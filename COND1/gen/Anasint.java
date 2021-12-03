// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/COND1/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, PROGRAMA=4, VARIABLES=5, INSTRUCCIONES=6, 
		RUPTURA=7, MOSTRAR=8, ENTONCES=9, FINSI=10, SINO=11, MAYOR=12, MENOR=13, 
		IGUAL=14, DISTINTO=15, MAYORIGUAL=16, MENORIGUAL=17, MAS=18, MENOS=19, 
		POR=20, PUNTOYCOMA=21, COMA=22, ASIG=23, SI=24, PARENTESISABIERTO=25, 
		PARENTESISCERRADO=26, NUM=27, VAR=28, NUMERO=29, IDENT=30, COMENT_BLOQUE=31, 
		COMENT_LINEA=32;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_lista_vars = 2, RULE_instrucciones = 3, 
		RULE_lista_instrs = 4, RULE_instruccion = 5, RULE_asignacion = 6, RULE_condicional = 7, 
		RULE_alternativa = 8, RULE_ruptura = 9, RULE_impresion = 10, RULE_vars = 11, 
		RULE_condicion = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "lista_vars", "instrucciones", "lista_instrs", 
			"instruccion", "asignacion", "condicional", "alternativa", "ruptura", 
			"impresion", "vars", "condicion", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'INSTRUCCIONES'", 
			"'ruptura'", "'mostrar'", "'entonces'", "'finsi'", "'sino'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "';'", "','", "'='", 
			"'si'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "INSTRUCCIONES", 
			"RUPTURA", "MOSTRAR", "ENTONCES", "FINSI", "SINO", "MAYOR", "MENOR", 
			"IGUAL", "DISTINTO", "MAYORIGUAL", "MENORIGUAL", "MAS", "MENOS", "POR", 
			"PUNTOYCOMA", "COMA", "ASIG", "SI", "PARENTESISABIERTO", "PARENTESISCERRADO", 
			"NUM", "VAR", "NUMERO", "IDENT", "COMENT_BLOQUE", "COMENT_LINEA"
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
		public TerminalNode PROGRAMA() { return getToken(Anasint.PROGRAMA, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
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
			match(PROGRAMA);
			setState(29);
			variables();
			setState(30);
			instrucciones();
			setState(31);
			match(EOF);
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
		public TerminalNode PUNTOYCOMA() { return getToken(Anasint.PUNTOYCOMA, 0); }
		public Lista_varsContext lista_vars() {
			return getRuleContext(Lista_varsContext.class,0);
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
			setState(33);
			match(VARIABLES);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(34);
				lista_vars();
				}
			}

			setState(37);
			match(PUNTOYCOMA);
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

	public static class Lista_varsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Lista_varsContext lista_vars() {
			return getRuleContext(Lista_varsContext.class,0);
		}
		public Lista_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_varsContext lista_vars() throws RecognitionException {
		Lista_varsContext _localctx = new Lista_varsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_vars);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(VAR);
				setState(40);
				match(COMA);
				setState(41);
				lista_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(VAR);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public Lista_instrsContext lista_instrs() {
			return getRuleContext(Lista_instrsContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(INSTRUCCIONES);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RUPTURA) | (1L << MOSTRAR) | (1L << SI) | (1L << VAR))) != 0)) {
				{
				setState(46);
				lista_instrs();
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

	public static class Lista_instrsContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Lista_instrsContext lista_instrs() {
			return getRuleContext(Lista_instrsContext.class,0);
		}
		public Lista_instrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_instrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_instrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_instrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_instrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_instrsContext lista_instrs() throws RecognitionException {
		Lista_instrsContext _localctx = new Lista_instrsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_instrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			instruccion();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RUPTURA) | (1L << MOSTRAR) | (1L << SI) | (1L << VAR))) != 0)) {
				{
				setState(50);
				lista_instrs();
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

	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RupturaContext ruptura() {
			return getRuleContext(RupturaContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruccion);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				asignacion();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				condicional();
				}
				break;
			case RUPTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				ruptura();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				impresion();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode ASIG() { return getToken(Anasint.ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(Anasint.PUNTOYCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VAR);
			setState(60);
			match(ASIG);
			setState(61);
			expr(0);
			setState(62);
			match(PUNTOYCOMA);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Anasint.SI, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode ENTONCES() { return getToken(Anasint.ENTONCES, 0); }
		public Lista_instrsContext lista_instrs() {
			return getRuleContext(Lista_instrsContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(Anasint.FINSI, 0); }
		public AlternativaContext alternativa() {
			return getRuleContext(AlternativaContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SI);
			setState(65);
			match(PARENTESISABIERTO);
			setState(66);
			condicion();
			setState(67);
			match(PARENTESISCERRADO);
			setState(68);
			match(ENTONCES);
			setState(69);
			lista_instrs();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(70);
				alternativa();
				}
			}

			setState(73);
			match(FINSI);
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

	public static class AlternativaContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(Anasint.SINO, 0); }
		public Lista_instrsContext lista_instrs() {
			return getRuleContext(Lista_instrsContext.class,0);
		}
		public AlternativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAlternativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAlternativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAlternativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativaContext alternativa() throws RecognitionException {
		AlternativaContext _localctx = new AlternativaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alternativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(SINO);
			setState(76);
			lista_instrs();
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

	public static class RupturaContext extends ParserRuleContext {
		public TerminalNode RUPTURA() { return getToken(Anasint.RUPTURA, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(Anasint.PUNTOYCOMA, 0); }
		public RupturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruptura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRuptura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRuptura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRuptura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RupturaContext ruptura() throws RecognitionException {
		RupturaContext _localctx = new RupturaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruptura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(RUPTURA);
			setState(79);
			match(PUNTOYCOMA);
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

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(Anasint.MOSTRAR, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(Anasint.PUNTOYCOMA, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MOSTRAR);
			setState(82);
			match(PARENTESISABIERTO);
			setState(83);
			vars();
			setState(84);
			match(PARENTESISCERRADO);
			setState(85);
			match(PUNTOYCOMA);
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

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vars);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(VAR);
				setState(88);
				match(COMA);
				setState(89);
				vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(VAR);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(Anasint.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Anasint.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(Anasint.DISTINTO, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Anasint.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Anasint.MENORIGUAL, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicion);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				expr(0);
				setState(94);
				match(MAYOR);
				setState(95);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				expr(0);
				setState(98);
				match(MENOR);
				setState(99);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				expr(0);
				setState(102);
				match(IGUAL);
				setState(103);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				expr(0);
				setState(106);
				match(DISTINTO);
				setState(107);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				expr(0);
				setState(110);
				match(MAYORIGUAL);
				setState(111);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				expr(0);
				setState(114);
				match(MENORIGUAL);
				setState(115);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(120);
				match(VAR);
				}
				break;
			case NUM:
				{
				setState(121);
				match(NUM);
				}
				break;
			case PARENTESISABIERTO:
				{
				setState(122);
				match(PARENTESISABIERTO);
				setState(123);
				expr(0);
				setState(124);
				match(PARENTESISCERRADO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						match(MAS);
						setState(130);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						match(MENOS);
						setState(133);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						match(POR);
						setState(136);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(141);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5"+
		"\3&\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\5\5\62\n\5\3\6\3\6\5"+
		"\6\66\n\6\3\7\3\7\3\7\3\7\5\7<\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tJ\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r^\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0081"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008c\n\17\f\17"+
		"\16\17\u008f\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u0095\2\36\3\2\2\2\4#\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n\63\3\2\2"+
		"\2\f;\3\2\2\2\16=\3\2\2\2\20B\3\2\2\2\22M\3\2\2\2\24P\3\2\2\2\26S\3\2"+
		"\2\2\30]\3\2\2\2\32w\3\2\2\2\34\u0080\3\2\2\2\36\37\7\6\2\2\37 \5\4\3"+
		"\2 !\5\b\5\2!\"\7\2\2\3\"\3\3\2\2\2#%\7\7\2\2$&\5\6\4\2%$\3\2\2\2%&\3"+
		"\2\2\2&\'\3\2\2\2\'(\7\27\2\2(\5\3\2\2\2)*\7\36\2\2*+\7\30\2\2+.\5\6\4"+
		"\2,.\7\36\2\2-)\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\61\7\b\2\2\60\62\5\n\6\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\65\5\f\7\2\64\66\5\n\6\2"+
		"\65\64\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\67<\5\16\b\28<\5\20\t\29<\5"+
		"\24\13\2:<\5\26\f\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\r\3\2\2"+
		"\2=>\7\36\2\2>?\7\31\2\2?@\5\34\17\2@A\7\27\2\2A\17\3\2\2\2BC\7\32\2\2"+
		"CD\7\33\2\2DE\5\32\16\2EF\7\34\2\2FG\7\13\2\2GI\5\n\6\2HJ\5\22\n\2IH\3"+
		"\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\f\2\2L\21\3\2\2\2MN\7\r\2\2NO\5\n\6\2O"+
		"\23\3\2\2\2PQ\7\t\2\2QR\7\27\2\2R\25\3\2\2\2ST\7\n\2\2TU\7\33\2\2UV\5"+
		"\30\r\2VW\7\34\2\2WX\7\27\2\2X\27\3\2\2\2YZ\7\36\2\2Z[\7\30\2\2[^\5\30"+
		"\r\2\\^\7\36\2\2]Y\3\2\2\2]\\\3\2\2\2^\31\3\2\2\2_`\5\34\17\2`a\7\16\2"+
		"\2ab\5\34\17\2bx\3\2\2\2cd\5\34\17\2de\7\17\2\2ef\5\34\17\2fx\3\2\2\2"+
		"gh\5\34\17\2hi\7\20\2\2ij\5\34\17\2jx\3\2\2\2kl\5\34\17\2lm\7\21\2\2m"+
		"n\5\34\17\2nx\3\2\2\2op\5\34\17\2pq\7\22\2\2qr\5\34\17\2rx\3\2\2\2st\5"+
		"\34\17\2tu\7\23\2\2uv\5\34\17\2vx\3\2\2\2w_\3\2\2\2wc\3\2\2\2wg\3\2\2"+
		"\2wk\3\2\2\2wo\3\2\2\2ws\3\2\2\2x\33\3\2\2\2yz\b\17\1\2z\u0081\7\36\2"+
		"\2{\u0081\7\35\2\2|}\7\33\2\2}~\5\34\17\2~\177\7\34\2\2\177\u0081\3\2"+
		"\2\2\u0080y\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\u008d\3\2\2\2"+
		"\u0082\u0083\f\b\2\2\u0083\u0084\7\24\2\2\u0084\u008c\5\34\17\t\u0085"+
		"\u0086\f\7\2\2\u0086\u0087\7\25\2\2\u0087\u008c\5\34\17\b\u0088\u0089"+
		"\f\6\2\2\u0089\u008a\7\26\2\2\u008a\u008c\5\34\17\7\u008b\u0082\3\2\2"+
		"\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\35\3\2\2\2\u008f\u008d\3\2\2\2\r%-"+
		"\61\65;I]w\u0080\u008b\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}