// Generated from C:/Users/amigo/IdeaProjects/LEXCHANGE/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, ESQUEMA=4, FUENTE=5, DATOS=6, DESTINO=7, 
		RESTRICCIONES=8, IMPLICA=9, VAR=10, COMA=11, PA=12, PC=13, PyC=14, NUMERO=15, 
		IDENT_MAYUS=16, IDENT=17, COMENTARIO_BLOQUE=18, COMENTARIO_LINEA=19;
	public static final int
		RULE_programa = 0, RULE_esq_fuente = 1, RULE_parametros = 2, RULE_datos_fuente = 3, 
		RULE_datos = 4, RULE_esq_destino = 5, RULE_restr = 6, RULE_restriccion = 7, 
		RULE_decl_vars = 8, RULE_variables = 9, RULE_implicacion = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "esq_fuente", "parametros", "datos_fuente", "datos", "esq_destino", 
			"restr", "restriccion", "decl_vars", "variables", "implicacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'ESQUEMA'", "'FUENTE'", "'DATOS'", "'DESTINO'", 
			"'RESTRICCIONES'", "'IMPLICA'", "'VAR'", "','", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "ESQUEMA", "FUENTE", "DATOS", 
			"DESTINO", "RESTRICCIONES", "IMPLICA", "VAR", "COMA", "PA", "PC", "PyC", 
			"NUMERO", "IDENT_MAYUS", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		public Esq_fuenteContext esq_fuente() {
			return getRuleContext(Esq_fuenteContext.class,0);
		}
		public Datos_fuenteContext datos_fuente() {
			return getRuleContext(Datos_fuenteContext.class,0);
		}
		public Esq_destinoContext esq_destino() {
			return getRuleContext(Esq_destinoContext.class,0);
		}
		public RestrContext restr() {
			return getRuleContext(RestrContext.class,0);
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
			setState(22);
			esq_fuente();
			setState(23);
			datos_fuente();
			setState(24);
			esq_destino();
			setState(25);
			restr();
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

	public static class Esq_fuenteContext extends ParserRuleContext {
		public TerminalNode ESQUEMA() { return getToken(Anasint.ESQUEMA, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public Esq_fuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esq_fuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEsq_fuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEsq_fuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEsq_fuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Esq_fuenteContext esq_fuente() throws RecognitionException {
		Esq_fuenteContext _localctx = new Esq_fuenteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_esq_fuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ESQUEMA);
			setState(28);
			match(FUENTE);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				match(IDENT);
				setState(30);
				match(PA);
				setState(31);
				parametros();
				setState(32);
				match(PC);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode IDENT_MAYUS() { return getToken(Anasint.IDENT_MAYUS, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(IDENT_MAYUS);
				setState(39);
				match(COMA);
				setState(40);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(IDENT_MAYUS);
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

	public static class Datos_fuenteContext extends ParserRuleContext {
		public TerminalNode DATOS() { return getToken(Anasint.DATOS, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public List<DatosContext> datos() {
			return getRuleContexts(DatosContext.class);
		}
		public DatosContext datos(int i) {
			return getRuleContext(DatosContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public Datos_fuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos_fuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDatos_fuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDatos_fuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDatos_fuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datos_fuenteContext datos_fuente() throws RecognitionException {
		Datos_fuenteContext _localctx = new Datos_fuenteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_datos_fuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(DATOS);
			setState(45);
			match(FUENTE);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(IDENT);
				setState(47);
				match(PA);
				setState(48);
				datos();
				setState(49);
				match(PC);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class DatosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public DatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatosContext datos() throws RecognitionException {
		DatosContext _localctx = new DatosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datos);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				match(COMA);
				setState(57);
				datos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Esq_destinoContext extends ParserRuleContext {
		public TerminalNode ESQUEMA() { return getToken(Anasint.ESQUEMA, 0); }
		public TerminalNode DESTINO() { return getToken(Anasint.DESTINO, 0); }
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public Esq_destinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esq_destino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEsq_destino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEsq_destino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEsq_destino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Esq_destinoContext esq_destino() throws RecognitionException {
		Esq_destinoContext _localctx = new Esq_destinoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_esq_destino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ESQUEMA);
			setState(62);
			match(DESTINO);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(IDENT);
				setState(64);
				match(PA);
				setState(65);
				parametros();
				setState(66);
				match(PC);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class RestrContext extends ParserRuleContext {
		public TerminalNode RESTRICCIONES() { return getToken(Anasint.RESTRICCIONES, 0); }
		public List<RestriccionContext> restriccion() {
			return getRuleContexts(RestriccionContext.class);
		}
		public RestriccionContext restriccion(int i) {
			return getRuleContext(RestriccionContext.class,i);
		}
		public RestrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRestr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRestr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRestr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestrContext restr() throws RecognitionException {
		RestrContext _localctx = new RestrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(RESTRICCIONES);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				restriccion();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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

	public static class RestriccionContext extends ParserRuleContext {
		public Decl_varsContext decl_vars() {
			return getRuleContext(Decl_varsContext.class,0);
		}
		public ImplicacionContext implicacion() {
			return getRuleContext(ImplicacionContext.class,0);
		}
		public RestriccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRestriccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRestriccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRestriccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionContext restriccion() throws RecognitionException {
		RestriccionContext _localctx = new RestriccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_restriccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			decl_vars();
			setState(79);
			implicacion();
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

	public static class Decl_varsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(VAR);
			setState(82);
			variables();
			setState(83);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
		enterRule(_localctx, 18, RULE_variables);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(IDENT);
				setState(86);
				match(COMA);
				setState(87);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(IDENT);
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

	public static class ImplicacionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public TerminalNode IMPLICA() { return getToken(Anasint.IMPLICA, 0); }
		public ImplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterImplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitImplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitImplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicacionContext implicacion() throws RecognitionException {
		ImplicacionContext _localctx = new ImplicacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_implicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IDENT);
			setState(92);
			match(PA);
			setState(93);
			variables();
			setState(94);
			match(PC);
			setState(95);
			match(IMPLICA);
			setState(96);
			match(IDENT);
			setState(97);
			match(PA);
			setState(98);
			variables();
			setState(99);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3%\n\3\r\3\16"+
		"\3&\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\66\n\5\r"+
		"\5\16\5\67\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7G\n"+
		"\7\r\7\16\7H\3\b\3\b\6\bM\n\b\r\b\16\bN\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\21\21\23\23\2c\2\30\3\2"+
		"\2\2\4\35\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16J\3\2"+
		"\2\2\20P\3\2\2\2\22S\3\2\2\2\24[\3\2\2\2\26]\3\2\2\2\30\31\5\4\3\2\31"+
		"\32\5\b\5\2\32\33\5\f\7\2\33\34\5\16\b\2\34\3\3\2\2\2\35\36\7\6\2\2\36"+
		"$\7\7\2\2\37 \7\23\2\2 !\7\16\2\2!\"\5\6\4\2\"#\7\17\2\2#%\3\2\2\2$\37"+
		"\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2()\7\22\2\2)*\7\r\2"+
		"\2*-\5\6\4\2+-\7\22\2\2,(\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7\b\2\2/\65\7"+
		"\7\2\2\60\61\7\23\2\2\61\62\7\16\2\2\62\63\5\n\6\2\63\64\7\17\2\2\64\66"+
		"\3\2\2\2\65\60\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2"+
		"\2\29:\t\2\2\2:;\7\r\2\2;>\5\n\6\2<>\t\2\2\2=9\3\2\2\2=<\3\2\2\2>\13\3"+
		"\2\2\2?@\7\6\2\2@F\7\t\2\2AB\7\23\2\2BC\7\16\2\2CD\5\6\4\2DE\7\17\2\2"+
		"EG\3\2\2\2FA\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\r\3\2\2\2JL\7\n\2"+
		"\2KM\5\20\t\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PQ\5"+
		"\22\n\2QR\5\26\f\2R\21\3\2\2\2ST\7\f\2\2TU\5\24\13\2UV\7\20\2\2V\23\3"+
		"\2\2\2WX\7\23\2\2XY\7\r\2\2Y\\\5\24\13\2Z\\\7\23\2\2[W\3\2\2\2[Z\3\2\2"+
		"\2\\\25\3\2\2\2]^\7\23\2\2^_\7\16\2\2_`\5\24\13\2`a\7\17\2\2ab\7\13\2"+
		"\2bc\7\23\2\2cd\7\16\2\2de\5\24\13\2ef\7\17\2\2f\27\3\2\2\2\t&,\67=HN"+
		"[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}