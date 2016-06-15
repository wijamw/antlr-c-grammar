// Generated from Project.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, INT=30, NEWLINE=31, WS=32;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_con = 2, RULE_expr = 3, RULE_operator = 4, 
		RULE_kondisi = 5, RULE_logic = 6;
	public static final String[] ruleNames = {
		"prog", "stat", "con", "expr", "operator", "kondisi", "logic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'('", "')'", "'{'", "'}'", "'do'", "'0'", "'1'", "'TRUE'", 
		"'FALSE'", "';'", "'++'", "'--'", "'='", "'*'", "'/'", "'+'", "'-'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'&'", "'|'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Project.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectParser(TokenStream input) {
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
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__5 );
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
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProjectParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProjectParser.NEWLINE, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				setState(20);
				match(T__1);
				setState(21);
				con(0);
				setState(22);
				match(T__2);
				setState(23);
				match(T__3);
				setState(24);
				match(NEWLINE);
				setState(25);
				stat();
				setState(26);
				match(T__4);
				setState(27);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(T__1);
				setState(31);
				con(0);
				setState(32);
				match(T__2);
				setState(33);
				match(T__3);
				setState(34);
				match(NEWLINE);
				setState(35);
				expr(0);
				setState(36);
				match(NEWLINE);
				setState(37);
				match(T__4);
				setState(38);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(T__1);
				setState(42);
				con(0);
				setState(43);
				match(T__2);
				setState(44);
				match(T__5);
				setState(45);
				match(T__3);
				setState(46);
				match(NEWLINE);
				setState(47);
				stat();
				setState(48);
				match(T__4);
				setState(49);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(T__0);
				setState(52);
				match(T__1);
				setState(53);
				con(0);
				setState(54);
				match(T__2);
				setState(55);
				match(T__5);
				setState(56);
				match(T__3);
				setState(57);
				match(NEWLINE);
				setState(58);
				expr(0);
				setState(59);
				match(NEWLINE);
				setState(60);
				match(T__4);
				setState(61);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__5);
				setState(64);
				match(T__3);
				setState(65);
				match(NEWLINE);
				setState(66);
				stat();
				setState(67);
				match(T__4);
				setState(68);
				match(T__0);
				setState(69);
				match(T__1);
				setState(70);
				con(0);
				setState(71);
				match(T__2);
				setState(72);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__5);
				setState(75);
				match(T__3);
				setState(76);
				match(NEWLINE);
				setState(77);
				expr(0);
				setState(78);
				match(NEWLINE);
				setState(79);
				match(T__4);
				setState(80);
				match(T__0);
				setState(81);
				match(T__1);
				setState(82);
				con(0);
				setState(83);
				match(T__2);
				setState(84);
				match(NEWLINE);
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

	public static class ConContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ProjectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ProjectParser.ID, i);
		}
		public KondisiContext kondisi() {
			return getRuleContext(KondisiContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(ProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ProjectParser.INT, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ConContext> con() {
			return getRuleContexts(ConContext.class);
		}
		public ConContext con(int i) {
			return getRuleContext(ConContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitCon(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		return con(0);
	}

	private ConContext con(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConContext _localctx = new ConContext(_ctx, _parentState);
		ConContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_con, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89);
				match(ID);
				setState(90);
				kondisi();
				setState(91);
				match(ID);
				}
				break;
			case 2:
				{
				setState(93);
				match(ID);
				setState(94);
				kondisi();
				setState(95);
				match(INT);
				}
				break;
			case 3:
				{
				setState(97);
				match(ID);
				setState(98);
				kondisi();
				setState(99);
				match(T__1);
				setState(100);
				match(ID);
				setState(101);
				operator();
				setState(102);
				match(ID);
				setState(103);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(105);
				match(ID);
				setState(106);
				kondisi();
				setState(107);
				match(T__1);
				setState(108);
				match(ID);
				setState(109);
				operator();
				setState(110);
				match(INT);
				setState(111);
				match(T__2);
				}
				break;
			case 5:
				{
				setState(113);
				match(ID);
				setState(114);
				kondisi();
				setState(115);
				match(T__1);
				setState(116);
				match(INT);
				setState(117);
				operator();
				setState(118);
				match(INT);
				setState(119);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(121);
				match(ID);
				setState(122);
				kondisi();
				setState(123);
				match(T__1);
				setState(124);
				match(INT);
				setState(125);
				operator();
				setState(126);
				match(ID);
				setState(127);
				match(T__2);
				}
				break;
			case 7:
				{
				setState(129);
				match(T__6);
				}
				break;
			case 8:
				{
				setState(130);
				match(T__7);
				}
				break;
			case 9:
				{
				setState(131);
				match(T__8);
				}
				break;
			case 10:
				{
				setState(132);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_con);
					setState(135);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(136);
					logic();
					setState(137);
					con(6);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ProjectParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ProjectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ProjectParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(ProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ProjectParser.INT, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitExpr(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(145);
				match(NEWLINE);
				setState(146);
				expr(13);
				}
				break;
			case 2:
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__13);
				setState(149);
				expr(3);
				}
				break;
			case 3:
				{
				setState(150);
				match(INT);
				setState(151);
				operator();
				setState(152);
				match(INT);
				setState(153);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(155);
				match(INT);
				setState(156);
				operator();
				setState(157);
				match(ID);
				setState(158);
				match(T__10);
				}
				break;
			case 5:
				{
				setState(160);
				match(ID);
				setState(161);
				operator();
				setState(162);
				match(INT);
				setState(163);
				match(T__10);
				}
				break;
			case 6:
				{
				setState(165);
				match(ID);
				setState(166);
				operator();
				setState(167);
				match(ID);
				setState(168);
				match(T__10);
				}
				break;
			case 7:
				{
				setState(170);
				match(ID);
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(172);
				match(T__10);
				}
				break;
			case 8:
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(174);
				match(ID);
				setState(175);
				match(T__10);
				}
				break;
			case 9:
				{
				setState(176);
				match(T__1);
				setState(177);
				expr(0);
				setState(178);
				match(T__2);
				setState(179);
				match(T__10);
				}
				break;
			case 10:
				{
				setState(181);
				match(INT);
				setState(182);
				match(T__10);
				}
				break;
			case 11:
				{
				setState(183);
				match(ID);
				setState(184);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(188);
						operator();
						setState(189);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(192);
						match(NEWLINE);
						setState(193);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(195);
						match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(200);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class KondisiContext extends ParserRuleContext {
		public KondisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kondisi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterKondisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitKondisi(this);
		}
	}

	public final KondisiContext kondisi() throws RecognitionException {
		KondisiContext _localctx = new KondisiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kondisi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectListener ) ((ProjectListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return con_sempred((ConContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean con_sempred(ConContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2"+
		"\23\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3"+
		"\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00bc"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c7\n\5\f\5\16\5\u00ca"+
		"\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\4\6\b\t\2\4\6\b\n\f\16\2\6\3\2\16"+
		"\17\3\2\21\24\3\2\25\32\3\2\33\36\u00e7\2\21\3\2\2\2\4X\3\2\2\2\6\u0087"+
		"\3\2\2\2\b\u00bb\3\2\2\2\n\u00cb\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf\3\2"+
		"\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\3\3\2\2\2\25\26\7\3\2\2\26\27\7\4\2\2\27\30\5\6\4\2\30\31\7\5"+
		"\2\2\31\32\7\6\2\2\32\33\7!\2\2\33\34\5\4\3\2\34\35\7\7\2\2\35\36\7!\2"+
		"\2\36Y\3\2\2\2\37 \7\3\2\2 !\7\4\2\2!\"\5\6\4\2\"#\7\5\2\2#$\7\6\2\2$"+
		"%\7!\2\2%&\5\b\5\2&\'\7!\2\2\'(\7\7\2\2()\7!\2\2)Y\3\2\2\2*+\7\3\2\2+"+
		",\7\4\2\2,-\5\6\4\2-.\7\5\2\2./\7\b\2\2/\60\7\6\2\2\60\61\7!\2\2\61\62"+
		"\5\4\3\2\62\63\7\7\2\2\63\64\7!\2\2\64Y\3\2\2\2\65\66\7\3\2\2\66\67\7"+
		"\4\2\2\678\5\6\4\289\7\5\2\29:\7\b\2\2:;\7\6\2\2;<\7!\2\2<=\5\b\5\2=>"+
		"\7!\2\2>?\7\7\2\2?@\7!\2\2@Y\3\2\2\2AB\7\b\2\2BC\7\6\2\2CD\7!\2\2DE\5"+
		"\4\3\2EF\7\7\2\2FG\7\3\2\2GH\7\4\2\2HI\5\6\4\2IJ\7\5\2\2JK\7!\2\2KY\3"+
		"\2\2\2LM\7\b\2\2MN\7\6\2\2NO\7!\2\2OP\5\b\5\2PQ\7!\2\2QR\7\7\2\2RS\7\3"+
		"\2\2ST\7\4\2\2TU\5\6\4\2UV\7\5\2\2VW\7!\2\2WY\3\2\2\2X\25\3\2\2\2X\37"+
		"\3\2\2\2X*\3\2\2\2X\65\3\2\2\2XA\3\2\2\2XL\3\2\2\2Y\5\3\2\2\2Z[\b\4\1"+
		"\2[\\\7\37\2\2\\]\5\f\7\2]^\7\37\2\2^\u0088\3\2\2\2_`\7\37\2\2`a\5\f\7"+
		"\2ab\7 \2\2b\u0088\3\2\2\2cd\7\37\2\2de\5\f\7\2ef\7\4\2\2fg\7\37\2\2g"+
		"h\5\n\6\2hi\7\37\2\2ij\7\5\2\2j\u0088\3\2\2\2kl\7\37\2\2lm\5\f\7\2mn\7"+
		"\4\2\2no\7\37\2\2op\5\n\6\2pq\7 \2\2qr\7\5\2\2r\u0088\3\2\2\2st\7\37\2"+
		"\2tu\5\f\7\2uv\7\4\2\2vw\7 \2\2wx\5\n\6\2xy\7 \2\2yz\7\5\2\2z\u0088\3"+
		"\2\2\2{|\7\37\2\2|}\5\f\7\2}~\7\4\2\2~\177\7 \2\2\177\u0080\5\n\6\2\u0080"+
		"\u0081\7\37\2\2\u0081\u0082\7\5\2\2\u0082\u0088\3\2\2\2\u0083\u0088\7"+
		"\t\2\2\u0084\u0088\7\n\2\2\u0085\u0088\7\13\2\2\u0086\u0088\7\f\2\2\u0087"+
		"Z\3\2\2\2\u0087_\3\2\2\2\u0087c\3\2\2\2\u0087k\3\2\2\2\u0087s\3\2\2\2"+
		"\u0087{\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0086\3\2\2\2\u0088\u008f\3\2\2\2\u0089\u008a\f\7\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u008c\5\6\4\b\u008c\u008e\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\7\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\5\1\2\u0093\u0094\7!\2\2"+
		"\u0094\u00bc\5\b\5\17\u0095\u0096\7\37\2\2\u0096\u0097\7\20\2\2\u0097"+
		"\u00bc\5\b\5\5\u0098\u0099\7 \2\2\u0099\u009a\5\n\6\2\u009a\u009b\7 \2"+
		"\2\u009b\u009c\7\r\2\2\u009c\u00bc\3\2\2\2\u009d\u009e\7 \2\2\u009e\u009f"+
		"\5\n\6\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00bc\3\2\2\2"+
		"\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7 \2\2\u00a5\u00a6"+
		"\7\r\2\2\u00a6\u00bc\3\2\2\2\u00a7\u00a8\7\37\2\2\u00a8\u00a9\5\n\6\2"+
		"\u00a9\u00aa\7\37\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00bc\3\2\2\2\u00ac\u00ad"+
		"\7\37\2\2\u00ad\u00ae\t\2\2\2\u00ae\u00bc\7\r\2\2\u00af\u00b0\t\2\2\2"+
		"\u00b0\u00b1\7\37\2\2\u00b1\u00bc\7\r\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4"+
		"\5\b\5\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7\r\2\2\u00b6\u00bc\3\2\2\2\u00b7"+
		"\u00b8\7 \2\2\u00b8\u00bc\7\r\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc\7\r"+
		"\2\2\u00bb\u0092\3\2\2\2\u00bb\u0095\3\2\2\2\u00bb\u0098\3\2\2\2\u00bb"+
		"\u009d\3\2\2\2\u00bb\u00a2\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ac\3\2"+
		"\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00c8\3\2\2\2\u00bd\u00be\f\20\2\2\u00be\u00bf\5"+
		"\n\6\2\u00bf\u00c0\5\b\5\21\u00c0\u00c7\3\2\2\2\u00c1\u00c2\f\r\2\2\u00c2"+
		"\u00c3\7!\2\2\u00c3\u00c7\5\b\5\16\u00c4\u00c5\f\16\2\2\u00c5\u00c7\7"+
		"!\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\t\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc\13\3\2\2\2\u00cd\u00ce"+
		"\t\4\2\2\u00ce\r\3\2\2\2\u00cf\u00d0\t\5\2\2\u00d0\17\3\2\2\2\t\23X\u0087"+
		"\u008f\u00bb\u00c6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}