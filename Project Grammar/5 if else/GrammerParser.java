// Generated from Grammer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, BEGIN=12, ELSE=13, SGN=14, ID=15, INT=16, Float=17, 
		WS=18;
	public static final int
		RULE_init = 0, RULE_cond = 1, RULE_matem = 2, RULE_arg = 3;
	public static final String[] ruleNames = {
		"init", "cond", "matem", "arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"','", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BEGIN", "ELSE", "SGN", "ID", "INT", "Float", "WS"
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
	public String getGrammarFileName() { return "Grammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammerParser.BEGIN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammerParser.ELSE, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(BEGIN);
			setState(9);
			match(T__0);
			setState(10);
			cond(0);
			setState(11);
			match(T__1);
			setState(25);
			switch (_input.LA(1)) {
			case BEGIN:
			case ID:
				{
				setState(12);
				arg(0);
				setState(13);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(15);
				match(T__3);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BEGIN || _la==ID) {
					{
					{
					setState(16);
					arg(0);
					setState(17);
					match(T__2);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(24);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(27);
			match(ELSE);
			setState(47);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(28);
				init();
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29);
						arg(0);
						setState(30);
						match(T__2);
						}
						} 
					}
					setState(36);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case T__3:
				{
				setState(37);
				match(T__3);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BEGIN || _la==ID) {
					{
					{
					setState(38);
					arg(0);
					setState(39);
					match(T__2);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CondContext extends ParserRuleContext {
		public List<MatemContext> matem() {
			return getRuleContexts(MatemContext.class);
		}
		public MatemContext matem(int i) {
			return getRuleContext(MatemContext.class,i);
		}
		public TerminalNode SGN() { return getToken(GrammerParser.SGN, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(50);
				matem(0);
				setState(51);
				match(SGN);
				setState(52);
				matem(0);
				}
				break;
			case 2:
				{
				setState(54);
				match(T__0);
				setState(55);
				matem(0);
				setState(56);
				match(SGN);
				setState(57);
				matem(0);
				setState(58);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(60);
				match(T__0);
				setState(61);
				matem(0);
				setState(62);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(66);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(67);
					match(SGN);
					setState(68);
					cond(4);
					}
					} 
				}
				setState(73);
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

	public static class MatemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammerParser.INT, 0); }
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public TerminalNode Float() { return getToken(GrammerParser.Float, 0); }
		public List<MatemContext> matem() {
			return getRuleContexts(MatemContext.class);
		}
		public MatemContext matem(int i) {
			return getRuleContext(MatemContext.class,i);
		}
		public MatemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterMatem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitMatem(this);
		}
	}

	public final MatemContext matem() throws RecognitionException {
		return matem(0);
	}

	private MatemContext matem(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MatemContext _localctx = new MatemContext(_ctx, _parentState);
		MatemContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_matem, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(75);
				match(INT);
				}
				break;
			case ID:
				{
				setState(76);
				match(ID);
				}
				break;
			case Float:
				{
				setState(77);
				match(Float);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(80);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(81);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(82);
						matem(0);
						setState(83);
						match(T__10);
						setState(84);
						matem(0);
						setState(85);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(86);
						matem(6);
						}
						break;
					case 2:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(90);
						matem(5);
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ArgContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		return arg(0);
	}

	private ArgContext arg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgContext _localctx = new ArgContext(_ctx, _parentState);
		ArgContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(97);
				init();
				}
				break;
			case ID:
				{
				setState(98);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arg);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					match(T__2);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 1:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 2:
			return matem_sempred((MatemContext)_localctx, predIndex);
		case 3:
			return arg_sempred((ArgContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean matem_sempred(MatemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\5\2\62\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\3"+
		"\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\5"+
		"\5f\n\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\2\5\4\6\b\6\2\4\6\b\2\3\3"+
		"\2\b\fx\2\n\3\2\2\2\4B\3\2\2\2\6P\3\2\2\2\be\3\2\2\2\n\13\7\16\2\2\13"+
		"\f\7\3\2\2\f\r\5\4\3\2\r\33\7\4\2\2\16\17\5\b\5\2\17\20\7\5\2\2\20\34"+
		"\3\2\2\2\21\27\7\6\2\2\22\23\5\b\5\2\23\24\7\5\2\2\24\26\3\2\2\2\25\22"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27"+
		"\3\2\2\2\32\34\7\7\2\2\33\16\3\2\2\2\33\21\3\2\2\2\34\35\3\2\2\2\35\61"+
		"\7\17\2\2\36$\5\2\2\2\37 \5\b\5\2 !\7\5\2\2!#\3\2\2\2\"\37\3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\62\3\2\2\2&$\3\2\2\2\'-\7\6\2\2()\5\b\5\2"+
		")*\7\5\2\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2"+
		"\2/-\3\2\2\2\60\62\7\7\2\2\61\36\3\2\2\2\61\'\3\2\2\2\62\3\3\2\2\2\63"+
		"\64\b\3\1\2\64\65\5\6\4\2\65\66\7\20\2\2\66\67\5\6\4\2\67C\3\2\2\289\7"+
		"\3\2\29:\5\6\4\2:;\7\20\2\2;<\5\6\4\2<=\7\4\2\2=C\3\2\2\2>?\7\3\2\2?@"+
		"\5\6\4\2@A\7\4\2\2AC\3\2\2\2B\63\3\2\2\2B8\3\2\2\2B>\3\2\2\2CI\3\2\2\2"+
		"DE\f\5\2\2EF\7\20\2\2FH\5\4\3\6GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\5\3\2\2\2KI\3\2\2\2LM\b\4\1\2MQ\7\22\2\2NQ\7\21\2\2OQ\7\23\2\2PL\3"+
		"\2\2\2PN\3\2\2\2PO\3\2\2\2Q_\3\2\2\2RS\f\7\2\2ST\t\2\2\2TU\5\6\4\2UV\7"+
		"\r\2\2VW\5\6\4\2WX\t\2\2\2XY\5\6\4\bY^\3\2\2\2Z[\f\6\2\2[\\\t\2\2\2\\"+
		"^\5\6\4\7]R\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2"+
		"a_\3\2\2\2bc\b\5\1\2cf\5\2\2\2df\7\21\2\2eb\3\2\2\2ed\3\2\2\2fk\3\2\2"+
		"\2gh\f\4\2\2hj\7\5\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\t\3\2"+
		"\2\2mk\3\2\2\2\16\27\33$-\61BIP]_ek";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}