// Generated from Expr.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Identifier=37, INT=38, 
		CHAR=39, UNSG=40, FLOAT=41, DOUBLE=42, Whitespace=43, Newline=44, BlockComment=45, 
		LineComment=46;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_type_data = 2, RULE_bitwise = 3, RULE_assignment = 4, 
		RULE_indec = 5, RULE_comparator = 6, RULE_matem = 7, RULE_aritmatich = 8, 
		RULE_ternary = 9;
	public static final String[] ruleNames = {
		"prog", "stat", "type_data", "bitwise", "assignment", "indec", "comparator", 
		"matem", "aritmatich", "ternary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'int'", "'float'", "'bool'", "'double'", "'char'", 
		"'&'", "'|'", "'^'", "'<<'", "'>>'", "'~'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'++'", "'--'", "'+1'", "'-1'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'||'", "'&&'", "'!'", "'('", "')'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__32) | (1L << Identifier) | (1L << INT) | (1L << FLOAT))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
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
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				aritmatich(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					matem(0);
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << Identifier) | (1L << INT) | (1L << FLOAT))) != 0) );
				setState(31);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				type_data();
				setState(34);
				match(Identifier);
				setState(35);
				match(T__1);
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(36);
					match(Identifier);
					setState(37);
					match(T__2);
					setState(38);
					matem(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(39);
					matem(0);
					setState(40);
					match(T__2);
					setState(41);
					match(Identifier);
					}
					}
					break;
				case 3:
					{
					{
					setState(43);
					matem(0);
					}
					}
					break;
				}
				setState(46);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(Identifier);
				setState(49);
				match(T__1);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(50);
					match(Identifier);
					setState(51);
					indec();
					}
					}
					break;
				case 2:
					{
					{
					setState(52);
					ternary();
					}
					}
					break;
				case 3:
					{
					{
					setState(53);
					bitwise();
					}
					}
					break;
				case 4:
					{
					{
					setState(54);
					aritmatich(0);
					}
					}
					break;
				case 5:
					{
					{
					setState(55);
					matem(0);
					}
					}
					break;
				}
				setState(58);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(Identifier);
				setState(61);
				assignment();
				setState(62);
				match(Identifier);
				setState(63);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(Identifier);
				setState(66);
				indec();
				setState(67);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				indec();
				setState(70);
				match(Identifier);
				setState(71);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
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

	public static class Type_dataContext extends ParserRuleContext {
		public Type_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_data(this);
		}
	}

	public final Type_dataContext type_data() throws RecognitionException {
		Type_dataContext _localctx = new Type_dataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static class BitwiseContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ExprParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ExprParser.FLOAT, i);
		}
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBitwise(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bitwise);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Identifier);
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(80);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(INT);
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(83);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(FLOAT);
				setState(85);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(INT);
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(89);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(FLOAT);
				setState(91);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(92);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(93);
				match(T__13);
				}
				setState(94);
				match(INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(95);
				match(T__13);
				}
				setState(96);
				match(Identifier);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(97);
				match(T__13);
				}
				setState(98);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(102);
			match(T__1);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIndec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIndec(this);
		}
	}

	public final IndecContext indec() throws RecognitionException {
		IndecContext _localctx = new IndecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_indec);
		int _la;
		try {
			setState(106);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
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
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparator);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(Identifier);
				setState(109);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(110);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(111);
				match(T__31);
				}
				setState(112);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(113);
				match(T__31);
				}
				setState(114);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(INT);
				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(117);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__32);
				setState(119);
				comparator();
				setState(120);
				match(T__33);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(T__32);
				setState(123);
				match(T__31);
				setState(124);
				match(T__32);
				setState(125);
				comparator();
				setState(126);
				match(T__33);
				setState(127);
				match(T__33);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(T__32);
				setState(130);
				match(T__32);
				setState(131);
				aritmatich(0);
				setState(132);
				match(T__33);
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(134);
				match(Identifier);
				setState(135);
				match(T__33);
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
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public MatemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMatem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMatem(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_matem, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(141);
				matem(0);
				setState(142);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(143);
				matem(0);
				setState(144);
				match(T__2);
				setState(145);
				matem(0);
				setState(146);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(147);
				matem(0);
				}
				break;
			case 2:
				{
				setState(149);
				match(INT);
				}
				break;
			case 3:
				{
				setState(150);
				match(Identifier);
				}
				break;
			case 4:
				{
				setState(151);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(152);
				match(T__32);
				setState(153);
				matem(0);
				setState(154);
				match(T__33);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(160);
						matem(0);
						setState(161);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(162);
						matem(7);
						}
						break;
					case 2:
						{
						_localctx = new MatemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_matem);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(166);
						matem(6);
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAritmatich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAritmatich(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_aritmatich, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(173);
				match(INT);
				}
				break;
			case 2:
				{
				setState(174);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(175);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(176);
				match(T__32);
				setState(177);
				aritmatich(0);
				setState(178);
				match(T__33);
				}
				break;
			case 5:
				{
				setState(180);
				match(T__32);
				setState(181);
				aritmatich(0);
				setState(182);
				match(T__33);
				setState(183);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(184);
				match(T__32);
				setState(185);
				aritmatich(0);
				setState(186);
				match(T__33);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmatichContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmatich);
					setState(190);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(191);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(192);
					aritmatich(7);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTernary(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ternary);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__32);
				setState(199);
				match(Identifier);
				setState(200);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(201);
				match(INT);
				setState(202);
				match(T__33);
				setState(203);
				match(T__34);
				setState(204);
				match(INT);
				setState(205);
				match(T__35);
				setState(206);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__32);
				setState(208);
				match(Identifier);
				setState(209);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(210);
				match(Identifier);
				setState(211);
				match(T__33);
				setState(212);
				match(T__34);
				setState(213);
				match(Identifier);
				setState(214);
				match(T__35);
				setState(215);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__32);
				setState(217);
				match(INT);
				setState(218);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(219);
				match(INT);
				setState(220);
				match(T__33);
				setState(221);
				match(T__34);
				setState(222);
				match(Identifier);
				setState(223);
				match(T__35);
				setState(224);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return matem_sempred((MatemContext)_localctx, predIndex);
		case 8:
			return aritmatich_sempred((AritmatichContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5f\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\n\3\n\3\n\7\n\u00c4\n\n\f"+
		"\n\16\n\u00c7\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00e4\n\13\3\13\2\4\20\22\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\13\3\2\6\n\3\2\13\17\3\2\13\25\3\2\26\27\3\2\30\31\3\2\32!\3\2\32\37"+
		"\4\2\'(++\3\2\21\25\u0105\2\27\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\be\3\2\2"+
		"\2\ng\3\2\2\2\fl\3\2\2\2\16\u008b\3\2\2\2\20\u009e\3\2\2\2\22\u00be\3"+
		"\2\2\2\24\u00e3\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33M\5\22\n\2\34\36\5\20\t\2\35\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\3\2\2"+
		"\"M\3\2\2\2#$\5\6\4\2$%\7\'\2\2%.\7\4\2\2&\'\7\'\2\2\'(\7\5\2\2(/\5\20"+
		"\t\2)*\5\20\t\2*+\7\5\2\2+,\7\'\2\2,/\3\2\2\2-/\5\20\t\2.&\3\2\2\2.)\3"+
		"\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\3\2\2\61M\3\2\2\2\62\63\7\'\2\2\63"+
		":\7\4\2\2\64\65\7\'\2\2\65;\5\f\7\2\66;\5\24\13\2\67;\5\b\5\28;\5\22\n"+
		"\29;\5\20\t\2:\64\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2"+
		";<\3\2\2\2<=\7\3\2\2=M\3\2\2\2>?\7\'\2\2?@\5\n\6\2@A\7\'\2\2AB\7\3\2\2"+
		"BM\3\2\2\2CD\7\'\2\2DE\5\f\7\2EF\7\3\2\2FM\3\2\2\2GH\5\f\7\2HI\7\'\2\2"+
		"IJ\7\3\2\2JM\3\2\2\2KM\5\16\b\2L\33\3\2\2\2L\35\3\2\2\2L#\3\2\2\2L\62"+
		"\3\2\2\2L>\3\2\2\2LC\3\2\2\2LG\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\t\2\2\2"+
		"O\7\3\2\2\2PQ\7\'\2\2QR\t\3\2\2Rf\7\'\2\2ST\7(\2\2TU\t\3\2\2Uf\7(\2\2"+
		"VW\7+\2\2WX\t\3\2\2Xf\7(\2\2YZ\7(\2\2Z[\t\3\2\2[f\7+\2\2\\]\7+\2\2]^\t"+
		"\3\2\2^f\7+\2\2_`\7\20\2\2`f\7(\2\2ab\7\20\2\2bf\7\'\2\2cd\7\20\2\2df"+
		"\7+\2\2eP\3\2\2\2eS\3\2\2\2eV\3\2\2\2eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2e"+
		"a\3\2\2\2ec\3\2\2\2f\t\3\2\2\2gh\t\4\2\2hi\7\4\2\2i\13\3\2\2\2jm\t\5\2"+
		"\2km\t\6\2\2lj\3\2\2\2lk\3\2\2\2m\r\3\2\2\2no\7\'\2\2op\t\7\2\2p\u008c"+
		"\7\'\2\2qr\7\"\2\2r\u008c\7\'\2\2st\7\"\2\2t\u008c\7(\2\2uv\7(\2\2vw\t"+
		"\7\2\2w\u008c\7(\2\2xy\7#\2\2yz\5\16\b\2z{\7$\2\2{\u008c\3\2\2\2|}\7#"+
		"\2\2}~\7\"\2\2~\177\7#\2\2\177\u0080\5\16\b\2\u0080\u0081\7$\2\2\u0081"+
		"\u0082\7$\2\2\u0082\u008c\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085\7#\2"+
		"\2\u0085\u0086\5\22\n\2\u0086\u0087\7$\2\2\u0087\u0088\t\b\2\2\u0088\u0089"+
		"\7\'\2\2\u0089\u008a\7$\2\2\u008a\u008c\3\2\2\2\u008bn\3\2\2\2\u008bq"+
		"\3\2\2\2\u008bs\3\2\2\2\u008bu\3\2\2\2\u008bx\3\2\2\2\u008b|\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e\b\t\1\2\u008e\u008f\t\t\2"+
		"\2\u008f\u0090\5\20\t\2\u0090\u0091\t\n\2\2\u0091\u0092\5\20\t\2\u0092"+
		"\u0093\7\5\2\2\u0093\u0094\5\20\t\2\u0094\u0095\t\n\2\2\u0095\u0096\5"+
		"\20\t\2\u0096\u009f\3\2\2\2\u0097\u009f\7(\2\2\u0098\u009f\7\'\2\2\u0099"+
		"\u009f\7+\2\2\u009a\u009b\7#\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7$\2"+
		"\2\u009d\u009f\3\2\2\2\u009e\u008d\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00ab\3\2\2\2\u00a0"+
		"\u00a1\f\b\2\2\u00a1\u00a2\t\n\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\t"+
		"\n\2\2\u00a4\u00a5\5\20\t\t\u00a5\u00aa\3\2\2\2\u00a6\u00a7\f\7\2\2\u00a7"+
		"\u00a8\t\n\2\2\u00a8\u00aa\5\20\t\b\u00a9\u00a0\3\2\2\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\21\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\n\1\2\u00af\u00bf\7(\2\2"+
		"\u00b0\u00bf\7\'\2\2\u00b1\u00bf\7+\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00b5\7$\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00b8\5\22\n\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\t\n\2\2\u00ba\u00bb\7#"+
		"\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7$\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00ae\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b2\3\2"+
		"\2\2\u00be\u00b6\3\2\2\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\f\b\2\2\u00c1"+
		"\u00c2\t\n\2\2\u00c2\u00c4\5\22\n\t\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\t\b"+
		"\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7$\2\2\u00cd\u00ce\7%\2\2\u00ce\u00cf"+
		"\7(\2\2\u00cf\u00d0\7&\2\2\u00d0\u00e4\7(\2\2\u00d1\u00d2\7#\2\2\u00d2"+
		"\u00d3\7\'\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00d5\7\'\2\2\u00d5\u00d6\7$"+
		"\2\2\u00d6\u00d7\7%\2\2\u00d7\u00d8\7\'\2\2\u00d8\u00d9\7&\2\2\u00d9\u00e4"+
		"\7\'\2\2\u00da\u00db\7#\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd\t\b\2\2\u00dd"+
		"\u00de\7(\2\2\u00de\u00df\7$\2\2\u00df\u00e0\7%\2\2\u00e0\u00e1\7\'\2"+
		"\2\u00e1\u00e2\7&\2\2\u00e2\u00e4\7\'\2\2\u00e3\u00c8\3\2\2\2\u00e3\u00d1"+
		"\3\2\2\2\u00e3\u00da\3\2\2\2\u00e4\25\3\2\2\2\20\31\37.:Lel\u008b\u009e"+
		"\u00a9\u00ab\u00be\u00c5\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}