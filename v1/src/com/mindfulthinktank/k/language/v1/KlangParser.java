// Generated from S:\cloud\mindfulthinktank\GitHub\k\v1\src\com\mindfulthinktank\k\language\v1\Klang.g4 by ANTLR 4.1
package com.mindfulthinktank.k.language.v1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KlangParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, ABSTRACT=27, ASSERT=28, BOOLEAN=29, BREAK=30, BYTE=31, 
		CASE=32, CATCH=33, CHAR=34, CLASS=35, CONST=36, CONTINUE=37, DEFAULT=38, 
		DO=39, DOUBLE=40, ELSE=41, ENUM=42, EXTENDS=43, FINAL=44, FINALLY=45, 
		FLOAT=46, FOR=47, IF=48, GOTO=49, IMPLEMENTS=50, IMPORT=51, INSTANCEOF=52, 
		INT=53, INTERFACE=54, LONG=55, NATIVE=56, NEW=57, PACKAGE=58, PRIVATE=59, 
		PROTECTED=60, PUBLIC=61, RETURN=62, SHORT=63, STATIC=64, STRICTFP=65, 
		SUPER=66, SWITCH=67, SYNCHRONIZED=68, THIS=69, THROW=70, THROWS=71, TRANSIENT=72, 
		TRY=73, VOID=74, VOLATILE=75, WHILE=76, IntegerLiteral=77, FloatingPointLiteral=78, 
		BooleanLiteral=79, CharacterLiteral=80, StringLiteral=81, NullLiteral=82, 
		LPAREN=83, RPAREN=84, LBRACE=85, RBRACE=86, LBRACK=87, RBRACK=88, SEMI=89, 
		COMMA=90, DOT=91, ASSIGN=92, GT=93, LT=94, BANG=95, TILDE=96, QUESTION=97, 
		COLON=98, EQUAL=99, LE=100, GE=101, NOTEQUAL=102, AND=103, OR=104, INC=105, 
		DEC=106, ADD=107, SUB=108, MUL=109, DIV=110, BITAND=111, BITOR=112, CARET=113, 
		MOD=114, ADD_ASSIGN=115, SUB_ASSIGN=116, MUL_ASSIGN=117, DIV_ASSIGN=118, 
		AND_ASSIGN=119, OR_ASSIGN=120, XOR_ASSIGN=121, MOD_ASSIGN=122, LSHIFT_ASSIGN=123, 
		RSHIFT_ASSIGN=124, URSHIFT_ASSIGN=125, Identifier=126, AT=127, ELLIPSIS=128, 
		WS=129, NL=130, COMMENT=131, LINE_COMMENT=132;
	public static final String[] tokenNames = {
		"<INVALID>", "'character'", "'integers'", "'stack'", "'collection'", "'priority queue'", 
		"'characters'", "'shorts'", "'print'", "'bytes'", "'matrix'", "'doubles'", 
		"'queue'", "'of'", "'numbers'", "'array'", "'set'", "'booleans'", "'strings'", 
		"'longs'", "'list'", "'binary tree'", "'number'", "'floats'", "'integer'", 
		"'tree'", "'string'", "'abstract'", "'assert'", "'boolean'", "'break'", 
		"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
		"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
		"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
		"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
		"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
		"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", "Identifier", "'@'", "'...'", "WS", "NL", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_primitiveCollectionType = 3, 
		RULE_primitiveCollection = 4, RULE_primitiveTypePlural = 5, RULE_qualifiedName = 6, 
		RULE_literal = 7, RULE_statement = 8, RULE_parExpression = 9, RULE_expressionList = 10, 
		RULE_statementExpression = 11, RULE_constantExpression = 12, RULE_expression = 13, 
		RULE_primary = 14;
	public static final String[] ruleNames = {
		"compilationUnit", "type", "primitiveType", "primitiveCollectionType", 
		"primitiveCollection", "primitiveTypePlural", "qualifiedName", "literal", 
		"statement", "parExpression", "expressionList", "statementExpression", 
		"constantExpression", "expression", "primary"
	};

	@Override
	public String getGrammarFileName() { return "Klang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public KlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(KlangParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==8 || _la==NL) {
				{
				{
				setState(30); statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(EOF);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 22) | (1L << 24) | (1L << 26) | (1L << BOOLEAN) | (1L << BYTE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrimitiveCollectionTypeContext extends ParserRuleContext {
		public PrimitiveTypePluralContext primitiveTypePlural() {
			return getRuleContext(PrimitiveTypePluralContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimitiveCollectionContext primitiveCollection() {
			return getRuleContext(PrimitiveCollectionContext.class,0);
		}
		public PrimitiveCollectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveCollectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimitiveCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimitiveCollectionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimitiveCollectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveCollectionTypeContext primitiveCollectionType() throws RecognitionException {
		PrimitiveCollectionTypeContext _localctx = new PrimitiveCollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveCollectionType);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case 3:
			case 4:
			case 5:
			case 10:
			case 12:
			case 15:
			case 16:
			case 20:
			case 21:
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); primitiveCollection();
				setState(43); match(13);
				setState(44); primitiveTypePlural();
				}
				break;
			case 1:
			case 22:
			case 24:
			case 26:
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); primitiveType();
				setState(47); primitiveCollection();
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

	public static class PrimitiveCollectionContext extends ParserRuleContext {
		public PrimitiveCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimitiveCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimitiveCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimitiveCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveCollectionContext primitiveCollection() throws RecognitionException {
		PrimitiveCollectionContext _localctx = new PrimitiveCollectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 10) | (1L << 12) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 21) | (1L << 25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrimitiveTypePluralContext extends ParserRuleContext {
		public PrimitiveTypePluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveTypePlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimitiveTypePlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimitiveTypePlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimitiveTypePlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypePluralContext primitiveTypePlural() throws RecognitionException {
		PrimitiveTypePluralContext _localctx = new PrimitiveTypePluralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitiveTypePlural);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(KlangParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KlangParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(Identifier);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(56); match(DOT);
				setState(57); match(Identifier);
				}
				}
				setState(62);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgnoreLiteralContext extends LiteralContext {
		public IgnoreLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterIgnoreLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitIgnoreLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitIgnoreLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(KlangParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new IgnoreLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				_localctx = new IgnoreLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new IgnoreLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new IgnoreLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67); match(BooleanLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new IgnoreLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(68); match(NullLiteral);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgnoreStatementContext extends StatementContext {
		public TerminalNode NL() { return getToken(KlangParser.NL, 0); }
		public IgnoreStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterIgnoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitIgnoreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitIgnoreStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode NL() { return getToken(KlangParser.NL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case NL:
				_localctx = new IgnoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(NL);
				}
				break;
			case 8:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(8);
				setState(73); expressionList();
				setState(74); match(NL);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(LPAREN);
			setState(79); expression(0);
			setState(80); match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); expression(0);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83); match(COMMA);
				setState(84); expression(0);
				}
				}
				setState(89);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); expression(0);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgnoreContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IgnoreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new IgnoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95); match(LPAREN);
				setState(96); type();
				setState(97); match(RPAREN);
				setState(98); expression(17);
				}
				break;

			case 2:
				{
				_localctx = new IgnoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				_la = _input.LA(1);
				if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (INC - 105)) | (1L << (DEC - 105)) | (1L << (ADD - 105)) | (1L << (SUB - 105)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(101); expression(15);
				}
				break;

			case 3:
				{
				_localctx = new IgnoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(103); expression(14);
				}
				break;

			case 4:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104); primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(108);
						_la = _input.LA(1);
						if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (MUL - 109)) | (1L << (DIV - 109)) | (1L << (MOD - 109)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(109); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(112); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(121);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(114); match(LT);
							setState(115); match(LT);
							}
							break;

						case 2:
							{
							setState(116); match(GT);
							setState(117); match(GT);
							setState(118); match(GT);
							}
							break;

						case 3:
							{
							setState(119); match(GT);
							setState(120); match(GT);
							}
							break;
						}
						setState(123); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(125);
						_la = _input.LA(1);
						if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (GT - 93)) | (1L << (LT - 93)) | (1L << (LE - 93)) | (1L << (GE - 93)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(126); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(129); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(131); match(BITAND);
						setState(132); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(134); match(CARET);
						setState(135); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(137); match(BITOR);
						setState(138); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(140); match(AND);
						setState(141); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(143); match(OR);
						setState(144); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(158);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(146); match(ASSIGN);
							}
							break;
						case ADD_ASSIGN:
							{
							setState(147); match(ADD_ASSIGN);
							}
							break;
						case SUB_ASSIGN:
							{
							setState(148); match(SUB_ASSIGN);
							}
							break;
						case MUL_ASSIGN:
							{
							setState(149); match(MUL_ASSIGN);
							}
							break;
						case DIV_ASSIGN:
							{
							setState(150); match(DIV_ASSIGN);
							}
							break;
						case AND_ASSIGN:
							{
							setState(151); match(AND_ASSIGN);
							}
							break;
						case OR_ASSIGN:
							{
							setState(152); match(OR_ASSIGN);
							}
							break;
						case XOR_ASSIGN:
							{
							setState(153); match(XOR_ASSIGN);
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(154); match(RSHIFT_ASSIGN);
							}
							break;
						case URSHIFT_ASSIGN:
							{
							setState(155); match(URSHIFT_ASSIGN);
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(156); match(LSHIFT_ASSIGN);
							}
							break;
						case MOD_ASSIGN:
							{
							setState(157); match(MOD_ASSIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(160); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(162); match(QUESTION);
						setState(163); expression(0);
						setState(164); match(COLON);
						setState(165); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(168); match(DOT);
						setState(169); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(171); match(LBRACK);
						setState(172); expression(0);
						setState(173); match(RBRACK);
						}
						break;

					case 15:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(176); match(LPAREN);
						setState(178);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 22) | (1L << 24) | (1L << 26) | (1L << BOOLEAN) | (1L << BYTE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SUPER - 66)) | (1L << (THIS - 66)) | (1L << (VOID - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)))) != 0)) {
							{
							setState(177); expressionList();
							}
						}

						setState(180); match(RPAREN);
						}
						break;

					case 16:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(182);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 17:
						{
						_localctx = new IgnoreContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(184); match(INSTANCEOF);
						setState(185); type();
						}
						break;
					}
					} 
				}
				setState(190);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KlangParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KlangListener ) ((KlangListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KlangVisitor ) return ((KlangVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(LPAREN);
				setState(192); expression(0);
				setState(193); match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); match(SUPER);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(198); match(Identifier);
				}
				break;
			case 1:
			case 22:
			case 24:
			case 26:
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(199); type();
				setState(200); match(DOT);
				setState(201); match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 7);
				{
				setState(203); match(VOID);
				setState(204); match(DOT);
				setState(205); match(CLASS);
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
		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 20 >= _localctx._p;

		case 13: return 19 >= _localctx._p;

		case 14: return 18 >= _localctx._p;

		case 15: return 16 >= _localctx._p;

		case 16: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0086\u00d3\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tH\n\t\3\n\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\7\fX\n\f\f\f\16\f[\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17l\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17|\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bd\n\17\f\17\16\17\u00c0\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00d1\n\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\f\f\2\3\3\30\30\32\32\34\34\37\37!!**\60\6099AA\b\2\5\7\f\f\16\16"+
		"\21\22\26\27\33\33\t\2\4\4\b\t\13\13\r\r\20\20\23\25\31\31\3\2kn\3\2a"+
		"b\4\2optt\3\2mn\4\2_`fg\4\2eehh\3\2kl\u00f5\2#\3\2\2\2\4(\3\2\2\2\6*\3"+
		"\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\169\3\2\2\2\20G\3\2\2\2"+
		"\22N\3\2\2\2\24P\3\2\2\2\26T\3\2\2\2\30\\\3\2\2\2\32^\3\2\2\2\34k\3\2"+
		"\2\2\36\u00d0\3\2\2\2 \"\5\22\n\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2"+
		"\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2()\5\6\4\2)\5\3\2\2\2*"+
		"+\t\2\2\2+\7\3\2\2\2,-\5\n\6\2-.\7\17\2\2./\5\f\7\2/\64\3\2\2\2\60\61"+
		"\5\6\4\2\61\62\5\n\6\2\62\64\3\2\2\2\63,\3\2\2\2\63\60\3\2\2\2\64\t\3"+
		"\2\2\2\65\66\t\3\2\2\66\13\3\2\2\2\678\t\4\2\28\r\3\2\2\29>\7\u0080\2"+
		"\2:;\7]\2\2;=\7\u0080\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\17"+
		"\3\2\2\2@>\3\2\2\2AH\7O\2\2BH\7P\2\2CH\7R\2\2DH\7S\2\2EH\7Q\2\2FH\7T\2"+
		"\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\21\3\2"+
		"\2\2IO\7\u0084\2\2JK\7\n\2\2KL\5\26\f\2LM\7\u0084\2\2MO\3\2\2\2NI\3\2"+
		"\2\2NJ\3\2\2\2O\23\3\2\2\2PQ\7U\2\2QR\5\34\17\2RS\7V\2\2S\25\3\2\2\2T"+
		"Y\5\34\17\2UV\7\\\2\2VX\5\34\17\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\27\3\2\2\2[Y\3\2\2\2\\]\5\34\17\2]\31\3\2\2\2^_\5\34\17\2_\33\3"+
		"\2\2\2`a\b\17\1\2ab\7U\2\2bc\5\4\3\2cd\7V\2\2de\5\34\17\2el\3\2\2\2fg"+
		"\t\5\2\2gl\5\34\17\2hi\t\6\2\2il\5\34\17\2jl\5\36\20\2k`\3\2\2\2kf\3\2"+
		"\2\2kh\3\2\2\2kj\3\2\2\2l\u00be\3\2\2\2mn\6\17\2\3no\t\7\2\2o\u00bd\5"+
		"\34\17\2pq\6\17\3\3qr\t\b\2\2r\u00bd\5\34\17\2s{\6\17\4\3tu\7`\2\2u|\7"+
		"`\2\2vw\7_\2\2wx\7_\2\2x|\7_\2\2yz\7_\2\2z|\7_\2\2{t\3\2\2\2{v\3\2\2\2"+
		"{y\3\2\2\2|}\3\2\2\2}\u00bd\5\34\17\2~\177\6\17\5\3\177\u0080\t\t\2\2"+
		"\u0080\u00bd\5\34\17\2\u0081\u0082\6\17\6\3\u0082\u0083\t\n\2\2\u0083"+
		"\u00bd\5\34\17\2\u0084\u0085\6\17\7\3\u0085\u0086\7q\2\2\u0086\u00bd\5"+
		"\34\17\2\u0087\u0088\6\17\b\3\u0088\u0089\7s\2\2\u0089\u00bd\5\34\17\2"+
		"\u008a\u008b\6\17\t\3\u008b\u008c\7r\2\2\u008c\u00bd\5\34\17\2\u008d\u008e"+
		"\6\17\n\3\u008e\u008f\7i\2\2\u008f\u00bd\5\34\17\2\u0090\u0091\6\17\13"+
		"\3\u0091\u0092\7j\2\2\u0092\u00bd\5\34\17\2\u0093\u00a0\6\17\f\3\u0094"+
		"\u00a1\7^\2\2\u0095\u00a1\7u\2\2\u0096\u00a1\7v\2\2\u0097\u00a1\7w\2\2"+
		"\u0098\u00a1\7x\2\2\u0099\u00a1\7y\2\2\u009a\u00a1\7z\2\2\u009b\u00a1"+
		"\7{\2\2\u009c\u00a1\7~\2\2\u009d\u00a1\7\177\2\2\u009e\u00a1\7}\2\2\u009f"+
		"\u00a1\7|\2\2\u00a0\u0094\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0\u0096\3\2"+
		"\2\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00bd\5\34\17\2\u00a3\u00a4\6\17\r\3\u00a4\u00a5\7c\2\2\u00a5\u00a6\5"+
		"\34\17\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00bd\3\2\2\2"+
		"\u00a9\u00aa\6\17\16\3\u00aa\u00ab\7]\2\2\u00ab\u00bd\7\u0080\2\2\u00ac"+
		"\u00ad\6\17\17\3\u00ad\u00ae\7Y\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0"+
		"\7Z\2\2\u00b0\u00bd\3\2\2\2\u00b1\u00b2\6\17\20\3\u00b2\u00b4\7U\2\2\u00b3"+
		"\u00b5\5\26\f\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00bd\7V\2\2\u00b7\u00b8\6\17\21\3\u00b8\u00bd\t\13\2\2\u00b9"+
		"\u00ba\6\17\22\3\u00ba\u00bb\7\66\2\2\u00bb\u00bd\5\4\3\2\u00bcm\3\2\2"+
		"\2\u00bcp\3\2\2\2\u00bcs\3\2\2\2\u00bc~\3\2\2\2\u00bc\u0081\3\2\2\2\u00bc"+
		"\u0084\3\2\2\2\u00bc\u0087\3\2\2\2\u00bc\u008a\3\2\2\2\u00bc\u008d\3\2"+
		"\2\2\u00bc\u0090\3\2\2\2\u00bc\u0093\3\2\2\2\u00bc\u00a3\3\2\2\2\u00bc"+
		"\u00a9\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b7\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7U\2\2"+
		"\u00c2\u00c3\5\34\17\2\u00c3\u00c4\7V\2\2\u00c4\u00d1\3\2\2\2\u00c5\u00d1"+
		"\7G\2\2\u00c6\u00d1\7D\2\2\u00c7\u00d1\5\20\t\2\u00c8\u00d1\7\u0080\2"+
		"\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7]\2\2\u00cb\u00cc\7%\2\2\u00cc\u00d1"+
		"\3\2\2\2\u00cd\u00ce\7L\2\2\u00ce\u00cf\7]\2\2\u00cf\u00d1\7%\2\2\u00d0"+
		"\u00c1\3\2\2\2\u00d0\u00c5\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c7\3\2"+
		"\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\37\3\2\2\2\17#\63>GNYk{\u00a0\u00b4\u00bc\u00be\u00d0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}