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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, NOT=14, AND=15, OR=16, GT=17, LT=18, GE=19, 
		LE=20, EQ=21, NE=22, ID=23, INT=24, NEWLINE=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"MUL", "DIV", "ADD", "SUB", "NOT", "AND", "OR", "GT", "LT", "GE", "LE", 
			"EQ", "NE", "ID", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'while'", "'if'", "'then'", "'else'", "'{'", "'}'", "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'", "'!'", "'&&'", "'||'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MUL", "DIV", 
			"ADD", "SUB", "NOT", "AND", "OR", "GT", "LT", "GE", "LE", "EQ", "NE", 
			"ID", "INT", "NEWLINE", "WS"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0004\u0016t\b\u0016\u000b\u0016\f\u0016"+
		"u\u0001\u0017\u0004\u0017y\b\u0017\u000b\u0017\f\u0017z\u0001\u0018\u0003"+
		"\u0018~\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u0083"+
		"\b\u0019\u000b\u0019\f\u0019\u0084\u0001\u0019\u0001\u0019\u0000\u0000"+
		"\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009"+
		"\u0002\u0000\t\t  \u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007@\u0001"+
		"\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000"+
		"\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011"+
		"P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015T\u0001"+
		"\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000"+
		"\u0000\u001bZ\u0001\u0000\u0000\u0000\u001d\\\u0001\u0000\u0000\u0000"+
		"\u001f_\u0001\u0000\u0000\u0000!b\u0001\u0000\u0000\u0000#d\u0001\u0000"+
		"\u0000\u0000%f\u0001\u0000\u0000\u0000\'i\u0001\u0000\u0000\u0000)l\u0001"+
		"\u0000\u0000\u0000+o\u0001\u0000\u0000\u0000-s\u0001\u0000\u0000\u0000"+
		"/x\u0001\u0000\u0000\u00001}\u0001\u0000\u0000\u00003\u0082\u0001\u0000"+
		"\u0000\u000056\u0005=\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005"+
		"w\u0000\u000089\u0005h\u0000\u00009:\u0005i\u0000\u0000:;\u0005l\u0000"+
		"\u0000;<\u0005e\u0000\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005i\u0000"+
		"\u0000>?\u0005f\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005t\u0000"+
		"\u0000AB\u0005h\u0000\u0000BC\u0005e\u0000\u0000CD\u0005n\u0000\u0000"+
		"D\b\u0001\u0000\u0000\u0000EF\u0005e\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005s\u0000\u0000HI\u0005e\u0000\u0000I\n\u0001\u0000\u0000\u0000"+
		"JK\u0005{\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000"+
		"M\u000e\u0001\u0000\u0000\u0000NO\u0005(\u0000\u0000O\u0010\u0001\u0000"+
		"\u0000\u0000PQ\u0005)\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005"+
		"*\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005/\u0000\u0000U\u0016"+
		"\u0001\u0000\u0000\u0000VW\u0005+\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000XY\u0005-\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0005!\u0000"+
		"\u0000[\u001c\u0001\u0000\u0000\u0000\\]\u0005&\u0000\u0000]^\u0005&\u0000"+
		"\u0000^\u001e\u0001\u0000\u0000\u0000_`\u0005|\u0000\u0000`a\u0005|\u0000"+
		"\u0000a \u0001\u0000\u0000\u0000bc\u0005>\u0000\u0000c\"\u0001\u0000\u0000"+
		"\u0000de\u0005<\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0005>\u0000\u0000"+
		"gh\u0005=\u0000\u0000h&\u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000j"+
		"k\u0005=\u0000\u0000k(\u0001\u0000\u0000\u0000lm\u0005=\u0000\u0000mn"+
		"\u0005=\u0000\u0000n*\u0001\u0000\u0000\u0000op\u0005!\u0000\u0000pq\u0005"+
		"=\u0000\u0000q,\u0001\u0000\u0000\u0000rt\u0007\u0000\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v.\u0001\u0000\u0000\u0000wy\u0007\u0001\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{0\u0001\u0000\u0000\u0000|~\u0005"+
		"\r\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u00802\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0007\u0002\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\u0019\u0000\u0000\u00874\u0001\u0000"+
		"\u0000\u0000\u0005\u0000uz}\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}