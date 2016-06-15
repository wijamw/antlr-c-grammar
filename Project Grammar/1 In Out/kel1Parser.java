// Generated from kel1.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kel1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ID=21, INT=22, Whitespace=23, Newline=24, 
		BlockComment=25, LineComment=26;
	public static final int
		RULE_prog = 0, RULE_init = 1, RULE_statement = 2, RULE_input = 3, RULE_output = 4, 
		RULE_funcall = 5, RULE_parameter = 6, RULE_alphabet = 7, RULE_function = 8, 
		RULE_tipedata = 9, RULE_var = 10;
	public static final String[] ruleNames = {
		"prog", "init", "statement", "input", "output", "funcall", "parameter", 
		"alphabet", "function", "tipedata", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'scanf'", "'\"'", "','", "'&'", "';'", 
		"'printf'", "'''", "'%'", "'#'", "'+'", "'*'", "'.'", "'='", "'/'", "':'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ID", "INT", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
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
	public String getGrammarFileName() { return "kel1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kel1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				init();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class InitContext extends ParserRuleContext {
		public TipedataContext tipedata() {
			return getRuleContext(TipedataContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			tipedata();
			setState(28);
			function();
			setState(29);
			match(T__0);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				parameter();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(T__1);
			setState(37);
			match(T__2);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				output();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				input();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				funcall();
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

	public static class InputContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<AlphabetContext> alphabet() {
			return getRuleContexts(AlphabetContext.class);
		}
		public AlphabetContext alphabet(int i) {
			return getRuleContext(AlphabetContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(T__0);
			setState(53);
			match(T__5);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(54);
				alphabet();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__5);
			setState(61);
			match(T__6);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(62);
				match(T__7);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			var();
			setState(69);
			match(T__1);
			setState(70);
			match(T__8);
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

	public static class OutputContext extends ParserRuleContext {
		public List<AlphabetContext> alphabet() {
			return getRuleContexts(AlphabetContext.class);
		}
		public AlphabetContext alphabet(int i) {
			return getRuleContext(AlphabetContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__9);
			setState(73);
			match(T__0);
			setState(74);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(75);
				alphabet();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__5);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(T__6);
					setState(83);
					var();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(T__6);
					setState(90);
					match(T__5);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID) | (1L << INT))) != 0)) {
						{
						{
						setState(91);
						alphabet();
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(97);
					match(T__5);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(103);
				match(T__6);
				setState(104);
				match(T__10);
				setState(105);
				var();
				setState(106);
				match(T__10);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__1);
			setState(114);
			match(T__8);
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

	public static class FuncallContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitFuncall(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			function();
			setState(117);
			match(T__0);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(118);
				parameter();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__1);
			setState(125);
			match(T__8);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TipedataContext> tipedata() {
			return getRuleContexts(TipedataContext.class);
		}
		public TipedataContext tipedata(int i) {
			return getRuleContext(TipedataContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(kel1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(kel1Parser.ID, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			tipedata();
			setState(128);
			match(ID);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(129);
				match(T__6);
				setState(130);
				tipedata();
				setState(131);
				match(ID);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AlphabetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(kel1Parser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(kel1Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(kel1Parser.INT, i);
		}
		public TipedataContext tipedata() {
			return getRuleContext(TipedataContext.class,0);
		}
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitAlphabet(this);
		}
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alphabet);
		int _la;
		try {
			int _alt;
			setState(190);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(INT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__11);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						match(INT);
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(147);
					match(T__12);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(153);
					match(T__13);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(159);
					match(T__14);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15 || _la==INT) {
					{
					{
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INT) {
						{
						{
						setState(165);
						match(INT);
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(171);
					match(T__15);
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(172);
							match(INT);
							}
							} 
						}
						setState(177);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				tipedata();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(T__16);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(T__13);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(T__18);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(T__14);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				match(T__19);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(kel1Parser.ID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
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

	public static class TipedataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(kel1Parser.ID, 0); }
		public TipedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterTipedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitTipedata(this);
		}
	}

	public final TipedataContext tipedata() throws RecognitionException {
		TipedataContext _localctx = new TipedataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(kel1Parser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(kel1Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(kel1Parser.INT, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kel1Listener ) ((kel1Listener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		int _la;
		try {
			setState(205);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(INT);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(198);
					match(T__15);
					setState(199);
					match(INT);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\4\3\4\3\4\5"+
		"\4\64\n\4\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\5\7\5B\n\5"+
		"\f\5\16\5E\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13"+
		"\6\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b"+
		"\13\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16"+
		"\6r\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\t\3\t\3\t\3"+
		"\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a"+
		"\13\t\3\t\7\t\u009d\n\t\f\t\16\t\u00a0\13\t\3\t\7\t\u00a3\n\t\f\t\16\t"+
		"\u00a6\13\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\t\3\t\7\t\u00b0\n"+
		"\t\f\t\16\t\u00b3\13\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00cb"+
		"\n\f\f\f\16\f\u00ce\13\f\5\f\u00d0\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\2\u00e5\2\31\3\2\2\2\4\35\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n"+
		"J\3\2\2\2\fv\3\2\2\2\16\u0081\3\2\2\2\20\u00c0\3\2\2\2\22\u00c2\3\2\2"+
		"\2\24\u00c4\3\2\2\2\26\u00cf\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\36\5\24\13\2\36\37"+
		"\5\22\n\2\37#\7\3\2\2 \"\5\16\b\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2"+
		"\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\4\2\2\'+\7\5\2\2(*\5\6\4\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\6\2\2/\5\3\2\2\2\60"+
		"\64\5\n\6\2\61\64\5\b\5\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\7\3\2\2\2\65\66\7\7\2\2\66\67\7\3\2\2\67;\7\b\2\28:\5\20"+
		"\t\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\b"+
		"\2\2?C\7\t\2\2@B\7\n\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\5\26\f\2GH\7\4\2\2HI\7\13\2\2I\t\3\2\2\2JK\7\f\2\2KL"+
		"\7\3\2\2LP\7\b\2\2MO\5\20\t\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RP\3\2\2\2SX\7\b\2\2TU\7\t\2\2UW\5\26\f\2VT\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Yf\3\2\2\2ZX\3\2\2\2[\\\7\t\2\2\\`\7\b\2\2]_\5\20"+
		"\t\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\7\b"+
		"\2\2d[\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gp\3\2\2\2hf\3\2\2\2ij\7\t"+
		"\2\2jk\7\r\2\2kl\5\26\f\2lm\7\r\2\2mo\3\2\2\2ni\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\4\2\2tu\7\13\2\2u\13\3\2\2\2"+
		"vw\5\22\n\2w{\7\3\2\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\177\7\4\2\2\177\u0080\7\13\2\2\u0080\r\3\2\2\2"+
		"\u0081\u0082\5\24\13\2\u0082\u0089\7\27\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\5\24\13\2\u0085\u0086\7\27\2\2\u0086\u0088\3\2\2\2\u0087\u0083"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\17\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u00c1\7\27\2\2\u008d\u00c1\7\30"+
		"\2\2\u008e\u0092\7\16\2\2\u008f\u0091\7\30\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\17\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\20\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\21\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b6\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\30\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7\22\2\2\u00ae\u00b0\7\30\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c1\5\24\13\2\u00ba\u00c1\7\23\2\2\u00bb"+
		"\u00c1\7\20\2\2\u00bc\u00c1\7\24\2\2\u00bd\u00c1\7\25\2\2\u00be\u00c1"+
		"\7\21\2\2\u00bf\u00c1\7\26\2\2\u00c0\u008c\3\2\2\2\u00c0\u008d\3\2\2\2"+
		"\u00c0\u008e\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc"+
		"\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\21\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\23\3\2\2\2\u00c4\u00c5\7\27\2\2"+
		"\u00c5\25\3\2\2\2\u00c6\u00d0\7\27\2\2\u00c7\u00cc\7\30\2\2\u00c8\u00c9"+
		"\7\22\2\2\u00c9\u00cb\7\30\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00d0\27\3\2\2\2\31\33"+
		"#+\63;CPX`fp{\u0089\u0092\u0098\u009e\u00a4\u00aa\u00b1\u00b6\u00c0\u00cc"+
		"\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}