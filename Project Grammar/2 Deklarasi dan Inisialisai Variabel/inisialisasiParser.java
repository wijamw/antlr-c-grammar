// Generated from inisialisasi.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inisialisasiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, Identifier=73, 
		INT=74, CHAR=75, UNSG=76, FLOAT=77, DOUBLE=78, Whitespace=79, Newline=80, 
		BlockComment=81, LineComment=82;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_pointer = 2, RULE_array = 3, RULE_struct = 4, 
		RULE_operator = 5, RULE_bitwise = 6, RULE_assignment = 7, RULE_indec = 8, 
		RULE_comparator = 9, RULE_matem = 10, RULE_aritmatich = 11, RULE_ternary = 12, 
		RULE_dec = 13, RULE_type_int = 14, RULE_init_struct = 15, RULE_size = 16, 
		RULE_init_array1 = 17, RULE_init_array2 = 18, RULE_init_array3 = 19, RULE_init_array4 = 20, 
		RULE_value1 = 21, RULE_value2 = 22, RULE_value3 = 23, RULE_value4 = 24, 
		RULE_type_CHAR = 25, RULE_type_FLOAT = 26, RULE_type_DOUBLE = 27, RULE_type_INT = 28, 
		RULE_init_pointer1 = 29, RULE_init_pointer2 = 30, RULE_deklarasi = 31, 
		RULE_typedata = 32, RULE_type_data = 33, RULE_integer_s = 34, RULE_integer_v = 35, 
		RULE_char_s = 36, RULE_char_v = 37, RULE_float_s = 38, RULE_float_v = 39, 
		RULE_double_s = 40, RULE_double_v = 41, RULE_boolean_s = 42, RULE_boolean_v = 43, 
		RULE_switchcase = 44, RULE_init_switchcase = 45, RULE_swstatement = 46, 
		RULE_swcase = 47, RULE_swdefault = 48, RULE_statcase = 49, RULE_jumpstat = 50, 
		RULE_bool = 51, RULE_while_statement = 52, RULE_init_while = 53, RULE_relationalExpression = 54, 
		RULE_unaryExpression = 55, RULE_assignmentOperator = 56, RULE_logic = 57, 
		RULE_iterationStatement = 58, RULE_init_for = 59, RULE_condition = 60, 
		RULE_state = 61, RULE_jumpStatement = 62;
	public static final String[] ruleNames = {
		"prog", "statement", "pointer", "array", "struct", "operator", "bitwise", 
		"assignment", "indec", "comparator", "matem", "aritmatich", "ternary", 
		"dec", "type_int", "init_struct", "size", "init_array1", "init_array2", 
		"init_array3", "init_array4", "value1", "value2", "value3", "value4", 
		"type_CHAR", "type_FLOAT", "type_DOUBLE", "type_INT", "init_pointer1", 
		"init_pointer2", "deklarasi", "typedata", "type_data", "integer_s", "integer_v", 
		"char_s", "char_v", "float_s", "float_v", "double_s", "double_v", "boolean_s", 
		"boolean_v", "switchcase", "init_switchcase", "swstatement", "swcase", 
		"swdefault", "statcase", "jumpstat", "bool", "while_statement", "init_while", 
		"relationalExpression", "unaryExpression", "assignmentOperator", "logic", 
		"iterationStatement", "init_for", "condition", "state", "jumpStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'const'", "'='", "'unsigned'", "'struct'", "'{'", "'}'", 
		"','", "'.'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'~'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'+1'", "'-1'", "'=='", "'!='", "'>'", 
		"'<'", "'>='", "'<='", "'||'", "'&&'", "'!'", "'('", "')'", "'?'", "':'", 
		"'short'", "'int'", "'long'", "'['", "']'", "'char'", "'float'", "'double'", 
		"'boolean'", "'\"'", "'''", "'TRUE'", "'FALSE'", "'true'", "'false'", 
		"'switch'", "'case'", "'default'", "'break'", "'continue'", "'goto'", 
		"'0'", "'1'", "'while'", "'do'", "'*='", "'/='", "'%='", "'+='", "'-='", 
		"'<<='", "'>>='", "'&='", "'^='", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Identifier", "INT", "CHAR", "UNSG", "FLOAT", "DOUBLE", "Whitespace", 
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
	public String getGrammarFileName() { return "inisialisasi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inisialisasiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0) );
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public DeklarasiContext deklarasi() {
			return getRuleContext(DeklarasiContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				deklarasi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				pointer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				struct();
				}
				break;
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

	public static class PointerContext extends ParserRuleContext {
		public List<Type_dataContext> type_data() {
			return getRuleContexts(Type_dataContext.class);
		}
		public Type_dataContext type_data(int i) {
			return getRuleContext(Type_dataContext.class,i);
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
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pointer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(150);
					switch (_input.LA(1)) {
					case T__38:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
						{
						{
						setState(138);
						type_data();
						setState(139);
						init_pointer1();
						setState(140);
						match(T__0);
						}
						}
						break;
					case Identifier:
						{
						{
						setState(142);
						init_pointer2();
						setState(143);
						match(T__0);
						}
						}
						break;
					case T__1:
						{
						{
						setState(145);
						match(T__1);
						setState(146);
						type_data();
						setState(147);
						init_pointer2();
						setState(148);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArrayContext extends ParserRuleContext {
		public Type_INTContext type_INT() {
			return getRuleContext(Type_INTContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public Init_array1Context init_array1() {
			return getRuleContext(Init_array1Context.class,0);
		}
		public Init_array4Context init_array4() {
			return getRuleContext(Init_array4Context.class,0);
		}
		public Type_CHARContext type_CHAR() {
			return getRuleContext(Type_CHARContext.class,0);
		}
		public Init_array2Context init_array2() {
			return getRuleContext(Init_array2Context.class,0);
		}
		public Type_FLOATContext type_FLOAT() {
			return getRuleContext(Type_FLOATContext.class,0);
		}
		public Type_DOUBLEContext type_DOUBLE() {
			return getRuleContext(Type_DOUBLEContext.class,0);
		}
		public Init_array3Context init_array3() {
			return getRuleContext(Init_array3Context.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(209);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(154);
				type_INT();
				setState(155);
				match(Identifier);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					size();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(163);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(161);
					match(T__2);
					setState(162);
					init_array1();
					}
				}

				setState(165);
				match(T__0);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(167);
				match(T__3);
				setState(168);
				match(Identifier);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					size();
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(176);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(174);
					match(T__2);
					setState(175);
					init_array4();
					}
				}

				setState(178);
				match(T__0);
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(180);
				type_CHAR();
				setState(181);
				match(Identifier);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					size();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(189);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(187);
					match(T__2);
					setState(188);
					init_array2();
					}
				}

				setState(191);
				match(T__0);
				}
				}
				break;
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(195);
				switch (_input.LA(1)) {
				case T__43:
					{
					setState(193);
					type_FLOAT();
					}
					break;
				case T__44:
					{
					setState(194);
					type_DOUBLE();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197);
				match(Identifier);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					size();
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(205);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(203);
					match(T__2);
					setState(204);
					init_array3();
					}
				}

				setState(207);
				match(T__0);
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

	public static class StructContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public Init_structContext init_struct() {
			return getRuleContext(Init_structContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		int _la;
		try {
			int _alt;
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(211);
						match(T__4);
						setState(212);
						match(Identifier);
						setState(213);
						match(T__5);
						setState(215); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(214);
							dec();
							}
							}
							setState(217); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) );
						setState(219);
						match(T__6);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						match(T__4);
						setState(226);
						match(Identifier);
						setState(227);
						match(Identifier);
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__7) {
							{
							{
							setState(228);
							match(T__7);
							setState(229);
							match(Identifier);
							}
							}
							setState(234);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(235);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(240);
				match(Identifier);
				setState(241);
				match(T__8);
				setState(242);
				match(Identifier);
				setState(243);
				match(T__2);
				setState(244);
				init_struct();
				setState(245);
				match(T__0);
				}
				}
				break;
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

	public static class OperatorContext extends ParserRuleContext {
		public AritmatichContext aritmatich() {
			return getRuleContext(AritmatichContext.class,0);
		}
		public List<MatemContext> matem() {
			return getRuleContexts(MatemContext.class);
		}
		public MatemContext matem(int i) {
			return getRuleContext(MatemContext.class,i);
		}
		public Type_dataContext type_data() {
			return getRuleContext(Type_dataContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public IndecContext indec() {
			return getRuleContext(IndecContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				aritmatich(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					matem(0);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__33 - 34)) | (1L << (Identifier - 34)) | (1L << (INT - 34)) | (1L << (FLOAT - 34)))) != 0) );
				setState(255);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				type_data();
				setState(258);
				match(Identifier);
				setState(259);
				match(T__2);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					{
					setState(260);
					match(Identifier);
					setState(261);
					match(T__7);
					setState(262);
					matem(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(263);
					matem(0);
					setState(264);
					match(T__7);
					setState(265);
					match(Identifier);
					}
					}
					break;
				case 3:
					{
					{
					setState(267);
					matem(0);
					}
					}
					break;
				}
				setState(270);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(Identifier);
				setState(273);
				match(T__2);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					{
					setState(274);
					match(Identifier);
					setState(275);
					indec();
					}
					}
					break;
				case 2:
					{
					{
					setState(276);
					ternary();
					}
					}
					break;
				case 3:
					{
					{
					setState(277);
					bitwise();
					}
					}
					break;
				case 4:
					{
					{
					setState(278);
					aritmatich(0);
					}
					}
					break;
				case 5:
					{
					{
					setState(279);
					matem(0);
					}
					}
					break;
				}
				setState(282);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(Identifier);
				setState(285);
				assignment();
				setState(286);
				match(Identifier);
				setState(287);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				match(Identifier);
				setState(290);
				indec();
				setState(291);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				indec();
				setState(294);
				match(Identifier);
				setState(295);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				comparator();
				}
				break;
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

	public static class BitwiseContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(inisialisasiParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(inisialisasiParser.FLOAT, i);
		}
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitBitwise(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bitwise);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(Identifier);
				setState(301);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(302);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(INT);
				setState(304);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(305);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(FLOAT);
				setState(307);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(308);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(INT);
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(311);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(FLOAT);
				setState(313);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(314);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(315);
				match(T__14);
				}
				setState(316);
				match(INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(317);
				match(T__14);
				}
				setState(318);
				match(Identifier);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(319);
				match(T__14);
				}
				setState(320);
				match(FLOAT);
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(324);
			match(T__2);
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

	public static class IndecContext extends ParserRuleContext {
		public IndecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterIndec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitIndec(this);
		}
	}

	public final IndecContext indec() throws RecognitionException {
		IndecContext _localctx = new IndecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_indec);
		int _la;
		try {
			setState(328);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class ComparatorContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public AritmatichContext aritmatich() {
			return getRuleContext(AritmatichContext.class,0);
		}
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(Identifier);
				setState(331);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(332);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(Identifier);
				setState(334);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(335);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(336);
				match(T__32);
				}
				setState(337);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(338);
				match(T__32);
				}
				setState(339);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(INT);
				setState(341);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(342);
				match(INT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(T__33);
				setState(344);
				comparator();
				setState(345);
				match(T__34);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(T__33);
				setState(348);
				match(T__32);
				setState(349);
				match(T__33);
				setState(350);
				comparator();
				setState(351);
				match(T__34);
				setState(352);
				match(T__34);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				match(T__33);
				setState(355);
				match(T__33);
				setState(356);
				aritmatich(0);
				setState(357);
				match(T__34);
				setState(358);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(359);
				match(Identifier);
				setState(360);
				match(T__34);
				}
				break;
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

	public static class MatemContext extends ParserRuleContext {
		public List<MatemContext> matem() {
			return getRuleContexts(MatemContext.class);
		}
		public MatemContext matem(int i) {
			return getRuleContext(MatemContext.class,i);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public TerminalNode FLOAT() { return getToken(inisialisasiParser.FLOAT, 0); }
		public MatemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterMatem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitMatem(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_matem, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(366);
				matem(0);
				setState(367);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(368);
				matem(0);
				setState(369);
				match(T__7);
				setState(370);
				matem(0);
				setState(371);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(372);
				matem(0);
				}
				break;
			case 2:
				{
				setState(374);
				match(INT);
				}
				break;
			case 3:
				{
				setState(375);
				match(Identifier);
				}
				break;
			case 4:
				{
				setState(376);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(377);
				match(T__33);
				setState(378);
				matem(0);
				setState(379);
				match(T__34);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(383);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(384);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(385);
						matem(0);
						setState(386);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(387);
						matem(7);
						}
						break;
					case 2:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(389);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(390);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(391);
						matem(6);
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class AritmatichContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public TerminalNode FLOAT() { return getToken(inisialisasiParser.FLOAT, 0); }
		public List<AritmatichContext> aritmatich() {
			return getRuleContexts(AritmatichContext.class);
		}
		public AritmatichContext aritmatich(int i) {
			return getRuleContext(AritmatichContext.class,i);
		}
		public AritmatichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmatich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterAritmatich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitAritmatich(this);
		}
	}

	public final AritmatichContext aritmatich() throws RecognitionException {
		return aritmatich(0);
	}

	private AritmatichContext aritmatich(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritmatichContext _localctx = new AritmatichContext(_ctx, _parentState);
		AritmatichContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_aritmatich, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(398);
				match(INT);
				}
				break;
			case 2:
				{
				setState(399);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(400);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(401);
				match(T__33);
				setState(402);
				aritmatich(0);
				setState(403);
				match(T__34);
				}
				break;
			case 5:
				{
				setState(405);
				match(T__33);
				setState(406);
				aritmatich(0);
				setState(407);
				match(T__34);
				setState(408);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(409);
				match(T__33);
				setState(410);
				aritmatich(0);
				setState(411);
				match(T__34);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmatichContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmatich);
					setState(415);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(416);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(417);
					aritmatich(7);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class TernaryContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitTernary(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternary);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__33);
				setState(424);
				match(Identifier);
				setState(425);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(426);
				match(INT);
				setState(427);
				match(T__34);
				setState(428);
				match(T__35);
				setState(429);
				match(INT);
				setState(430);
				match(T__36);
				setState(431);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__33);
				setState(433);
				match(Identifier);
				setState(434);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(435);
				match(Identifier);
				setState(436);
				match(T__34);
				setState(437);
				match(T__35);
				setState(438);
				match(Identifier);
				setState(439);
				match(T__36);
				setState(440);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(T__33);
				setState(442);
				match(INT);
				setState(443);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(444);
				match(INT);
				setState(445);
				match(T__34);
				setState(446);
				match(T__35);
				setState(447);
				match(Identifier);
				setState(448);
				match(T__36);
				setState(449);
				match(Identifier);
				}
				break;
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

	public static class DecContext extends ParserRuleContext {
		public Type_dataContext type_data() {
			return getRuleContext(Type_dataContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dec);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				type_data();
				setState(453);
				match(Identifier);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(454);
					size();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				type_int();
				setState(463);
				match(Identifier);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(464);
					size();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(T__0);
				}
				break;
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

	public static class Type_intContext extends ParserRuleContext {
		public Type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_int(this);
		}
	}

	public final Type_intContext type_int() throws RecognitionException {
		Type_intContext _localctx = new Type_intContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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

	public static class Init_structContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(inisialisasiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(inisialisasiParser.CHAR, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(inisialisasiParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(inisialisasiParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(inisialisasiParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(inisialisasiParser.DOUBLE, i);
		}
		public Init_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_struct(this);
		}
	}

	public final Init_structContext init_struct() throws RecognitionException {
		Init_structContext _localctx = new Init_structContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_init_struct);
		int _la;
		try {
			setState(508);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(INT);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(477);
					match(T__7);
					setState(478);
					match(INT);
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(CHAR);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(485);
					match(T__7);
					setState(486);
					match(CHAR);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(FLOAT);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(493);
					match(T__7);
					setState(494);
					match(FLOAT);
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				match(DOUBLE);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(501);
					match(T__7);
					setState(502);
					match(DOUBLE);
					}
					}
					setState(507);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__40);
			setState(511);
			match(INT);
			setState(512);
			match(T__41);
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

	public static class Init_array1Context extends ParserRuleContext {
		public List<Value1Context> value1() {
			return getRuleContexts(Value1Context.class);
		}
		public Value1Context value1(int i) {
			return getRuleContext(Value1Context.class,i);
		}
		public Init_array1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_array1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_array1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_array1(this);
		}
	}

	public final Init_array1Context init_array1() throws RecognitionException {
		Init_array1Context _localctx = new Init_array1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_init_array1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__5);
			setState(515);
			value1();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(516);
				match(T__7);
				setState(517);
				value1();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(T__6);
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

	public static class Init_array2Context extends ParserRuleContext {
		public List<Value2Context> value2() {
			return getRuleContexts(Value2Context.class);
		}
		public Value2Context value2(int i) {
			return getRuleContext(Value2Context.class,i);
		}
		public Init_array2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_array2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_array2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_array2(this);
		}
	}

	public final Init_array2Context init_array2() throws RecognitionException {
		Init_array2Context _localctx = new Init_array2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_init_array2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__5);
			setState(526);
			value2();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(527);
				match(T__7);
				setState(528);
				value2();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(T__6);
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

	public static class Init_array3Context extends ParserRuleContext {
		public List<Value3Context> value3() {
			return getRuleContexts(Value3Context.class);
		}
		public Value3Context value3(int i) {
			return getRuleContext(Value3Context.class,i);
		}
		public Init_array3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_array3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_array3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_array3(this);
		}
	}

	public final Init_array3Context init_array3() throws RecognitionException {
		Init_array3Context _localctx = new Init_array3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_init_array3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__5);
			setState(537);
			value3();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(538);
				match(T__7);
				setState(539);
				value3();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(T__6);
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

	public static class Init_array4Context extends ParserRuleContext {
		public List<Value4Context> value4() {
			return getRuleContexts(Value4Context.class);
		}
		public Value4Context value4(int i) {
			return getRuleContext(Value4Context.class,i);
		}
		public Init_array4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_array4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_array4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_array4(this);
		}
	}

	public final Init_array4Context init_array4() throws RecognitionException {
		Init_array4Context _localctx = new Init_array4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_array4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(T__5);
			setState(548);
			value4();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(549);
				match(T__7);
				setState(550);
				value4();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(T__6);
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

	public static class Value1Context extends ParserRuleContext {
		public Init_array1Context init_array1() {
			return getRuleContext(Init_array1Context.class,0);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitValue1(this);
		}
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_value1);
		try {
			setState(560);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				init_array1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				match(INT);
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

	public static class Value2Context extends ParserRuleContext {
		public Init_array2Context init_array2() {
			return getRuleContext(Init_array2Context.class,0);
		}
		public TerminalNode CHAR() { return getToken(inisialisasiParser.CHAR, 0); }
		public Value2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitValue2(this);
		}
	}

	public final Value2Context value2() throws RecognitionException {
		Value2Context _localctx = new Value2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_value2);
		try {
			setState(564);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				init_array2();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(CHAR);
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

	public static class Value3Context extends ParserRuleContext {
		public Init_array3Context init_array3() {
			return getRuleContext(Init_array3Context.class,0);
		}
		public TerminalNode FLOAT() { return getToken(inisialisasiParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(inisialisasiParser.DOUBLE, 0); }
		public Value3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterValue3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitValue3(this);
		}
	}

	public final Value3Context value3() throws RecognitionException {
		Value3Context _localctx = new Value3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_value3);
		int _la;
		try {
			setState(568);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				init_array3();
				}
				break;
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class Value4Context extends ParserRuleContext {
		public Init_array4Context init_array4() {
			return getRuleContext(Init_array4Context.class,0);
		}
		public TerminalNode UNSG() { return getToken(inisialisasiParser.UNSG, 0); }
		public Value4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterValue4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitValue4(this);
		}
	}

	public final Value4Context value4() throws RecognitionException {
		Value4Context _localctx = new Value4Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_value4);
		try {
			setState(572);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				init_array4();
				}
				break;
			case UNSG:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(UNSG);
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

	public static class Type_CHARContext extends ParserRuleContext {
		public Type_CHARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_CHAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_CHAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_CHAR(this);
		}
	}

	public final Type_CHARContext type_CHAR() throws RecognitionException {
		Type_CHARContext _localctx = new Type_CHARContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_CHAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__42);
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

	public static class Type_FLOATContext extends ParserRuleContext {
		public Type_FLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_FLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_FLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_FLOAT(this);
		}
	}

	public final Type_FLOATContext type_FLOAT() throws RecognitionException {
		Type_FLOATContext _localctx = new Type_FLOATContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type_FLOAT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T__43);
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

	public static class Type_DOUBLEContext extends ParserRuleContext {
		public Type_DOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_DOUBLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_DOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_DOUBLE(this);
		}
	}

	public final Type_DOUBLEContext type_DOUBLE() throws RecognitionException {
		Type_DOUBLEContext _localctx = new Type_DOUBLEContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type_DOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__44);
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

	public static class Type_INTContext extends ParserRuleContext {
		public Type_INTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_INT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_INT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_INT(this);
		}
	}

	public final Type_INTContext type_INT() throws RecognitionException {
		Type_INTContext _localctx = new Type_INTContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_INT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__38);
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
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
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
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_pointer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_pointer1(this);
		}
	}

	public final Init_pointer1Context init_pointer1() throws RecognitionException {
		Init_pointer1Context _localctx = new Init_pointer1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_init_pointer1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__17);
			setState(584);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(583);
				match(T__1);
				}
			}

			setState(586);
			match(Identifier);
			setState(599);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(587);
				match(T__2);
				setState(589);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(588);
					match(T__9);
					}
				}

				setState(591);
				match(Identifier);
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(T__7);
						setState(593);
						init_pointer1();
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
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
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_pointer2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_pointer2(this);
		}
	}

	public final Init_pointer2Context init_pointer2() throws RecognitionException {
		Init_pointer2Context _localctx = new Init_pointer2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_init_pointer2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(Identifier);
			setState(614);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(602);
				match(T__2);
				setState(604);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(603);
					match(T__9);
					}
				}

				setState(606);
				match(Identifier);
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(607);
						match(T__7);
						setState(608);
						init_pointer2();
						}
						} 
					}
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class DeklarasiContext extends ParserRuleContext {
		public Type_dataContext type_data() {
			return getRuleContext(Type_dataContext.class,0);
		}
		public TypedataContext typedata() {
			return getRuleContext(TypedataContext.class,0);
		}
		public Integer_sContext integer_s() {
			return getRuleContext(Integer_sContext.class,0);
		}
		public DeklarasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarasi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterDeklarasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitDeklarasi(this);
		}
	}

	public final DeklarasiContext deklarasi() throws RecognitionException {
		DeklarasiContext _localctx = new DeklarasiContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_deklarasi);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(616);
					match(T__3);
					}
				}

				setState(620);
				_la = _input.LA(1);
				if (_la==T__37 || _la==T__39) {
					{
					setState(619);
					typedata();
					}
				}

				setState(622);
				type_data();
				setState(623);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(625);
					match(T__3);
					}
				}

				setState(628);
				typedata();
				setState(629);
				integer_s();
				setState(630);
				match(T__0);
				}
				break;
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

	public static class TypedataContext extends ParserRuleContext {
		public TypedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterTypedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitTypedata(this);
		}
	}

	public final TypedataContext typedata() throws RecognitionException {
		TypedataContext _localctx = new TypedataContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typedata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__39) ) {
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

	public static class Type_dataContext extends ParserRuleContext {
		public List<Integer_sContext> integer_s() {
			return getRuleContexts(Integer_sContext.class);
		}
		public Integer_sContext integer_s(int i) {
			return getRuleContext(Integer_sContext.class,i);
		}
		public List<Char_sContext> char_s() {
			return getRuleContexts(Char_sContext.class);
		}
		public Char_sContext char_s(int i) {
			return getRuleContext(Char_sContext.class,i);
		}
		public List<Float_sContext> float_s() {
			return getRuleContexts(Float_sContext.class);
		}
		public Float_sContext float_s(int i) {
			return getRuleContext(Float_sContext.class,i);
		}
		public List<Double_sContext> double_s() {
			return getRuleContexts(Double_sContext.class);
		}
		public Double_sContext double_s(int i) {
			return getRuleContext(Double_sContext.class,i);
		}
		public List<Boolean_sContext> boolean_s() {
			return getRuleContexts(Boolean_sContext.class);
		}
		public Boolean_sContext boolean_s(int i) {
			return getRuleContext(Boolean_sContext.class,i);
		}
		public Type_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterType_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitType_data(this);
		}
	}

	public final Type_dataContext type_data() throws RecognitionException {
		Type_dataContext _localctx = new Type_dataContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type_data);
		int _la;
		try {
			setState(691);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(T__38);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(637);
					integer_s();
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(638);
						match(T__7);
						setState(639);
						integer_s();
						}
						}
						setState(644);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(T__42);
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(648);
					char_s();
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(649);
						match(T__7);
						setState(650);
						char_s();
						}
						}
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(T__43);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(659);
					float_s();
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(660);
						match(T__7);
						setState(661);
						float_s();
						}
						}
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				match(T__44);
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(670);
					double_s();
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(671);
						match(T__7);
						setState(672);
						double_s();
						}
						}
						setState(677);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				match(T__45);
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(681);
					boolean_s();
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(682);
						match(T__7);
						setState(683);
						boolean_s();
						}
						}
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
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

	public static class Integer_sContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Integer_vContext integer_v() {
			return getRuleContext(Integer_vContext.class,0);
		}
		public Integer_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInteger_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInteger_s(this);
		}
	}

	public final Integer_sContext integer_s() throws RecognitionException {
		Integer_sContext _localctx = new Integer_sContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integer_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(Identifier);
			setState(695);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(694);
				integer_v();
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

	public static class Integer_vContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public Integer_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInteger_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInteger_v(this);
		}
	}

	public final Integer_vContext integer_v() throws RecognitionException {
		Integer_vContext _localctx = new Integer_vContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_integer_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T__2);
			setState(698);
			match(INT);
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

	public static class Char_sContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Char_vContext char_v() {
			return getRuleContext(Char_vContext.class,0);
		}
		public Char_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterChar_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitChar_s(this);
		}
	}

	public final Char_sContext char_s() throws RecognitionException {
		Char_sContext _localctx = new Char_sContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_char_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(Identifier);
			setState(702);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(701);
				char_v();
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

	public static class Char_vContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Char_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterChar_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitChar_v(this);
		}
	}

	public final Char_vContext char_v() throws RecognitionException {
		Char_vContext _localctx = new Char_vContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_char_v);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(T__2);
				setState(705);
				match(T__46);
				setState(706);
				match(Identifier);
				setState(707);
				match(T__46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(T__2);
				setState(709);
				match(T__47);
				setState(710);
				matchWildcard();
				setState(711);
				match(T__47);
				}
				break;
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

	public static class Float_sContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Float_vContext float_v() {
			return getRuleContext(Float_vContext.class,0);
		}
		public Float_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterFloat_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitFloat_s(this);
		}
	}

	public final Float_sContext float_s() throws RecognitionException {
		Float_sContext _localctx = new Float_sContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_float_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(Identifier);
			setState(716);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(715);
				float_v();
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

	public static class Float_vContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public Float_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterFloat_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitFloat_v(this);
		}
	}

	public final Float_vContext float_v() throws RecognitionException {
		Float_vContext _localctx = new Float_vContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_float_v);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(T__2);
				setState(719);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(T__2);
				setState(721);
				match(INT);
				setState(722);
				match(T__8);
				setState(723);
				match(INT);
				}
				break;
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

	public static class Double_sContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Double_vContext double_v() {
			return getRuleContext(Double_vContext.class,0);
		}
		public Double_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterDouble_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitDouble_s(this);
		}
	}

	public final Double_sContext double_s() throws RecognitionException {
		Double_sContext _localctx = new Double_sContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_double_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(Identifier);
			setState(728);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(727);
				double_v();
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

	public static class Double_vContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(inisialisasiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inisialisasiParser.INT, i);
		}
		public Double_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterDouble_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitDouble_v(this);
		}
	}

	public final Double_vContext double_v() throws RecognitionException {
		Double_vContext _localctx = new Double_vContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_double_v);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(T__2);
				setState(731);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(T__2);
				setState(733);
				match(INT);
				setState(734);
				match(T__8);
				setState(735);
				match(INT);
				}
				break;
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

	public static class Boolean_sContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public Boolean_vContext boolean_v() {
			return getRuleContext(Boolean_vContext.class,0);
		}
		public Boolean_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterBoolean_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitBoolean_s(this);
		}
	}

	public final Boolean_sContext boolean_s() throws RecognitionException {
		Boolean_sContext _localctx = new Boolean_sContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolean_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(Identifier);
			setState(740);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(739);
				boolean_v();
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

	public static class Boolean_vContext extends ParserRuleContext {
		public Boolean_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterBoolean_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitBoolean_v(this);
		}
	}

	public final Boolean_vContext boolean_v() throws RecognitionException {
		Boolean_vContext _localctx = new Boolean_vContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolean_v);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(T__2);
				setState(743);
				match(T__48);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(T__2);
				setState(745);
				match(T__49);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(T__2);
				setState(747);
				match(T__50);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(T__2);
				setState(749);
				match(T__51);
				}
				break;
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

	public static class SwitchcaseContext extends ParserRuleContext {
		public Init_switchcaseContext init_switchcase() {
			return getRuleContext(Init_switchcaseContext.class,0);
		}
		public List<SwstatementContext> swstatement() {
			return getRuleContexts(SwstatementContext.class);
		}
		public SwstatementContext swstatement(int i) {
			return getRuleContext(SwstatementContext.class,i);
		}
		public SwitchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitSwitchcase(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(T__52);
			setState(753);
			match(T__33);
			setState(754);
			init_switchcase();
			setState(755);
			match(T__34);
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(756);
				swstatement();
				}
				break;
			case 2:
				{
				setState(757);
				match(T__5);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__53 || _la==T__54) {
					{
					{
					setState(758);
					swstatement();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(764);
				match(T__6);
				}
				break;
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

	public static class Init_switchcaseContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Init_switchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_switchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_switchcase(this);
		}
	}

	public final Init_switchcaseContext init_switchcase() throws RecognitionException {
		Init_switchcaseContext _localctx = new Init_switchcaseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_init_switchcase);
		int _la;
		try {
			setState(777);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(Identifier);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(INT);
				}
				break;
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__58:
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				bool();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				match(T__47);
				setState(772); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(771);
					match(Identifier);
					}
					}
					setState(774); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(776);
				match(T__47);
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

	public static class SwstatementContext extends ParserRuleContext {
		public List<SwcaseContext> swcase() {
			return getRuleContexts(SwcaseContext.class);
		}
		public SwcaseContext swcase(int i) {
			return getRuleContext(SwcaseContext.class,i);
		}
		public SwdefaultContext swdefault() {
			return getRuleContext(SwdefaultContext.class,0);
		}
		public SwstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterSwstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitSwstatement(this);
		}
	}

	public final SwstatementContext swstatement() throws RecognitionException {
		SwstatementContext _localctx = new SwstatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_swstatement);
		try {
			int _alt;
			setState(785);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(780); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(779);
						swcase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(782); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				swdefault();
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

	public static class SwcaseContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public List<StatcaseContext> statcase() {
			return getRuleContexts(StatcaseContext.class);
		}
		public StatcaseContext statcase(int i) {
			return getRuleContext(StatcaseContext.class,i);
		}
		public SwcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterSwcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitSwcase(this);
		}
	}

	public final SwcaseContext swcase() throws RecognitionException {
		SwcaseContext _localctx = new SwcaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_swcase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(T__53);
			setState(788);
			match(Identifier);
			setState(789);
			match(T__36);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(790);
					statcase();
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class SwdefaultContext extends ParserRuleContext {
		public List<StatcaseContext> statcase() {
			return getRuleContexts(StatcaseContext.class);
		}
		public StatcaseContext statcase(int i) {
			return getRuleContext(StatcaseContext.class,i);
		}
		public SwdefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swdefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterSwdefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitSwdefault(this);
		}
	}

	public final SwdefaultContext swdefault() throws RecognitionException {
		SwdefaultContext _localctx = new SwdefaultContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_swdefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(T__54);
			setState(797);
			match(T__36);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					statcase();
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class StatcaseContext extends ParserRuleContext {
		public SwitchcaseContext switchcase() {
			return getRuleContext(SwitchcaseContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public JumpstatContext jumpstat() {
			return getRuleContext(JumpstatContext.class,0);
		}
		public StatcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterStatcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitStatcase(this);
		}
	}

	public final StatcaseContext statcase() throws RecognitionException {
		StatcaseContext _localctx = new StatcaseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statcase);
		try {
			setState(809);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				switchcase();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__32:
			case T__33:
			case T__37:
			case T__38:
			case T__39:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case Identifier:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				statement();
				setState(806);
				match(T__0);
				}
				break;
			case T__55:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				jumpstat();
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

	public static class JumpstatContext extends ParserRuleContext {
		public JumpstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterJumpstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitJumpstat(this);
		}
	}

	public final JumpstatContext jumpstat() throws RecognitionException {
		JumpstatContext _localctx = new JumpstatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_jumpstat);
		try {
			setState(817);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(T__55);
				setState(812);
				match(T__0);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				match(T__56);
				setState(814);
				match(T__0);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(T__57);
				setState(816);
				match(T__0);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0)) ) {
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

	public static class While_statementContext extends ParserRuleContext {
		public Init_whileContext init_while() {
			return getRuleContext(Init_whileContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(inisialisasiParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(inisialisasiParser.Newline, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_while_statement);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(T__60);
				setState(822);
				match(T__33);
				setState(823);
				init_while(0);
				setState(824);
				match(T__34);
				setState(825);
				match(T__5);
				setState(826);
				match(Newline);
				setState(827);
				statement();
				setState(828);
				match(T__6);
				setState(829);
				match(Newline);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(T__60);
				setState(832);
				match(T__33);
				setState(833);
				init_while(0);
				setState(834);
				match(T__34);
				setState(835);
				match(T__5);
				setState(836);
				match(Newline);
				setState(837);
				operator();
				setState(838);
				match(Newline);
				setState(839);
				match(T__6);
				setState(840);
				match(Newline);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(T__60);
				setState(843);
				match(T__33);
				setState(844);
				init_while(0);
				setState(845);
				match(T__34);
				setState(846);
				match(T__61);
				setState(847);
				match(T__5);
				setState(848);
				match(Newline);
				setState(849);
				statement();
				setState(850);
				match(T__6);
				setState(851);
				match(Newline);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				match(T__60);
				setState(854);
				match(T__33);
				setState(855);
				init_while(0);
				setState(856);
				match(T__34);
				setState(857);
				match(T__61);
				setState(858);
				match(T__5);
				setState(859);
				match(Newline);
				setState(860);
				operator();
				setState(861);
				match(Newline);
				setState(862);
				match(T__6);
				setState(863);
				match(Newline);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(865);
				match(T__61);
				setState(866);
				match(T__5);
				setState(867);
				match(Newline);
				setState(868);
				statement();
				setState(869);
				match(T__6);
				setState(870);
				match(T__60);
				setState(871);
				match(T__33);
				setState(872);
				init_while(0);
				setState(873);
				match(T__34);
				setState(874);
				match(Newline);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(876);
				match(T__61);
				setState(877);
				match(T__5);
				setState(878);
				match(Newline);
				setState(879);
				operator();
				setState(880);
				match(Newline);
				setState(881);
				match(T__6);
				setState(882);
				match(T__60);
				setState(883);
				match(T__33);
				setState(884);
				init_while(0);
				setState(885);
				match(T__34);
				setState(886);
				match(Newline);
				}
				break;
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

	public static class Init_whileContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<Init_whileContext> init_while() {
			return getRuleContexts(Init_whileContext.class);
		}
		public Init_whileContext init_while(int i) {
			return getRuleContext(Init_whileContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public Init_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_while(this);
		}
	}

	public final Init_whileContext init_while() throws RecognitionException {
		return init_while(0);
	}

	private Init_whileContext init_while(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_whileContext _localctx = new Init_whileContext(_ctx, _parentState);
		Init_whileContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_init_while, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(891);
				match(Identifier);
				setState(892);
				relationalExpression();
				setState(893);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(895);
				match(Identifier);
				setState(896);
				relationalExpression();
				setState(897);
				match(INT);
				}
				break;
			case 3:
				{
				setState(899);
				match(Identifier);
				setState(900);
				relationalExpression();
				setState(901);
				match(T__33);
				setState(902);
				operator();
				setState(903);
				match(T__34);
				}
				break;
			case 4:
				{
				setState(905);
				match(Identifier);
				setState(906);
				relationalExpression();
				setState(907);
				match(T__33);
				setState(908);
				operator();
				setState(909);
				match(T__34);
				}
				break;
			case 5:
				{
				setState(911);
				match(Identifier);
				setState(912);
				relationalExpression();
				setState(913);
				match(T__33);
				setState(914);
				operator();
				setState(915);
				match(T__34);
				}
				break;
			case 6:
				{
				setState(917);
				match(Identifier);
				setState(918);
				relationalExpression();
				setState(919);
				match(T__33);
				setState(920);
				operator();
				setState(921);
				match(T__34);
				}
				break;
			case 7:
				{
				setState(923);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_whileContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_while);
					setState(926);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(927);
					logic();
					setState(928);
					init_while(3);
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__25) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)))) != 0)) ) {
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

	public static class LogicContext extends ParserRuleContext {
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class IterationStatementContext extends ParserRuleContext {
		public Init_forContext init_for() {
			return getRuleContext(Init_forContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DeklarasiContext deklarasi() {
			return getRuleContext(DeklarasiContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_iterationStatement);
		int _la;
		try {
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				match(T__71);
				setState(944);
				match(T__33);
				setState(946);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(945);
					init_for();
					}
				}

				setState(948);
				match(T__0);
				setState(950);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(949);
					condition();
					}
				}

				setState(952);
				match(T__0);
				setState(954);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(953);
					state();
					}
				}

				setState(956);
				match(T__34);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					{
					setState(957);
					statement();
					}
					}
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				match(T__71);
				setState(964);
				match(T__33);
				setState(966);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
					{
					setState(965);
					deklarasi();
					}
				}

				setState(968);
				match(T__0);
				setState(970);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(969);
					condition();
					}
				}

				setState(972);
				match(T__0);
				setState(974);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(973);
					state();
					}
				}

				setState(976);
				match(T__34);
				{
				setState(977);
				match(T__5);
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					{
					setState(978);
					statement();
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(984);
				match(T__6);
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					{
					setState(985);
					statement();
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				match(T__71);
				setState(992);
				match(T__33);
				setState(994);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(993);
					init_for();
					}
				}

				setState(996);
				match(T__0);
				setState(998);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(997);
					condition();
					}
				}

				setState(1000);
				match(T__0);
				setState(1002);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(1001);
					state();
					}
				}

				setState(1004);
				match(T__34);
				{
				setState(1005);
				match(T__5);
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					{
					setState(1006);
					statement();
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(1012);
				match(T__6);
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					{
					setState(1013);
					statement();
					}
					}
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class Init_forContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public Init_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterInit_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitInit_for(this);
		}
	}

	public final Init_forContext init_for() throws RecognitionException {
		Init_forContext _localctx = new Init_forContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_init_for);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1021);
					match(Identifier);
					}
					}
					setState(1024); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1026);
				match(T__2);
				setState(1027);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1028);
					match(Identifier);
					}
					}
					setState(1031); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1033);
				match(T__2);
				{
				setState(1034);
				match(Identifier);
				}
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_condition);
		int _la;
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1037);
					match(Identifier);
					}
					}
					setState(1040); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1043); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1042);
					relationalExpression();
					}
					}
					setState(1045); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) );
				{
				setState(1047);
				match(Identifier);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1049);
					match(Identifier);
					}
					}
					setState(1052); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1054);
				relationalExpression();
				setState(1055);
				match(INT);
				}
				break;
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

	public static class StateContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(inisialisasiParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(inisialisasiParser.Identifier, i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(inisialisasiParser.INT, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_state);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				unaryExpression();
				setState(1061); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1060);
					match(Identifier);
					}
					}
					setState(1063); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1065);
					match(Identifier);
					}
					}
					setState(1068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1070);
				assignmentOperator();
				setState(1071);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1073);
					match(Identifier);
					}
					}
					setState(1076); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(1078);
				unaryExpression();
				}
				break;
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(inisialisasiParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inisialisasiListener ) ((inisialisasiListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_jumpStatement);
		int _la;
		try {
			setState(1092);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(T__57);
				setState(1082);
				match(Identifier);
				setState(1083);
				match(T__0);
				setState(1085);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					setState(1084);
					statement();
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				match(Identifier);
				setState(1088);
				match(T__36);
				setState(1090);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Identifier - 73)) | (1L << (INT - 73)) | (1L << (FLOAT - 73)))) != 0)) {
					{
					setState(1089);
					statement();
					}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return matem_sempred((MatemContext)_localctx, predIndex);
		case 11:
			return aritmatich_sempred((AritmatichContext)_localctx, predIndex);
		case 53:
			return init_while_sempred((Init_whileContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean matem_sempred(MatemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean aritmatich_sempred(AritmatichContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean init_while_sempred(Init_whileContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0449\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\6\2\u0082\n\2\r\2\16\2\u0083\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u008b\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0099"+
		"\n\4\r\4\16\4\u009a\3\5\3\5\3\5\6\5\u00a0\n\5\r\5\16\5\u00a1\3\5\3\5\5"+
		"\5\u00a6\n\5\3\5\3\5\3\5\3\5\3\5\6\5\u00ad\n\5\r\5\16\5\u00ae\3\5\3\5"+
		"\5\5\u00b3\n\5\3\5\3\5\3\5\3\5\3\5\6\5\u00ba\n\5\r\5\16\5\u00bb\3\5\3"+
		"\5\5\5\u00c0\n\5\3\5\3\5\3\5\3\5\5\5\u00c6\n\5\3\5\3\5\6\5\u00ca\n\5\r"+
		"\5\16\5\u00cb\3\5\3\5\5\5\u00d0\n\5\3\5\3\5\5\5\u00d4\n\5\3\6\3\6\3\6"+
		"\3\6\6\6\u00da\n\6\r\6\16\6\u00db\3\6\3\6\6\6\u00e0\n\6\r\6\16\6\u00e1"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00e9\n\6\f\6\16\6\u00ec\13\6\3\6\6\6\u00ef\n"+
		"\6\r\6\16\6\u00f0\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00fa\n\6\3\7\3\7\6"+
		"\7\u00fe\n\7\r\7\16\7\u00ff\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u010f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u011b"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u012d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0144\n\b\3\t\3\t\3\t\3\n\3\n\5\n\u014b"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u016d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0180\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u018b\n\f\f\f\16\f\u018e\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01a0\n\r\3\r\3\r"+
		"\3\r\7\r\u01a5\n\r\f\r\16\r\u01a8\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01c5\n\16\3\17\3\17\3\17\7\17"+
		"\u01ca\n\17\f\17\16\17\u01cd\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u01d4"+
		"\n\17\f\17\16\17\u01d7\13\17\3\17\3\17\5\17\u01db\n\17\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u01e2\n\21\f\21\16\21\u01e5\13\21\3\21\3\21\3\21\7\21"+
		"\u01ea\n\21\f\21\16\21\u01ed\13\21\3\21\3\21\3\21\7\21\u01f2\n\21\f\21"+
		"\16\21\u01f5\13\21\3\21\3\21\3\21\7\21\u01fa\n\21\f\21\16\21\u01fd\13"+
		"\21\5\21\u01ff\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0209"+
		"\n\23\f\23\16\23\u020c\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0214"+
		"\n\24\f\24\16\24\u0217\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u021f"+
		"\n\25\f\25\16\25\u0222\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u022a"+
		"\n\26\f\26\16\26\u022d\13\26\3\26\3\26\3\27\3\27\5\27\u0233\n\27\3\30"+
		"\3\30\5\30\u0237\n\30\3\31\3\31\5\31\u023b\n\31\3\32\3\32\5\32\u023f\n"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u024b\n\37"+
		"\3\37\3\37\3\37\5\37\u0250\n\37\3\37\3\37\3\37\7\37\u0255\n\37\f\37\16"+
		"\37\u0258\13\37\5\37\u025a\n\37\3 \3 \3 \5 \u025f\n \3 \3 \3 \7 \u0264"+
		"\n \f \16 \u0267\13 \5 \u0269\n \3!\5!\u026c\n!\3!\5!\u026f\n!\3!\3!\3"+
		"!\3!\5!\u0275\n!\3!\3!\3!\3!\5!\u027b\n!\3\"\3\"\3#\3#\3#\3#\7#\u0283"+
		"\n#\f#\16#\u0286\13#\5#\u0288\n#\3#\3#\3#\3#\7#\u028e\n#\f#\16#\u0291"+
		"\13#\5#\u0293\n#\3#\3#\3#\3#\7#\u0299\n#\f#\16#\u029c\13#\5#\u029e\n#"+
		"\3#\3#\3#\3#\7#\u02a4\n#\f#\16#\u02a7\13#\5#\u02a9\n#\3#\3#\3#\3#\7#\u02af"+
		"\n#\f#\16#\u02b2\13#\5#\u02b4\n#\5#\u02b6\n#\3$\3$\5$\u02ba\n$\3%\3%\3"+
		"%\3&\3&\5&\u02c1\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02cb\n\'\3(\3"+
		"(\5(\u02cf\n(\3)\3)\3)\3)\3)\3)\5)\u02d7\n)\3*\3*\5*\u02db\n*\3+\3+\3"+
		"+\3+\3+\3+\5+\u02e3\n+\3,\3,\5,\u02e7\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02f1"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\7.\u02fa\n.\f.\16.\u02fd\13.\3.\5.\u0300\n.\3"+
		"/\3/\3/\3/\3/\6/\u0307\n/\r/\16/\u0308\3/\5/\u030c\n/\3\60\6\60\u030f"+
		"\n\60\r\60\16\60\u0310\3\60\5\60\u0314\n\60\3\61\3\61\3\61\3\61\7\61\u031a"+
		"\n\61\f\61\16\61\u031d\13\61\3\62\3\62\3\62\7\62\u0322\n\62\f\62\16\62"+
		"\u0325\13\62\3\63\3\63\3\63\3\63\3\63\5\63\u032c\n\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u0334\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u037b\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u039f\n\67\3\67\3\67\3\67\3\67\7\67\u03a5\n\67\f\67\16\67\u03a8"+
		"\13\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\5<\u03b5\n<\3<\3<\5<\u03b9\n<"+
		"\3<\3<\5<\u03bd\n<\3<\3<\7<\u03c1\n<\f<\16<\u03c4\13<\3<\3<\3<\5<\u03c9"+
		"\n<\3<\3<\5<\u03cd\n<\3<\3<\5<\u03d1\n<\3<\3<\3<\7<\u03d6\n<\f<\16<\u03d9"+
		"\13<\3<\3<\7<\u03dd\n<\f<\16<\u03e0\13<\3<\3<\3<\5<\u03e5\n<\3<\3<\5<"+
		"\u03e9\n<\3<\3<\5<\u03ed\n<\3<\3<\3<\7<\u03f2\n<\f<\16<\u03f5\13<\3<\3"+
		"<\7<\u03f9\n<\f<\16<\u03fc\13<\5<\u03fe\n<\3=\6=\u0401\n=\r=\16=\u0402"+
		"\3=\3=\3=\6=\u0408\n=\r=\16=\u0409\3=\3=\5=\u040e\n=\3>\6>\u0411\n>\r"+
		">\16>\u0412\3>\6>\u0416\n>\r>\16>\u0417\3>\3>\3>\6>\u041d\n>\r>\16>\u041e"+
		"\3>\3>\3>\5>\u0424\n>\3?\3?\6?\u0428\n?\r?\16?\u0429\3?\6?\u042d\n?\r"+
		"?\16?\u042e\3?\3?\3?\3?\6?\u0435\n?\r?\16?\u0436\3?\5?\u043a\n?\3@\3@"+
		"\3@\3@\5@\u0440\n@\3@\3@\3@\5@\u0445\n@\5@\u0447\n@\3@\2\5\26\30lA\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\2\20\3\2\f\20\3\2\f\26\3\2\27\30\3\2\31\32\3"+
		"\2\33\"\3\2\33 \4\2KLOO\3\2\22\26\4\2\6\6(*\3\2OP\4\2((**\4\2\63\66=>"+
		"\5\2\5\5\34\34AI\4\2\f\r!\"\u04bd\2\u0081\3\2\2\2\4\u008a\3\2\2\2\6\u0098"+
		"\3\2\2\2\b\u00d3\3\2\2\2\n\u00f9\3\2\2\2\f\u012c\3\2\2\2\16\u0143\3\2"+
		"\2\2\20\u0145\3\2\2\2\22\u014a\3\2\2\2\24\u016c\3\2\2\2\26\u017f\3\2\2"+
		"\2\30\u019f\3\2\2\2\32\u01c4\3\2\2\2\34\u01da\3\2\2\2\36\u01dc\3\2\2\2"+
		" \u01fe\3\2\2\2\"\u0200\3\2\2\2$\u0204\3\2\2\2&\u020f\3\2\2\2(\u021a\3"+
		"\2\2\2*\u0225\3\2\2\2,\u0232\3\2\2\2.\u0236\3\2\2\2\60\u023a\3\2\2\2\62"+
		"\u023e\3\2\2\2\64\u0240\3\2\2\2\66\u0242\3\2\2\28\u0244\3\2\2\2:\u0246"+
		"\3\2\2\2<\u0248\3\2\2\2>\u025b\3\2\2\2@\u027a\3\2\2\2B\u027c\3\2\2\2D"+
		"\u02b5\3\2\2\2F\u02b7\3\2\2\2H\u02bb\3\2\2\2J\u02be\3\2\2\2L\u02ca\3\2"+
		"\2\2N\u02cc\3\2\2\2P\u02d6\3\2\2\2R\u02d8\3\2\2\2T\u02e2\3\2\2\2V\u02e4"+
		"\3\2\2\2X\u02f0\3\2\2\2Z\u02f2\3\2\2\2\\\u030b\3\2\2\2^\u0313\3\2\2\2"+
		"`\u0315\3\2\2\2b\u031e\3\2\2\2d\u032b\3\2\2\2f\u0333\3\2\2\2h\u0335\3"+
		"\2\2\2j\u037a\3\2\2\2l\u039e\3\2\2\2n\u03a9\3\2\2\2p\u03ab\3\2\2\2r\u03ad"+
		"\3\2\2\2t\u03af\3\2\2\2v\u03fd\3\2\2\2x\u040d\3\2\2\2z\u0423\3\2\2\2|"+
		"\u0439\3\2\2\2~\u0446\3\2\2\2\u0080\u0082\5\4\3\2\u0081\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\3\3"+
		"\2\2\2\u0085\u008b\5\f\7\2\u0086\u008b\5@!\2\u0087\u008b\5\6\4\2\u0088"+
		"\u008b\5\b\5\2\u0089\u008b\5\n\6\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\5\3\2\2\2\u008c\u008d\5D#\2\u008d\u008e\5<\37\2\u008e\u008f\7\3\2\2\u008f"+
		"\u0099\3\2\2\2\u0090\u0091\5> \2\u0091\u0092\7\3\2\2\u0092\u0099\3\2\2"+
		"\2\u0093\u0094\7\4\2\2\u0094\u0095\5D#\2\u0095\u0096\5> \2\u0096\u0097"+
		"\7\3\2\2\u0097\u0099\3\2\2\2\u0098\u008c\3\2\2\2\u0098\u0090\3\2\2\2\u0098"+
		"\u0093\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\7\3\2\2\2\u009c\u009d\5:\36\2\u009d\u009f\7K\2\2\u009e\u00a0"+
		"\5\"\22\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a6"+
		"\5$\23\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\3\2\2\u00a8\u00d4\3\2\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00ac\7K"+
		"\2\2\u00ab\u00ad\5\"\22\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\7\5"+
		"\2\2\u00b1\u00b3\5*\26\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00d4\3\2\2\2\u00b6\u00b7\5\64"+
		"\33\2\u00b7\u00b9\7K\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00be\7\5\2\2\u00be\u00c0\5&\24\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00d4\3\2"+
		"\2\2\u00c3\u00c6\5\66\34\2\u00c4\u00c6\58\35\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7K\2\2\u00c8\u00ca\5\""+
		"\22\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\5("+
		"\25\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\7\3\2\2\u00d2\u00d4\3\2\2\2\u00d3\u009c\3\2\2\2\u00d3\u00a9\3\2"+
		"\2\2\u00d3\u00b6\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d4\t\3\2\2\2\u00d5\u00d6"+
		"\7\7\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d9\7\b\2\2\u00d8\u00da\5\34\17\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\t\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00d5\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00fa\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\7K\2\2\u00e5"+
		"\u00ea\7K\2\2\u00e6\u00e7\7\n\2\2\u00e7\u00e9\7K\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\3\2\2\u00ee\u00e3\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fa\3\2"+
		"\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7\13\2\2\u00f4\u00f5\7K\2\2\u00f5"+
		"\u00f6\7\5\2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8\7\3\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00df\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f2\3\2\2\2\u00fa"+
		"\13\3\2\2\2\u00fb\u012d\5\30\r\2\u00fc\u00fe\5\26\f\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\7\3\2\2\u0102\u012d\3\2\2\2\u0103\u0104\5D"+
		"#\2\u0104\u0105\7K\2\2\u0105\u010e\7\5\2\2\u0106\u0107\7K\2\2\u0107\u0108"+
		"\7\n\2\2\u0108\u010f\5\26\f\2\u0109\u010a\5\26\f\2\u010a\u010b\7\n\2\2"+
		"\u010b\u010c\7K\2\2\u010c\u010f\3\2\2\2\u010d\u010f\5\26\f\2\u010e\u0106"+
		"\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7\3\2\2\u0111\u012d\3\2\2\2\u0112\u0113\7K\2\2\u0113\u011a\7\5"+
		"\2\2\u0114\u0115\7K\2\2\u0115\u011b\5\22\n\2\u0116\u011b\5\32\16\2\u0117"+
		"\u011b\5\16\b\2\u0118\u011b\5\30\r\2\u0119\u011b\5\26\f\2\u011a\u0114"+
		"\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\3\2\2\u011d\u012d\3\2"+
		"\2\2\u011e\u011f\7K\2\2\u011f\u0120\5\20\t\2\u0120\u0121\7K\2\2\u0121"+
		"\u0122\7\3\2\2\u0122\u012d\3\2\2\2\u0123\u0124\7K\2\2\u0124\u0125\5\22"+
		"\n\2\u0125\u0126\7\3\2\2\u0126\u012d\3\2\2\2\u0127\u0128\5\22\n\2\u0128"+
		"\u0129\7K\2\2\u0129\u012a\7\3\2\2\u012a\u012d\3\2\2\2\u012b\u012d\5\24"+
		"\13\2\u012c\u00fb\3\2\2\2\u012c\u00fd\3\2\2\2\u012c\u0103\3\2\2\2\u012c"+
		"\u0112\3\2\2\2\u012c\u011e\3\2\2\2\u012c\u0123\3\2\2\2\u012c\u0127\3\2"+
		"\2\2\u012c\u012b\3\2\2\2\u012d\r\3\2\2\2\u012e\u012f\7K\2\2\u012f\u0130"+
		"\t\2\2\2\u0130\u0144\7K\2\2\u0131\u0132\7L\2\2\u0132\u0133\t\2\2\2\u0133"+
		"\u0144\7L\2\2\u0134\u0135\7O\2\2\u0135\u0136\t\2\2\2\u0136\u0144\7L\2"+
		"\2\u0137\u0138\7L\2\2\u0138\u0139\t\2\2\2\u0139\u0144\7O\2\2\u013a\u013b"+
		"\7O\2\2\u013b\u013c\t\2\2\2\u013c\u0144\7O\2\2\u013d\u013e\7\21\2\2\u013e"+
		"\u0144\7L\2\2\u013f\u0140\7\21\2\2\u0140\u0144\7K\2\2\u0141\u0142\7\21"+
		"\2\2\u0142\u0144\7O\2\2\u0143\u012e\3\2\2\2\u0143\u0131\3\2\2\2\u0143"+
		"\u0134\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013d\3\2"+
		"\2\2\u0143\u013f\3\2\2\2\u0143\u0141\3\2\2\2\u0144\17\3\2\2\2\u0145\u0146"+
		"\t\3\2\2\u0146\u0147\7\5\2\2\u0147\21\3\2\2\2\u0148\u014b\t\4\2\2\u0149"+
		"\u014b\t\5\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\23\3\2\2"+
		"\2\u014c\u014d\7K\2\2\u014d\u014e\t\6\2\2\u014e\u016d\7K\2\2\u014f\u0150"+
		"\7K\2\2\u0150\u0151\t\6\2\2\u0151\u016d\7L\2\2\u0152\u0153\7#\2\2\u0153"+
		"\u016d\7K\2\2\u0154\u0155\7#\2\2\u0155\u016d\7L\2\2\u0156\u0157\7L\2\2"+
		"\u0157\u0158\t\6\2\2\u0158\u016d\7L\2\2\u0159\u015a\7$\2\2\u015a\u015b"+
		"\5\24\13\2\u015b\u015c\7%\2\2\u015c\u016d\3\2\2\2\u015d\u015e\7$\2\2\u015e"+
		"\u015f\7#\2\2\u015f\u0160\7$\2\2\u0160\u0161\5\24\13\2\u0161\u0162\7%"+
		"\2\2\u0162\u0163\7%\2\2\u0163\u016d\3\2\2\2\u0164\u0165\7$\2\2\u0165\u0166"+
		"\7$\2\2\u0166\u0167\5\30\r\2\u0167\u0168\7%\2\2\u0168\u0169\t\7\2\2\u0169"+
		"\u016a\7K\2\2\u016a\u016b\7%\2\2\u016b\u016d\3\2\2\2\u016c\u014c\3\2\2"+
		"\2\u016c\u014f\3\2\2\2\u016c\u0152\3\2\2\2\u016c\u0154\3\2\2\2\u016c\u0156"+
		"\3\2\2\2\u016c\u0159\3\2\2\2\u016c\u015d\3\2\2\2\u016c\u0164\3\2\2\2\u016d"+
		"\25\3\2\2\2\u016e\u016f\b\f\1\2\u016f\u0170\t\b\2\2\u0170\u0171\5\26\f"+
		"\2\u0171\u0172\t\t\2\2\u0172\u0173\5\26\f\2\u0173\u0174\7\n\2\2\u0174"+
		"\u0175\5\26\f\2\u0175\u0176\t\t\2\2\u0176\u0177\5\26\f\2\u0177\u0180\3"+
		"\2\2\2\u0178\u0180\7L\2\2\u0179\u0180\7K\2\2\u017a\u0180\7O\2\2\u017b"+
		"\u017c\7$\2\2\u017c\u017d\5\26\f\2\u017d\u017e\7%\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u016e\3\2\2\2\u017f\u0178\3\2\2\2\u017f\u0179\3\2\2\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u0180\u018c\3\2\2\2\u0181\u0182\f\b"+
		"\2\2\u0182\u0183\t\t\2\2\u0183\u0184\5\26\f\2\u0184\u0185\t\t\2\2\u0185"+
		"\u0186\5\26\f\t\u0186\u018b\3\2\2\2\u0187\u0188\f\7\2\2\u0188\u0189\t"+
		"\t\2\2\u0189\u018b\5\26\f\b\u018a\u0181\3\2\2\2\u018a\u0187\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\27\3\2\2"+
		"\2\u018e\u018c\3\2\2\2\u018f\u0190\b\r\1\2\u0190\u01a0\7L\2\2\u0191\u01a0"+
		"\7K\2\2\u0192\u01a0\7O\2\2\u0193\u0194\7$\2\2\u0194\u0195\5\30\r\2\u0195"+
		"\u0196\7%\2\2\u0196\u01a0\3\2\2\2\u0197\u0198\7$\2\2\u0198\u0199\5\30"+
		"\r\2\u0199\u019a\7%\2\2\u019a\u019b\t\t\2\2\u019b\u019c\7$\2\2\u019c\u019d"+
		"\5\30\r\2\u019d\u019e\7%\2\2\u019e\u01a0\3\2\2\2\u019f\u018f\3\2\2\2\u019f"+
		"\u0191\3\2\2\2\u019f\u0192\3\2\2\2\u019f\u0193\3\2\2\2\u019f\u0197\3\2"+
		"\2\2\u01a0\u01a6\3\2\2\2\u01a1\u01a2\f\b\2\2\u01a2\u01a3\t\t\2\2\u01a3"+
		"\u01a5\5\30\r\t\u01a4\u01a1\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\31\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01aa\7$\2\2\u01aa\u01ab\7K\2\2\u01ab\u01ac\t\7\2\2\u01ac\u01ad\7L\2"+
		"\2\u01ad\u01ae\7%\2\2\u01ae\u01af\7&\2\2\u01af\u01b0\7L\2\2\u01b0\u01b1"+
		"\7\'\2\2\u01b1\u01c5\7L\2\2\u01b2\u01b3\7$\2\2\u01b3\u01b4\7K\2\2\u01b4"+
		"\u01b5\t\7\2\2\u01b5\u01b6\7K\2\2\u01b6\u01b7\7%\2\2\u01b7\u01b8\7&\2"+
		"\2\u01b8\u01b9\7K\2\2\u01b9\u01ba\7\'\2\2\u01ba\u01c5\7K\2\2\u01bb\u01bc"+
		"\7$\2\2\u01bc\u01bd\7L\2\2\u01bd\u01be\t\7\2\2\u01be\u01bf\7L\2\2\u01bf"+
		"\u01c0\7%\2\2\u01c0\u01c1\7&\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c3\7\'\2"+
		"\2\u01c3\u01c5\7K\2\2\u01c4\u01a9\3\2\2\2\u01c4\u01b2\3\2\2\2\u01c4\u01bb"+
		"\3\2\2\2\u01c5\33\3\2\2\2\u01c6\u01c7\5D#\2\u01c7\u01cb\7K\2\2\u01c8\u01ca"+
		"\5\"\22\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf"+
		"\7\3\2\2\u01cf\u01db\3\2\2\2\u01d0\u01d1\5\36\20\2\u01d1\u01d5\7K\2\2"+
		"\u01d2\u01d4\5\"\22\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\7\3\2\2\u01d9\u01db\3\2\2\2\u01da\u01c6\3\2\2\2\u01da\u01d0\3\2"+
		"\2\2\u01db\35\3\2\2\2\u01dc\u01dd\t\n\2\2\u01dd\37\3\2\2\2\u01de\u01e3"+
		"\7L\2\2\u01df\u01e0\7\n\2\2\u01e0\u01e2\7L\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ff\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01eb\7M\2\2\u01e7\u01e8\7\n\2\2\u01e8"+
		"\u01ea\7M\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ff\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01f3\7O\2\2\u01ef\u01f0\7\n\2\2\u01f0\u01f2\7O\2\2\u01f1\u01ef\3\2\2"+
		"\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01ff"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01fb\7P\2\2\u01f7\u01f8\7\n\2\2\u01f8"+
		"\u01fa\7P\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u01de\3\2\2\2\u01fe\u01e6\3\2\2\2\u01fe\u01ee\3\2\2\2\u01fe\u01f6\3\2"+
		"\2\2\u01ff!\3\2\2\2\u0200\u0201\7+\2\2\u0201\u0202\7L\2\2\u0202\u0203"+
		"\7,\2\2\u0203#\3\2\2\2\u0204\u0205\7\b\2\2\u0205\u020a\5,\27\2\u0206\u0207"+
		"\7\n\2\2\u0207\u0209\5,\27\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7\t\2\2\u020e%\3\2\2\2\u020f\u0210\7\b\2\2\u0210\u0215"+
		"\5.\30\2\u0211\u0212\7\n\2\2\u0212\u0214\5.\30\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7\t\2\2\u0219\'\3\2\2\2\u021a\u021b"+
		"\7\b\2\2\u021b\u0220\5\60\31\2\u021c\u021d\7\n\2\2\u021d\u021f\5\60\31"+
		"\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\t\2\2\u0224"+
		")\3\2\2\2\u0225\u0226\7\b\2\2\u0226\u022b\5\62\32\2\u0227\u0228\7\n\2"+
		"\2\u0228\u022a\5\62\32\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u022f\7\t\2\2\u022f+\3\2\2\2\u0230\u0233\5$\23\2\u0231\u0233"+
		"\7L\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233-\3\2\2\2\u0234\u0237"+
		"\5&\24\2\u0235\u0237\7M\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"/\3\2\2\2\u0238\u023b\5(\25\2\u0239\u023b\t\13\2\2\u023a\u0238\3\2\2\2"+
		"\u023a\u0239\3\2\2\2\u023b\61\3\2\2\2\u023c\u023f\5*\26\2\u023d\u023f"+
		"\7N\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\63\3\2\2\2\u0240"+
		"\u0241\7-\2\2\u0241\65\3\2\2\2\u0242\u0243\7.\2\2\u0243\67\3\2\2\2\u0244"+
		"\u0245\7/\2\2\u02459\3\2\2\2\u0246\u0247\7)\2\2\u0247;\3\2\2\2\u0248\u024a"+
		"\7\24\2\2\u0249\u024b\7\4\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2"+
		"\u024b\u024c\3\2\2\2\u024c\u0259\7K\2\2\u024d\u024f\7\5\2\2\u024e\u0250"+
		"\7\f\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0256\7K\2\2\u0252\u0253\7\n\2\2\u0253\u0255\5<\37\2\u0254\u0252\3\2"+
		"\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u024d\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a=\3\2\2\2\u025b\u0268\7K\2\2\u025c\u025e\7\5\2\2\u025d\u025f"+
		"\7\f\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0265\7K\2\2\u0261\u0262\7\n\2\2\u0262\u0264\5> \2\u0263\u0261\3\2\2"+
		"\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0269"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u025c\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"?\3\2\2\2\u026a\u026c\7\6\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2"+
		"\u026c\u026e\3\2\2\2\u026d\u026f\5B\"\2\u026e\u026d\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5D#\2\u0271\u0272\7\3\2\2\u0272"+
		"\u027b\3\2\2\2\u0273\u0275\7\6\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0277\5B\"\2\u0277\u0278\5F$\2\u0278\u0279"+
		"\7\3\2\2\u0279\u027b\3\2\2\2\u027a\u026b\3\2\2\2\u027a\u0274\3\2\2\2\u027b"+
		"A\3\2\2\2\u027c\u027d\t\f\2\2\u027dC\3\2\2\2\u027e\u0287\7)\2\2\u027f"+
		"\u0284\5F$\2\u0280\u0281\7\n\2\2\u0281\u0283\5F$\2\u0282\u0280\3\2\2\2"+
		"\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u027f\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u02b6\3\2\2\2\u0289\u0292\7-\2\2\u028a\u028f\5J&\2\u028b\u028c\7\n\2"+
		"\2\u028c\u028e\5J&\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u028a\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02b6\3\2\2\2\u0294\u029d\7."+
		"\2\2\u0295\u029a\5N(\2\u0296\u0297\7\n\2\2\u0297\u0299\5N(\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u02b6\3\2\2\2\u029f\u02a8\7/\2\2\u02a0\u02a5\5R*\2\u02a1\u02a2"+
		"\7\n\2\2\u02a2\u02a4\5R*\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2"+
		"\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02b6\3\2\2\2\u02aa"+
		"\u02b3\7\60\2\2\u02ab\u02b0\5V,\2\u02ac\u02ad\7\n\2\2\u02ad\u02af\5V,"+
		"\2\u02ae\u02ac\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02ab\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u027e\3\2\2\2\u02b5\u0289\3\2"+
		"\2\2\u02b5\u0294\3\2\2\2\u02b5\u029f\3\2\2\2\u02b5\u02aa\3\2\2\2\u02b6"+
		"E\3\2\2\2\u02b7\u02b9\7K\2\2\u02b8\u02ba\5H%\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02baG\3\2\2\2\u02bb\u02bc\7\5\2\2\u02bc\u02bd\7L\2\2\u02bd"+
		"I\3\2\2\2\u02be\u02c0\7K\2\2\u02bf\u02c1\5L\'\2\u02c0\u02bf\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1K\3\2\2\2\u02c2\u02c3\7\5\2\2\u02c3\u02c4\7\61\2\2"+
		"\u02c4\u02c5\7K\2\2\u02c5\u02cb\7\61\2\2\u02c6\u02c7\7\5\2\2\u02c7\u02c8"+
		"\7\62\2\2\u02c8\u02c9\13\2\2\2\u02c9\u02cb\7\62\2\2\u02ca\u02c2\3\2\2"+
		"\2\u02ca\u02c6\3\2\2\2\u02cbM\3\2\2\2\u02cc\u02ce\7K\2\2\u02cd\u02cf\5"+
		"P)\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfO\3\2\2\2\u02d0\u02d1"+
		"\7\5\2\2\u02d1\u02d7\7L\2\2\u02d2\u02d3\7\5\2\2\u02d3\u02d4\7L\2\2\u02d4"+
		"\u02d5\7\13\2\2\u02d5\u02d7\7L\2\2\u02d6\u02d0\3\2\2\2\u02d6\u02d2\3\2"+
		"\2\2\u02d7Q\3\2\2\2\u02d8\u02da\7K\2\2\u02d9\u02db\5T+\2\u02da\u02d9\3"+
		"\2\2\2\u02da\u02db\3\2\2\2\u02dbS\3\2\2\2\u02dc\u02dd\7\5\2\2\u02dd\u02e3"+
		"\7L\2\2\u02de\u02df\7\5\2\2\u02df\u02e0\7L\2\2\u02e0\u02e1\7\13\2\2\u02e1"+
		"\u02e3\7L\2\2\u02e2\u02dc\3\2\2\2\u02e2\u02de\3\2\2\2\u02e3U\3\2\2\2\u02e4"+
		"\u02e6\7K\2\2\u02e5\u02e7\5X-\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7W\3\2\2\2\u02e8\u02e9\7\5\2\2\u02e9\u02f1\7\63\2\2\u02ea\u02eb"+
		"\7\5\2\2\u02eb\u02f1\7\64\2\2\u02ec\u02ed\7\5\2\2\u02ed\u02f1\7\65\2\2"+
		"\u02ee\u02ef\7\5\2\2\u02ef\u02f1\7\66\2\2\u02f0\u02e8\3\2\2\2\u02f0\u02ea"+
		"\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1Y\3\2\2\2\u02f2"+
		"\u02f3\7\67\2\2\u02f3\u02f4\7$\2\2\u02f4\u02f5\5\\/\2\u02f5\u02ff\7%\2"+
		"\2\u02f6\u0300\5^\60\2\u02f7\u02fb\7\b\2\2\u02f8\u02fa\5^\60\2\u02f9\u02f8"+
		"\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0300\7\t\2\2\u02ff\u02f6\3\2"+
		"\2\2\u02ff\u02f7\3\2\2\2\u02ff\u0300\3\2\2\2\u0300[\3\2\2\2\u0301\u030c"+
		"\7K\2\2\u0302\u030c\7L\2\2\u0303\u030c\5h\65\2\u0304\u0306\7\62\2\2\u0305"+
		"\u0307\7K\2\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\7\62\2\2\u030b"+
		"\u0301\3\2\2\2\u030b\u0302\3\2\2\2\u030b\u0303\3\2\2\2\u030b\u0304\3\2"+
		"\2\2\u030c]\3\2\2\2\u030d\u030f\5`\61\2\u030e\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0314\5b\62\2\u0313\u030e\3\2\2\2\u0313\u0312\3\2\2\2\u0314_\3\2\2\2"+
		"\u0315\u0316\78\2\2\u0316\u0317\7K\2\2\u0317\u031b\7\'\2\2\u0318\u031a"+
		"\5d\63\2\u0319\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031ca\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u031f\79\2\2\u031f"+
		"\u0323\7\'\2\2\u0320\u0322\5d\63\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324c\3\2\2\2\u0325\u0323"+
		"\3\2\2\2\u0326\u032c\5Z.\2\u0327\u0328\5\4\3\2\u0328\u0329\7\3\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u032c\5f\64\2\u032b\u0326\3\2\2\2\u032b\u0327\3\2"+
		"\2\2\u032b\u032a\3\2\2\2\u032ce\3\2\2\2\u032d\u032e\7:\2\2\u032e\u0334"+
		"\7\3\2\2\u032f\u0330\7;\2\2\u0330\u0334\7\3\2\2\u0331\u0332\7<\2\2\u0332"+
		"\u0334\7\3\2\2\u0333\u032d\3\2\2\2\u0333\u032f\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0334g\3\2\2\2\u0335\u0336\t\r\2\2\u0336i\3\2\2\2\u0337\u0338\7?"+
		"\2\2\u0338\u0339\7$\2\2\u0339\u033a\5l\67\2\u033a\u033b\7%\2\2\u033b\u033c"+
		"\7\b\2\2\u033c\u033d\7R\2\2\u033d\u033e\5\4\3\2\u033e\u033f\7\t\2\2\u033f"+
		"\u0340\7R\2\2\u0340\u037b\3\2\2\2\u0341\u0342\7?\2\2\u0342\u0343\7$\2"+
		"\2\u0343\u0344\5l\67\2\u0344\u0345\7%\2\2\u0345\u0346\7\b\2\2\u0346\u0347"+
		"\7R\2\2\u0347\u0348\5\f\7\2\u0348\u0349\7R\2\2\u0349\u034a\7\t\2\2\u034a"+
		"\u034b\7R\2\2\u034b\u037b\3\2\2\2\u034c\u034d\7?\2\2\u034d\u034e\7$\2"+
		"\2\u034e\u034f\5l\67\2\u034f\u0350\7%\2\2\u0350\u0351\7@\2\2\u0351\u0352"+
		"\7\b\2\2\u0352\u0353\7R\2\2\u0353\u0354\5\4\3\2\u0354\u0355\7\t\2\2\u0355"+
		"\u0356\7R\2\2\u0356\u037b\3\2\2\2\u0357\u0358\7?\2\2\u0358\u0359\7$\2"+
		"\2\u0359\u035a\5l\67\2\u035a\u035b\7%\2\2\u035b\u035c\7@\2\2\u035c\u035d"+
		"\7\b\2\2\u035d\u035e\7R\2\2\u035e\u035f\5\f\7\2\u035f\u0360\7R\2\2\u0360"+
		"\u0361\7\t\2\2\u0361\u0362\7R\2\2\u0362\u037b\3\2\2\2\u0363\u0364\7@\2"+
		"\2\u0364\u0365\7\b\2\2\u0365\u0366\7R\2\2\u0366\u0367\5\4\3\2\u0367\u0368"+
		"\7\t\2\2\u0368\u0369\7?\2\2\u0369\u036a\7$\2\2\u036a\u036b\5l\67\2\u036b"+
		"\u036c\7%\2\2\u036c\u036d\7R\2\2\u036d\u037b\3\2\2\2\u036e\u036f\7@\2"+
		"\2\u036f\u0370\7\b\2\2\u0370\u0371\7R\2\2\u0371\u0372\5\f\7\2\u0372\u0373"+
		"\7R\2\2\u0373\u0374\7\t\2\2\u0374\u0375\7?\2\2\u0375\u0376\7$\2\2\u0376"+
		"\u0377\5l\67\2\u0377\u0378\7%\2\2\u0378\u0379\7R\2\2\u0379\u037b\3\2\2"+
		"\2\u037a\u0337\3\2\2\2\u037a\u0341\3\2\2\2\u037a\u034c\3\2\2\2\u037a\u0357"+
		"\3\2\2\2\u037a\u0363\3\2\2\2\u037a\u036e\3\2\2\2\u037bk\3\2\2\2\u037c"+
		"\u037d\b\67\1\2\u037d\u037e\7K\2\2\u037e\u037f\5n8\2\u037f\u0380\7K\2"+
		"\2\u0380\u039f\3\2\2\2\u0381\u0382\7K\2\2\u0382\u0383\5n8\2\u0383\u0384"+
		"\7L\2\2\u0384\u039f\3\2\2\2\u0385\u0386\7K\2\2\u0386\u0387\5n8\2\u0387"+
		"\u0388\7$\2\2\u0388\u0389\5\f\7\2\u0389\u038a\7%\2\2\u038a\u039f\3\2\2"+
		"\2\u038b\u038c\7K\2\2\u038c\u038d\5n8\2\u038d\u038e\7$\2\2\u038e\u038f"+
		"\5\f\7\2\u038f\u0390\7%\2\2\u0390\u039f\3\2\2\2\u0391\u0392\7K\2\2\u0392"+
		"\u0393\5n8\2\u0393\u0394\7$\2\2\u0394\u0395\5\f\7\2\u0395\u0396\7%\2\2"+
		"\u0396\u039f\3\2\2\2\u0397\u0398\7K\2\2\u0398\u0399\5n8\2\u0399\u039a"+
		"\7$\2\2\u039a\u039b\5\f\7\2\u039b\u039c\7%\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039f\5h\65\2\u039e\u037c\3\2\2\2\u039e\u0381\3\2\2\2\u039e\u0385\3\2"+
		"\2\2\u039e\u038b\3\2\2\2\u039e\u0391\3\2\2\2\u039e\u0397\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039f\u03a6\3\2\2\2\u03a0\u03a1\f\4\2\2\u03a1\u03a2\5t"+
		";\2\u03a2\u03a3\5l\67\5\u03a3\u03a5\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a5"+
		"\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7m\3\2\2\2"+
		"\u03a8\u03a6\3\2\2\2\u03a9\u03aa\t\7\2\2\u03aao\3\2\2\2\u03ab\u03ac\t"+
		"\4\2\2\u03acq\3\2\2\2\u03ad\u03ae\t\16\2\2\u03aes\3\2\2\2\u03af\u03b0"+
		"\t\17\2\2\u03b0u\3\2\2\2\u03b1\u03b2\7J\2\2\u03b2\u03b4\7$\2\2\u03b3\u03b5"+
		"\5x=\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b8\7\3\2\2\u03b7\u03b9\5z>\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\7\3\2\2\u03bb\u03bd\5|?\2\u03bc\u03bb"+
		"\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c2\7%\2\2\u03bf"+
		"\u03c1\5\4\3\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03fe\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c6\7J\2\2\u03c6\u03c8\7$\2\2\u03c7\u03c9\5@!\2\u03c8\u03c7\3\2\2\2"+
		"\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\7\3\2\2\u03cb\u03cd"+
		"\5z>\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03d0\7\3\2\2\u03cf\u03d1\5|?\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2"+
		"\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\7%\2\2\u03d3\u03d7\7\b\2\2\u03d4\u03d6"+
		"\5\4\3\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03de\7\t"+
		"\2\2\u03db\u03dd\5\4\3\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03fe\3\2\2\2\u03e0\u03de\3\2"+
		"\2\2\u03e1\u03e2\7J\2\2\u03e2\u03e4\7$\2\2\u03e3\u03e5\5x=\2\u03e4\u03e3"+
		"\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\7\3\2\2\u03e7"+
		"\u03e9\5z>\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2"+
		"\2\u03ea\u03ec\7\3\2\2\u03eb\u03ed\5|?\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7%\2\2\u03ef\u03f3\7\b\2\2\u03f0"+
		"\u03f2\5\4\3\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2"+
		"\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03fa\7\t\2\2\u03f7\u03f9\5\4\3\2\u03f8\u03f7\3\2\2\2\u03f9\u03fc\3\2"+
		"\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fd\u03b1\3\2\2\2\u03fd\u03c5\3\2\2\2\u03fd\u03e1\3\2"+
		"\2\2\u03few\3\2\2\2\u03ff\u0401\7K\2\2\u0400\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\7\5\2\2\u0405\u040e\7L\2\2\u0406\u0408\7K\2\2\u0407\u0406\3\2\2"+
		"\2\u0408\u0409\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040c\7\5\2\2\u040c\u040e\7K\2\2\u040d\u0400\3\2\2\2\u040d"+
		"\u0407\3\2\2\2\u040ey\3\2\2\2\u040f\u0411\7K\2\2\u0410\u040f\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2"+
		"\2\2\u0414\u0416\5n8\2\u0415\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0415"+
		"\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\7K\2\2\u041a"+
		"\u0424\3\2\2\2\u041b\u041d\7K\2\2\u041c\u041b\3\2\2\2\u041d\u041e\3\2"+
		"\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u0421\5n8\2\u0421\u0422\7L\2\2\u0422\u0424\3\2\2\2\u0423\u0410\3\2\2"+
		"\2\u0423\u041c\3\2\2\2\u0424{\3\2\2\2\u0425\u0427\5p9\2\u0426\u0428\7"+
		"K\2\2\u0427\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0427\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u043a\3\2\2\2\u042b\u042d\7K\2\2\u042c\u042b\3\2"+
		"\2\2\u042d\u042e\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0431\5r:\2\u0431\u0432\7L\2\2\u0432\u043a\3\2\2"+
		"\2\u0433\u0435\7K\2\2\u0434\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0434"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\5p9\2\u0439"+
		"\u0425\3\2\2\2\u0439\u042c\3\2\2\2\u0439\u0434\3\2\2\2\u043a}\3\2\2\2"+
		"\u043b\u043c\7<\2\2\u043c\u043d\7K\2\2\u043d\u043f\7\3\2\2\u043e\u0440"+
		"\5\4\3\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0447\3\2\2\2\u0441"+
		"\u0442\7K\2\2\u0442\u0444\7\'\2\2\u0443\u0445\5\4\3\2\u0444\u0443\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u043b\3\2\2\2\u0446"+
		"\u0441\3\2\2\2\u0447\177\3\2\2\2{\u0083\u008a\u0098\u009a\u00a1\u00a5"+
		"\u00ae\u00b2\u00bb\u00bf\u00c5\u00cb\u00cf\u00d3\u00db\u00e1\u00ea\u00f0"+
		"\u00f9\u00ff\u010e\u011a\u012c\u0143\u014a\u016c\u017f\u018a\u018c\u019f"+
		"\u01a6\u01c4\u01cb\u01d5\u01da\u01e3\u01eb\u01f3\u01fb\u01fe\u020a\u0215"+
		"\u0220\u022b\u0232\u0236\u023a\u023e\u024a\u024f\u0256\u0259\u025e\u0265"+
		"\u0268\u026b\u026e\u0274\u027a\u0284\u0287\u028f\u0292\u029a\u029d\u02a5"+
		"\u02a8\u02b0\u02b3\u02b5\u02b9\u02c0\u02ca\u02ce\u02d6\u02da\u02e2\u02e6"+
		"\u02f0\u02fb\u02ff\u0308\u030b\u0310\u0313\u031b\u0323\u032b\u0333\u037a"+
		"\u039e\u03a6\u03b4\u03b8\u03bc\u03c2\u03c8\u03cc\u03d0\u03d7\u03de\u03e4"+
		"\u03e8\u03ec\u03f3\u03fa\u03fd\u0402\u0409\u040d\u0412\u0417\u041e\u0423"+
		"\u0429\u042e\u0436\u0439\u043f\u0444\u0446";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}