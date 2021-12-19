// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/Diagramas_de_Estados/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, DIAGRAMA=4, VARIABLES=5, ESTADOS=6, 
		INICIAL=7, TRANSICIONES=8, MAYOR=9, MENOR=10, IGUAL=11, DISTINTO=12, MAYORIGUAL=13, 
		MENORIGUAL=14, MAS=15, MENOS=16, POR=17, PUNTOYCOMA=18, COMA=19, ASIG=20, 
		Y=21, O=22, NO=23, PARENTESISABIERTO=24, PARENTESISCERRADO=25, NUMERO=26, 
		IDENT=27, COMENT_BLOQUE=28, COMENT_LINEA=29;
	public static final int
		RULE_diagrama = 0, RULE_variables = 1, RULE_vars = 2, RULE_estados = 3, 
		RULE_estado = 4, RULE_asignaciones = 5, RULE_asignacion = 6, RULE_inicial = 7, 
		RULE_transiciones = 8, RULE_transicion = 9, RULE_condicion = 10, RULE_term = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"diagrama", "variables", "vars", "estados", "estado", "asignaciones", 
			"asignacion", "inicial", "transiciones", "transicion", "condicion", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'DIAGRAMA'", "'VARIABLES'", "'ESTADOS'", 
			"'INICIAL'", "'TRANSICIONES'", "'>'", "'<'", "'=='", "'!='", "'>='", 
			"'<='", "'+'", "'-'", "'*'", "';'", "','", "'='", "'Y'", "'O'", "'NO'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "DIAGRAMA", "VARIABLES", "ESTADOS", 
			"INICIAL", "TRANSICIONES", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "MAYORIGUAL", 
			"MENORIGUAL", "MAS", "MENOS", "POR", "PUNTOYCOMA", "COMA", "ASIG", "Y", 
			"O", "NO", "PARENTESISABIERTO", "PARENTESISCERRADO", "NUMERO", "IDENT", 
			"COMENT_BLOQUE", "COMENT_LINEA"
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

	public static class DiagramaContext extends ParserRuleContext {
		public TerminalNode DIAGRAMA() { return getToken(Anasint.DIAGRAMA, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public InicialContext inicial() {
			return getRuleContext(InicialContext.class,0);
		}
		public TransicionesContext transiciones() {
			return getRuleContext(TransicionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public DiagramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagrama; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDiagrama(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDiagrama(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDiagrama(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagramaContext diagrama() throws RecognitionException {
		DiagramaContext _localctx = new DiagramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_diagrama);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DIAGRAMA);
			setState(25);
			match(IDENT);
			setState(26);
			variables();
			setState(27);
			estados();
			setState(28);
			inicial();
			setState(29);
			transiciones();
			setState(30);
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
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(VARIABLES);
			setState(33);
			vars();
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
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
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
		enterRule(_localctx, 4, RULE_vars);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(IDENT);
				setState(36);
				vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
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

	public static class EstadosContext extends ParserRuleContext {
		public TerminalNode ESTADOS() { return getToken(Anasint.ESTADOS, 0); }
		public List<EstadoContext> estado() {
			return getRuleContexts(EstadoContext.class);
		}
		public EstadoContext estado(int i) {
			return getRuleContext(EstadoContext.class,i);
		}
		public EstadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEstados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEstados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEstados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadosContext estados() throws RecognitionException {
		EstadosContext _localctx = new EstadosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ESTADOS);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(41);
				estado();
				}
				}
				setState(46);
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

	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEstado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEstado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IDENT);
			setState(48);
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

	public static class AsignacionesContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
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
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				asignacion();
				setState(51);
				asignaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode ASIG() { return getToken(Anasint.ASIG, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
			setState(56);
			match(IDENT);
			setState(57);
			match(ASIG);
			setState(58);
			term();
			setState(59);
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

	public static class InicialContext extends ParserRuleContext {
		public TerminalNode INICIAL() { return getToken(Anasint.INICIAL, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(INICIAL);
			setState(62);
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

	public static class TransicionesContext extends ParserRuleContext {
		public TerminalNode TRANSICIONES() { return getToken(Anasint.TRANSICIONES, 0); }
		public List<TransicionContext> transicion() {
			return getRuleContexts(TransicionContext.class);
		}
		public TransicionContext transicion(int i) {
			return getRuleContext(TransicionContext.class,i);
		}
		public TransicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTransiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTransiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTransiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransicionesContext transiciones() throws RecognitionException {
		TransicionesContext _localctx = new TransicionesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TRANSICIONES);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(65);
				transicion();
				}
				}
				setState(70);
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

	public static class TransicionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(Anasint.PUNTOYCOMA, 0); }
		public TransicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTransicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTransicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTransicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransicionContext transicion() throws RecognitionException {
		TransicionContext _localctx = new TransicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENT);
			setState(72);
			match(IDENT);
			setState(73);
			condicion(0);
			setState(74);
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondParContext extends CondicionContext {
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public CondParContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondMayorContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(Anasint.MAYOR, 0); }
		public CondMayorContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIgualContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public CondIgualContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondYContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode Y() { return getToken(Anasint.Y, 0); }
		public CondYContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondMenorIgualContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MENORIGUAL() { return getToken(Anasint.MENORIGUAL, 0); }
		public CondMenorIgualContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondMayorIgualContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MAYORIGUAL() { return getToken(Anasint.MAYORIGUAL, 0); }
		public CondMayorIgualContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode O() { return getToken(Anasint.O, 0); }
		public CondOContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNoContext extends CondicionContext {
		public TerminalNode NO() { return getToken(Anasint.NO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondNoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondDistintoContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode DISTINTO() { return getToken(Anasint.DISTINTO, 0); }
		public CondDistintoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondDistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondDistinto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondDistinto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondMenorContext extends CondicionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(Anasint.MENOR, 0); }
		public CondMenorContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new CondNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(NO);
				setState(78);
				condicion(8);
				}
				break;
			case 2:
				{
				_localctx = new CondParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(PARENTESISABIERTO);
				setState(80);
				condicion(0);
				setState(81);
				match(PARENTESISCERRADO);
				}
				break;
			case 3:
				{
				_localctx = new CondMayorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				term();
				setState(84);
				match(MAYOR);
				setState(85);
				term();
				}
				break;
			case 4:
				{
				_localctx = new CondMenorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				term();
				setState(88);
				match(MENOR);
				setState(89);
				term();
				}
				break;
			case 5:
				{
				_localctx = new CondIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				term();
				setState(92);
				match(IGUAL);
				setState(93);
				term();
				}
				break;
			case 6:
				{
				_localctx = new CondDistintoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				term();
				setState(96);
				match(DISTINTO);
				setState(97);
				term();
				}
				break;
			case 7:
				{
				_localctx = new CondMayorIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				term();
				setState(100);
				match(MAYORIGUAL);
				setState(101);
				term();
				}
				break;
			case 8:
				{
				_localctx = new CondMenorIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				term();
				setState(104);
				match(MENORIGUAL);
				setState(105);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondYContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(109);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(110);
						match(Y);
						setState(111);
						condicion(11);
						}
						break;
					case 2:
						{
						_localctx = new CondOContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(112);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(113);
						match(O);
						setState(114);
						condicion(10);
						}
						break;
					}
					} 
				}
				setState(119);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\5\4)\n\4\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\79\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\nE\n\n\f\n\16\n"+
		"H\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fn\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fv\n\f\f\f\16\fy\13"+
		"\f\3\r\3\r\3\r\2\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\34\35\2"+
		"}\2\32\3\2\2\2\4\"\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\61\3\2\2\2\f8\3\2\2"+
		"\2\16:\3\2\2\2\20?\3\2\2\2\22B\3\2\2\2\24I\3\2\2\2\26m\3\2\2\2\30z\3\2"+
		"\2\2\32\33\7\6\2\2\33\34\7\35\2\2\34\35\5\4\3\2\35\36\5\b\5\2\36\37\5"+
		"\20\t\2\37 \5\22\n\2 !\7\2\2\3!\3\3\2\2\2\"#\7\7\2\2#$\5\6\4\2$\5\3\2"+
		"\2\2%&\7\35\2\2&)\5\6\4\2\')\7\35\2\2(%\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2"+
		"*.\7\b\2\2+-\5\n\6\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2"+
		"\2\2\60.\3\2\2\2\61\62\7\35\2\2\62\63\5\f\7\2\63\13\3\2\2\2\64\65\5\16"+
		"\b\2\65\66\5\f\7\2\669\3\2\2\2\679\3\2\2\28\64\3\2\2\28\67\3\2\2\29\r"+
		"\3\2\2\2:;\7\35\2\2;<\7\26\2\2<=\5\30\r\2=>\7\24\2\2>\17\3\2\2\2?@\7\t"+
		"\2\2@A\7\35\2\2A\21\3\2\2\2BF\7\n\2\2CE\5\24\13\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\23\3\2\2\2HF\3\2\2\2IJ\7\35\2\2JK\7\35\2\2KL\5\26"+
		"\f\2LM\7\24\2\2M\25\3\2\2\2NO\b\f\1\2OP\7\31\2\2Pn\5\26\f\nQR\7\32\2\2"+
		"RS\5\26\f\2ST\7\33\2\2Tn\3\2\2\2UV\5\30\r\2VW\7\13\2\2WX\5\30\r\2Xn\3"+
		"\2\2\2YZ\5\30\r\2Z[\7\f\2\2[\\\5\30\r\2\\n\3\2\2\2]^\5\30\r\2^_\7\r\2"+
		"\2_`\5\30\r\2`n\3\2\2\2ab\5\30\r\2bc\7\16\2\2cd\5\30\r\2dn\3\2\2\2ef\5"+
		"\30\r\2fg\7\17\2\2gh\5\30\r\2hn\3\2\2\2ij\5\30\r\2jk\7\20\2\2kl\5\30\r"+
		"\2ln\3\2\2\2mN\3\2\2\2mQ\3\2\2\2mU\3\2\2\2mY\3\2\2\2m]\3\2\2\2ma\3\2\2"+
		"\2me\3\2\2\2mi\3\2\2\2nw\3\2\2\2op\f\f\2\2pq\7\27\2\2qv\5\26\f\rrs\f\13"+
		"\2\2st\7\30\2\2tv\5\26\f\fuo\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2x\27\3\2\2\2yw\3\2\2\2z{\t\2\2\2{\31\3\2\2\2\t(.8Fmuw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}