// Generated from LabeledExpr.g4 by ANTLR 4.13.2
package rules;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LabeledExprParser extends Parser {
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
    public static final int
            RULE_prog = 0, RULE_stat = 1, RULE_ifStat = 2, RULE_block = 3, RULE_expr = 4;

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "stat", "ifStat", "block", "expr"
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
    public ATN getATN() {
        return _ATN;
    }

    public LabeledExprParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgContext extends ParserRuleContext {
        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(11);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(10);
                            stat();
                        }
                    }
                    setState(13);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360260L) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatContext extends ParserRuleContext {
        public StatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stat;
        }

        public StatContext() {
        }

        public void copyFrom(StatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlankContext extends StatContext {
        public TerminalNode NEWLINE() {
            return getToken(LabeledExprParser.NEWLINE, 0);
        }

        public BlankContext(StatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitBlank(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IfStatementContext extends StatContext {
        public IfStatContext ifStat() {
            return getRuleContext(IfStatContext.class, 0);
        }

        public IfStatementContext(StatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrintExprContext extends StatContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode NEWLINE() {
            return getToken(LabeledExprParser.NEWLINE, 0);
        }

        public PrintExprContext(StatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitPrintExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AssignContext extends StatContext {
        public TerminalNode ID() {
            return getToken(LabeledExprParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode NEWLINE() {
            return getToken(LabeledExprParser.NEWLINE, 0);
        }

        public AssignContext(StatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatContext stat() throws RecognitionException {
        StatContext _localctx = new StatContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_stat);
        try {
            setState(25);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    _localctx = new PrintExprContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(15);
                    expr(0);
                    setState(16);
                    match(NEWLINE);
                }
                break;
                case 2:
                    _localctx = new AssignContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(18);
                    match(ID);
                    setState(19);
                    match(T__0);
                    setState(20);
                    expr(0);
                    setState(21);
                    match(NEWLINE);
                }
                break;
                case 3:
                    _localctx = new IfStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(23);
                    ifStat();
                }
                break;
                case 4:
                    _localctx = new BlankContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(24);
                    match(NEWLINE);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IfStatContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public IfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfStatContext ifStat() throws RecognitionException {
        IfStatContext _localctx = new IfStatContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(27);
                match(T__1);
                setState(28);
                expr(0);
                setState(29);
                match(T__2);
                setState(30);
                block();
                setState(33);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(31);
                        match(T__3);
                        setState(32);
                        block();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        public BlockContext() {
        }

        public void copyFrom(BlockContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Single_logic_blockContext extends BlockContext {
        public StatContext stat() {
            return getRuleContext(StatContext.class, 0);
        }

        public Single_logic_blockContext(BlockContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitSingle_logic_block(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Multiple_logic_blockContext extends BlockContext {
        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public Multiple_logic_blockContext(BlockContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitMultiple_logic_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_block);
        int _la;
        try {
            setState(44);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__4:
                    _localctx = new Multiple_logic_blockContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(35);
                    match(T__4);
                    setState(39);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360260L) != 0)) {
                        {
                            {
                                setState(36);
                                stat();
                            }
                        }
                        setState(41);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(42);
                    match(T__5);
                }
                break;
                case T__1:
                case T__6:
                case ID:
                case INT:
                case NEWLINE:
                    _localctx = new Single_logic_blockContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(43);
                    stat();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public ExprContext() {
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParensContext extends ExprContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public ParensContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitParens(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AddSubContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode ADD() {
            return getToken(LabeledExprParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(LabeledExprParser.SUB, 0);
        }

        public AddSubContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitAddSub(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RelationalContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LT() {
            return getToken(LabeledExprParser.LT, 0);
        }

        public TerminalNode GT() {
            return getToken(LabeledExprParser.GT, 0);
        }

        public TerminalNode LE() {
            return getToken(LabeledExprParser.LE, 0);
        }

        public TerminalNode GE() {
            return getToken(LabeledExprParser.GE, 0);
        }

        public RelationalContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitRelational(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdContext extends ExprContext {
        public TerminalNode ID() {
            return getToken(LabeledExprParser.ID, 0);
        }

        public IdContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor) return ((LabeledExprVisitor<? extends T>) visitor).visitId(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class EqualityContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode EQ() {
            return getToken(LabeledExprParser.EQ, 0);
        }

        public TerminalNode NE() {
            return getToken(LabeledExprParser.NE, 0);
        }

        public EqualityContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitEquality(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntContext extends ExprContext {
        public TerminalNode INT() {
            return getToken(LabeledExprParser.INT, 0);
        }

        public IntContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitInt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MulDivContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(LabeledExprParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(LabeledExprParser.DIV, 0);
        }

        public MulDivContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LabeledExprVisitor)
                return ((LabeledExprVisitor<? extends T>) visitor).visitMulDiv(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__6: {
                        _localctx = new ParensContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(47);
                        match(T__6);
                        setState(48);
                        expr(0);
                        setState(49);
                        match(T__7);
                    }
                    break;
                    case INT: {
                        _localctx = new IntContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(51);
                        match(INT);
                    }
                    break;
                    case ID: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(52);
                        match(ID);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(69);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(67);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                case 1: {
                                    _localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(55);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(56);
                                    ((MulDivContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == MUL || _la == DIV)) {
                                        ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(57);
                                    expr(8);
                                }
                                break;
                                case 2: {
                                    _localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(58);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(59);
                                    ((AddSubContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(60);
                                    expr(7);
                                }
                                break;
                                case 3: {
                                    _localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(61);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(62);
                                    ((RelationalContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0))) {
                                        ((RelationalContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(63);
                                    expr(6);
                                }
                                break;
                                case 4: {
                                    _localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(64);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(65);
                                    ((EqualityContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NE)) {
                                        ((EqualityContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(66);
                                    expr(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 4:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 7);
            case 1:
                return precpred(_ctx, 6);
            case 2:
                return precpred(_ctx, 5);
            case 3:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public static final String _serializedATN =
            "\u0004\u0001\u0019I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001" +
                    "\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002" +
                    "\u0001\u0003\u0001\u0003\u0005\u0003&\b\u0003\n\u0003\f\u0003)\t\u0003" +
                    "\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004" +
                    "6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0005\u0004D\b\u0004\n\u0004\f\u0004G\t\u0004\u0001\u0004" +
                    "\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0004\u0001\u0000" +
                    "\t\n\u0001\u0000\u000b\f\u0001\u0000\u0010\u0013\u0001\u0000\u0014\u0015" +
                    "P\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000" +
                    "\u0004\u001b\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b" +
                    "5\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000" +
                    "\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000" +
                    "\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f" +
                    "\u0010\u0003\b\u0004\u0000\u0010\u0011\u0005\u0018\u0000\u0000\u0011\u001a" +
                    "\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0016\u0000\u0000\u0013\u0014" +
                    "\u0005\u0001\u0000\u0000\u0014\u0015\u0003\b\u0004\u0000\u0015\u0016\u0005" +
                    "\u0018\u0000\u0000\u0016\u001a\u0001\u0000\u0000\u0000\u0017\u001a\u0003" +
                    "\u0004\u0002\u0000\u0018\u001a\u0005\u0018\u0000\u0000\u0019\u000f\u0001" +
                    "\u0000\u0000\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0017\u0001" +
                    "\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0003\u0001" +
                    "\u0000\u0000\u0000\u001b\u001c\u0005\u0002\u0000\u0000\u001c\u001d\u0003" +
                    "\b\u0004\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e!\u0003\u0006" +
                    "\u0003\u0000\u001f \u0005\u0004\u0000\u0000 \"\u0003\u0006\u0003\u0000" +
                    "!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0005\u0001" +
                    "\u0000\u0000\u0000#\'\u0005\u0005\u0000\u0000$&\u0003\u0002\u0001\u0000" +
                    "%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000" +
                    "\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000" +
                    "\u0000\u0000*-\u0005\u0006\u0000\u0000+-\u0003\u0002\u0001\u0000,#\u0001" +
                    "\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000" +
                    "\u0000./\u0006\u0004\uffff\uffff\u0000/0\u0005\u0007\u0000\u000001\u0003" +
                    "\b\u0004\u000012\u0005\b\u0000\u000026\u0001\u0000\u0000\u000036\u0005" +
                    "\u0017\u0000\u000046\u0005\u0016\u0000\u00005.\u0001\u0000\u0000\u0000" +
                    "53\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006E\u0001\u0000\u0000" +
                    "\u000078\n\u0007\u0000\u000089\u0007\u0000\u0000\u00009D\u0003\b\u0004" +
                    "\b:;\n\u0006\u0000\u0000;<\u0007\u0001\u0000\u0000<D\u0003\b\u0004\u0007" +
                    "=>\n\u0005\u0000\u0000>?\u0007\u0002\u0000\u0000?D\u0003\b\u0004\u0006" +
                    "@A\n\u0004\u0000\u0000AB\u0007\u0003\u0000\u0000BD\u0003\b\u0004\u0005" +
                    "C7\u0001\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000" +
                    "\u0000C@\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000" +
                    "\u0000\u0000EF\u0001\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GE\u0001" +
                    "\u0000\u0000\u0000\b\r\u0019!\',5CE";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}