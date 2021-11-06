// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/LEXCHANGE/src\Anasint.g4 by ANTLR 4.8
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
		IDENT=16, COMENTARIO_BLOQUE=17, COMENTARIO_LINEA=18;
	public static final int
		RULE_programa = 0, RULE_esq_fuente = 1, RULE_clases = 2, RULE_elements = 3, 
		RULE_datos_fuente = 4, RULE_datos = 5, RULE_atribs = 6, RULE_esq_destino = 7, 
		RULE_restr = 8, RULE_restriccion = 9, RULE_decl_vars = 10, RULE_variables = 11, 
		RULE_implicacion = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "esq_fuente", "clases", "elements", "datos_fuente", "datos", 
			"atribs", "esq_destino", "restr", "restriccion", "decl_vars", "variables", 
			"implicacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'ESQUEMA'", "'FUENTE'", "'DATOS'", "'DESTINO'", 
			"'RESTRICCIONES'", "'implica'", "'VAR'", "','", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "ESQUEMA", "FUENTE", "DATOS", 
			"DESTINO", "RESTRICCIONES", "IMPLICA", "VAR", "COMA", "PA", "PC", "PyC", 
			"NUMERO", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			esq_fuente();
			setState(27);
			datos_fuente();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESQUEMA) {
				{
				setState(28);
				esq_destino();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTRICCIONES) {
				{
				setState(31);
				restr();
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

	public static class Esq_fuenteContext extends ParserRuleContext {
		public TerminalNode ESQUEMA() { return getToken(Anasint.ESQUEMA, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<ClasesContext> clases() {
			return getRuleContexts(ClasesContext.class);
		}
		public ClasesContext clases(int i) {
			return getRuleContext(ClasesContext.class,i);
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
			setState(34);
			match(ESQUEMA);
			setState(35);
			match(FUENTE);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				clases();
				}
				}
				setState(39); 
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

	public static class ClasesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ClasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterClases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitClases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitClases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasesContext clases() throws RecognitionException {
		ClasesContext _localctx = new ClasesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IDENT);
			setState(42);
			match(PA);
			setState(43);
			elements();
			setState(44);
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

	public static class ElementsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elements);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(IDENT);
				setState(47);
				match(COMA);
				setState(48);
				elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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

	public static class Datos_fuenteContext extends ParserRuleContext {
		public TerminalNode DATOS() { return getToken(Anasint.DATOS, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<DatosContext> datos() {
			return getRuleContexts(DatosContext.class);
		}
		public DatosContext datos(int i) {
			return getRuleContext(DatosContext.class,i);
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
		enterRule(_localctx, 8, RULE_datos_fuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DATOS);
			setState(53);
			match(FUENTE);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				datos();
				}
				}
				setState(57); 
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
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public AtribsContext atribs() {
			return getRuleContext(AtribsContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
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
		enterRule(_localctx, 10, RULE_datos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENT);
			setState(60);
			match(PA);
			setState(61);
			atribs();
			setState(62);
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

	public static class AtribsContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public AtribsContext atribs() {
			return getRuleContext(AtribsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public AtribsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAtribs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAtribs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAtribs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribsContext atribs() throws RecognitionException {
		AtribsContext _localctx = new AtribsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribs);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(COMA);
				setState(66);
				atribs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
		public List<ClasesContext> clases() {
			return getRuleContexts(ClasesContext.class);
		}
		public ClasesContext clases(int i) {
			return getRuleContext(ClasesContext.class,i);
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
		enterRule(_localctx, 14, RULE_esq_destino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ESQUEMA);
			setState(71);
			match(DESTINO);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				clases();
				}
				}
				setState(75); 
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
		enterRule(_localctx, 16, RULE_restr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(RESTRICCIONES);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				restriccion();
				}
				}
				setState(81); 
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
		enterRule(_localctx, 18, RULE_restriccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			decl_vars();
			setState(84);
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
		enterRule(_localctx, 20, RULE_decl_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR);
			setState(87);
			variables();
			setState(88);
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
		enterRule(_localctx, 22, RULE_variables);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(IDENT);
				setState(91);
				match(COMA);
				setState(92);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
		enterRule(_localctx, 24, RULE_implicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENT);
			setState(97);
			match(PA);
			setState(98);
			variables();
			setState(99);
			match(PC);
			setState(100);
			match(IMPLICA);
			setState(101);
			match(IDENT);
			setState(102);
			match(PA);
			setState(103);
			variables();
			setState(104);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\2\5\2#\n\2\3\3\3\3\3\3"+
		"\6\3(\n\3\r\3\16\3)\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\65\n\5\3\6"+
		"\3\6\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bG\n"+
		"\b\3\t\3\t\3\t\6\tL\n\t\r\t\16\tM\3\n\3\n\6\nR\n\n\r\n\16\nS\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\ra\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\3\3\2\21\22\2h\2\34\3\2\2\2\4$\3\2\2\2\6+\3\2\2\2\b\64\3\2\2\2\n\66"+
		"\3\2\2\2\f=\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22O\3\2\2\2\24U\3\2\2\2\26"+
		"X\3\2\2\2\30`\3\2\2\2\32b\3\2\2\2\34\35\5\4\3\2\35\37\5\n\6\2\36 \5\20"+
		"\t\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#\5\22\n\2\"!\3\2\2\2\"#\3\2"+
		"\2\2#\3\3\2\2\2$%\7\6\2\2%\'\7\7\2\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+,\7\22\2\2,-\7\16\2\2-.\5\b\5\2./\7\17\2"+
		"\2/\7\3\2\2\2\60\61\7\22\2\2\61\62\7\r\2\2\62\65\5\b\5\2\63\65\7\22\2"+
		"\2\64\60\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66\67\7\b\2\2\679\7\7\2\2"+
		"8:\5\f\7\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=>\7\22"+
		"\2\2>?\7\16\2\2?@\5\16\b\2@A\7\17\2\2A\r\3\2\2\2BC\t\2\2\2CD\7\r\2\2D"+
		"G\5\16\b\2EG\t\2\2\2FB\3\2\2\2FE\3\2\2\2G\17\3\2\2\2HI\7\6\2\2IK\7\t\2"+
		"\2JL\5\6\4\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OQ\7\n"+
		"\2\2PR\5\24\13\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\23\3\2\2\2U"+
		"V\5\26\f\2VW\5\32\16\2W\25\3\2\2\2XY\7\f\2\2YZ\5\30\r\2Z[\7\20\2\2[\27"+
		"\3\2\2\2\\]\7\22\2\2]^\7\r\2\2^a\5\30\r\2_a\7\22\2\2`\\\3\2\2\2`_\3\2"+
		"\2\2a\31\3\2\2\2bc\7\22\2\2cd\7\16\2\2de\5\30\r\2ef\7\17\2\2fg\7\13\2"+
		"\2gh\7\22\2\2hi\7\16\2\2ij\5\30\r\2jk\7\17\2\2k\33\3\2\2\2\13\37\")\64"+
		";FMS`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}