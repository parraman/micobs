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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'osswpackage'", "'{'", "'}'", "'extends'", "','", "'version'", "':='", "'os'", "'construction'", "'tools'", "'provided'", "'osswis'"
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
    public static final int T__28=28;
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


        public InternalOSSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOSSWP.g"; }


     
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
    // InternalOSSWP.g:61:1: entryRuleMMESPOSSWPPackageFile : ruleMMESPOSSWPPackageFile EOF ;
    public final void entryRuleMMESPOSSWPPackageFile() throws RecognitionException {
        try {
            // InternalOSSWP.g:62:1: ( ruleMMESPOSSWPPackageFile EOF )
            // InternalOSSWP.g:63:1: ruleMMESPOSSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPOSSWPPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileRule()); 
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
    // $ANTLR end "entryRuleMMESPOSSWPPackageFile"


    // $ANTLR start "ruleMMESPOSSWPPackageFile"
    // InternalOSSWP.g:70:1: ruleMMESPOSSWPPackageFile : ( ( rule__MMESPOSSWPPackageFile__Group__0 ) ) ;
    public final void ruleMMESPOSSWPPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:74:2: ( ( ( rule__MMESPOSSWPPackageFile__Group__0 ) ) )
            // InternalOSSWP.g:75:1: ( ( rule__MMESPOSSWPPackageFile__Group__0 ) )
            {
            // InternalOSSWP.g:75:1: ( ( rule__MMESPOSSWPPackageFile__Group__0 ) )
            // InternalOSSWP.g:76:1: ( rule__MMESPOSSWPPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup()); 
            }
            // InternalOSSWP.g:77:1: ( rule__MMESPOSSWPPackageFile__Group__0 )
            // InternalOSSWP.g:77:2: rule__MMESPOSSWPPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:89:1: entryRuleMMESPOSSWPPackageElement : ruleMMESPOSSWPPackageElement EOF ;
    public final void entryRuleMMESPOSSWPPackageElement() throws RecognitionException {
        try {
            // InternalOSSWP.g:90:1: ( ruleMMESPOSSWPPackageElement EOF )
            // InternalOSSWP.g:91:1: ruleMMESPOSSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageElementRule()); 
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
    // $ANTLR end "entryRuleMMESPOSSWPPackageElement"


    // $ANTLR start "ruleMMESPOSSWPPackageElement"
    // InternalOSSWP.g:98:1: ruleMMESPOSSWPPackageElement : ( ruleMOSSwPackage ) ;
    public final void ruleMMESPOSSWPPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:102:2: ( ( ruleMOSSwPackage ) )
            // InternalOSSWP.g:103:1: ( ruleMOSSwPackage )
            {
            // InternalOSSWP.g:103:1: ( ruleMOSSwPackage )
            // InternalOSSWP.g:104:1: ruleMOSSwPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalOSSWP.g:118:1: ( ruleQualifiedName EOF )
            // InternalOSSWP.g:119:1: ruleQualifiedName EOF
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
    // InternalOSSWP.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalOSSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalOSSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalOSSWP.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalOSSWP.g:133:1: ( rule__QualifiedName__Group__0 )
            // InternalOSSWP.g:133:2: rule__QualifiedName__Group__0
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
    // InternalOSSWP.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalOSSWP.g:146:1: ( ruleVersion EOF )
            // InternalOSSWP.g:147:1: ruleVersion EOF
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
    // InternalOSSWP.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalOSSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // InternalOSSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            // InternalOSSWP.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalOSSWP.g:161:1: ( rule__Version__Group__0 )
            // InternalOSSWP.g:161:2: rule__Version__Group__0
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
    // InternalOSSWP.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalOSSWP.g:174:1: ( ruleVersionedQualifiedName EOF )
            // InternalOSSWP.g:175:1: ruleVersionedQualifiedName EOF
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
    // InternalOSSWP.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalOSSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalOSSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalOSSWP.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalOSSWP.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // InternalOSSWP.g:189:2: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleMOSSwPackage"
    // InternalOSSWP.g:201:1: entryRuleMOSSwPackage : ruleMOSSwPackage EOF ;
    public final void entryRuleMOSSwPackage() throws RecognitionException {
        try {
            // InternalOSSWP.g:202:1: ( ruleMOSSwPackage EOF )
            // InternalOSSWP.g:203:1: ruleMOSSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageRule()); 
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
    // $ANTLR end "entryRuleMOSSwPackage"


    // $ANTLR start "ruleMOSSwPackage"
    // InternalOSSWP.g:210:1: ruleMOSSwPackage : ( ( rule__MOSSwPackage__Group__0 ) ) ;
    public final void ruleMOSSwPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:214:2: ( ( ( rule__MOSSwPackage__Group__0 ) ) )
            // InternalOSSWP.g:215:1: ( ( rule__MOSSwPackage__Group__0 ) )
            {
            // InternalOSSWP.g:215:1: ( ( rule__MOSSwPackage__Group__0 ) )
            // InternalOSSWP.g:216:1: ( rule__MOSSwPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup()); 
            }
            // InternalOSSWP.g:217:1: ( rule__MOSSwPackage__Group__0 )
            // InternalOSSWP.g:217:2: rule__MOSSwPackage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:229:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:233:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // InternalOSSWP.g:234:1: ( RULE_INT )
                    {
                    // InternalOSSWP.g:234:1: ( RULE_INT )
                    // InternalOSSWP.g:235:1: RULE_INT
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
                    // InternalOSSWP.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalOSSWP.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalOSSWP.g:241:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalOSSWP.g:242:1: ( rule__Version__Group_0_1__0 )
                    // InternalOSSWP.g:242:2: rule__Version__Group_0_1__0
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
    // InternalOSSWP.g:251:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:255:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // InternalOSSWP.g:256:1: ( RULE_INT )
                    {
                    // InternalOSSWP.g:256:1: ( RULE_INT )
                    // InternalOSSWP.g:257:1: RULE_INT
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
                    // InternalOSSWP.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalOSSWP.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalOSSWP.g:263:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalOSSWP.g:264:1: ( rule__Version__Group_1_1_1__0 )
                    // InternalOSSWP.g:264:2: rule__Version__Group_1_1_1__0
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


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__0"
    // InternalOSSWP.g:275:1: rule__MMESPOSSWPPackageFile__Group__0 : rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1 ;
    public final void rule__MMESPOSSWPPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:279:1: ( rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1 )
            // InternalOSSWP.g:280:2: rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPOSSWPPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:287:1: rule__MMESPOSSWPPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:291:1: ( ( 'package' ) )
            // InternalOSSWP.g:292:1: ( 'package' )
            {
            // InternalOSSWP.g:292:1: ( 'package' )
            // InternalOSSWP.g:293:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:306:1: rule__MMESPOSSWPPackageFile__Group__1 : rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2 ;
    public final void rule__MMESPOSSWPPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:310:1: ( rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2 )
            // InternalOSSWP.g:311:2: rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPOSSWPPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:318:1: rule__MMESPOSSWPPackageFile__Group__1__Impl : ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:322:1: ( ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) ) )
            // InternalOSSWP.g:323:1: ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) )
            {
            // InternalOSSWP.g:323:1: ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) )
            // InternalOSSWP.g:324:1: ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1()); 
            }
            // InternalOSSWP.g:325:1: ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 )
            // InternalOSSWP.g:325:2: rule__MMESPOSSWPPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:335:1: rule__MMESPOSSWPPackageFile__Group__2 : rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3 ;
    public final void rule__MMESPOSSWPPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:339:1: ( rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3 )
            // InternalOSSWP.g:340:2: rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPOSSWPPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:347:1: rule__MMESPOSSWPPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:351:1: ( ( ';' ) )
            // InternalOSSWP.g:352:1: ( ';' )
            {
            // InternalOSSWP.g:352:1: ( ';' )
            // InternalOSSWP.g:353:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:366:1: rule__MMESPOSSWPPackageFile__Group__3 : rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4 ;
    public final void rule__MMESPOSSWPPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:370:1: ( rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4 )
            // InternalOSSWP.g:371:2: rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPOSSWPPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:378:1: rule__MMESPOSSWPPackageFile__Group__3__Impl : ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:382:1: ( ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* ) )
            // InternalOSSWP.g:383:1: ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* )
            {
            // InternalOSSWP.g:383:1: ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* )
            // InternalOSSWP.g:384:1: ( rule__MMESPOSSWPPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3()); 
            }
            // InternalOSSWP.g:385:1: ( rule__MMESPOSSWPPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOSSWP.g:385:2: rule__MMESPOSSWPPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalOSSWP.g:395:1: rule__MMESPOSSWPPackageFile__Group__4 : rule__MMESPOSSWPPackageFile__Group__4__Impl ;
    public final void rule__MMESPOSSWPPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:399:1: ( rule__MMESPOSSWPPackageFile__Group__4__Impl )
            // InternalOSSWP.g:400:2: rule__MMESPOSSWPPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:406:1: rule__MMESPOSSWPPackageFile__Group__4__Impl : ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:410:1: ( ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) ) )
            // InternalOSSWP.g:411:1: ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) )
            {
            // InternalOSSWP.g:411:1: ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) )
            // InternalOSSWP.g:412:1: ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4()); 
            }
            // InternalOSSWP.g:413:1: ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 )
            // InternalOSSWP.g:413:2: rule__MMESPOSSWPPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:433:1: rule__MMESPOSSWPPackageFile__Group_3__0 : rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1 ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:437:1: ( rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1 )
            // InternalOSSWP.g:438:2: rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPOSSWPPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:445:1: rule__MMESPOSSWPPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:449:1: ( ( 'import' ) )
            // InternalOSSWP.g:450:1: ( 'import' )
            {
            // InternalOSSWP.g:450:1: ( 'import' )
            // InternalOSSWP.g:451:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:464:1: rule__MMESPOSSWPPackageFile__Group_3__1 : rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2 ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:468:1: ( rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2 )
            // InternalOSSWP.g:469:2: rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPOSSWPPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:476:1: rule__MMESPOSSWPPackageFile__Group_3__1__Impl : ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:480:1: ( ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) ) )
            // InternalOSSWP.g:481:1: ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) )
            {
            // InternalOSSWP.g:481:1: ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) )
            // InternalOSSWP.g:482:1: ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // InternalOSSWP.g:483:1: ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 )
            // InternalOSSWP.g:483:2: rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:493:1: rule__MMESPOSSWPPackageFile__Group_3__2 : rule__MMESPOSSWPPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:497:1: ( rule__MMESPOSSWPPackageFile__Group_3__2__Impl )
            // InternalOSSWP.g:498:2: rule__MMESPOSSWPPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:504:1: rule__MMESPOSSWPPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:508:1: ( ( ';' ) )
            // InternalOSSWP.g:509:1: ( ';' )
            {
            // InternalOSSWP.g:509:1: ( ';' )
            // InternalOSSWP.g:510:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:529:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:533:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOSSWP.g:534:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOSSWP.g:541:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:545:1: ( ( RULE_ID ) )
            // InternalOSSWP.g:546:1: ( RULE_ID )
            {
            // InternalOSSWP.g:546:1: ( RULE_ID )
            // InternalOSSWP.g:547:1: RULE_ID
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
    // InternalOSSWP.g:558:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:562:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOSSWP.g:563:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOSSWP.g:569:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:573:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOSSWP.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOSSWP.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOSSWP.g:575:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalOSSWP.g:576:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOSSWP.g:576:2: rule__QualifiedName__Group_1__0
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
    // InternalOSSWP.g:590:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:594:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOSSWP.g:595:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOSSWP.g:602:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:606:1: ( ( '.' ) )
            // InternalOSSWP.g:607:1: ( '.' )
            {
            // InternalOSSWP.g:607:1: ( '.' )
            // InternalOSSWP.g:608:1: '.'
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
    // InternalOSSWP.g:621:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:625:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOSSWP.g:626:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOSSWP.g:632:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:636:1: ( ( RULE_ID ) )
            // InternalOSSWP.g:637:1: ( RULE_ID )
            {
            // InternalOSSWP.g:637:1: ( RULE_ID )
            // InternalOSSWP.g:638:1: RULE_ID
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
    // InternalOSSWP.g:653:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:657:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalOSSWP.g:658:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalOSSWP.g:665:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:669:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalOSSWP.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalOSSWP.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalOSSWP.g:671:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalOSSWP.g:672:1: ( rule__Version__Alternatives_0 )
            // InternalOSSWP.g:672:2: rule__Version__Alternatives_0
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
    // InternalOSSWP.g:682:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:686:1: ( rule__Version__Group__1__Impl )
            // InternalOSSWP.g:687:2: rule__Version__Group__1__Impl
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
    // InternalOSSWP.g:693:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:697:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalOSSWP.g:698:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalOSSWP.g:698:1: ( ( rule__Version__Group_1__0 )* )
            // InternalOSSWP.g:699:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalOSSWP.g:700:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOSSWP.g:700:2: rule__Version__Group_1__0
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
    // InternalOSSWP.g:714:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:718:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalOSSWP.g:719:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalOSSWP.g:726:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:730:1: ( ( ( RULE_INT )? ) )
            // InternalOSSWP.g:731:1: ( ( RULE_INT )? )
            {
            // InternalOSSWP.g:731:1: ( ( RULE_INT )? )
            // InternalOSSWP.g:732:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalOSSWP.g:733:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOSSWP.g:733:3: RULE_INT
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
    // InternalOSSWP.g:743:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:747:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalOSSWP.g:748:2: rule__Version__Group_0_1__1__Impl
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
    // InternalOSSWP.g:754:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:758:1: ( ( RULE_ID ) )
            // InternalOSSWP.g:759:1: ( RULE_ID )
            {
            // InternalOSSWP.g:759:1: ( RULE_ID )
            // InternalOSSWP.g:760:1: RULE_ID
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
    // InternalOSSWP.g:775:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:779:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalOSSWP.g:780:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalOSSWP.g:787:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:791:1: ( ( '.' ) )
            // InternalOSSWP.g:792:1: ( '.' )
            {
            // InternalOSSWP.g:792:1: ( '.' )
            // InternalOSSWP.g:793:1: '.'
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
    // InternalOSSWP.g:806:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:810:1: ( rule__Version__Group_1__1__Impl )
            // InternalOSSWP.g:811:2: rule__Version__Group_1__1__Impl
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
    // InternalOSSWP.g:817:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:821:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalOSSWP.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalOSSWP.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalOSSWP.g:823:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalOSSWP.g:824:1: ( rule__Version__Alternatives_1_1 )
            // InternalOSSWP.g:824:2: rule__Version__Alternatives_1_1
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
    // InternalOSSWP.g:838:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:842:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalOSSWP.g:843:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalOSSWP.g:850:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:854:1: ( ( ( RULE_INT )? ) )
            // InternalOSSWP.g:855:1: ( ( RULE_INT )? )
            {
            // InternalOSSWP.g:855:1: ( ( RULE_INT )? )
            // InternalOSSWP.g:856:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalOSSWP.g:857:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOSSWP.g:857:3: RULE_INT
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
    // InternalOSSWP.g:867:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:871:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalOSSWP.g:872:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalOSSWP.g:878:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:882:1: ( ( RULE_ID ) )
            // InternalOSSWP.g:883:1: ( RULE_ID )
            {
            // InternalOSSWP.g:883:1: ( RULE_ID )
            // InternalOSSWP.g:884:1: RULE_ID
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
    // InternalOSSWP.g:899:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:903:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalOSSWP.g:904:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // InternalOSSWP.g:911:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:915:1: ( ( ruleQualifiedName ) )
            // InternalOSSWP.g:916:1: ( ruleQualifiedName )
            {
            // InternalOSSWP.g:916:1: ( ruleQualifiedName )
            // InternalOSSWP.g:917:1: ruleQualifiedName
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
    // InternalOSSWP.g:928:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:932:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalOSSWP.g:933:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalOSSWP.g:940:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:944:1: ( ( '(' ) )
            // InternalOSSWP.g:945:1: ( '(' )
            {
            // InternalOSSWP.g:945:1: ( '(' )
            // InternalOSSWP.g:946:1: '('
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
    // InternalOSSWP.g:959:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:963:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalOSSWP.g:964:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // InternalOSSWP.g:971:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:975:1: ( ( ruleVersion ) )
            // InternalOSSWP.g:976:1: ( ruleVersion )
            {
            // InternalOSSWP.g:976:1: ( ruleVersion )
            // InternalOSSWP.g:977:1: ruleVersion
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
    // InternalOSSWP.g:988:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:992:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalOSSWP.g:993:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalOSSWP.g:999:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1003:1: ( ( ')' ) )
            // InternalOSSWP.g:1004:1: ( ')' )
            {
            // InternalOSSWP.g:1004:1: ( ')' )
            // InternalOSSWP.g:1005:1: ')'
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


    // $ANTLR start "rule__MOSSwPackage__Group__0"
    // InternalOSSWP.g:1026:1: rule__MOSSwPackage__Group__0 : rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1 ;
    public final void rule__MOSSwPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1030:1: ( rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1 )
            // InternalOSSWP.g:1031:2: rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1038:1: rule__MOSSwPackage__Group__0__Impl : ( 'osswpackage' ) ;
    public final void rule__MOSSwPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1042:1: ( ( 'osswpackage' ) )
            // InternalOSSWP.g:1043:1: ( 'osswpackage' )
            {
            // InternalOSSWP.g:1043:1: ( 'osswpackage' )
            // InternalOSSWP.g:1044:1: 'osswpackage'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1057:1: rule__MOSSwPackage__Group__1 : rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2 ;
    public final void rule__MOSSwPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1061:1: ( rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2 )
            // InternalOSSWP.g:1062:2: rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MOSSwPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1069:1: rule__MOSSwPackage__Group__1__Impl : ( ( rule__MOSSwPackage__NameAssignment_1 ) ) ;
    public final void rule__MOSSwPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1073:1: ( ( ( rule__MOSSwPackage__NameAssignment_1 ) ) )
            // InternalOSSWP.g:1074:1: ( ( rule__MOSSwPackage__NameAssignment_1 ) )
            {
            // InternalOSSWP.g:1074:1: ( ( rule__MOSSwPackage__NameAssignment_1 ) )
            // InternalOSSWP.g:1075:1: ( rule__MOSSwPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1()); 
            }
            // InternalOSSWP.g:1076:1: ( rule__MOSSwPackage__NameAssignment_1 )
            // InternalOSSWP.g:1076:2: rule__MOSSwPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1086:1: rule__MOSSwPackage__Group__2 : rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3 ;
    public final void rule__MOSSwPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1090:1: ( rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3 )
            // InternalOSSWP.g:1091:2: rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MOSSwPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1098:1: rule__MOSSwPackage__Group__2__Impl : ( ( rule__MOSSwPackage__Group_2__0 )? ) ;
    public final void rule__MOSSwPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1102:1: ( ( ( rule__MOSSwPackage__Group_2__0 )? ) )
            // InternalOSSWP.g:1103:1: ( ( rule__MOSSwPackage__Group_2__0 )? )
            {
            // InternalOSSWP.g:1103:1: ( ( rule__MOSSwPackage__Group_2__0 )? )
            // InternalOSSWP.g:1104:1: ( rule__MOSSwPackage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_2()); 
            }
            // InternalOSSWP.g:1105:1: ( rule__MOSSwPackage__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOSSWP.g:1105:2: rule__MOSSwPackage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1115:1: rule__MOSSwPackage__Group__3 : rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4 ;
    public final void rule__MOSSwPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1119:1: ( rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4 )
            // InternalOSSWP.g:1120:2: rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__MOSSwPackage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1127:1: rule__MOSSwPackage__Group__3__Impl : ( '{' ) ;
    public final void rule__MOSSwPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1131:1: ( ( '{' ) )
            // InternalOSSWP.g:1132:1: ( '{' )
            {
            // InternalOSSWP.g:1132:1: ( '{' )
            // InternalOSSWP.g:1133:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1146:1: rule__MOSSwPackage__Group__4 : rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5 ;
    public final void rule__MOSSwPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1150:1: ( rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5 )
            // InternalOSSWP.g:1151:2: rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MOSSwPackage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1158:1: rule__MOSSwPackage__Group__4__Impl : ( ( rule__MOSSwPackage__UnorderedGroup_4 ) ) ;
    public final void rule__MOSSwPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1162:1: ( ( ( rule__MOSSwPackage__UnorderedGroup_4 ) ) )
            // InternalOSSWP.g:1163:1: ( ( rule__MOSSwPackage__UnorderedGroup_4 ) )
            {
            // InternalOSSWP.g:1163:1: ( ( rule__MOSSwPackage__UnorderedGroup_4 ) )
            // InternalOSSWP.g:1164:1: ( rule__MOSSwPackage__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()); 
            }
            // InternalOSSWP.g:1165:1: ( rule__MOSSwPackage__UnorderedGroup_4 )
            // InternalOSSWP.g:1165:2: rule__MOSSwPackage__UnorderedGroup_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1175:1: rule__MOSSwPackage__Group__5 : rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6 ;
    public final void rule__MOSSwPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1179:1: ( rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6 )
            // InternalOSSWP.g:1180:2: rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwPackage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1187:1: rule__MOSSwPackage__Group__5__Impl : ( '}' ) ;
    public final void rule__MOSSwPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1191:1: ( ( '}' ) )
            // InternalOSSWP.g:1192:1: ( '}' )
            {
            // InternalOSSWP.g:1192:1: ( '}' )
            // InternalOSSWP.g:1193:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1206:1: rule__MOSSwPackage__Group__6 : rule__MOSSwPackage__Group__6__Impl ;
    public final void rule__MOSSwPackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1210:1: ( rule__MOSSwPackage__Group__6__Impl )
            // InternalOSSWP.g:1211:2: rule__MOSSwPackage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1217:1: rule__MOSSwPackage__Group__6__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1221:1: ( ( ';' ) )
            // InternalOSSWP.g:1222:1: ( ';' )
            {
            // InternalOSSWP.g:1222:1: ( ';' )
            // InternalOSSWP.g:1223:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1250:1: rule__MOSSwPackage__Group_2__0 : rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1 ;
    public final void rule__MOSSwPackage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1254:1: ( rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1 )
            // InternalOSSWP.g:1255:2: rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1262:1: rule__MOSSwPackage__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MOSSwPackage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1266:1: ( ( 'extends' ) )
            // InternalOSSWP.g:1267:1: ( 'extends' )
            {
            // InternalOSSWP.g:1267:1: ( 'extends' )
            // InternalOSSWP.g:1268:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1281:1: rule__MOSSwPackage__Group_2__1 : rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2 ;
    public final void rule__MOSSwPackage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1285:1: ( rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2 )
            // InternalOSSWP.g:1286:2: rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MOSSwPackage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1293:1: rule__MOSSwPackage__Group_2__1__Impl : ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MOSSwPackage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1297:1: ( ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) ) )
            // InternalOSSWP.g:1298:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) )
            {
            // InternalOSSWP.g:1298:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) )
            // InternalOSSWP.g:1299:1: ( rule__MOSSwPackage__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1()); 
            }
            // InternalOSSWP.g:1300:1: ( rule__MOSSwPackage__ExtendsAssignment_2_1 )
            // InternalOSSWP.g:1300:2: rule__MOSSwPackage__ExtendsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1310:1: rule__MOSSwPackage__Group_2__2 : rule__MOSSwPackage__Group_2__2__Impl ;
    public final void rule__MOSSwPackage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1314:1: ( rule__MOSSwPackage__Group_2__2__Impl )
            // InternalOSSWP.g:1315:2: rule__MOSSwPackage__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1321:1: rule__MOSSwPackage__Group_2__2__Impl : ( ( rule__MOSSwPackage__Group_2_2__0 )* ) ;
    public final void rule__MOSSwPackage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1325:1: ( ( ( rule__MOSSwPackage__Group_2_2__0 )* ) )
            // InternalOSSWP.g:1326:1: ( ( rule__MOSSwPackage__Group_2_2__0 )* )
            {
            // InternalOSSWP.g:1326:1: ( ( rule__MOSSwPackage__Group_2_2__0 )* )
            // InternalOSSWP.g:1327:1: ( rule__MOSSwPackage__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_2_2()); 
            }
            // InternalOSSWP.g:1328:1: ( rule__MOSSwPackage__Group_2_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOSSWP.g:1328:2: rule__MOSSwPackage__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalOSSWP.g:1344:1: rule__MOSSwPackage__Group_2_2__0 : rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1 ;
    public final void rule__MOSSwPackage__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1348:1: ( rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1 )
            // InternalOSSWP.g:1349:2: rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1356:1: rule__MOSSwPackage__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1360:1: ( ( ',' ) )
            // InternalOSSWP.g:1361:1: ( ',' )
            {
            // InternalOSSWP.g:1361:1: ( ',' )
            // InternalOSSWP.g:1362:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1375:1: rule__MOSSwPackage__Group_2_2__1 : rule__MOSSwPackage__Group_2_2__1__Impl ;
    public final void rule__MOSSwPackage__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1379:1: ( rule__MOSSwPackage__Group_2_2__1__Impl )
            // InternalOSSWP.g:1380:2: rule__MOSSwPackage__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1386:1: rule__MOSSwPackage__Group_2_2__1__Impl : ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__MOSSwPackage__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1390:1: ( ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) ) )
            // InternalOSSWP.g:1391:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) )
            {
            // InternalOSSWP.g:1391:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) )
            // InternalOSSWP.g:1392:1: ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1()); 
            }
            // InternalOSSWP.g:1393:1: ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 )
            // InternalOSSWP.g:1393:2: rule__MOSSwPackage__ExtendsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1407:1: rule__MOSSwPackage__Group_4_0__0 : rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1 ;
    public final void rule__MOSSwPackage__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1411:1: ( rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1 )
            // InternalOSSWP.g:1412:2: rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MOSSwPackage__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1419:1: rule__MOSSwPackage__Group_4_0__0__Impl : ( 'version' ) ;
    public final void rule__MOSSwPackage__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1423:1: ( ( 'version' ) )
            // InternalOSSWP.g:1424:1: ( 'version' )
            {
            // InternalOSSWP.g:1424:1: ( 'version' )
            // InternalOSSWP.g:1425:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1438:1: rule__MOSSwPackage__Group_4_0__1 : rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2 ;
    public final void rule__MOSSwPackage__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1442:1: ( rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2 )
            // InternalOSSWP.g:1443:2: rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MOSSwPackage__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1450:1: rule__MOSSwPackage__Group_4_0__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1454:1: ( ( ':=' ) )
            // InternalOSSWP.g:1455:1: ( ':=' )
            {
            // InternalOSSWP.g:1455:1: ( ':=' )
            // InternalOSSWP.g:1456:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1469:1: rule__MOSSwPackage__Group_4_0__2 : rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3 ;
    public final void rule__MOSSwPackage__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1473:1: ( rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3 )
            // InternalOSSWP.g:1474:2: rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwPackage__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1481:1: rule__MOSSwPackage__Group_4_0__2__Impl : ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1485:1: ( ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) ) )
            // InternalOSSWP.g:1486:1: ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) )
            {
            // InternalOSSWP.g:1486:1: ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) )
            // InternalOSSWP.g:1487:1: ( rule__MOSSwPackage__VersionAssignment_4_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2()); 
            }
            // InternalOSSWP.g:1488:1: ( rule__MOSSwPackage__VersionAssignment_4_0_2 )
            // InternalOSSWP.g:1488:2: rule__MOSSwPackage__VersionAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1498:1: rule__MOSSwPackage__Group_4_0__3 : rule__MOSSwPackage__Group_4_0__3__Impl ;
    public final void rule__MOSSwPackage__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1502:1: ( rule__MOSSwPackage__Group_4_0__3__Impl )
            // InternalOSSWP.g:1503:2: rule__MOSSwPackage__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1509:1: rule__MOSSwPackage__Group_4_0__3__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1513:1: ( ( ';' ) )
            // InternalOSSWP.g:1514:1: ( ';' )
            {
            // InternalOSSWP.g:1514:1: ( ';' )
            // InternalOSSWP.g:1515:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1536:1: rule__MOSSwPackage__Group_4_1__0 : rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1 ;
    public final void rule__MOSSwPackage__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1540:1: ( rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1 )
            // InternalOSSWP.g:1541:2: rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MOSSwPackage__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1548:1: rule__MOSSwPackage__Group_4_1__0__Impl : ( 'os' ) ;
    public final void rule__MOSSwPackage__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1552:1: ( ( 'os' ) )
            // InternalOSSWP.g:1553:1: ( 'os' )
            {
            // InternalOSSWP.g:1553:1: ( 'os' )
            // InternalOSSWP.g:1554:1: 'os'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1567:1: rule__MOSSwPackage__Group_4_1__1 : rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2 ;
    public final void rule__MOSSwPackage__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1571:1: ( rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2 )
            // InternalOSSWP.g:1572:2: rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1579:1: rule__MOSSwPackage__Group_4_1__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1583:1: ( ( ':=' ) )
            // InternalOSSWP.g:1584:1: ( ':=' )
            {
            // InternalOSSWP.g:1584:1: ( ':=' )
            // InternalOSSWP.g:1585:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1598:1: rule__MOSSwPackage__Group_4_1__2 : rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3 ;
    public final void rule__MOSSwPackage__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1602:1: ( rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3 )
            // InternalOSSWP.g:1603:2: rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwPackage__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1610:1: rule__MOSSwPackage__Group_4_1__2__Impl : ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1614:1: ( ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) ) )
            // InternalOSSWP.g:1615:1: ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) )
            {
            // InternalOSSWP.g:1615:1: ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) )
            // InternalOSSWP.g:1616:1: ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2()); 
            }
            // InternalOSSWP.g:1617:1: ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 )
            // InternalOSSWP.g:1617:2: rule__MOSSwPackage__ReferencedElementAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1627:1: rule__MOSSwPackage__Group_4_1__3 : rule__MOSSwPackage__Group_4_1__3__Impl ;
    public final void rule__MOSSwPackage__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1631:1: ( rule__MOSSwPackage__Group_4_1__3__Impl )
            // InternalOSSWP.g:1632:2: rule__MOSSwPackage__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1638:1: rule__MOSSwPackage__Group_4_1__3__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1642:1: ( ( ';' ) )
            // InternalOSSWP.g:1643:1: ( ';' )
            {
            // InternalOSSWP.g:1643:1: ( ';' )
            // InternalOSSWP.g:1644:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:1665:1: rule__MOSSwPackage__Group_4_2__0 : rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1 ;
    public final void rule__MOSSwPackage__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1669:1: ( rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1 )
            // InternalOSSWP.g:1670:2: rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MOSSwPackage__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1677:1: rule__MOSSwPackage__Group_4_2__0__Impl : ( 'construction' ) ;
    public final void rule__MOSSwPackage__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1681:1: ( ( 'construction' ) )
            // InternalOSSWP.g:1682:1: ( 'construction' )
            {
            // InternalOSSWP.g:1682:1: ( 'construction' )
            // InternalOSSWP.g:1683:1: 'construction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1696:1: rule__MOSSwPackage__Group_4_2__1 : rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2 ;
    public final void rule__MOSSwPackage__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1700:1: ( rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2 )
            // InternalOSSWP.g:1701:2: rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MOSSwPackage__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1708:1: rule__MOSSwPackage__Group_4_2__1__Impl : ( 'tools' ) ;
    public final void rule__MOSSwPackage__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1712:1: ( ( 'tools' ) )
            // InternalOSSWP.g:1713:1: ( 'tools' )
            {
            // InternalOSSWP.g:1713:1: ( 'tools' )
            // InternalOSSWP.g:1714:1: 'tools'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1727:1: rule__MOSSwPackage__Group_4_2__2 : rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3 ;
    public final void rule__MOSSwPackage__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1731:1: ( rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3 )
            // InternalOSSWP.g:1732:2: rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1739:1: rule__MOSSwPackage__Group_4_2__2__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1743:1: ( ( ':=' ) )
            // InternalOSSWP.g:1744:1: ( ':=' )
            {
            // InternalOSSWP.g:1744:1: ( ':=' )
            // InternalOSSWP.g:1745:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1758:1: rule__MOSSwPackage__Group_4_2__3 : rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4 ;
    public final void rule__MOSSwPackage__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1762:1: ( rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4 )
            // InternalOSSWP.g:1763:2: rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwPackage__Group_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1770:1: rule__MOSSwPackage__Group_4_2__3__Impl : ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 ) ) ;
    public final void rule__MOSSwPackage__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1774:1: ( ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 ) ) )
            // InternalOSSWP.g:1775:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 ) )
            {
            // InternalOSSWP.g:1775:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 ) )
            // InternalOSSWP.g:1776:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3()); 
            }
            // InternalOSSWP.g:1777:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_3 )
            // InternalOSSWP.g:1777:2: rule__MOSSwPackage__CtoolsAssignment_4_2_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__CtoolsAssignment_4_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1787:1: rule__MOSSwPackage__Group_4_2__4 : rule__MOSSwPackage__Group_4_2__4__Impl rule__MOSSwPackage__Group_4_2__5 ;
    public final void rule__MOSSwPackage__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1791:1: ( rule__MOSSwPackage__Group_4_2__4__Impl rule__MOSSwPackage__Group_4_2__5 )
            // InternalOSSWP.g:1792:2: rule__MOSSwPackage__Group_4_2__4__Impl rule__MOSSwPackage__Group_4_2__5
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwPackage__Group_4_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWP.g:1799:1: rule__MOSSwPackage__Group_4_2__4__Impl : ( ( rule__MOSSwPackage__Group_4_2_4__0 )* ) ;
    public final void rule__MOSSwPackage__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1803:1: ( ( ( rule__MOSSwPackage__Group_4_2_4__0 )* ) )
            // InternalOSSWP.g:1804:1: ( ( rule__MOSSwPackage__Group_4_2_4__0 )* )
            {
            // InternalOSSWP.g:1804:1: ( ( rule__MOSSwPackage__Group_4_2_4__0 )* )
            // InternalOSSWP.g:1805:1: ( rule__MOSSwPackage__Group_4_2_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4()); 
            }
            // InternalOSSWP.g:1806:1: ( rule__MOSSwPackage__Group_4_2_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOSSWP.g:1806:2: rule__MOSSwPackage__Group_4_2_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__MOSSwPackage__Group_4_2_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__5"
    // InternalOSSWP.g:1816:1: rule__MOSSwPackage__Group_4_2__5 : rule__MOSSwPackage__Group_4_2__5__Impl ;
    public final void rule__MOSSwPackage__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1820:1: ( rule__MOSSwPackage__Group_4_2__5__Impl )
            // InternalOSSWP.g:1821:2: rule__MOSSwPackage__Group_4_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__5"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__5__Impl"
    // InternalOSSWP.g:1827:1: rule__MOSSwPackage__Group_4_2__5__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1831:1: ( ( ';' ) )
            // InternalOSSWP.g:1832:1: ( ';' )
            {
            // InternalOSSWP.g:1832:1: ( ';' )
            // InternalOSSWP.g:1833:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__5__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_4__0"
    // InternalOSSWP.g:1858:1: rule__MOSSwPackage__Group_4_2_4__0 : rule__MOSSwPackage__Group_4_2_4__0__Impl rule__MOSSwPackage__Group_4_2_4__1 ;
    public final void rule__MOSSwPackage__Group_4_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1862:1: ( rule__MOSSwPackage__Group_4_2_4__0__Impl rule__MOSSwPackage__Group_4_2_4__1 )
            // InternalOSSWP.g:1863:2: rule__MOSSwPackage__Group_4_2_4__0__Impl rule__MOSSwPackage__Group_4_2_4__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_4_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_4__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_4__0__Impl"
    // InternalOSSWP.g:1870:1: rule__MOSSwPackage__Group_4_2_4__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_4_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1874:1: ( ( ',' ) )
            // InternalOSSWP.g:1875:1: ( ',' )
            {
            // InternalOSSWP.g:1875:1: ( ',' )
            // InternalOSSWP.g:1876:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_4__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_4__1"
    // InternalOSSWP.g:1889:1: rule__MOSSwPackage__Group_4_2_4__1 : rule__MOSSwPackage__Group_4_2_4__1__Impl ;
    public final void rule__MOSSwPackage__Group_4_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1893:1: ( rule__MOSSwPackage__Group_4_2_4__1__Impl )
            // InternalOSSWP.g:1894:2: rule__MOSSwPackage__Group_4_2_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_4__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_4__1__Impl"
    // InternalOSSWP.g:1900:1: rule__MOSSwPackage__Group_4_2_4__1__Impl : ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 ) ) ;
    public final void rule__MOSSwPackage__Group_4_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1904:1: ( ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 ) ) )
            // InternalOSSWP.g:1905:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 ) )
            {
            // InternalOSSWP.g:1905:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 ) )
            // InternalOSSWP.g:1906:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1()); 
            }
            // InternalOSSWP.g:1907:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 )
            // InternalOSSWP.g:1907:2: rule__MOSSwPackage__CtoolsAssignment_4_2_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__CtoolsAssignment_4_2_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_4__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__0"
    // InternalOSSWP.g:1921:1: rule__MOSSwPackage__Group_4_3__0 : rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1 ;
    public final void rule__MOSSwPackage__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1925:1: ( rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1 )
            // InternalOSSWP.g:1926:2: rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MOSSwPackage__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1933:1: rule__MOSSwPackage__Group_4_3__0__Impl : ( 'provided' ) ;
    public final void rule__MOSSwPackage__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1937:1: ( ( 'provided' ) )
            // InternalOSSWP.g:1938:1: ( 'provided' )
            {
            // InternalOSSWP.g:1938:1: ( 'provided' )
            // InternalOSSWP.g:1939:1: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1952:1: rule__MOSSwPackage__Group_4_3__1 : rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2 ;
    public final void rule__MOSSwPackage__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1956:1: ( rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2 )
            // InternalOSSWP.g:1957:2: rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MOSSwPackage__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1964:1: rule__MOSSwPackage__Group_4_3__1__Impl : ( 'osswis' ) ;
    public final void rule__MOSSwPackage__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1968:1: ( ( 'osswis' ) )
            // InternalOSSWP.g:1969:1: ( 'osswis' )
            {
            // InternalOSSWP.g:1969:1: ( 'osswis' )
            // InternalOSSWP.g:1970:1: 'osswis'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:1983:1: rule__MOSSwPackage__Group_4_3__2 : rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3 ;
    public final void rule__MOSSwPackage__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1987:1: ( rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3 )
            // InternalOSSWP.g:1988:2: rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_4_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:1995:1: rule__MOSSwPackage__Group_4_3__2__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:1999:1: ( ( ':=' ) )
            // InternalOSSWP.g:2000:1: ( ':=' )
            {
            // InternalOSSWP.g:2000:1: ( ':=' )
            // InternalOSSWP.g:2001:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:2014:1: rule__MOSSwPackage__Group_4_3__3 : rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4 ;
    public final void rule__MOSSwPackage__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2018:1: ( rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4 )
            // InternalOSSWP.g:2019:2: rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwPackage__Group_4_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2026:1: rule__MOSSwPackage__Group_4_3__3__Impl : ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 ) ) ;
    public final void rule__MOSSwPackage__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2030:1: ( ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 ) ) )
            // InternalOSSWP.g:2031:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 ) )
            {
            // InternalOSSWP.g:2031:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 ) )
            // InternalOSSWP.g:2032:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3()); 
            }
            // InternalOSSWP.g:2033:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 )
            // InternalOSSWP.g:2033:2: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3()); 
            }

            }


            }

        }
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
    // InternalOSSWP.g:2043:1: rule__MOSSwPackage__Group_4_3__4 : rule__MOSSwPackage__Group_4_3__4__Impl rule__MOSSwPackage__Group_4_3__5 ;
    public final void rule__MOSSwPackage__Group_4_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2047:1: ( rule__MOSSwPackage__Group_4_3__4__Impl rule__MOSSwPackage__Group_4_3__5 )
            // InternalOSSWP.g:2048:2: rule__MOSSwPackage__Group_4_3__4__Impl rule__MOSSwPackage__Group_4_3__5
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwPackage__Group_4_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWP.g:2055:1: rule__MOSSwPackage__Group_4_3__4__Impl : ( ( rule__MOSSwPackage__Group_4_3_4__0 )* ) ;
    public final void rule__MOSSwPackage__Group_4_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2059:1: ( ( ( rule__MOSSwPackage__Group_4_3_4__0 )* ) )
            // InternalOSSWP.g:2060:1: ( ( rule__MOSSwPackage__Group_4_3_4__0 )* )
            {
            // InternalOSSWP.g:2060:1: ( ( rule__MOSSwPackage__Group_4_3_4__0 )* )
            // InternalOSSWP.g:2061:1: ( rule__MOSSwPackage__Group_4_3_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4()); 
            }
            // InternalOSSWP.g:2062:1: ( rule__MOSSwPackage__Group_4_3_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOSSWP.g:2062:2: rule__MOSSwPackage__Group_4_3_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__MOSSwPackage__Group_4_3_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__5"
    // InternalOSSWP.g:2072:1: rule__MOSSwPackage__Group_4_3__5 : rule__MOSSwPackage__Group_4_3__5__Impl ;
    public final void rule__MOSSwPackage__Group_4_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2076:1: ( rule__MOSSwPackage__Group_4_3__5__Impl )
            // InternalOSSWP.g:2077:2: rule__MOSSwPackage__Group_4_3__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__5"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__5__Impl"
    // InternalOSSWP.g:2083:1: rule__MOSSwPackage__Group_4_3__5__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2087:1: ( ( ';' ) )
            // InternalOSSWP.g:2088:1: ( ';' )
            {
            // InternalOSSWP.g:2088:1: ( ';' )
            // InternalOSSWP.g:2089:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__5__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_4__0"
    // InternalOSSWP.g:2114:1: rule__MOSSwPackage__Group_4_3_4__0 : rule__MOSSwPackage__Group_4_3_4__0__Impl rule__MOSSwPackage__Group_4_3_4__1 ;
    public final void rule__MOSSwPackage__Group_4_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2118:1: ( rule__MOSSwPackage__Group_4_3_4__0__Impl rule__MOSSwPackage__Group_4_3_4__1 )
            // InternalOSSWP.g:2119:2: rule__MOSSwPackage__Group_4_3_4__0__Impl rule__MOSSwPackage__Group_4_3_4__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwPackage__Group_4_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_3_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_4__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_4__0__Impl"
    // InternalOSSWP.g:2126:1: rule__MOSSwPackage__Group_4_3_4__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_4_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2130:1: ( ( ',' ) )
            // InternalOSSWP.g:2131:1: ( ',' )
            {
            // InternalOSSWP.g:2131:1: ( ',' )
            // InternalOSSWP.g:2132:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_4__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_4__1"
    // InternalOSSWP.g:2145:1: rule__MOSSwPackage__Group_4_3_4__1 : rule__MOSSwPackage__Group_4_3_4__1__Impl ;
    public final void rule__MOSSwPackage__Group_4_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2149:1: ( rule__MOSSwPackage__Group_4_3_4__1__Impl )
            // InternalOSSWP.g:2150:2: rule__MOSSwPackage__Group_4_3_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__Group_4_3_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_4__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_4__1__Impl"
    // InternalOSSWP.g:2156:1: rule__MOSSwPackage__Group_4_3_4__1__Impl : ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 ) ) ;
    public final void rule__MOSSwPackage__Group_4_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2160:1: ( ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 ) ) )
            // InternalOSSWP.g:2161:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 ) )
            {
            // InternalOSSWP.g:2161:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 ) )
            // InternalOSSWP.g:2162:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1()); 
            }
            // InternalOSSWP.g:2163:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 )
            // InternalOSSWP.g:2163:2: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_4__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4"
    // InternalOSSWP.g:2178:1: rule__MOSSwPackage__UnorderedGroup_4 : rule__MOSSwPackage__UnorderedGroup_4__0 {...}?;
    public final void rule__MOSSwPackage__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            
        try {
            // InternalOSSWP.g:2183:1: ( rule__MOSSwPackage__UnorderedGroup_4__0 {...}?)
            // InternalOSSWP.g:2184:2: rule__MOSSwPackage__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2195:1: rule__MOSSwPackage__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) ) ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalOSSWP.g:2200:1: ( ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) ) )
            // InternalOSSWP.g:2201:3: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) )
            {
            // InternalOSSWP.g:2201:3: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt12=2;
            }
            else if ( LA12_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt12=3;
            }
            else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
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
                    // InternalOSSWP.g:2203:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
                    {
                    // InternalOSSWP.g:2203:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
                    // InternalOSSWP.g:2204:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalOSSWP.g:2204:109: ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
                    // InternalOSSWP.g:2205:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalOSSWP.g:2211:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
                    // InternalOSSWP.g:2213:7: ( rule__MOSSwPackage__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); 
                    }
                    // InternalOSSWP.g:2214:7: ( rule__MOSSwPackage__Group_4_0__0 )
                    // InternalOSSWP.g:2214:8: rule__MOSSwPackage__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalOSSWP.g:2220:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
                    {
                    // InternalOSSWP.g:2220:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
                    // InternalOSSWP.g:2221:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalOSSWP.g:2221:109: ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
                    // InternalOSSWP.g:2222:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalOSSWP.g:2228:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
                    // InternalOSSWP.g:2230:7: ( rule__MOSSwPackage__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); 
                    }
                    // InternalOSSWP.g:2231:7: ( rule__MOSSwPackage__Group_4_1__0 )
                    // InternalOSSWP.g:2231:8: rule__MOSSwPackage__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalOSSWP.g:2237:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
                    {
                    // InternalOSSWP.g:2237:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
                    // InternalOSSWP.g:2238:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalOSSWP.g:2238:109: ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
                    // InternalOSSWP.g:2239:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalOSSWP.g:2245:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
                    // InternalOSSWP.g:2247:7: ( rule__MOSSwPackage__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); 
                    }
                    // InternalOSSWP.g:2248:7: ( rule__MOSSwPackage__Group_4_2__0 )
                    // InternalOSSWP.g:2248:8: rule__MOSSwPackage__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalOSSWP.g:2254:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) )
                    {
                    // InternalOSSWP.g:2254:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) )
                    // InternalOSSWP.g:2255:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
                    }
                    // InternalOSSWP.g:2255:109: ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) )
                    // InternalOSSWP.g:2256:6: ( ( rule__MOSSwPackage__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // InternalOSSWP.g:2262:6: ( ( rule__MOSSwPackage__Group_4_3__0 ) )
                    // InternalOSSWP.g:2264:7: ( rule__MOSSwPackage__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3()); 
                    }
                    // InternalOSSWP.g:2265:7: ( rule__MOSSwPackage__Group_4_3__0 )
                    // InternalOSSWP.g:2265:8: rule__MOSSwPackage__Group_4_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2280:1: rule__MOSSwPackage__UnorderedGroup_4__0 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2284:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )? )
            // InternalOSSWP.g:2285:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOSSWP.g:2286:2: ( rule__MOSSwPackage__UnorderedGroup_4__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2293:1: rule__MOSSwPackage__UnorderedGroup_4__1 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2297:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )? )
            // InternalOSSWP.g:2298:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOSSWP.g:2299:2: ( rule__MOSSwPackage__UnorderedGroup_4__2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2306:1: rule__MOSSwPackage__UnorderedGroup_4__2 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2310:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )? )
            // InternalOSSWP.g:2311:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOSSWP.g:2312:2: ( rule__MOSSwPackage__UnorderedGroup_4__3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2319:1: rule__MOSSwPackage__UnorderedGroup_4__3 : rule__MOSSwPackage__UnorderedGroup_4__Impl ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2323:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl )
            // InternalOSSWP.g:2324:2: rule__MOSSwPackage__UnorderedGroup_4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2339:1: rule__MMESPOSSWPPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWPPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2343:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOSSWP.g:2344:1: ( ( ruleQualifiedName ) )
            {
            // InternalOSSWP.g:2344:1: ( ( ruleQualifiedName ) )
            // InternalOSSWP.g:2345:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // InternalOSSWP.g:2346:1: ( ruleQualifiedName )
            // InternalOSSWP.g:2347:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2358:1: rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2362:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOSSWP.g:2363:1: ( ( ruleQualifiedName ) )
            {
            // InternalOSSWP.g:2363:1: ( ( ruleQualifiedName ) )
            // InternalOSSWP.g:2364:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // InternalOSSWP.g:2365:1: ( ruleQualifiedName )
            // InternalOSSWP.g:2366:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2377:1: rule__MMESPOSSWPPackageFile__ElementAssignment_4 : ( ruleMMESPOSSWPPackageElement ) ;
    public final void rule__MMESPOSSWPPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2381:1: ( ( ruleMMESPOSSWPPackageElement ) )
            // InternalOSSWP.g:2382:1: ( ruleMMESPOSSWPPackageElement )
            {
            // InternalOSSWP.g:2382:1: ( ruleMMESPOSSWPPackageElement )
            // InternalOSSWP.g:2383:1: ruleMMESPOSSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2392:1: rule__MOSSwPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MOSSwPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2396:1: ( ( RULE_ID ) )
            // InternalOSSWP.g:2397:1: ( RULE_ID )
            {
            // InternalOSSWP.g:2397:1: ( RULE_ID )
            // InternalOSSWP.g:2398:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWP.g:2407:1: rule__MOSSwPackage__ExtendsAssignment_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2411:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2412:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2412:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2413:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); 
            }
            // InternalOSSWP.g:2414:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2415:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2426:1: rule__MOSSwPackage__ExtendsAssignment_2_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2430:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2431:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2431:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2432:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); 
            }
            // InternalOSSWP.g:2433:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2434:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2445:1: rule__MOSSwPackage__VersionAssignment_4_0_2 : ( ruleVersion ) ;
    public final void rule__MOSSwPackage__VersionAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2449:1: ( ( ruleVersion ) )
            // InternalOSSWP.g:2450:1: ( ruleVersion )
            {
            // InternalOSSWP.g:2450:1: ( ruleVersion )
            // InternalOSSWP.g:2451:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:2460:1: rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ReferencedElementAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2464:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2465:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2465:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2466:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); 
            }
            // InternalOSSWP.g:2467:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2468:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__MOSSwPackage__CtoolsAssignment_4_2_3"
    // InternalOSSWP.g:2479:1: rule__MOSSwPackage__CtoolsAssignment_4_2_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__CtoolsAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2483:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2484:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2484:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2485:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0()); 
            }
            // InternalOSSWP.g:2486:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2487:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__CtoolsAssignment_4_2_3"


    // $ANTLR start "rule__MOSSwPackage__CtoolsAssignment_4_2_4_1"
    // InternalOSSWP.g:2498:1: rule__MOSSwPackage__CtoolsAssignment_4_2_4_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__CtoolsAssignment_4_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2502:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2503:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2503:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2504:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0()); 
            }
            // InternalOSSWP.g:2505:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2506:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__CtoolsAssignment_4_2_4_1"


    // $ANTLR start "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3"
    // InternalOSSWP.g:2517:1: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2521:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2522:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2522:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2523:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0()); 
            }
            // InternalOSSWP.g:2524:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2525:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3"


    // $ANTLR start "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1"
    // InternalOSSWP.g:2536:1: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWP.g:2540:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWP.g:2541:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWP.g:2541:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWP.g:2542:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0()); 
            }
            // InternalOSSWP.g:2543:1: ( ruleVersionedQualifiedName )
            // InternalOSSWP.g:2544:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1"

    // $ANTLR start synpred12_InternalOSSWP
    public final void synpred12_InternalOSSWP_fragment() throws RecognitionException {   
        // InternalOSSWP.g:2203:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) )
        // InternalOSSWP.g:2203:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
        {
        // InternalOSSWP.g:2203:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
        // InternalOSSWP.g:2204:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalOSSWP.g:2204:109: ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
        // InternalOSSWP.g:2205:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
        // InternalOSSWP.g:2211:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
        // InternalOSSWP.g:2213:7: ( rule__MOSSwPackage__Group_4_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); 
        }
        // InternalOSSWP.g:2214:7: ( rule__MOSSwPackage__Group_4_0__0 )
        // InternalOSSWP.g:2214:8: rule__MOSSwPackage__Group_4_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalOSSWP.g:2220:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) )
        // InternalOSSWP.g:2220:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
        {
        // InternalOSSWP.g:2220:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
        // InternalOSSWP.g:2221:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalOSSWP.g:2221:109: ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
        // InternalOSSWP.g:2222:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
        // InternalOSSWP.g:2228:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
        // InternalOSSWP.g:2230:7: ( rule__MOSSwPackage__Group_4_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); 
        }
        // InternalOSSWP.g:2231:7: ( rule__MOSSwPackage__Group_4_1__0 )
        // InternalOSSWP.g:2231:8: rule__MOSSwPackage__Group_4_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalOSSWP.g:2237:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) )
        // InternalOSSWP.g:2237:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
        {
        // InternalOSSWP.g:2237:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
        // InternalOSSWP.g:2238:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalOSSWP.g:2238:109: ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
        // InternalOSSWP.g:2239:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
        // InternalOSSWP.g:2245:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
        // InternalOSSWP.g:2247:7: ( rule__MOSSwPackage__Group_4_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); 
        }
        // InternalOSSWP.g:2248:7: ( rule__MOSSwPackage__Group_4_2__0 )
        // InternalOSSWP.g:2248:8: rule__MOSSwPackage__Group_4_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalOSSWP.g:2286:2: ( rule__MOSSwPackage__UnorderedGroup_4__1 )
        // InternalOSSWP.g:2286:2: rule__MOSSwPackage__UnorderedGroup_4__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwPackage__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalOSSWP

    // $ANTLR start synpred16_InternalOSSWP
    public final void synpred16_InternalOSSWP_fragment() throws RecognitionException {   
        // InternalOSSWP.g:2299:2: ( rule__MOSSwPackage__UnorderedGroup_4__2 )
        // InternalOSSWP.g:2299:2: rule__MOSSwPackage__UnorderedGroup_4__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwPackage__UnorderedGroup_4__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalOSSWP

    // $ANTLR start synpred17_InternalOSSWP
    public final void synpred17_InternalOSSWP_fragment() throws RecognitionException {   
        // InternalOSSWP.g:2312:2: ( rule__MOSSwPackage__UnorderedGroup_4__3 )
        // InternalOSSWP.g:2312:2: rule__MOSSwPackage__UnorderedGroup_4__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwPackage__UnorderedGroup_4__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalOSSWP

    // Delegated rules

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
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000B400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000B400002L});
    }


}