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

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCADLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
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

    public InternalMCADLexer() {;} 
    public InternalMCADLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMCADLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMCAD.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:11:7: ( 'true' )
            // InternalMCAD.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12:7: ( 'false' )
            // InternalMCAD.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:13:7: ( '+' )
            // InternalMCAD.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:14:7: ( '-' )
            // InternalMCAD.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:15:7: ( '*' )
            // InternalMCAD.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:16:7: ( '/' )
            // InternalMCAD.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:17:7: ( 'package' )
            // InternalMCAD.g:17:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:18:7: ( ';' )
            // InternalMCAD.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:19:7: ( 'import' )
            // InternalMCAD.g:19:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:20:7: ( 'deployment' )
            // InternalMCAD.g:20:9: 'deployment'
            {
            match("deployment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:21:7: ( 'project' )
            // InternalMCAD.g:21:9: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:22:7: ( '{' )
            // InternalMCAD.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:23:7: ( '}' )
            // InternalMCAD.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:24:7: ( 'version' )
            // InternalMCAD.g:24:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:25:7: ( ':=' )
            // InternalMCAD.g:25:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:26:7: ( 'attribute' )
            // InternalMCAD.g:26:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:27:7: ( 'values' )
            // InternalMCAD.g:27:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:28:7: ( 'platforms' )
            // InternalMCAD.g:28:9: 'platforms'
            {
            match("platforms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:29:7: ( 'alternatives' )
            // InternalMCAD.g:29:9: 'alternatives'
            {
            match("alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:30:7: ( 'components' )
            // InternalMCAD.g:30:9: 'components'
            {
            match("components"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:31:7: ( 'connections' )
            // InternalMCAD.g:31:9: 'connections'
            {
            match("connections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:32:7: ( 'libraries' )
            // InternalMCAD.g:32:9: 'libraries'
            {
            match("libraries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:33:7: ( '.' )
            // InternalMCAD.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:34:7: ( '(' )
            // InternalMCAD.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:35:7: ( ')' )
            // InternalMCAD.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:36:7: ( '::' )
            // InternalMCAD.g:36:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:37:7: ( 'connection' )
            // InternalMCAD.g:37:9: 'connection'
            {
            match("connection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:38:7: ( '<->' )
            // InternalMCAD.g:38:9: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:39:7: ( 'using' )
            // InternalMCAD.g:39:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:40:7: ( 'mapping' )
            // InternalMCAD.g:40:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:41:7: ( 'switch' )
            // InternalMCAD.g:41:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:42:7: ( 'case' )
            // InternalMCAD.g:42:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:43:7: ( ':' )
            // InternalMCAD.g:43:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:44:7: ( 'instance' )
            // InternalMCAD.g:44:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:45:7: ( 'library' )
            // InternalMCAD.g:45:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:46:7: ( 'driver' )
            // InternalMCAD.g:46:9: 'driver'
            {
            match("driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:47:7: ( 'device' )
            // InternalMCAD.g:47:9: 'device'
            {
            match("device"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:48:7: ( 'mappings' )
            // InternalMCAD.g:48:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:49:7: ( 'supported' )
            // InternalMCAD.g:49:9: 'supported'
            {
            match("supported"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:50:7: ( '->' )
            // InternalMCAD.g:50:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:51:7: ( 'deployed' )
            // InternalMCAD.g:51:9: 'deployed'
            {
            match("deployed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:52:7: ( 'alternative' )
            // InternalMCAD.g:52:9: 'alternative'
            {
            match("alternative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:53:7: ( ',' )
            // InternalMCAD.g:53:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:54:7: ( 'platform' )
            // InternalMCAD.g:54:9: 'platform'
            {
            match("platform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:55:7: ( 'devices' )
            // InternalMCAD.g:55:9: 'devices'
            {
            match("devices"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:56:7: ( 'parameter' )
            // InternalMCAD.g:56:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:57:7: ( 'e' )
            // InternalMCAD.g:57:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:58:7: ( 'raw' )
            // InternalMCAD.g:58:9: 'raw'
            {
            match("raw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_HEXADECIMAL"
    public final void mRULE_HEXADECIMAL() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12396:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalMCAD.g:12396:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalMCAD.g:12396:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMCAD.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12398:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMCAD.g:12398:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMCAD.g:12398:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMCAD.g:12398:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMCAD.g:12398:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMCAD.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12400:10: ( ( '0' .. '9' )+ )
            // InternalMCAD.g:12400:12: ( '0' .. '9' )+
            {
            // InternalMCAD.g:12400:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMCAD.g:12400:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12402:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMCAD.g:12402:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMCAD.g:12402:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMCAD.g:12402:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMCAD.g:12402:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMCAD.g:12402:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCAD.g:12402:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMCAD.g:12402:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMCAD.g:12402:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMCAD.g:12402:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCAD.g:12402:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12404:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMCAD.g:12404:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMCAD.g:12404:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMCAD.g:12404:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12406:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMCAD.g:12406:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMCAD.g:12406:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMCAD.g:12406:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMCAD.g:12406:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCAD.g:12406:41: ( '\\r' )? '\\n'
                    {
                    // InternalMCAD.g:12406:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMCAD.g:12406:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12408:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMCAD.g:12408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMCAD.g:12408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMCAD.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCAD.g:12410:16: ( . )
            // InternalMCAD.g:12410:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMCAD.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=56;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMCAD.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMCAD.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMCAD.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMCAD.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMCAD.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMCAD.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMCAD.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMCAD.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMCAD.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMCAD.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMCAD.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMCAD.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMCAD.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMCAD.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMCAD.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMCAD.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMCAD.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMCAD.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMCAD.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMCAD.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMCAD.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMCAD.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMCAD.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMCAD.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMCAD.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMCAD.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMCAD.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMCAD.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMCAD.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMCAD.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalMCAD.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalMCAD.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalMCAD.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalMCAD.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalMCAD.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalMCAD.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalMCAD.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalMCAD.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalMCAD.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalMCAD.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalMCAD.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalMCAD.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalMCAD.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalMCAD.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalMCAD.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalMCAD.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalMCAD.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalMCAD.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalMCAD.g:1:298: RULE_HEXADECIMAL
                {
                mRULE_HEXADECIMAL(); 

                }
                break;
            case 50 :
                // InternalMCAD.g:1:315: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalMCAD.g:1:323: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalMCAD.g:1:332: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalMCAD.g:1:344: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalMCAD.g:1:360: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalMCAD.g:1:376: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalMCAD.g:1:384: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\45\1\uffff\1\51\1\uffff\1\55\1\45\1\uffff\2\45\2\uffff\1\45\1\74\3\45\3\uffff\1\43\3\45\1\uffff\1\113\1\45\1\116\1\43\2\uffff\2\43\2\uffff\1\45\1\uffff\1\45\7\uffff\3\45\1\uffff\4\45\2\uffff\2\45\3\uffff\5\45\4\uffff\4\45\2\uffff\1\45\4\uffff\27\45\1\u0080\1\u0081\20\45\1\u0092\5\45\2\uffff\1\u0098\17\45\1\uffff\1\45\1\u00a9\3\45\1\uffff\4\45\1\u00b1\2\45\1\u00b6\1\u00b7\1\45\1\u00b9\5\45\1\uffff\1\45\1\u00c1\1\45\1\u00c3\1\45\1\u00c5\1\45\1\uffff\3\45\1\u00ca\2\uffff\1\u00cb\1\uffff\5\45\1\u00d1\1\u00d3\1\uffff\1\45\1\uffff\1\45\1\uffff\1\u00d7\1\u00d8\1\45\1\u00da\2\uffff\5\45\1\uffff\1\u00e0\1\uffff\1\45\1\u00e2\1\u00e3\2\uffff\1\45\1\uffff\1\u00e5\3\45\1\u00e9\1\uffff\1\u00ea\2\uffff\1\u00eb\1\uffff\1\45\1\u00ed\1\u00ef\3\uffff\1\u00f1\1\uffff\1\u00f2\1\uffff\1\u00f3\3\uffff";
    static final String DFA13_eofS =
        "\u00f4\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\141\1\uffff\1\76\1\uffff\1\52\1\141\1\uffff\1\155\1\145\2\uffff\1\141\1\72\1\154\1\141\1\151\3\uffff\1\55\1\163\1\141\1\165\1\uffff\1\60\1\141\1\170\1\101\2\uffff\2\0\2\uffff\1\165\1\uffff\1\154\7\uffff\1\143\1\157\1\141\1\uffff\1\160\1\163\1\160\1\151\2\uffff\1\162\1\154\3\uffff\2\164\1\155\1\163\1\142\4\uffff\1\151\1\160\1\151\1\160\2\uffff\1\167\4\uffff\1\145\1\163\1\153\1\141\1\152\1\164\1\157\1\164\1\154\1\151\1\166\1\163\1\165\1\162\1\145\1\160\1\156\1\145\1\162\1\156\1\160\1\164\1\160\2\60\1\145\1\141\1\155\1\145\1\146\1\162\1\141\1\157\1\143\1\145\1\151\1\145\1\151\1\162\1\157\1\145\1\60\1\141\1\147\1\151\1\143\1\157\2\uffff\1\60\1\147\1\145\1\143\1\157\1\164\1\156\1\171\1\145\1\162\1\157\1\163\1\142\2\156\1\143\1\uffff\1\162\1\60\1\156\1\150\1\162\1\uffff\1\145\2\164\1\162\1\60\1\143\1\145\2\60\1\156\1\60\1\165\1\141\1\145\1\164\1\151\1\uffff\1\147\1\60\1\164\1\60\1\145\1\60\1\155\1\uffff\2\145\1\144\1\60\2\uffff\1\60\1\uffff\2\164\1\156\1\151\1\145\2\60\1\uffff\1\145\1\uffff\1\162\1\uffff\2\60\1\156\1\60\2\uffff\1\145\1\151\1\164\1\157\1\163\1\uffff\1\60\1\uffff\1\144\2\60\2\uffff\1\164\1\uffff\1\60\1\166\1\163\1\156\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\145\2\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\141\1\uffff\1\76\1\uffff\1\57\1\162\1\uffff\1\156\1\162\2\uffff\1\145\1\75\1\164\1\157\1\151\3\uffff\1\55\1\163\1\141\1\167\1\uffff\1\172\1\141\1\170\1\172\2\uffff\2\uffff\2\uffff\1\165\1\uffff\1\154\7\uffff\1\162\1\157\1\141\1\uffff\1\160\1\163\1\166\1\151\2\uffff\1\162\1\154\3\uffff\2\164\1\156\1\163\1\142\4\uffff\1\151\1\160\1\151\1\160\2\uffff\1\167\4\uffff\1\145\1\163\1\153\1\141\1\152\1\164\1\157\1\164\1\154\1\151\1\166\1\163\1\165\1\162\1\145\1\160\1\156\1\145\1\162\1\156\1\160\1\164\1\160\2\172\1\145\1\141\1\155\1\145\1\146\1\162\1\141\1\157\1\143\1\145\1\151\1\145\1\151\1\162\1\157\1\145\1\172\1\141\1\147\1\151\1\143\1\157\2\uffff\1\172\1\147\1\145\1\143\1\157\1\164\1\156\1\171\1\145\1\162\1\157\1\163\1\142\2\156\1\143\1\uffff\1\162\1\172\1\156\1\150\1\162\1\uffff\1\145\2\164\1\162\1\172\1\143\1\155\2\172\1\156\1\172\1\165\1\141\1\145\1\164\1\171\1\uffff\1\147\1\172\1\164\1\172\1\145\1\172\1\155\1\uffff\2\145\1\144\1\172\2\uffff\1\172\1\uffff\2\164\1\156\1\151\1\145\2\172\1\uffff\1\145\1\uffff\1\162\1\uffff\2\172\1\156\1\172\2\uffff\1\145\1\151\1\164\1\157\1\163\1\uffff\1\172\1\uffff\1\144\2\172\2\uffff\1\164\1\uffff\1\172\1\166\1\163\1\156\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\145\2\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\2\uffff\1\10\2\uffff\1\14\1\15\5\uffff\1\27\1\30\1\31\4\uffff\1\53\4\uffff\1\62\1\63\2\uffff\1\67\1\70\1\uffff\1\62\1\uffff\1\3\1\50\1\4\1\5\1\65\1\66\1\6\3\uffff\1\10\4\uffff\1\14\1\15\2\uffff\1\17\1\32\1\41\5\uffff\1\27\1\30\1\31\1\34\4\uffff\1\53\1\57\1\uffff\1\61\1\63\1\64\1\67\57\uffff\1\60\1\1\20\uffff\1\40\5\uffff\1\2\20\uffff\1\35\7\uffff\1\11\4\uffff\1\45\1\44\1\uffff\1\21\7\uffff\1\37\1\uffff\1\7\1\uffff\1\13\4\uffff\1\55\1\16\5\uffff\1\43\1\uffff\1\36\3\uffff\1\54\1\42\1\uffff\1\51\5\uffff\1\46\1\uffff\1\56\1\22\1\uffff\1\20\3\uffff\1\26\1\47\1\12\1\uffff\1\24\1\uffff\1\33\1\uffff\1\52\1\25\1\23";
    static final String DFA13_specialS =
        "\1\1\37\uffff\1\0\1\2\u00d2\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\40\4\43\1\41\1\23\1\24\1\5\1\3\1\31\1\4\1\22\1\6\1\34\11\37\1\16\1\10\1\25\4\43\32\36\3\43\1\35\1\36\1\43\1\17\1\36\1\20\1\12\1\32\1\2\2\36\1\11\2\36\1\21\1\27\2\36\1\7\1\36\1\33\1\30\1\1\1\26\1\15\4\36\1\13\1\43\1\14\uff82\43",
            "\1\44",
            "\1\46",
            "",
            "\1\50",
            "",
            "\1\53\4\uffff\1\54",
            "\1\56\12\uffff\1\60\5\uffff\1\57",
            "",
            "\1\62\1\63",
            "\1\64\14\uffff\1\65",
            "",
            "",
            "\1\71\3\uffff\1\70",
            "\1\73\2\uffff\1\72",
            "\1\76\7\uffff\1\75",
            "\1\100\15\uffff\1\77",
            "\1\101",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111\1\uffff\1\110",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\114",
            "\1\115",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\117",
            "\0\117",
            "",
            "",
            "\1\121",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123\16\uffff\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131\5\uffff\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b2",
            "\1\u00b4\7\uffff\1\u00b3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00b5\7\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\17\uffff\1\u00bf",
            "",
            "\1\u00c0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00d2\7\45",
            "",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00d6\7\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00e1",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00e4",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00ec",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00ee\7\45",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00f0\7\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    static class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 79;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='t') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='+') ) {s = 3;}

                        else if ( (LA13_0=='-') ) {s = 4;}

                        else if ( (LA13_0=='*') ) {s = 5;}

                        else if ( (LA13_0=='/') ) {s = 6;}

                        else if ( (LA13_0=='p') ) {s = 7;}

                        else if ( (LA13_0==';') ) {s = 8;}

                        else if ( (LA13_0=='i') ) {s = 9;}

                        else if ( (LA13_0=='d') ) {s = 10;}

                        else if ( (LA13_0=='{') ) {s = 11;}

                        else if ( (LA13_0=='}') ) {s = 12;}

                        else if ( (LA13_0=='v') ) {s = 13;}

                        else if ( (LA13_0==':') ) {s = 14;}

                        else if ( (LA13_0=='a') ) {s = 15;}

                        else if ( (LA13_0=='c') ) {s = 16;}

                        else if ( (LA13_0=='l') ) {s = 17;}

                        else if ( (LA13_0=='.') ) {s = 18;}

                        else if ( (LA13_0=='(') ) {s = 19;}

                        else if ( (LA13_0==')') ) {s = 20;}

                        else if ( (LA13_0=='<') ) {s = 21;}

                        else if ( (LA13_0=='u') ) {s = 22;}

                        else if ( (LA13_0=='m') ) {s = 23;}

                        else if ( (LA13_0=='s') ) {s = 24;}

                        else if ( (LA13_0==',') ) {s = 25;}

                        else if ( (LA13_0=='e') ) {s = 26;}

                        else if ( (LA13_0=='r') ) {s = 27;}

                        else if ( (LA13_0=='0') ) {s = 28;}

                        else if ( (LA13_0=='^') ) {s = 29;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='w' && LA13_0<='z')) ) {s = 30;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 31;}

                        else if ( (LA13_0=='\"') ) {s = 32;}

                        else if ( (LA13_0=='\'') ) {s = 33;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 34;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='=' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFF')) ) {s = 79;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}