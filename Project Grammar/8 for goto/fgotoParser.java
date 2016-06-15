// Generated from fgoto.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fgotoParser extends Parser {
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
		T__38=39, T__39=40, Identifier=41, NUMBER=42, Whitespace=43, Newline=44, 
		BlockComment=45, LineComment=46;
	public static final int
		RULE_statement = 0, RULE_declaration = 1, RULE_jumpStatement = 2, RULE_declarationSpecifier = 3, 
		RULE_typeSpecifier = 4, RULE_assignmentOperator = 5, RULE_unaryOperator = 6, 
		RULE_assignmentExpression = 7, RULE_relationalExpression = 8, RULE_unaryExpression = 9, 
		RULE_iterationStatement = 10, RULE_init = 11, RULE_condition = 12, RULE_state = 13, 
		RULE_declaration_expression = 14;
	public static final String[] ruleNames = {
		"statement", "declaration", "jumpStatement", "declarationSpecifier", "typeSpecifier", 
		"assignmentOperator", "unaryOperator", "assignmentExpression", "relationalExpression", 
		"unaryExpression", "iterationStatement", "init", "condition", "state", 
		"declaration_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'goto'", "':'", "'void'", "'char'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'unsigned'", "'*='", "'/='", 
		"'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'&'", 
		"'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'++'", 
		"'--'", "'for'", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Identifier", "NUMBER", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "fgoto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fgotoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<IterationStatementContext> iterationStatement() {
			return getRuleContexts(IterationStatementContext.class);
		}
		public IterationStatementContext iterationStatement(int i) {
			return getRuleContext(IterationStatementContext.class,i);
		}
		public List<JumpStatementContext> jumpStatement() {
			return getRuleContexts(JumpStatementContext.class);
		}
		public JumpStatementContext jumpStatement(int i) {
			return getRuleContext(JumpStatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			int _alt;
			setState(45);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(30);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(33); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(35);
						iterationStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(38); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__3:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						jumpStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(43); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(fgotoParser.Identifier, 0); }
		public TerminalNode NUMBER() { return getToken(fgotoParser.NUMBER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				declarationSpecifier();
				setState(48);
				match(T__0);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(49);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				declarationSpecifier();
				setState(53);
				match(T__1);
				setState(54);
				match(Identifier);
				setState(55);
				match(T__0);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(56);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				declarationSpecifier();
				setState(60);
				match(T__1);
				setState(61);
				match(Identifier);
				setState(62);
				match(T__2);
				setState(63);
				match(NUMBER);
				setState(64);
				match(T__0);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(65);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				declarationSpecifier();
				setState(69);
				match(T__1);
				setState(70);
				declarationSpecifier();
				setState(71);
				match(T__0);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(72);
					statement();
					}
					break;
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(fgotoParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jumpStatement);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__3);
				setState(78);
				match(Identifier);
				setState(79);
				match(T__0);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(80);
					statement();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(Identifier);
				setState(84);
				match(T__4);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(85);
					statement();
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(fgotoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fgotoParser.Identifier, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(fgotoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(fgotoParser.NUMBER, i);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationSpecifier);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				typeSpecifier();
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					match(Identifier);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				typeSpecifier();
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(Identifier);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(102);
				match(T__2);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(NUMBER);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) );
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
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			unaryExpression();
			setState(120);
			assignmentOperator();
			setState(121);
			assignmentExpression();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
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
		public Declaration_expressionContext declaration_expression() {
			return getRuleContext(Declaration_expressionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_iterationStatement);
		int _la;
		try {
			int _alt;
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__35);
				setState(128);
				match(T__36);
				setState(130);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(129);
					init();
					}
				}

				setState(132);
				match(T__0);
				setState(134);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(133);
					condition();
					}
				}

				setState(136);
				match(T__0);
				setState(138);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					setState(137);
					state();
					}
				}

				setState(140);
				match(T__37);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						statement();
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__35);
				setState(148);
				match(T__36);
				setState(150);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(149);
					declaration_expression();
					}
				}

				setState(152);
				match(T__0);
				setState(154);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(153);
					condition();
					}
				}

				setState(156);
				match(T__0);
				setState(158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					setState(157);
					state();
					}
				}

				setState(160);
				match(T__37);
				{
				setState(161);
				match(T__38);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__35) | (1L << Identifier))) != 0)) {
					{
					{
					setState(162);
					statement();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(168);
				match(T__39);
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						statement();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__35);
				setState(176);
				match(T__36);
				setState(178);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(177);
					init();
					}
				}

				setState(180);
				match(T__0);
				setState(182);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(181);
					condition();
					}
				}

				setState(184);
				match(T__0);
				setState(186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					setState(185);
					state();
					}
				}

				setState(188);
				match(T__37);
				{
				setState(189);
				match(T__38);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__35) | (1L << Identifier))) != 0)) {
					{
					{
					setState(190);
					statement();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(196);
				match(T__39);
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197);
						statement();
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(fgotoParser.NUMBER, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fgotoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fgotoParser.Identifier, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				match(Identifier);
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(210);
			match(T__2);
			setState(211);
			match(NUMBER);
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
		public List<TerminalNode> Identifier() { return getTokens(fgotoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fgotoParser.Identifier, i);
		}
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(fgotoParser.NUMBER, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					match(Identifier);
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					relationalExpression();
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) );
				{
				setState(223);
				match(Identifier);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(Identifier);
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(230);
				relationalExpression();
				setState(231);
				match(NUMBER);
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
		public List<TerminalNode> Identifier() { return getTokens(fgotoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fgotoParser.Identifier, i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(fgotoParser.NUMBER, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_state);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				unaryExpression();
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					match(Identifier);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					match(Identifier);
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(246);
				assignmentOperator();
				setState(247);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(249);
					match(Identifier);
					}
					}
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(254);
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

	public static class Declaration_expressionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(fgotoParser.NUMBER, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fgotoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fgotoParser.Identifier, i);
		}
		public Declaration_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).enterDeclaration_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fgotoListener ) ((fgotoListener)listener).exitDeclaration_expression(this);
		}
	}

	public final Declaration_expressionContext declaration_expression() throws RecognitionException {
		Declaration_expressionContext _localctx = new Declaration_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			typeSpecifier();
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				match(Identifier);
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(263);
			match(T__2);
			setState(264);
			match(NUMBER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u010d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\2\6\2\'\n\2\r\2\16\2(\3\2\6\2,\n\2\r\2\16\2-\5\2\60\n\2\3\3\3"+
		"\3\3\3\5\3\65\n\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\5\3N\n\3\3\4\3\4\3\4\3\4\5"+
		"\4T\n\4\3\4\3\4\3\4\5\4Y\n\4\5\4[\n\4\3\5\3\5\6\5_\n\5\r\5\16\5`\3\5\3"+
		"\5\6\5e\n\5\r\5\16\5f\3\5\3\5\6\5k\n\5\r\5\16\5l\5\5o\n\5\3\6\6\6r\n\6"+
		"\r\6\16\6s\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u0085\n\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f\7"+
		"\f\u0091\n\f\f\f\16\f\u0094\13\f\3\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f\5\f"+
		"\u009d\n\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9"+
		"\13\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0\13\f\3\f\3\f\3\f\5\f\u00b5"+
		"\n\f\3\f\3\f\5\f\u00b9\n\f\3\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\7\f\u00c2"+
		"\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\5\f"+
		"\u00ce\n\f\3\r\6\r\u00d1\n\r\r\r\16\r\u00d2\3\r\3\r\3\r\3\16\6\16\u00d9"+
		"\n\16\r\16\16\16\u00da\3\16\6\16\u00de\n\16\r\16\16\16\u00df\3\16\3\16"+
		"\3\16\6\16\u00e5\n\16\r\16\16\16\u00e6\3\16\3\16\3\16\5\16\u00ec\n\16"+
		"\3\17\3\17\6\17\u00f0\n\17\r\17\16\17\u00f1\3\17\6\17\u00f5\n\17\r\17"+
		"\16\17\u00f6\3\17\3\17\3\17\3\17\6\17\u00fd\n\17\r\17\16\17\u00fe\3\17"+
		"\5\17\u0102\n\17\3\20\3\20\6\20\u0106\n\20\r\20\16\20\u0107\3\20\3\20"+
		"\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\b\17"+
		"\4\2\5\5\20\31\3\2\32\37\3\2 #\3\2$%\u012c\2/\3\2\2\2\4M\3\2\2\2\6Z\3"+
		"\2\2\2\bn\3\2\2\2\nq\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22}\3"+
		"\2\2\2\24\177\3\2\2\2\26\u00cd\3\2\2\2\30\u00d0\3\2\2\2\32\u00eb\3\2\2"+
		"\2\34\u0101\3\2\2\2\36\u0103\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#"+
		"!\3\2\2\2#$\3\2\2\2$\60\3\2\2\2%\'\5\26\f\2&%\3\2\2\2\'(\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)\60\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3"+
		"\2\2\2.\60\3\2\2\2/!\3\2\2\2/&\3\2\2\2/+\3\2\2\2\60\3\3\2\2\2\61\62\5"+
		"\b\5\2\62\64\7\3\2\2\63\65\5\2\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65N\3\2"+
		"\2\2\66\67\5\b\5\2\678\7\4\2\289\7+\2\29;\7\3\2\2:<\5\2\2\2;:\3\2\2\2"+
		";<\3\2\2\2<N\3\2\2\2=>\5\b\5\2>?\7\4\2\2?@\7+\2\2@A\7\5\2\2AB\7,\2\2B"+
		"D\7\3\2\2CE\5\2\2\2DC\3\2\2\2DE\3\2\2\2EN\3\2\2\2FG\5\b\5\2GH\7\4\2\2"+
		"HI\5\b\5\2IK\7\3\2\2JL\5\2\2\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2M\61\3\2\2"+
		"\2M\66\3\2\2\2M=\3\2\2\2MF\3\2\2\2N\5\3\2\2\2OP\7\6\2\2PQ\7+\2\2QS\7\3"+
		"\2\2RT\5\2\2\2SR\3\2\2\2ST\3\2\2\2T[\3\2\2\2UV\7+\2\2VX\7\7\2\2WY\5\2"+
		"\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZO\3\2\2\2ZU\3\2\2\2[\7\3\2\2\2\\^\5"+
		"\n\6\2]_\7+\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ao\3\2\2\2bd\5"+
		"\n\6\2ce\7+\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\7"+
		"\5\2\2ik\7,\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n\\\3"+
		"\2\2\2nb\3\2\2\2o\t\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st"+
		"\3\2\2\2t\13\3\2\2\2uv\t\3\2\2v\r\3\2\2\2wx\t\4\2\2x\17\3\2\2\2yz\5\24"+
		"\13\2z{\5\f\7\2{|\5\20\t\2|\21\3\2\2\2}~\t\5\2\2~\23\3\2\2\2\177\u0080"+
		"\t\6\2\2\u0080\25\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0084\7\'\2\2\u0083"+
		"\u0085\5\30\r\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0088\7\3\2\2\u0087\u0089\5\32\16\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\3\2\2\u008b\u008d\5\34"+
		"\17\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0092\7(\2\2\u008f\u0091\5\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00ce\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7&\2\2\u0096\u0098\7\'\2\2\u0097\u0099\5\36"+
		"\20\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\7\3\2\2\u009b\u009d\5\32\16\2\u009c\u009b\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\3\2\2\u009f\u00a1\5\34\17\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7("+
		"\2\2\u00a3\u00a7\7)\2\2\u00a4\u00a6\5\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ae\7*\2\2\u00ab\u00ad\5\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00ce\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7&\2\2\u00b2"+
		"\u00b4\7\'\2\2\u00b3\u00b5\5\30\r\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\7\3\2\2\u00b7\u00b9\5\32\16\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\3"+
		"\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c3\7)\2\2\u00c0\u00c2\5\2\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\7*\2\2\u00c7"+
		"\u00c9\5\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u0081\3\2\2\2\u00cd\u0095\3\2\2\2\u00cd\u00b1\3\2\2\2\u00ce\27\3\2\2"+
		"\2\u00cf\u00d1\7+\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\5\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\31\3\2\2\2\u00d7\u00d9\7+\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00de\5\22\n\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\7+\2\2\u00e2\u00ec\3\2\2\2\u00e3\u00e5\7+\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7,\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00d8\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec\33\3\2\2\2\u00ed\u00ef\5\24\13"+
		"\2\u00ee\u00f0\7+\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0102\3\2\2\2\u00f3\u00f5\7+\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5\f\7\2\u00f9\u00fa\7,\2\2\u00fa"+
		"\u0102\3\2\2\2\u00fb\u00fd\7+\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\5\24\13\2\u0101\u00ed\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00fc\3"+
		"\2\2\2\u0102\35\3\2\2\2\u0103\u0105\5\n\6\2\u0104\u0106\7+\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\5\2\2\u010a\u010b\7,\2\2\u010b\37\3\2\2\2"+
		",#(-/\64;DKMSXZ`flns\u0084\u0088\u008c\u0092\u0098\u009c\u00a0\u00a7\u00ae"+
		"\u00b4\u00b8\u00bc\u00c3\u00ca\u00cd\u00d2\u00da\u00df\u00e6\u00eb\u00f1"+
		"\u00f6\u00fe\u0101\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}