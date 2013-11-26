package es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal; 

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
import es.uah.aut.srg.micobs.lang.services.LANGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLANGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'language'", "'{'", "'version'", "':='", "'}'", "'extends'", "','"
    };
    public static final int RULE_ID=5;
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


        public InternalLANGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLANGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLANGParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g"; }


     
     	private LANGGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LANGGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMSYSTEMPackageFile"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:61:1: entryRuleMSYSTEMPackageFile : ruleMSYSTEMPackageFile EOF ;
    public final void entryRuleMSYSTEMPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:62:1: ( ruleMSYSTEMPackageFile EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:63:1: ruleMSYSTEMPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageFile_in_entryRuleMSYSTEMPackageFile67);
            ruleMSYSTEMPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMSYSTEMPackageFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMSYSTEMPackageFile"


    // $ANTLR start "ruleMSYSTEMPackageFile"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:70:1: ruleMSYSTEMPackageFile : ( ( rule__MSYSTEMPackageFile__Group__0 ) ) ;
    public final void ruleMSYSTEMPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:74:2: ( ( ( rule__MSYSTEMPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:75:1: ( ( rule__MSYSTEMPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:75:1: ( ( rule__MSYSTEMPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:76:1: ( rule__MSYSTEMPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:77:1: ( rule__MSYSTEMPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:77:2: rule__MSYSTEMPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__0_in_ruleMSYSTEMPackageFile100);
            rule__MSYSTEMPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMSYSTEMPackageFile"


    // $ANTLR start "entryRuleMSYSTEMPackageElement"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:89:1: entryRuleMSYSTEMPackageElement : ruleMSYSTEMPackageElement EOF ;
    public final void entryRuleMSYSTEMPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:90:1: ( ruleMSYSTEMPackageElement EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:91:1: ruleMSYSTEMPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageElement_in_entryRuleMSYSTEMPackageElement127);
            ruleMSYSTEMPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMSYSTEMPackageElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMSYSTEMPackageElement"


    // $ANTLR start "ruleMSYSTEMPackageElement"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:98:1: ruleMSYSTEMPackageElement : ( ruleMLanguage ) ;
    public final void ruleMSYSTEMPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:102:2: ( ( ruleMLanguage ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:103:1: ( ruleMLanguage )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:103:1: ( ruleMLanguage )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:104:1: ruleMLanguage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageElementAccess().getMLanguageParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMLanguage_in_ruleMSYSTEMPackageElement160);
            ruleMLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageElementAccess().getMLanguageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMSYSTEMPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:118:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:119:1: ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:133:2: rule__QualifiedName__Group__0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:146:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:147:1: ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:159:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:161:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:161:2: rule__Version__Group__0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:174:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:175:1: ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:189:2: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleMLanguage"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:201:1: entryRuleMLanguage : ruleMLanguage EOF ;
    public final void entryRuleMLanguage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:202:1: ( ruleMLanguage EOF )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:203:1: ruleMLanguage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMLanguage_in_entryRuleMLanguage366);
            ruleMLanguage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMLanguage373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMLanguage"


    // $ANTLR start "ruleMLanguage"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:210:1: ruleMLanguage : ( ( rule__MLanguage__Group__0 ) ) ;
    public final void ruleMLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:214:2: ( ( ( rule__MLanguage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:215:1: ( ( rule__MLanguage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:215:1: ( ( rule__MLanguage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:216:1: ( rule__MLanguage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:217:1: ( rule__MLanguage__Group__0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:217:2: rule__MLanguage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__0_in_ruleMLanguage399);
            rule__MLanguage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLanguage"


    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:229:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:233:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:234:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:234:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:235:1: RULE_INT
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
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:241:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:242:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:242:2: rule__Version__Group_0_1__0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:251:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:255:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:256:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:256:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:257:1: RULE_INT
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
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:263:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:264:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:264:2: rule__Version__Group_1_1_1__0
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


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:275:1: rule__MSYSTEMPackageFile__Group__0 : rule__MSYSTEMPackageFile__Group__0__Impl rule__MSYSTEMPackageFile__Group__1 ;
    public final void rule__MSYSTEMPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:279:1: ( rule__MSYSTEMPackageFile__Group__0__Impl rule__MSYSTEMPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:280:2: rule__MSYSTEMPackageFile__Group__0__Impl rule__MSYSTEMPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__0__Impl_in_rule__MSYSTEMPackageFile__Group__0533);
            rule__MSYSTEMPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__1_in_rule__MSYSTEMPackageFile__Group__0536);
            rule__MSYSTEMPackageFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__0"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:287:1: rule__MSYSTEMPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MSYSTEMPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:291:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:292:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:292:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:293:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MSYSTEMPackageFile__Group__0__Impl564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:306:1: rule__MSYSTEMPackageFile__Group__1 : rule__MSYSTEMPackageFile__Group__1__Impl rule__MSYSTEMPackageFile__Group__2 ;
    public final void rule__MSYSTEMPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:310:1: ( rule__MSYSTEMPackageFile__Group__1__Impl rule__MSYSTEMPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:311:2: rule__MSYSTEMPackageFile__Group__1__Impl rule__MSYSTEMPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__1__Impl_in_rule__MSYSTEMPackageFile__Group__1595);
            rule__MSYSTEMPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__2_in_rule__MSYSTEMPackageFile__Group__1598);
            rule__MSYSTEMPackageFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__1"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:318:1: rule__MSYSTEMPackageFile__Group__1__Impl : ( ( rule__MSYSTEMPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MSYSTEMPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:322:1: ( ( ( rule__MSYSTEMPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:323:1: ( ( rule__MSYSTEMPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:323:1: ( ( rule__MSYSTEMPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:324:1: ( rule__MSYSTEMPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getPackageAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:325:1: ( rule__MSYSTEMPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:325:2: rule__MSYSTEMPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__PackageAssignment_1_in_rule__MSYSTEMPackageFile__Group__1__Impl625);
            rule__MSYSTEMPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getPackageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:335:1: rule__MSYSTEMPackageFile__Group__2 : rule__MSYSTEMPackageFile__Group__2__Impl rule__MSYSTEMPackageFile__Group__3 ;
    public final void rule__MSYSTEMPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:339:1: ( rule__MSYSTEMPackageFile__Group__2__Impl rule__MSYSTEMPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:340:2: rule__MSYSTEMPackageFile__Group__2__Impl rule__MSYSTEMPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__2__Impl_in_rule__MSYSTEMPackageFile__Group__2655);
            rule__MSYSTEMPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__3_in_rule__MSYSTEMPackageFile__Group__2658);
            rule__MSYSTEMPackageFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__2"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:347:1: rule__MSYSTEMPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MSYSTEMPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:351:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:352:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:352:1: ( ';' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:353:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MSYSTEMPackageFile__Group__2__Impl686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:366:1: rule__MSYSTEMPackageFile__Group__3 : rule__MSYSTEMPackageFile__Group__3__Impl rule__MSYSTEMPackageFile__Group__4 ;
    public final void rule__MSYSTEMPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:370:1: ( rule__MSYSTEMPackageFile__Group__3__Impl rule__MSYSTEMPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:371:2: rule__MSYSTEMPackageFile__Group__3__Impl rule__MSYSTEMPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__3__Impl_in_rule__MSYSTEMPackageFile__Group__3717);
            rule__MSYSTEMPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__4_in_rule__MSYSTEMPackageFile__Group__3720);
            rule__MSYSTEMPackageFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__3"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:378:1: rule__MSYSTEMPackageFile__Group__3__Impl : ( ( rule__MSYSTEMPackageFile__Group_3__0 )* ) ;
    public final void rule__MSYSTEMPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:382:1: ( ( ( rule__MSYSTEMPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:383:1: ( ( rule__MSYSTEMPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:383:1: ( ( rule__MSYSTEMPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:384:1: ( rule__MSYSTEMPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:385:1: ( rule__MSYSTEMPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:385:2: rule__MSYSTEMPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__0_in_rule__MSYSTEMPackageFile__Group__3__Impl747);
            	    rule__MSYSTEMPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:395:1: rule__MSYSTEMPackageFile__Group__4 : rule__MSYSTEMPackageFile__Group__4__Impl ;
    public final void rule__MSYSTEMPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:399:1: ( rule__MSYSTEMPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:400:2: rule__MSYSTEMPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group__4__Impl_in_rule__MSYSTEMPackageFile__Group__4778);
            rule__MSYSTEMPackageFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__4"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:406:1: rule__MSYSTEMPackageFile__Group__4__Impl : ( ( rule__MSYSTEMPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MSYSTEMPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:410:1: ( ( ( rule__MSYSTEMPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:411:1: ( ( rule__MSYSTEMPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:411:1: ( ( rule__MSYSTEMPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:412:1: ( rule__MSYSTEMPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getElementAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:413:1: ( rule__MSYSTEMPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:413:2: rule__MSYSTEMPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__ElementAssignment_4_in_rule__MSYSTEMPackageFile__Group__4__Impl805);
            rule__MSYSTEMPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getElementAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:433:1: rule__MSYSTEMPackageFile__Group_3__0 : rule__MSYSTEMPackageFile__Group_3__0__Impl rule__MSYSTEMPackageFile__Group_3__1 ;
    public final void rule__MSYSTEMPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:437:1: ( rule__MSYSTEMPackageFile__Group_3__0__Impl rule__MSYSTEMPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:438:2: rule__MSYSTEMPackageFile__Group_3__0__Impl rule__MSYSTEMPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__0__Impl_in_rule__MSYSTEMPackageFile__Group_3__0845);
            rule__MSYSTEMPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__1_in_rule__MSYSTEMPackageFile__Group_3__0848);
            rule__MSYSTEMPackageFile__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__0"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:445:1: rule__MSYSTEMPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MSYSTEMPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:449:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:450:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:450:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:451:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MSYSTEMPackageFile__Group_3__0__Impl876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getImportKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:464:1: rule__MSYSTEMPackageFile__Group_3__1 : rule__MSYSTEMPackageFile__Group_3__1__Impl rule__MSYSTEMPackageFile__Group_3__2 ;
    public final void rule__MSYSTEMPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:468:1: ( rule__MSYSTEMPackageFile__Group_3__1__Impl rule__MSYSTEMPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:469:2: rule__MSYSTEMPackageFile__Group_3__1__Impl rule__MSYSTEMPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__1__Impl_in_rule__MSYSTEMPackageFile__Group_3__1907);
            rule__MSYSTEMPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__2_in_rule__MSYSTEMPackageFile__Group_3__1910);
            rule__MSYSTEMPackageFile__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__1"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:476:1: rule__MSYSTEMPackageFile__Group_3__1__Impl : ( ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MSYSTEMPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:480:1: ( ( ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:481:1: ( ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:481:1: ( ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:482:1: ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:483:1: ( rule__MSYSTEMPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:483:2: rule__MSYSTEMPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__ImportsAssignment_3_1_in_rule__MSYSTEMPackageFile__Group_3__1__Impl937);
            rule__MSYSTEMPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getImportsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:493:1: rule__MSYSTEMPackageFile__Group_3__2 : rule__MSYSTEMPackageFile__Group_3__2__Impl ;
    public final void rule__MSYSTEMPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:497:1: ( rule__MSYSTEMPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:498:2: rule__MSYSTEMPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MSYSTEMPackageFile__Group_3__2__Impl_in_rule__MSYSTEMPackageFile__Group_3__2967);
            rule__MSYSTEMPackageFile__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__2"


    // $ANTLR start "rule__MSYSTEMPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:504:1: rule__MSYSTEMPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MSYSTEMPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:508:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:509:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:509:1: ( ';' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:510:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MSYSTEMPackageFile__Group_3__2__Impl995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:529:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:533:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:534:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:541:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:545:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:546:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:546:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:547:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:558:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:562:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:563:2: rule__QualifiedName__Group__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:569:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:573:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:575:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:576:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:576:2: rule__QualifiedName__Group_1__0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:590:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:594:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:595:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:602:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:606:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:607:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:607:1: ( '.' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:608:1: '.'
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:621:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:625:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:626:2: rule__QualifiedName__Group_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:632:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:636:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:637:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:637:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:638:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:653:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:657:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:658:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:665:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:669:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:671:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:672:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:672:2: rule__Version__Alternatives_0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:682:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:686:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:687:2: rule__Version__Group__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:693:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:697:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:698:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:698:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:699:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:700:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:700:2: rule__Version__Group_1__0
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:714:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:718:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:719:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:726:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:730:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:731:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:731:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:732:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:733:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:733:3: RULE_INT
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:743:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:747:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:748:2: rule__Version__Group_0_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:754:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:758:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:759:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:759:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:760:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:775:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:779:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:780:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:787:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:791:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:792:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:792:1: ( '.' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:793:1: '.'
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:806:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:810:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:811:2: rule__Version__Group_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:817:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:821:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:823:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:824:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:824:2: rule__Version__Alternatives_1_1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:838:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:842:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:843:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:850:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:854:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:855:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:855:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:856:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:857:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:857:3: RULE_INT
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:867:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:871:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:872:2: rule__Version__Group_1_1_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:878:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:882:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:883:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:883:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:884:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:899:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:903:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:904:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:911:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:915:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:916:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:916:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:917:1: ruleQualifiedName
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:928:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:932:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:933:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:940:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:944:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:945:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:945:1: ( '(' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:946:1: '('
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:959:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:963:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:964:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:971:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:975:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:976:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:976:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:977:1: ruleVersion
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:988:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:992:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:993:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:999:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1003:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1004:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1004:1: ( ')' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1005:1: ')'
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


    // $ANTLR start "rule__MLanguage__Group__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1026:1: rule__MLanguage__Group__0 : rule__MLanguage__Group__0__Impl rule__MLanguage__Group__1 ;
    public final void rule__MLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1030:1: ( rule__MLanguage__Group__0__Impl rule__MLanguage__Group__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1031:2: rule__MLanguage__Group__0__Impl rule__MLanguage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__0__Impl_in_rule__MLanguage__Group__02011);
            rule__MLanguage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__1_in_rule__MLanguage__Group__02014);
            rule__MLanguage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__0"


    // $ANTLR start "rule__MLanguage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1038:1: rule__MLanguage__Group__0__Impl : ( 'language' ) ;
    public final void rule__MLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1042:1: ( ( 'language' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1043:1: ( 'language' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1043:1: ( 'language' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1044:1: 'language'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getLanguageKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MLanguage__Group__0__Impl2042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getLanguageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__0__Impl"


    // $ANTLR start "rule__MLanguage__Group__1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1057:1: rule__MLanguage__Group__1 : rule__MLanguage__Group__1__Impl rule__MLanguage__Group__2 ;
    public final void rule__MLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1061:1: ( rule__MLanguage__Group__1__Impl rule__MLanguage__Group__2 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1062:2: rule__MLanguage__Group__1__Impl rule__MLanguage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__1__Impl_in_rule__MLanguage__Group__12073);
            rule__MLanguage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__2_in_rule__MLanguage__Group__12076);
            rule__MLanguage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__1"


    // $ANTLR start "rule__MLanguage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1069:1: rule__MLanguage__Group__1__Impl : ( ( rule__MLanguage__NameAssignment_1 ) ) ;
    public final void rule__MLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1073:1: ( ( ( rule__MLanguage__NameAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1074:1: ( ( rule__MLanguage__NameAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1074:1: ( ( rule__MLanguage__NameAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1075:1: ( rule__MLanguage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getNameAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1076:1: ( rule__MLanguage__NameAssignment_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1076:2: rule__MLanguage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__NameAssignment_1_in_rule__MLanguage__Group__1__Impl2103);
            rule__MLanguage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__1__Impl"


    // $ANTLR start "rule__MLanguage__Group__2"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1086:1: rule__MLanguage__Group__2 : rule__MLanguage__Group__2__Impl rule__MLanguage__Group__3 ;
    public final void rule__MLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1090:1: ( rule__MLanguage__Group__2__Impl rule__MLanguage__Group__3 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1091:2: rule__MLanguage__Group__2__Impl rule__MLanguage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__2__Impl_in_rule__MLanguage__Group__22133);
            rule__MLanguage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__3_in_rule__MLanguage__Group__22136);
            rule__MLanguage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__2"


    // $ANTLR start "rule__MLanguage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1098:1: rule__MLanguage__Group__2__Impl : ( ( rule__MLanguage__Group_2__0 )? ) ;
    public final void rule__MLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1102:1: ( ( ( rule__MLanguage__Group_2__0 )? ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1103:1: ( ( rule__MLanguage__Group_2__0 )? )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1103:1: ( ( rule__MLanguage__Group_2__0 )? )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1104:1: ( rule__MLanguage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getGroup_2()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1105:1: ( rule__MLanguage__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1105:2: rule__MLanguage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__0_in_rule__MLanguage__Group__2__Impl2163);
                    rule__MLanguage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__2__Impl"


    // $ANTLR start "rule__MLanguage__Group__3"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1115:1: rule__MLanguage__Group__3 : rule__MLanguage__Group__3__Impl rule__MLanguage__Group__4 ;
    public final void rule__MLanguage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1119:1: ( rule__MLanguage__Group__3__Impl rule__MLanguage__Group__4 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1120:2: rule__MLanguage__Group__3__Impl rule__MLanguage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__3__Impl_in_rule__MLanguage__Group__32194);
            rule__MLanguage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__4_in_rule__MLanguage__Group__32197);
            rule__MLanguage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__3"


    // $ANTLR start "rule__MLanguage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1127:1: rule__MLanguage__Group__3__Impl : ( '{' ) ;
    public final void rule__MLanguage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1131:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1132:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1132:1: ( '{' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1133:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MLanguage__Group__3__Impl2225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__3__Impl"


    // $ANTLR start "rule__MLanguage__Group__4"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1146:1: rule__MLanguage__Group__4 : rule__MLanguage__Group__4__Impl rule__MLanguage__Group__5 ;
    public final void rule__MLanguage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1150:1: ( rule__MLanguage__Group__4__Impl rule__MLanguage__Group__5 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1151:2: rule__MLanguage__Group__4__Impl rule__MLanguage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__4__Impl_in_rule__MLanguage__Group__42256);
            rule__MLanguage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__5_in_rule__MLanguage__Group__42259);
            rule__MLanguage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__4"


    // $ANTLR start "rule__MLanguage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1158:1: rule__MLanguage__Group__4__Impl : ( 'version' ) ;
    public final void rule__MLanguage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1162:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1163:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1163:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1164:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getVersionKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MLanguage__Group__4__Impl2287); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getVersionKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__4__Impl"


    // $ANTLR start "rule__MLanguage__Group__5"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1177:1: rule__MLanguage__Group__5 : rule__MLanguage__Group__5__Impl rule__MLanguage__Group__6 ;
    public final void rule__MLanguage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1181:1: ( rule__MLanguage__Group__5__Impl rule__MLanguage__Group__6 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1182:2: rule__MLanguage__Group__5__Impl rule__MLanguage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__5__Impl_in_rule__MLanguage__Group__52318);
            rule__MLanguage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__6_in_rule__MLanguage__Group__52321);
            rule__MLanguage__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__5"


    // $ANTLR start "rule__MLanguage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1189:1: rule__MLanguage__Group__5__Impl : ( ':=' ) ;
    public final void rule__MLanguage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1193:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1194:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1194:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1195:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getColonEqualsSignKeyword_5()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MLanguage__Group__5__Impl2349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getColonEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__5__Impl"


    // $ANTLR start "rule__MLanguage__Group__6"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1208:1: rule__MLanguage__Group__6 : rule__MLanguage__Group__6__Impl rule__MLanguage__Group__7 ;
    public final void rule__MLanguage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1212:1: ( rule__MLanguage__Group__6__Impl rule__MLanguage__Group__7 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1213:2: rule__MLanguage__Group__6__Impl rule__MLanguage__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__6__Impl_in_rule__MLanguage__Group__62380);
            rule__MLanguage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__7_in_rule__MLanguage__Group__62383);
            rule__MLanguage__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__6"


    // $ANTLR start "rule__MLanguage__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1220:1: rule__MLanguage__Group__6__Impl : ( ( rule__MLanguage__VersionAssignment_6 ) ) ;
    public final void rule__MLanguage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1224:1: ( ( ( rule__MLanguage__VersionAssignment_6 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1225:1: ( ( rule__MLanguage__VersionAssignment_6 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1225:1: ( ( rule__MLanguage__VersionAssignment_6 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1226:1: ( rule__MLanguage__VersionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getVersionAssignment_6()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1227:1: ( rule__MLanguage__VersionAssignment_6 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1227:2: rule__MLanguage__VersionAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__VersionAssignment_6_in_rule__MLanguage__Group__6__Impl2410);
            rule__MLanguage__VersionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getVersionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__6__Impl"


    // $ANTLR start "rule__MLanguage__Group__7"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1237:1: rule__MLanguage__Group__7 : rule__MLanguage__Group__7__Impl rule__MLanguage__Group__8 ;
    public final void rule__MLanguage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1241:1: ( rule__MLanguage__Group__7__Impl rule__MLanguage__Group__8 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1242:2: rule__MLanguage__Group__7__Impl rule__MLanguage__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__7__Impl_in_rule__MLanguage__Group__72440);
            rule__MLanguage__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__8_in_rule__MLanguage__Group__72443);
            rule__MLanguage__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__7"


    // $ANTLR start "rule__MLanguage__Group__7__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1249:1: rule__MLanguage__Group__7__Impl : ( ';' ) ;
    public final void rule__MLanguage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1253:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1254:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1254:1: ( ';' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1255:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getSemicolonKeyword_7()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MLanguage__Group__7__Impl2471); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__7__Impl"


    // $ANTLR start "rule__MLanguage__Group__8"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1268:1: rule__MLanguage__Group__8 : rule__MLanguage__Group__8__Impl rule__MLanguage__Group__9 ;
    public final void rule__MLanguage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1272:1: ( rule__MLanguage__Group__8__Impl rule__MLanguage__Group__9 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1273:2: rule__MLanguage__Group__8__Impl rule__MLanguage__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__8__Impl_in_rule__MLanguage__Group__82502);
            rule__MLanguage__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__9_in_rule__MLanguage__Group__82505);
            rule__MLanguage__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__8"


    // $ANTLR start "rule__MLanguage__Group__8__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1280:1: rule__MLanguage__Group__8__Impl : ( '}' ) ;
    public final void rule__MLanguage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1284:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1285:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1285:1: ( '}' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1286:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MLanguage__Group__8__Impl2533); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__8__Impl"


    // $ANTLR start "rule__MLanguage__Group__9"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1299:1: rule__MLanguage__Group__9 : rule__MLanguage__Group__9__Impl ;
    public final void rule__MLanguage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1303:1: ( rule__MLanguage__Group__9__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1304:2: rule__MLanguage__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group__9__Impl_in_rule__MLanguage__Group__92564);
            rule__MLanguage__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__9"


    // $ANTLR start "rule__MLanguage__Group__9__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1310:1: rule__MLanguage__Group__9__Impl : ( ';' ) ;
    public final void rule__MLanguage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1314:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1315:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1315:1: ( ';' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1316:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getSemicolonKeyword_9()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MLanguage__Group__9__Impl2592); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group__9__Impl"


    // $ANTLR start "rule__MLanguage__Group_2__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1349:1: rule__MLanguage__Group_2__0 : rule__MLanguage__Group_2__0__Impl rule__MLanguage__Group_2__1 ;
    public final void rule__MLanguage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1353:1: ( rule__MLanguage__Group_2__0__Impl rule__MLanguage__Group_2__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1354:2: rule__MLanguage__Group_2__0__Impl rule__MLanguage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__0__Impl_in_rule__MLanguage__Group_2__02643);
            rule__MLanguage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__1_in_rule__MLanguage__Group_2__02646);
            rule__MLanguage__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__0"


    // $ANTLR start "rule__MLanguage__Group_2__0__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1361:1: rule__MLanguage__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MLanguage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1365:1: ( ( 'extends' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1366:1: ( 'extends' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1366:1: ( 'extends' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1367:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsKeyword_2_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MLanguage__Group_2__0__Impl2674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__0__Impl"


    // $ANTLR start "rule__MLanguage__Group_2__1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1380:1: rule__MLanguage__Group_2__1 : rule__MLanguage__Group_2__1__Impl rule__MLanguage__Group_2__2 ;
    public final void rule__MLanguage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1384:1: ( rule__MLanguage__Group_2__1__Impl rule__MLanguage__Group_2__2 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1385:2: rule__MLanguage__Group_2__1__Impl rule__MLanguage__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__1__Impl_in_rule__MLanguage__Group_2__12705);
            rule__MLanguage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__2_in_rule__MLanguage__Group_2__12708);
            rule__MLanguage__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__1"


    // $ANTLR start "rule__MLanguage__Group_2__1__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1392:1: rule__MLanguage__Group_2__1__Impl : ( ( rule__MLanguage__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MLanguage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1396:1: ( ( ( rule__MLanguage__ExtendsAssignment_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1397:1: ( ( rule__MLanguage__ExtendsAssignment_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1397:1: ( ( rule__MLanguage__ExtendsAssignment_2_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1398:1: ( rule__MLanguage__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1399:1: ( rule__MLanguage__ExtendsAssignment_2_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1399:2: rule__MLanguage__ExtendsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__ExtendsAssignment_2_1_in_rule__MLanguage__Group_2__1__Impl2735);
            rule__MLanguage__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__1__Impl"


    // $ANTLR start "rule__MLanguage__Group_2__2"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1409:1: rule__MLanguage__Group_2__2 : rule__MLanguage__Group_2__2__Impl ;
    public final void rule__MLanguage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1413:1: ( rule__MLanguage__Group_2__2__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1414:2: rule__MLanguage__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2__2__Impl_in_rule__MLanguage__Group_2__22765);
            rule__MLanguage__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__2"


    // $ANTLR start "rule__MLanguage__Group_2__2__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1420:1: rule__MLanguage__Group_2__2__Impl : ( ( rule__MLanguage__Group_2_2__0 )* ) ;
    public final void rule__MLanguage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1424:1: ( ( ( rule__MLanguage__Group_2_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1425:1: ( ( rule__MLanguage__Group_2_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1425:1: ( ( rule__MLanguage__Group_2_2__0 )* )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1426:1: ( rule__MLanguage__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getGroup_2_2()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1427:1: ( rule__MLanguage__Group_2_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1427:2: rule__MLanguage__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2_2__0_in_rule__MLanguage__Group_2__2__Impl2792);
            	    rule__MLanguage__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2__2__Impl"


    // $ANTLR start "rule__MLanguage__Group_2_2__0"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1443:1: rule__MLanguage__Group_2_2__0 : rule__MLanguage__Group_2_2__0__Impl rule__MLanguage__Group_2_2__1 ;
    public final void rule__MLanguage__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1447:1: ( rule__MLanguage__Group_2_2__0__Impl rule__MLanguage__Group_2_2__1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1448:2: rule__MLanguage__Group_2_2__0__Impl rule__MLanguage__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2_2__0__Impl_in_rule__MLanguage__Group_2_2__02829);
            rule__MLanguage__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2_2__1_in_rule__MLanguage__Group_2_2__02832);
            rule__MLanguage__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2_2__0"


    // $ANTLR start "rule__MLanguage__Group_2_2__0__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1455:1: rule__MLanguage__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MLanguage__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1459:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1460:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1460:1: ( ',' )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1461:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MLanguage__Group_2_2__0__Impl2860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2_2__0__Impl"


    // $ANTLR start "rule__MLanguage__Group_2_2__1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1474:1: rule__MLanguage__Group_2_2__1 : rule__MLanguage__Group_2_2__1__Impl ;
    public final void rule__MLanguage__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1478:1: ( rule__MLanguage__Group_2_2__1__Impl )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1479:2: rule__MLanguage__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__Group_2_2__1__Impl_in_rule__MLanguage__Group_2_2__12891);
            rule__MLanguage__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2_2__1"


    // $ANTLR start "rule__MLanguage__Group_2_2__1__Impl"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1485:1: rule__MLanguage__Group_2_2__1__Impl : ( ( rule__MLanguage__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__MLanguage__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1489:1: ( ( ( rule__MLanguage__ExtendsAssignment_2_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1490:1: ( ( rule__MLanguage__ExtendsAssignment_2_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1490:1: ( ( rule__MLanguage__ExtendsAssignment_2_2_1 ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1491:1: ( rule__MLanguage__ExtendsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_2_1()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1492:1: ( rule__MLanguage__ExtendsAssignment_2_2_1 )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1492:2: rule__MLanguage__ExtendsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MLanguage__ExtendsAssignment_2_2_1_in_rule__MLanguage__Group_2_2__1__Impl2918);
            rule__MLanguage__ExtendsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__Group_2_2__1__Impl"


    // $ANTLR start "rule__MSYSTEMPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1507:1: rule__MSYSTEMPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MSYSTEMPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1511:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1512:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1512:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1513:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1514:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1515:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MSYSTEMPackageFile__PackageAssignment_12961);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MSYSTEMPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1526:1: rule__MSYSTEMPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MSYSTEMPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1530:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1531:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1531:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1532:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageCrossReference_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1533:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1534:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MSYSTEMPackageFile__ImportsAssignment_3_13000);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MSYSTEMPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1545:1: rule__MSYSTEMPackageFile__ElementAssignment_4 : ( ruleMSYSTEMPackageElement ) ;
    public final void rule__MSYSTEMPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1549:1: ( ( ruleMSYSTEMPackageElement ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1550:1: ( ruleMSYSTEMPackageElement )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1550:1: ( ruleMSYSTEMPackageElement )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1551:1: ruleMSYSTEMPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSYSTEMPackageFileAccess().getElementMSYSTEMPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageElement_in_rule__MSYSTEMPackageFile__ElementAssignment_43035);
            ruleMSYSTEMPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSYSTEMPackageFileAccess().getElementMSYSTEMPackageElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSYSTEMPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MLanguage__NameAssignment_1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1560:1: rule__MLanguage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MLanguage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1564:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1565:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1565:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1566:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MLanguage__NameAssignment_13066); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__NameAssignment_1"


    // $ANTLR start "rule__MLanguage__ExtendsAssignment_2_1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1575:1: rule__MLanguage__ExtendsAssignment_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MLanguage__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1579:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1580:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1580:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1581:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1582:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1583:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MLanguage__ExtendsAssignment_2_13101);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__ExtendsAssignment_2_1"


    // $ANTLR start "rule__MLanguage__ExtendsAssignment_2_2_1"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1594:1: rule__MLanguage__ExtendsAssignment_2_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MLanguage__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1598:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1599:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1599:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1600:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_2_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1601:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1602:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MLanguage__ExtendsAssignment_2_2_13140);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__ExtendsAssignment_2_2_1"


    // $ANTLR start "rule__MLanguage__VersionAssignment_6"
    // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1613:1: rule__MLanguage__VersionAssignment_6 : ( ruleVersion ) ;
    public final void rule__MLanguage__VersionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1617:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1618:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1618:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.editor.lang.ui/src-gen/es/uah/aut/srg/micobs/lang/ui/contentassist/antlr/internal/InternalLANG.g:1619:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMLanguageAccess().getVersionVersionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__MLanguage__VersionAssignment_63175);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMLanguageAccess().getVersionVersionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLanguage__VersionAssignment_6"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMSYSTEMPackageFile_in_entryRuleMSYSTEMPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMSYSTEMPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__0_in_ruleMSYSTEMPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMSYSTEMPackageElement_in_entryRuleMSYSTEMPackageElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMSYSTEMPackageElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMLanguage_in_ruleMSYSTEMPackageElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMLanguage_in_entryRuleMLanguage366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMLanguage373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__0_in_ruleMLanguage399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__0__Impl_in_rule__MSYSTEMPackageFile__Group__0533 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__1_in_rule__MSYSTEMPackageFile__Group__0536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MSYSTEMPackageFile__Group__0__Impl564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__1__Impl_in_rule__MSYSTEMPackageFile__Group__1595 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__2_in_rule__MSYSTEMPackageFile__Group__1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__PackageAssignment_1_in_rule__MSYSTEMPackageFile__Group__1__Impl625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__2__Impl_in_rule__MSYSTEMPackageFile__Group__2655 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__3_in_rule__MSYSTEMPackageFile__Group__2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MSYSTEMPackageFile__Group__2__Impl686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__3__Impl_in_rule__MSYSTEMPackageFile__Group__3717 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__4_in_rule__MSYSTEMPackageFile__Group__3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__0_in_rule__MSYSTEMPackageFile__Group__3__Impl747 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group__4__Impl_in_rule__MSYSTEMPackageFile__Group__4778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__ElementAssignment_4_in_rule__MSYSTEMPackageFile__Group__4__Impl805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__0__Impl_in_rule__MSYSTEMPackageFile__Group_3__0845 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__1_in_rule__MSYSTEMPackageFile__Group_3__0848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MSYSTEMPackageFile__Group_3__0__Impl876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__1__Impl_in_rule__MSYSTEMPackageFile__Group_3__1907 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__2_in_rule__MSYSTEMPackageFile__Group_3__1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__ImportsAssignment_3_1_in_rule__MSYSTEMPackageFile__Group_3__1__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MSYSTEMPackageFile__Group_3__2__Impl_in_rule__MSYSTEMPackageFile__Group_3__2967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MSYSTEMPackageFile__Group_3__2__Impl995 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__MLanguage__Group__0__Impl_in_rule__MLanguage__Group__02011 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__1_in_rule__MLanguage__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MLanguage__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__1__Impl_in_rule__MLanguage__Group__12073 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__2_in_rule__MLanguage__Group__12076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__NameAssignment_1_in_rule__MLanguage__Group__1__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__2__Impl_in_rule__MLanguage__Group__22133 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__3_in_rule__MLanguage__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__0_in_rule__MLanguage__Group__2__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__3__Impl_in_rule__MLanguage__Group__32194 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__4_in_rule__MLanguage__Group__32197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MLanguage__Group__3__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__4__Impl_in_rule__MLanguage__Group__42256 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__5_in_rule__MLanguage__Group__42259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MLanguage__Group__4__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__5__Impl_in_rule__MLanguage__Group__52318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__6_in_rule__MLanguage__Group__52321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MLanguage__Group__5__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__6__Impl_in_rule__MLanguage__Group__62380 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__7_in_rule__MLanguage__Group__62383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__VersionAssignment_6_in_rule__MLanguage__Group__6__Impl2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__7__Impl_in_rule__MLanguage__Group__72440 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__8_in_rule__MLanguage__Group__72443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MLanguage__Group__7__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__8__Impl_in_rule__MLanguage__Group__82502 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__9_in_rule__MLanguage__Group__82505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MLanguage__Group__8__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group__9__Impl_in_rule__MLanguage__Group__92564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MLanguage__Group__9__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__0__Impl_in_rule__MLanguage__Group_2__02643 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__1_in_rule__MLanguage__Group_2__02646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MLanguage__Group_2__0__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__1__Impl_in_rule__MLanguage__Group_2__12705 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__2_in_rule__MLanguage__Group_2__12708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__ExtendsAssignment_2_1_in_rule__MLanguage__Group_2__1__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2__2__Impl_in_rule__MLanguage__Group_2__22765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2_2__0_in_rule__MLanguage__Group_2__2__Impl2792 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2_2__0__Impl_in_rule__MLanguage__Group_2_2__02829 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2_2__1_in_rule__MLanguage__Group_2_2__02832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MLanguage__Group_2_2__0__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__Group_2_2__1__Impl_in_rule__MLanguage__Group_2_2__12891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MLanguage__ExtendsAssignment_2_2_1_in_rule__MLanguage__Group_2_2__1__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MSYSTEMPackageFile__PackageAssignment_12961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MSYSTEMPackageFile__ImportsAssignment_3_13000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMSYSTEMPackageElement_in_rule__MSYSTEMPackageFile__ElementAssignment_43035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MLanguage__NameAssignment_13066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MLanguage__ExtendsAssignment_2_13101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MLanguage__ExtendsAssignment_2_2_13140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__MLanguage__VersionAssignment_63175 = new BitSet(new long[]{0x0000000000000002L});
    }


}