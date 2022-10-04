// Generated from C:/Users/sebyn/Downloads/Compiler_Assignment/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TreeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BINARY=15, HVIDRUM=16, 
		IDENTIFIER=17, COMMENT=18, MULTILINECOMMENTS=19;
	public static final int
		RULE_start = 0, RULE_sequence = 1, RULE_command = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sequence", "command", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latch'", "'->'", "'.update'", 
			"'.simulate'", "'='", "'('", "')'", "'!'", "'&&'", "'||'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BINARY", "HVIDRUM", "IDENTIFIER", "COMMENT", "MULTILINECOMMENTS"
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TreeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public SequenceContext c;
		public TerminalNode EOF() { return getToken(TreeParser.EOF, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).c = sequence();
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public CommandContext c;
		public SequenceContext cs;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			((SequenceContext)_localctx).c = command();
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12);
					((SequenceContext)_localctx).cs = sequence();
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Token id;
		public Token ids;
		public Token id1;
		public Token id2;
		public ExprContext e;
		public Token b;
		public List<TerminalNode> IDENTIFIER() { return getTokens(TreeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TreeParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BINARY() { return getToken(TreeParser.BINARY, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(T__0);
				setState(19);
				((CommandContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__1);
				setState(21);
				((CommandContext)_localctx).ids = match(IDENTIFIER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(T__2);
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(23);
					((CommandContext)_localctx).ids = match(IDENTIFIER);
					}
					}
					setState(26); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(T__3);
				setState(29);
				((CommandContext)_localctx).id1 = match(IDENTIFIER);
				setState(30);
				match(T__4);
				setState(31);
				((CommandContext)_localctx).id2 = match(IDENTIFIER);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(T__5);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(33);
					((CommandContext)_localctx).e = expr(0);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				match(T__6);
				setState(40);
				((CommandContext)_localctx).id = match(IDENTIFIER);
				setState(41);
				match(T__7);
				setState(42);
				((CommandContext)_localctx).b = match(BINARY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public Token id;
		public ExprContext e;
		public TerminalNode IDENTIFIER() { return getToken(TreeParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TreeParser.IDENTIFIER, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreeListener ) ((TreeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreeVisitor ) return ((TreeVisitor<? extends T>)visitor).visitAnd(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(46);
				match(T__8);
				setState(47);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(48);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__10);
				setState(51);
				((NotContext)_localctx).e = expr(6);
				}
				break;
			case 3:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				((AssignmentContext)_localctx).id = match(IDENTIFIER);
				setState(53);
				match(T__7);
				setState(54);
				((AssignmentContext)_localctx).e = expr(2);
				}
				break;
			case 4:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(59);
						match(T__11);
						setState(60);
						((AndContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(62);
						match(T__12);
						setState(63);
						((OrContext)_localctx).e2 = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						((EqualContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						match(T__13);
						setState(66);
						((EqualContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u000e\b\u0001\n\u0001\f\u0001"+
		"\u0011\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u0019\b\u0002\u000b\u0002\f\u0002\u001a\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t\u0003\u0001"+
		"\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004\u0006\u0000\u0000R\u0000"+
		"\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000\u0004+"+
		"\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\u000f\u0003\u0004\u0002\u0000\f\u000e\u0003\u0002\u0001\u0000\r"+
		"\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r"+
		"\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0003"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0001\u0000\u0000\u0013,\u0005\u0011\u0000\u0000\u0014\u0015\u0005"+
		"\u0002\u0000\u0000\u0015,\u0005\u0011\u0000\u0000\u0016\u0018\u0005\u0003"+
		"\u0000\u0000\u0017\u0019\u0005\u0011\u0000\u0000\u0018\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b,\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0005\u0011\u0000"+
		"\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f,\u0005\u0011\u0000\u0000"+
		" $\u0005\u0006\u0000\u0000!#\u0003\u0006\u0003\u0000\"!\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%,\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u0007\u0000\u0000()\u0005\u0011\u0000\u0000)*\u0005\b\u0000\u0000*,\u0005"+
		"\u000f\u0000\u0000+\u0012\u0001\u0000\u0000\u0000+\u0014\u0001\u0000\u0000"+
		"\u0000+\u0016\u0001\u0000\u0000\u0000+\u001c\u0001\u0000\u0000\u0000+"+
		" \u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-.\u0006\u0003\uffff\uffff\u0000./\u0005\t\u0000\u0000/0\u0003"+
		"\u0006\u0003\u000001\u0005\n\u0000\u000019\u0001\u0000\u0000\u000023\u0005"+
		"\u000b\u0000\u000039\u0003\u0006\u0003\u000645\u0005\u0011\u0000\u0000"+
		"56\u0005\b\u0000\u000069\u0003\u0006\u0003\u000279\u0005\u0011\u0000\u0000"+
		"8-\u0001\u0000\u0000\u000082\u0001\u0000\u0000\u000084\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009E\u0001\u0000\u0000\u0000:;\n\u0005\u0000"+
		"\u0000;<\u0005\f\u0000\u0000<D\u0003\u0006\u0003\u0006=>\n\u0004\u0000"+
		"\u0000>?\u0005\r\u0000\u0000?D\u0003\u0006\u0003\u0005@A\n\u0003\u0000"+
		"\u0000AB\u0005\u000e\u0000\u0000BD\u0003\u0006\u0003\u0004C:\u0001\u0000"+
		"\u0000\u0000C=\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u0007\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000\u0007\u000f"+
		"\u001a$+8CE";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}