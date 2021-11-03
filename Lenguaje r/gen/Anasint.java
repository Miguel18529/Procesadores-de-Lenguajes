// Generated from C:/Users/amigo/IdeaProjects/Lenguaje r/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, ASIGNACIONES=5, HLIST=6, 
		BLIST=7, ILIST=8, BOOLEAN=9, INTEGER=10, BOOLEANO=11, NOT=12, OR=13, AND=14, 
		APPEND=15, COMA=16, PyC=17, IGUAL=18, CA=19, CC=20, ADD=21, MINUS=22, 
		TIMES=23, MENOS=24, PA=25, PC=26, NUMERO=27, IDENT=28, COMENTARIO_BLOQUE=29, 
		COMENTARIO_LINEA=30;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_definicion_variables = 2, 
		RULE_tipo = 3, RULE_idents = 4, RULE_asignaciones = 5, RULE_asig = 6, 
		RULE_expresion = 7, RULE_expr_lista = 8, RULE_lista_por_extension = 9, 
		RULE_lista_append = 10, RULE_variable = 11, RULE_expr_entera = 12, RULE_expr_booleana = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "definicion_variables", "tipo", "idents", "asignaciones", 
			"asig", "expresion", "expr_lista", "lista_por_extension", "lista_append", 
			"variable", "expr_entera", "expr_booleana"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'ASIGNACIONES'", "'Hlist'", 
			"'Blist'", "'Ilist'", "'Boolean'", "'Integer'", null, "'not'", "'or'", 
			"'and'", "'append'", "','", "';'", "'='", "'['", "']'", "'add'", "'minus'", 
			"'times'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "ASIGNACIONES", 
			"HLIST", "BLIST", "ILIST", "BOOLEAN", "INTEGER", "BOOLEANO", "NOT", "OR", 
			"AND", "APPEND", "COMA", "PyC", "IGUAL", "CA", "CC", "ADD", "MINUS", 
			"TIMES", "MENOS", "PA", "PC", "NUMERO", "IDENT", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			variables();
			setState(29);
			asignaciones();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<Definicion_variablesContext> definicion_variables() {
			return getRuleContexts(Definicion_variablesContext.class);
		}
		public Definicion_variablesContext definicion_variables(int i) {
			return getRuleContext(Definicion_variablesContext.class,i);
		}
		public List<TerminalNode> PyC() { return getTokens(Anasint.PyC); }
		public TerminalNode PyC(int i) {
			return getToken(Anasint.PyC, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(VARIABLES);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				definicion_variables();
				setState(33);
				match(PyC);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HLIST) | (1L << BLIST) | (1L << ILIST) | (1L << BOOLEAN) | (1L << INTEGER))) != 0) );
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

	public static class Definicion_variablesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public Definicion_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDefinicion_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDefinicion_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDefinicion_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_variablesContext definicion_variables() throws RecognitionException {
		Definicion_variablesContext _localctx = new Definicion_variablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			tipo();
			setState(40);
			idents();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode HLIST() { return getToken(Anasint.HLIST, 0); }
		public TerminalNode BLIST() { return getToken(Anasint.BLIST, 0); }
		public TerminalNode ILIST() { return getToken(Anasint.ILIST, 0); }
		public TerminalNode BOOLEAN() { return getToken(Anasint.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(Anasint.INTEGER, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HLIST) | (1L << BLIST) | (1L << ILIST) | (1L << BOOLEAN) | (1L << INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public IdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIdents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIdents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIdents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentsContext idents() throws RecognitionException {
		IdentsContext _localctx = new IdentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IDENT);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(45);
				match(COMA);
				setState(46);
				match(IDENT);
				}
				}
				setState(51);
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

	public static class AsignacionesContext extends ParserRuleContext {
		public TerminalNode ASIGNACIONES() { return getToken(Anasint.ASIGNACIONES, 0); }
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ASIGNACIONES);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(53);
				asig();
				}
				}
				setState(58);
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

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENT);
			setState(60);
			match(IGUAL);
			setState(61);
			expresion();
			setState(62);
			match(PyC);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expr_listaContext expr_lista() {
			return getRuleContext(Expr_listaContext.class,0);
		}
		public Expr_booleanaContext expr_booleana() {
			return getRuleContext(Expr_booleanaContext.class,0);
		}
		public Expr_enteraContext expr_entera() {
			return getRuleContext(Expr_enteraContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expr_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				expr_booleana();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				expr_entera();
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

	public static class Expr_listaContext extends ParserRuleContext {
		public Lista_por_extensionContext lista_por_extension() {
			return getRuleContext(Lista_por_extensionContext.class,0);
		}
		public Lista_appendContext lista_append() {
			return getRuleContext(Lista_appendContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Expr_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listaContext expr_lista() throws RecognitionException {
		Expr_listaContext _localctx = new Expr_listaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_lista);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CA:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				lista_por_extension();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				lista_append();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				variable();
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

	public static class Lista_por_extensionContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public List<Expr_enteraContext> expr_entera() {
			return getRuleContexts(Expr_enteraContext.class);
		}
		public Expr_enteraContext expr_entera(int i) {
			return getRuleContext(Expr_enteraContext.class,i);
		}
		public List<Expr_booleanaContext> expr_booleana() {
			return getRuleContexts(Expr_booleanaContext.class);
		}
		public Expr_booleanaContext expr_booleana(int i) {
			return getRuleContext(Expr_booleanaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Lista_por_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_por_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_por_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_por_extension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_por_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_por_extensionContext lista_por_extension() throws RecognitionException {
		Lista_por_extensionContext _localctx = new Lista_por_extensionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_por_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CA);
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				expr_entera();
				}
				break;
			case 2:
				{
				setState(76);
				expr_booleana();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(79);
				match(COMA);
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(80);
					expr_entera();
					}
					break;
				case 2:
					{
					setState(81);
					expr_booleana();
					}
					break;
				}
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(CC);
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

	public static class Lista_appendContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(Anasint.APPEND, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expr_listaContext> expr_lista() {
			return getRuleContexts(Expr_listaContext.class);
		}
		public Expr_listaContext expr_lista(int i) {
			return getRuleContext(Expr_listaContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public Lista_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_append(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_append(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_appendContext lista_append() throws RecognitionException {
		Lista_appendContext _localctx = new Lista_appendContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(APPEND);
			setState(92);
			match(PA);
			setState(93);
			expr_lista();
			setState(94);
			match(COMA);
			setState(95);
			expr_lista();
			setState(96);
			match(PC);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENT);
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

	public static class Expr_enteraContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode ADD() { return getToken(Anasint.ADD, 0); }
		public TerminalNode MINUS() { return getToken(Anasint.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(Anasint.TIMES, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public Expr_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_enteraContext expr_entera() throws RecognitionException {
		Expr_enteraContext _localctx = new Expr_enteraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_entera);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
			case TIMES:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << TIMES))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				match(PA);
				setState(102);
				match(IDENT);
				setState(103);
				match(COMA);
				setState(104);
				match(IDENT);
				setState(105);
				match(PC);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(IDENT);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(NUMERO);
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

	public static class Expr_booleanaContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expr_booleanaContext> expr_booleana() {
			return getRuleContexts(Expr_booleanaContext.class);
		}
		public Expr_booleanaContext expr_booleana(int i) {
			return getRuleContext(Expr_booleanaContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode OR() { return getToken(Anasint.OR, 0); }
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public TerminalNode NOT() { return getToken(Anasint.NOT, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode BOOLEANO() { return getToken(Anasint.BOOLEANO, 0); }
		public Expr_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_booleanaContext expr_booleana() throws RecognitionException {
		Expr_booleanaContext _localctx = new Expr_booleanaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_booleana);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(PA);
				setState(112);
				expr_booleana();
				setState(113);
				match(COMA);
				setState(114);
				expr_booleana();
				setState(115);
				match(PC);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(NOT);
				setState(118);
				match(PA);
				setState(119);
				expr_booleana();
				setState(120);
				match(PC);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(IDENT);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(BOOLEANO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6"+
		"\3&\n\3\r\3\16\3\'\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6\62\n\6\f\6\16\6"+
		"\65\13\6\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\tF\n\t\3\n\3\n\3\n\5\nK\n\n\3\13\3\13\3\13\5\13P\n\13\3\13\3\13\3"+
		"\13\5\13U\n\13\7\13W\n\13\f\13\16\13Z\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16o\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\177\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2"+
		"\b\f\3\2\27\31\3\2\17\20\2\u0081\2\36\3\2\2\2\4!\3\2\2\2\6)\3\2\2\2\b"+
		",\3\2\2\2\n.\3\2\2\2\f\66\3\2\2\2\16=\3\2\2\2\20E\3\2\2\2\22J\3\2\2\2"+
		"\24L\3\2\2\2\26]\3\2\2\2\30d\3\2\2\2\32n\3\2\2\2\34~\3\2\2\2\36\37\5\4"+
		"\3\2\37 \5\f\7\2 \3\3\2\2\2!%\7\6\2\2\"#\5\6\4\2#$\7\23\2\2$&\3\2\2\2"+
		"%\"\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)*\5\b\5\2*+\5"+
		"\n\6\2+\7\3\2\2\2,-\t\2\2\2-\t\3\2\2\2.\63\7\36\2\2/\60\7\22\2\2\60\62"+
		"\7\36\2\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\13"+
		"\3\2\2\2\65\63\3\2\2\2\66:\7\7\2\2\679\5\16\b\28\67\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2=>\7\36\2\2>?\7\24\2\2?@\5\20"+
		"\t\2@A\7\23\2\2A\17\3\2\2\2BF\5\22\n\2CF\5\34\17\2DF\5\32\16\2EB\3\2\2"+
		"\2EC\3\2\2\2ED\3\2\2\2F\21\3\2\2\2GK\5\24\13\2HK\5\26\f\2IK\5\30\r\2J"+
		"G\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\23\3\2\2\2LO\7\25\2\2MP\5\32\16\2NP\5\34"+
		"\17\2OM\3\2\2\2ON\3\2\2\2PX\3\2\2\2QT\7\22\2\2RU\5\32\16\2SU\5\34\17\2"+
		"TR\3\2\2\2TS\3\2\2\2UW\3\2\2\2VQ\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\7\26\2\2\\\25\3\2\2\2]^\7\21\2\2^_\7\33\2\2_`"+
		"\5\22\n\2`a\7\22\2\2ab\5\22\n\2bc\7\34\2\2c\27\3\2\2\2de\7\36\2\2e\31"+
		"\3\2\2\2fg\t\3\2\2gh\7\33\2\2hi\7\36\2\2ij\7\22\2\2jk\7\36\2\2ko\7\34"+
		"\2\2lo\7\36\2\2mo\7\35\2\2nf\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\33\3\2\2\2p"+
		"q\t\4\2\2qr\7\33\2\2rs\5\34\17\2st\7\22\2\2tu\5\34\17\2uv\7\34\2\2v\177"+
		"\3\2\2\2wx\7\16\2\2xy\7\33\2\2yz\5\34\17\2z{\7\34\2\2{\177\3\2\2\2|\177"+
		"\7\36\2\2}\177\7\r\2\2~p\3\2\2\2~w\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\35"+
		"\3\2\2\2\f\'\63:EJOTXn~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}