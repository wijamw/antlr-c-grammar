// Generated from pointer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pointerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOLEAN=15, STRING=16, 
		CHAR=17, INT=18, ID=19, UNSG=20, FLOAT=21, DOUBLE=22, WS=23, NEWLINE=24;
	public static final int
		RULE_s = 0, RULE_init_pointer1 = 1, RULE_init_pointer2 = 2, RULE_type = 3;
	public static final String[] ruleNames = {
		"s", "init_pointer1", "init_pointer2", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'const'", "'*'", "'='", "'&'", "','", "'short'", "'int'", 
		"'long'", "'float'", "'double'", "'bool'", "'char'", "'String'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOLEAN", "STRING", "CHAR", "INT", "ID", "UNSG", "FLOAT", 
		"DOUBLE", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "pointer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pointerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Init_pointer1Context> init_pointer1() {
			return getRuleContexts(Init_pointer1Context.class);
		}
		public Init_pointer1Context init_pointer1(int i) {
			return getRuleContext(Init_pointer1Context.class,i);
		}
		public List<Init_pointer2Context> init_pointer2() {
			return getRuleContexts(Init_pointer2Context.class);
		}
		public Init_pointer2Context init_pointer2(int i) {
			return getRuleContext(Init_pointer2Context.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				switch (_input.LA(1)) {
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
					{
					{
					setState(8);
					type();
					setState(9);
					init_pointer1();
					setState(10);
					match(T__0);
					}
					}
					break;
				case ID:
					{
					{
					setState(12);
					init_pointer2();
					setState(13);
					match(T__0);
					}
					}
					break;
				case T__1:
					{
					{
					setState(15);
					match(T__1);
					setState(16);
					type();
					setState(17);
					init_pointer2();
					setState(18);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID))) != 0) );
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

	public static class Init_pointer1Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pointerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pointerParser.ID, i);
		}
		public List<Init_pointer1Context> init_pointer1() {
			return getRuleContexts(Init_pointer1Context.class);
		}
		public Init_pointer1Context init_pointer1(int i) {
			return getRuleContext(Init_pointer1Context.class,i);
		}
		public Init_pointer1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_pointer1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).enterInit_pointer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).exitInit_pointer1(this);
		}
	}

	public final Init_pointer1Context init_pointer1() throws RecognitionException {
		Init_pointer1Context _localctx = new Init_pointer1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_init_pointer1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__2);
			setState(26);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(25);
				match(T__1);
				}
			}

			setState(28);
			match(ID);
			setState(41);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(29);
				match(T__3);
				setState(31);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(30);
					match(T__4);
					}
				}

				setState(33);
				match(ID);
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(34);
						match(T__5);
						setState(35);
						init_pointer1();
						}
						} 
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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

	public static class Init_pointer2Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pointerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pointerParser.ID, i);
		}
		public List<Init_pointer2Context> init_pointer2() {
			return getRuleContexts(Init_pointer2Context.class);
		}
		public Init_pointer2Context init_pointer2(int i) {
			return getRuleContext(Init_pointer2Context.class,i);
		}
		public Init_pointer2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_pointer2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).enterInit_pointer2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).exitInit_pointer2(this);
		}
	}

	public final Init_pointer2Context init_pointer2() throws RecognitionException {
		Init_pointer2Context _localctx = new Init_pointer2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_init_pointer2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ID);
			setState(56);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(44);
				match(T__3);
				setState(46);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(45);
					match(T__4);
					}
				}

				setState(48);
				match(ID);
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(49);
						match(T__5);
						setState(50);
						init_pointer2();
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pointerListener ) ((pointerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\5\3,\n\3\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3"+
		"\4\7\4\66\n\4\f\4\16\49\13\4\5\4;\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3"+
		"\2\t\20D\2\26\3\2\2\2\4\32\3\2\2\2\6-\3\2\2\2\b<\3\2\2\2\n\13\5\b\5\2"+
		"\13\f\5\4\3\2\f\r\7\3\2\2\r\27\3\2\2\2\16\17\5\6\4\2\17\20\7\3\2\2\20"+
		"\27\3\2\2\2\21\22\7\4\2\2\22\23\5\b\5\2\23\24\5\6\4\2\24\25\7\3\2\2\25"+
		"\27\3\2\2\2\26\n\3\2\2\2\26\16\3\2\2\2\26\21\3\2\2\2\27\30\3\2\2\2\30"+
		"\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\34\7\5\2\2\33\35\7\4\2\2\34"+
		"\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36+\7\25\2\2\37!\7\6\2\2 \"\7"+
		"\7\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#(\7\25\2\2$%\7\b\2\2%\'\5\4\3\2"+
		"&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+\37\3\2"+
		"\2\2+,\3\2\2\2,\5\3\2\2\2-:\7\25\2\2.\60\7\6\2\2/\61\7\7\2\2\60/\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\3\2\2\2\62\67\7\25\2\2\63\64\7\b\2\2\64\66\5\6"+
		"\4\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\2:.\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<=\t\2\2\2=\t\3\2\2\2\13\26\30"+
		"\34!(+\60\67:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}