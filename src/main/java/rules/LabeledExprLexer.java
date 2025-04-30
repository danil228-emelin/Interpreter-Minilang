// Generated from LabeledExpr.g4 by ANTLR 4.13.2
package rules;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LabeledExprLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, MUL = 9,
            DIV = 10, ADD = 11, SUB = 12, NOT = 13, AND = 14, OR = 15, GT = 16, LT = 17, GE = 18, LE = 19,
            EQ = 20, NE = 21, ID = 22, INT = 23, NEWLINE = 24, WS = 25;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "MUL",
                "DIV", "ADD", "SUB", "NOT", "AND", "OR", "GT", "LT", "GE", "LE", "EQ",
                "NE", "ID", "INT", "NEWLINE", "WS"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'='", "'if'", "'then'", "'else'", "'{'", "'}'", "'('", "')'",
                "'*'", "'/'", "'+'", "'-'", "'!'", "'&&'", "'||'", "'>'", "'<'", "'>='",
                "'<='", "'=='", "'!='"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "MUL", "DIV", "ADD",
                "SUB", "NOT", "AND", "OR", "GT", "LT", "GE", "LE", "EQ", "NE", "ID",
                "INT", "NEWLINE", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public LabeledExprLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "LabeledExpr.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000\u0019\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
                    "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
                    "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
                    "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
                    "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e" +
                    "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011" +
                    "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014" +
                    "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017" +
                    "\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004" +
                    "\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007" +
                    "\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b" +
                    "\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001" +
                    "\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0015\u0004\u0015l\b\u0015\u000b\u0015\f\u0015m\u0001\u0016\u0004\u0016" +
                    "q\b\u0016\u000b\u0016\f\u0016r\u0001\u0017\u0003\u0017v\b\u0017\u0001" +
                    "\u0017\u0001\u0017\u0001\u0018\u0004\u0018{\b\u0018\u000b\u0018\f\u0018" +
                    "|\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005" +
                    "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n" +
                    "\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011" +
                    "#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000" +
                    "\u0003\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t\t  \u0083\u0000\u0001" +
                    "\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005" +
                    "\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001" +
                    "\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000" +
                    "\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000" +
                    "\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000" +
                    "\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000" +
                    "\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000" +
                    "\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000" +
                    "\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000" +
                    "\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001" +
                    "\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000" +
                    "\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003" +
                    "5\u0001\u0000\u0000\u0000\u00058\u0001\u0000\u0000\u0000\u0007=\u0001" +
                    "\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000" +
                    "\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000\u0011" +
                    "J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N\u0001" +
                    "\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000" +
                    "\u0000\u001bT\u0001\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001f" +
                    "Z\u0001\u0000\u0000\u0000!\\\u0001\u0000\u0000\u0000#^\u0001\u0000\u0000" +
                    "\u0000%a\u0001\u0000\u0000\u0000\'d\u0001\u0000\u0000\u0000)g\u0001\u0000" +
                    "\u0000\u0000+k\u0001\u0000\u0000\u0000-p\u0001\u0000\u0000\u0000/u\u0001" +
                    "\u0000\u0000\u00001z\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\u0002" +
                    "\u0001\u0000\u0000\u000056\u0005i\u0000\u000067\u0005f\u0000\u00007\u0004" +
                    "\u0001\u0000\u0000\u000089\u0005t\u0000\u00009:\u0005h\u0000\u0000:;\u0005" +
                    "e\u0000\u0000;<\u0005n\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005" +
                    "e\u0000\u0000>?\u0005l\u0000\u0000?@\u0005s\u0000\u0000@A\u0005e\u0000" +
                    "\u0000A\b\u0001\u0000\u0000\u0000BC\u0005{\u0000\u0000C\n\u0001\u0000" +
                    "\u0000\u0000DE\u0005}\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005(" +
                    "\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005)\u0000\u0000I\u0010" +
                    "\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000K\u0012\u0001\u0000\u0000" +
                    "\u0000LM\u0005/\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005+\u0000" +
                    "\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000Q\u0018\u0001" +
                    "\u0000\u0000\u0000RS\u0005!\u0000\u0000S\u001a\u0001\u0000\u0000\u0000" +
                    "TU\u0005&\u0000\u0000UV\u0005&\u0000\u0000V\u001c\u0001\u0000\u0000\u0000" +
                    "WX\u0005|\u0000\u0000XY\u0005|\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000" +
                    "Z[\u0005>\u0000\u0000[ \u0001\u0000\u0000\u0000\\]\u0005<\u0000\u0000" +
                    "]\"\u0001\u0000\u0000\u0000^_\u0005>\u0000\u0000_`\u0005=\u0000\u0000" +
                    "`$\u0001\u0000\u0000\u0000ab\u0005<\u0000\u0000bc\u0005=\u0000\u0000c" +
                    "&\u0001\u0000\u0000\u0000de\u0005=\u0000\u0000ef\u0005=\u0000\u0000f(" +
                    "\u0001\u0000\u0000\u0000gh\u0005!\u0000\u0000hi\u0005=\u0000\u0000i*\u0001" +
                    "\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000" +
                    "lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000" +
                    "\u0000n,\u0001\u0000\u0000\u0000oq\u0007\u0001\u0000\u0000po\u0001\u0000" +
                    "\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001" +
                    "\u0000\u0000\u0000s.\u0001\u0000\u0000\u0000tv\u0005\r\u0000\u0000ut\u0001" +
                    "\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000" +
                    "wx\u0005\n\u0000\u0000x0\u0001\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000" +
                    "zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000" +
                    "\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006" +
                    "\u0018\u0000\u0000\u007f2\u0001\u0000\u0000\u0000\u0005\u0000mru|\u0001" +
                    "\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}