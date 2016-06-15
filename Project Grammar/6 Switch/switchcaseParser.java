// Generated from switchcase.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class switchcaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, STRING=27, ID=28, Bool=29, INT=30, COMMENT=31, LINE_COMMENT=32, 
		WS=33;
	public static final int
		RULE_stat = 0, RULE_switchcase = 1, RULE_identifier = 2, RULE_swstat = 3, 
		RULE_swcase = 4, RULE_swdefault = 5, RULE_statcase = 6, RULE_jumpstat = 7, 
		RULE_assign = 8, RULE_deklarasi = 9, RULE_initdeclarator = 10, RULE_inisialisasi = 11, 
		RULE_floatdeclarator = 12, RULE_expr = 13, RULE_decl = 14;
	public static final String[] ruleNames = {
		"stat", "switchcase", "identifier", "swstat", "swcase", "swdefault", "statcase", 
		"jumpstat", "assign", "deklarasi", "initdeclarator", "inisialisasi", "floatdeclarator", 
		"expr", "decl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'switch'", "'('", "')'", "'{'", "'}'", "'''", "'case'", 
		"':'", "'default'", "'break'", "'continue'", "'goto'", "'int'", "'char'", 
		"'float'", "'double'", "','", "'='", "'.'", "'*'", "'/'", "'+'", "'-'", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "STRING", "ID", "Bool", "INT", "COMMENT", "LINE_COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "switchcase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public switchcaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public SwitchcaseContext switchcase() {
			return getRuleContext(SwitchcaseContext.class,0);
		}
		public List<JumpstatContext> jumpstat() {
			return getRuleContexts(JumpstatContext.class);
		}
		public JumpstatContext jumpstat(int i) {
			return getRuleContext(JumpstatContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			setState(43);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				switchcase();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					jumpstat();
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) );
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					assign();
					setState(37);
					match(T__0);
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18))) != 0) );
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

	public static class SwitchcaseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<SwstatContext> swstat() {
			return getRuleContexts(SwstatContext.class);
		}
		public SwstatContext swstat(int i) {
			return getRuleContext(SwstatContext.class,i);
		}
		public SwitchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitSwitchcase(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_switchcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			identifier();
			setState(48);
			match(T__3);
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(49);
				swstat();
				}
				break;
			case 2:
				{
				setState(50);
				match(T__4);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__9) {
					{
					{
					setState(51);
					swstat();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(T__5);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(switchcaseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(switchcaseParser.ID, i);
		}
		public TerminalNode INT() { return getToken(switchcaseParser.INT, 0); }
		public TerminalNode Bool() { return getToken(switchcaseParser.Bool, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(INT);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(Bool);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(T__6);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					match(ID);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(69);
				match(T__6);
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

	public static class SwstatContext extends ParserRuleContext {
		public List<SwcaseContext> swcase() {
			return getRuleContexts(SwcaseContext.class);
		}
		public SwcaseContext swcase(int i) {
			return getRuleContext(SwcaseContext.class,i);
		}
		public SwdefaultContext swdefault() {
			return getRuleContext(SwdefaultContext.class,0);
		}
		public SwstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterSwstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitSwstat(this);
		}
	}

	public final SwstatContext swstat() throws RecognitionException {
		SwstatContext _localctx = new SwstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_swstat);
		try {
			int _alt;
			setState(78);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(72);
						swcase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(75); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterSwcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitSwcase(this);
		}
	}

	public final SwcaseContext swcase() throws RecognitionException {
		SwcaseContext _localctx = new SwcaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_swcase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__7);
			setState(81);
			identifier();
			setState(82);
			match(T__8);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					statcase();
					}
					} 
				}
				setState(88);
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
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterSwdefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitSwdefault(this);
		}
	}

	public final SwdefaultContext swdefault() throws RecognitionException {
		SwdefaultContext _localctx = new SwdefaultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_swdefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__9);
			setState(90);
			match(T__8);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					statcase();
					}
					} 
				}
				setState(96);
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
			exitRule();
		}
		return _localctx;
	}

	public static class StatcaseContext extends ParserRuleContext {
		public SwitchcaseContext switchcase() {
			return getRuleContext(SwitchcaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(switchcaseParser.ID, 0); }
		public InisialisasiContext inisialisasi() {
			return getRuleContext(InisialisasiContext.class,0);
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
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterStatcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitStatcase(this);
		}
	}

	public final StatcaseContext statcase() throws RecognitionException {
		StatcaseContext _localctx = new StatcaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statcase);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				switchcase();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				inisialisasi();
				setState(100);
				match(T__0);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterJumpstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitJumpstat(this);
		}
	}

	public final JumpstatContext jumpstat() throws RecognitionException {
		JumpstatContext _localctx = new JumpstatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jumpstat);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__10);
				setState(106);
				match(T__0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__11);
				setState(108);
				match(T__0);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__12);
				setState(110);
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

	public static class AssignContext extends ParserRuleContext {
		public DeklarasiContext deklarasi() {
			return getRuleContext(DeklarasiContext.class,0);
		}
		public InisialisasiContext inisialisasi() {
			return getRuleContext(InisialisasiContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				deklarasi();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				inisialisasi();
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

	public static class DeklarasiContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public FloatdeclaratorContext floatdeclarator() {
			return getRuleContext(FloatdeclaratorContext.class,0);
		}
		public DeklarasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarasi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterDeklarasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitDeklarasi(this);
		}
	}

	public final DeklarasiContext deklarasi() throws RecognitionException {
		DeklarasiContext _localctx = new DeklarasiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deklarasi);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__13);
				setState(118);
				initdeclarator(0);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__15);
				setState(121);
				floatdeclarator();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__16);
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

	public static class InitdeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(switchcaseParser.ID, 0); }
		public InisialisasiContext inisialisasi() {
			return getRuleContext(InisialisasiContext.class,0);
		}
		public List<InitdeclaratorContext> initdeclarator() {
			return getRuleContexts(InitdeclaratorContext.class);
		}
		public InitdeclaratorContext initdeclarator(int i) {
			return getRuleContext(InitdeclaratorContext.class,i);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		return initdeclarator(0);
	}

	private InitdeclaratorContext initdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, _parentState);
		InitdeclaratorContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_initdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(127);
				inisialisasi();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclarator);
					setState(130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(131);
					match(T__17);
					setState(132);
					initdeclarator(2);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class InisialisasiContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InisialisasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inisialisasi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterInisialisasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitInisialisasi(this);
		}
	}

	public final InisialisasiContext inisialisasi() throws RecognitionException {
		InisialisasiContext _localctx = new InisialisasiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inisialisasi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__18);
			setState(139);
			expr(0);
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

	public static class FloatdeclaratorContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(switchcaseParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(switchcaseParser.INT, i);
		}
		public FloatdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterFloatdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitFloatdeclarator(this);
		}
	}

	public final FloatdeclaratorContext floatdeclarator() throws RecognitionException {
		FloatdeclaratorContext _localctx = new FloatdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floatdeclarator);
		int _la;
		try {
			setState(160);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(INT);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(146);
				match(T__19);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(147);
					match(INT);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__19);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(154);
					match(INT);
					}
					}
					setState(159);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(switchcaseParser.INT, 0); }
		public TerminalNode ID() { return getToken(switchcaseParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitExpr(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(163);
				match(T__2);
				setState(164);
				expr(0);
				setState(165);
				match(T__3);
				}
				break;
			case INT:
				{
				setState(167);
				match(INT);
				}
				break;
			case ID:
				{
				setState(168);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(173);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(176);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode ID() { return getToken(switchcaseParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof switchcaseListener ) ((switchcaseListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		return decl(0);
	}

	private DeclContext decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclContext _localctx = new DeclContext(_ctx, _parentState);
		DeclContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(183);
				match(T__20);
				setState(184);
				decl(3);
				}
				break;
			case T__2:
				{
				setState(185);
				match(T__2);
				setState(186);
				decl(0);
				setState(187);
				match(T__3);
				}
				break;
			case ID:
				{
				setState(189);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decl);
					setState(192);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(193);
					match(T__24);
					setState(194);
					match(T__25);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 10:
			return initdeclarator_sempred((InitdeclaratorContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
			return decl_sempred((DeclContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean initdeclarator_sempred(InitdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean decl_sempred(DeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\6\4D\n"+
		"\4\r\4\16\4E\3\4\5\4I\n\4\3\5\6\5L\n\5\r\5\16\5M\3\5\5\5Q\n\5\3\6\3\6"+
		"\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3"+
		"\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\r\3\r\3\r\3\16\6"+
		"\16\u0091\n\16\r\16\16\16\u0092\3\16\3\16\7\16\u0097\n\16\f\16\16\16\u009a"+
		"\13\16\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\5\16\u00a3\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00c1\n\20\3\20\3\20\3\20\7\20\u00c6\n\20\f"+
		"\20\16\20\u00c9\13\20\3\20\2\5\26\34\36\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\4\3\2\27\30\3\2\31\32\u00df\2-\3\2\2\2\4/\3\2\2\2\6H\3"+
		"\2\2\2\bP\3\2\2\2\nR\3\2\2\2\f[\3\2\2\2\16i\3\2\2\2\20q\3\2\2\2\22u\3"+
		"\2\2\2\24}\3\2\2\2\26\177\3\2\2\2\30\u008c\3\2\2\2\32\u00a2\3\2\2\2\34"+
		"\u00ab\3\2\2\2\36\u00c0\3\2\2\2 .\5\4\3\2!#\5\20\t\2\"!\3\2\2\2#$\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%.\3\2\2\2&\'\5\22\n\2\'(\7\3\2\2(*\3\2\2\2)"+
		"&\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2- \3\2\2\2-\"\3\2\2\2"+
		"-)\3\2\2\2.\3\3\2\2\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\5\6\4\2\62<\7\6"+
		"\2\2\63=\5\b\5\2\648\7\7\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;=\7\b\2\2<\63\3\2\2\2<\64\3"+
		"\2\2\2<=\3\2\2\2=\5\3\2\2\2>I\7\36\2\2?I\7 \2\2@I\7\37\2\2AC\7\t\2\2B"+
		"D\7\36\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7\t\2\2"+
		"H>\3\2\2\2H?\3\2\2\2H@\3\2\2\2HA\3\2\2\2I\7\3\2\2\2JL\5\n\6\2KJ\3\2\2"+
		"\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OQ\5\f\7\2PK\3\2\2\2PO\3\2\2"+
		"\2Q\t\3\2\2\2RS\7\n\2\2ST\5\6\4\2TX\7\13\2\2UW\5\16\b\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\7\f\2\2\\`\7\13\2"+
		"\2]_\5\16\b\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2b`\3\2"+
		"\2\2cj\5\4\3\2de\7\36\2\2ef\5\30\r\2fg\7\3\2\2gj\3\2\2\2hj\5\20\t\2ic"+
		"\3\2\2\2id\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kl\7\r\2\2lr\7\3\2\2mn\7\16\2"+
		"\2nr\7\3\2\2op\7\17\2\2pr\7\3\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\21\3"+
		"\2\2\2sv\5\24\13\2tv\5\30\r\2us\3\2\2\2ut\3\2\2\2v\23\3\2\2\2wx\7\20\2"+
		"\2x~\5\26\f\2y~\7\21\2\2z{\7\22\2\2{~\5\32\16\2|~\7\23\2\2}w\3\2\2\2}"+
		"y\3\2\2\2}z\3\2\2\2}|\3\2\2\2~\25\3\2\2\2\177\u0080\b\f\1\2\u0080\u0082"+
		"\7\36\2\2\u0081\u0083\5\30\r\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0089\3\2\2\2\u0084\u0085\f\3\2\2\u0085\u0086\7\24\2\2\u0086\u0088"+
		"\5\26\f\4\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\27\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\7\25\2\2\u008d\u008e\5\34\17\2\u008e\31\3\2\2\2\u008f\u0091\7 \2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0098\7\26\2\2\u0095\u0097\7 \2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a3\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\7\26\2\2\u009c"+
		"\u009e\7 \2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u0090\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\b\17\1"+
		"\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\6\2\2\u00a8"+
		"\u00ac\3\2\2\2\u00a9\u00ac\7 \2\2\u00aa\u00ac\7\36\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b5\3\2\2\2\u00ad"+
		"\u00ae\f\6\2\2\u00ae\u00af\t\2\2\2\u00af\u00b4\5\34\17\7\u00b0\u00b1\f"+
		"\5\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b4\5\34\17\6\u00b3\u00ad\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\35\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\20\1\2\u00b9\u00ba"+
		"\7\27\2\2\u00ba\u00c1\5\36\20\5\u00bb\u00bc\7\5\2\2\u00bc\u00bd\5\36\20"+
		"\2\u00bd\u00be\7\6\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1\7\36\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c7\3\2"+
		"\2\2\u00c2\u00c3\f\6\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c6\7\34\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\37\3\2\2\2\u00c9\u00c7\3\2\2\2\34$+-8<EHMPX`iqu}\u0082\u0089"+
		"\u0092\u0098\u009f\u00a2\u00ab\u00b3\u00b5\u00c0\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}