// Generated from C:/Users/amigo/IdeaProjects/Proyecto en grupo\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, LOG=5, SEQ=6, PA=7, PC=8, CA=9, 
		CC=10, DOSPUNTOS=11, PyC=12, COMA=13, SUMA=14, RESTA=15, POR=16, AND=17, 
		OR=18, NOT=19, IGUAL=20, IGUALIGUAL=21, DISTINTO=22, MAYOR=23, MENOR=24, 
		MENORIGUAL=25, MAYORIGUAL=26, HACER=27, FALSO=28, VERDADERO=29, INDEFINIDO=30, 
		DEV=31, SI=32, ENTONCES=33, FSI=34, SINO=35, RUPTURA=36, MIENTRAS=37, 
		FMIENTRAS=38, NUMERO=39, VARIABLES=40, FUNCION=41, FFUNCION=42, PROCEDIMIENTO=43, 
		FPROCEDIMIENTO=44, MOSTRAR=45, INSTRUCCIONES=46, IDENT=47, COMENTARIO_BLOQUE=48, 
		COMENTARIO_LINEA=49;
	public static final int
		RULE_programa = 0, RULE_subprogramas = 1, RULE_funcion = 2, RULE_procedimiento = 3, 
		RULE_entradas = 4, RULE_salidas = 5, RULE_predicado = 6, RULE_variables = 7, 
		RULE_vars = 8, RULE_nombreVariable = 9, RULE_tipo = 10, RULE_secuencia = 11, 
		RULE_instrucciones = 12, RULE_instruccion = 13, RULE_asignacion = 14, 
		RULE_expresion = 15, RULE_expresion_entera = 16, RULE_llamada_funcion = 17, 
		RULE_llamada_secuencia = 18, RULE_expresion_secuencia_entera = 19, RULE_expresion_secuencia_logica = 20, 
		RULE_expresion_logica = 21, RULE_condicionales = 22, RULE_condicion = 23, 
		RULE_condicional = 24, RULE_concatenar = 25, RULE_igualdades = 26, RULE_desigualdades = 27, 
		RULE_expresion_condicional = 28, RULE_iteracion = 29, RULE_ruptura = 30, 
		RULE_resultado = 31, RULE_valor_devuelto = 32, RULE_mostrar = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "subprogramas", "funcion", "procedimiento", "entradas", "salidas", 
			"predicado", "variables", "vars", "nombreVariable", "tipo", "secuencia", 
			"instrucciones", "instruccion", "asignacion", "expresion", "expresion_entera", 
			"llamada_funcion", "llamada_secuencia", "expresion_secuencia_entera", 
			"expresion_secuencia_logica", "expresion_logica", "condicionales", "condicion", 
			"condicional", "concatenar", "igualdades", "desigualdades", "expresion_condicional", 
			"iteracion", "ruptura", "resultado", "valor_devuelto", "mostrar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'LOG'", "'SEQ'", "'('", "')'", "'['", 
			"']'", "':'", "';'", "','", "'+'", "'-'", "'*'", "'&&'", "'||'", "'!'", 
			"'='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'hacer'", "'F'", 
			"'T'", "'unknown'", "'dev'", "'si'", "'entonces'", "'fsi'", "'sino'", 
			"'ruptura'", "'mientras'", "'fmientras'", null, "'VARIABLES'", "'FUNCION'", 
			"'FFUNCION'", "'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", "'mostrar'", "'INSTRUCCIONES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "LOG", "SEQ", "PA", 
			"PC", "CA", "CC", "DOSPUNTOS", "PyC", "COMA", "SUMA", "RESTA", "POR", 
			"AND", "OR", "NOT", "IGUAL", "IGUALIGUAL", "DISTINTO", "MAYOR", "MENOR", 
			"MENORIGUAL", "MAYORIGUAL", "HACER", "FALSO", "VERDADERO", "INDEFINIDO", 
			"DEV", "SI", "ENTONCES", "FSI", "SINO", "RUPTURA", "MIENTRAS", "FMIENTRAS", 
			"NUMERO", "VARIABLES", "FUNCION", "FFUNCION", "PROCEDIMIENTO", "FPROCEDIMIENTO", 
			"MOSTRAR", "INSTRUCCIONES", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		public SubprogramasContext subprogramas() {
			return getRuleContext(SubprogramasContext.class,0);
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
			setState(68);
			subprogramas();
			setState(69);
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

	public static class SubprogramasContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ProcedimientoContext procedimiento() {
			return getRuleContext(ProcedimientoContext.class,0);
		}
		public SubprogramasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSubprogramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSubprogramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSubprogramas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramasContext subprogramas() throws RecognitionException {
		SubprogramasContext _localctx = new SubprogramasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subprogramas);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				funcion();
				}
				break;
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				procedimiento();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(Anasint.FUNCION, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public EntradasContext entradas() {
			return getRuleContext(EntradasContext.class,0);
		}
		public List<TerminalNode> PC() { return getTokens(Anasint.PC); }
		public TerminalNode PC(int i) {
			return getToken(Anasint.PC, i);
		}
		public TerminalNode DEV() { return getToken(Anasint.DEV, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FFUNCION() { return getToken(Anasint.FFUNCION, 0); }
		public SalidasContext salidas() {
			return getRuleContext(SalidasContext.class,0);
		}
		public PredicadoContext predicado() {
			return getRuleContext(PredicadoContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUNCION);
			setState(76);
			match(IDENT);
			setState(77);
			match(PA);
			setState(78);
			entradas();
			setState(79);
			match(PC);
			setState(80);
			match(DEV);
			setState(81);
			match(PA);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case SEQ:
				{
				setState(82);
				salidas();
				}
				break;
			case LOG:
				{
				setState(83);
				predicado();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			match(PC);
			setState(87);
			variables();
			setState(88);
			instrucciones();
			setState(89);
			match(FFUNCION);
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

	public static class ProcedimientoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMIENTO() { return getToken(Anasint.PROCEDIMIENTO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public EntradasContext entradas() {
			return getRuleContext(EntradasContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FPROCEDIMIENTO() { return getToken(Anasint.FPROCEDIMIENTO, 0); }
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PROCEDIMIENTO);
			setState(92);
			match(IDENT);
			setState(93);
			match(PA);
			setState(94);
			entradas();
			setState(95);
			match(PC);
			setState(96);
			variables();
			setState(97);
			instrucciones();
			setState(98);
			match(FPROCEDIMIENTO);
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

	public static class EntradasContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public EntradasContext entradas() {
			return getRuleContext(EntradasContext.class,0);
		}
		public EntradasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEntradas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEntradas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEntradas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradasContext entradas() throws RecognitionException {
		EntradasContext _localctx = new EntradasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entradas);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOG:
			case SEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				tipo();
				setState(101);
				match(IDENT);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(102);
					match(COMA);
					setState(103);
					entradas();
					}
				}

				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SalidasContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public SecuenciaContext secuencia() {
			return getRuleContext(SecuenciaContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public SalidasContext salidas() {
			return getRuleContext(SalidasContext.class,0);
		}
		public SalidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salidas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSalidas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSalidas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSalidas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalidasContext salidas() throws RecognitionException {
		SalidasContext _localctx = new SalidasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(109);
				match(NUM);
				}
				break;
			case SEQ:
				{
				setState(110);
				secuencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(IDENT);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(114);
				match(COMA);
				setState(115);
				salidas();
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

	public static class PredicadoContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public PredicadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPredicado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPredicado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPredicado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicadoContext predicado() throws RecognitionException {
		PredicadoContext _localctx = new PredicadoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LOG);
			setState(119);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
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
		enterRule(_localctx, 14, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(VARIABLES);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(122);
				vars();
				}
				}
				setState(127);
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

	public static class VarsContext extends ParserRuleContext {
		public NombreVariableContext nombreVariable() {
			return getRuleContext(NombreVariableContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
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
		enterRule(_localctx, 16, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			nombreVariable();
			setState(129);
			match(DOSPUNTOS);
			setState(130);
			tipo();
			setState(131);
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

	public static class NombreVariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public NombreVariableContext nombreVariable() {
			return getRuleContext(NombreVariableContext.class,0);
		}
		public NombreVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterNombreVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitNombreVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitNombreVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreVariableContext nombreVariable() throws RecognitionException {
		NombreVariableContext _localctx = new NombreVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nombreVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENT);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(134);
				match(COMA);
				setState(135);
				nombreVariable();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public SecuenciaContext secuencia() {
			return getRuleContext(SecuenciaContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(NUM);
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(LOG);
				}
				break;
			case SEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				secuencia();
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

	public static class SecuenciaContext extends ParserRuleContext {
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public SecuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecuenciaContext secuencia() throws RecognitionException {
		SecuenciaContext _localctx = new SecuenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_secuencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SEQ);
			setState(144);
			match(PA);
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
		enterRule(_localctx, 24, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(INSTRUCCIONES);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEV) | (1L << SI) | (1L << RUPTURA) | (1L << MIENTRAS) | (1L << MOSTRAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(149);
				instruccion();
				}
				}
				setState(154);
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

	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public RupturaContext ruptura() {
			return getRuleContext(RupturaContext.class,0);
		}
		public ResultadoContext resultado() {
			return getRuleContext(ResultadoContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
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
		enterRule(_localctx, 26, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(155);
				asignacion();
				}
				break;
			case SI:
				{
				setState(156);
				condicionales();
				}
				break;
			case MIENTRAS:
				{
				setState(157);
				iteracion();
				}
				break;
			case RUPTURA:
				{
				setState(158);
				ruptura();
				}
				break;
			case DEV:
				{
				setState(159);
				resultado();
				}
				break;
			case MOSTRAR:
				{
				setState(160);
				mostrar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AsignacionContext extends ParserRuleContext {
		public NombreVariableContext nombreVariable() {
			return getRuleContext(NombreVariableContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
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
		enterRule(_localctx, 28, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			nombreVariable();
			setState(164);
			match(IGUAL);
			setState(165);
			expresion();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(166);
				match(COMA);
				setState(167);
				expresion();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_secuencia_logicaContext expresion_secuencia_logica() {
			return getRuleContext(Expresion_secuencia_logicaContext.class,0);
		}
		public Expresion_secuencia_enteraContext expresion_secuencia_entera() {
			return getRuleContext(Expresion_secuencia_enteraContext.class,0);
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
		enterRule(_localctx, 30, RULE_expresion);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				expresion_entera(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				expresion_logica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				expresion_secuencia_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				expresion_secuencia_entera();
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

	public static class Expresion_enteraContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Llamada_secuenciaContext llamada_secuencia() {
			return getRuleContext(Llamada_secuenciaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode RESTA() { return getToken(Anasint.RESTA, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public TerminalNode SUMA() { return getToken(Anasint.SUMA, 0); }
		public Expresion_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_enteraContext expresion_entera() throws RecognitionException {
		return expresion_entera(0);
	}

	private Expresion_enteraContext expresion_entera(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_enteraContext _localctx = new Expresion_enteraContext(_ctx, _parentState);
		Expresion_enteraContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresion_entera, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(182);
				match(PA);
				setState(183);
				expresion_entera(0);
				setState(184);
				match(PC);
				}
				break;
			case 2:
				{
				setState(186);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(187);
				llamada_secuencia();
				}
				break;
			case 4:
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESTA) {
					{
					setState(188);
					match(RESTA);
					}
				}

				setState(191);
				match(NUMERO);
				}
				break;
			case 5:
				{
				setState(192);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_enteraContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_entera);
					setState(195);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(196);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << POR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(197);
					expresion_entera(7);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENT);
			setState(204);
			match(PA);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << CA) | (1L << RESTA) | (1L << FALSO) | (1L << VERDADERO) | (1L << INDEFINIDO) | (1L << NUMERO) | (1L << IDENT))) != 0)) {
				{
				setState(205);
				expresion();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(206);
					match(COMA);
					setState(207);
					expresion();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(215);
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

	public static class Llamada_secuenciaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public Llamada_secuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLlamada_secuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLlamada_secuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLlamada_secuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_secuenciaContext llamada_secuencia() throws RecognitionException {
		Llamada_secuenciaContext _localctx = new Llamada_secuenciaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamada_secuencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENT);
			setState(218);
			match(CA);
			setState(219);
			expresion_entera(0);
			setState(220);
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

	public static class Expresion_secuencia_enteraContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Expresion_secuencia_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_secuencia_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_secuencia_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_secuencia_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_secuencia_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_secuencia_enteraContext expresion_secuencia_entera() throws RecognitionException {
		Expresion_secuencia_enteraContext _localctx = new Expresion_secuencia_enteraContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion_secuencia_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CA);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << RESTA) | (1L << NUMERO) | (1L << IDENT))) != 0)) {
				{
				setState(223);
				expresion_entera(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(224);
					match(COMA);
					setState(225);
					expresion_entera(0);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(233);
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

	public static class Expresion_secuencia_logicaContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Expresion_secuencia_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_secuencia_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_secuencia_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_secuencia_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_secuencia_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_secuencia_logicaContext expresion_secuencia_logica() throws RecognitionException {
		Expresion_secuencia_logicaContext _localctx = new Expresion_secuencia_logicaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_secuencia_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(CA);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << FALSO) | (1L << VERDADERO) | (1L << INDEFINIDO) | (1L << IDENT))) != 0)) {
				{
				setState(236);
				expresion_logica(0);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(237);
					match(COMA);
					setState(238);
					expresion_logica(0);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(246);
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Llamada_secuenciaContext llamada_secuencia() {
			return getRuleContext(Llamada_secuenciaContext.class,0);
		}
		public TerminalNode INDEFINIDO() { return getToken(Anasint.INDEFINIDO, 0); }
		public TerminalNode VERDADERO() { return getToken(Anasint.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(Anasint.FALSO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public TerminalNode OR() { return getToken(Anasint.OR, 0); }
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		return expresion_logica(0);
	}

	private Expresion_logicaContext expresion_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, _parentState);
		Expresion_logicaContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expresion_logica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(249);
				match(PA);
				setState(250);
				expresion_logica(0);
				setState(251);
				match(PC);
				}
				break;
			case 2:
				{
				setState(253);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(254);
				llamada_secuencia();
				}
				break;
			case 4:
				{
				setState(255);
				match(INDEFINIDO);
				}
				break;
			case 5:
				{
				setState(256);
				match(VERDADERO);
				}
				break;
			case 6:
				{
				setState(257);
				match(FALSO);
				}
				break;
			case 7:
				{
				setState(258);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica);
					setState(261);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(262);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(263);
					expresion_logica(9);
					}
					} 
				}
				setState(268);
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

	public static class CondicionalesContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Anasint.SI, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode ENTONCES() { return getToken(Anasint.ENTONCES, 0); }
		public TerminalNode FSI() { return getToken(Anasint.FSI, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode SINO() { return getToken(Anasint.SINO, 0); }
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicionales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(SI);
			setState(270);
			match(PA);
			setState(271);
			condicion();
			setState(272);
			match(PC);
			setState(273);
			match(ENTONCES);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEV) | (1L << SI) | (1L << RUPTURA) | (1L << MIENTRAS) | (1L << MOSTRAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(274);
				instruccion();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(280);
				match(SINO);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEV) | (1L << SI) | (1L << RUPTURA) | (1L << MIENTRAS) | (1L << MOSTRAR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(281);
					instruccion();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(289);
			match(FSI);
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
		public List<Expresion_condicionalContext> expresion_condicional() {
			return getRuleContexts(Expresion_condicionalContext.class);
		}
		public Expresion_condicionalContext expresion_condicional(int i) {
			return getRuleContext(Expresion_condicionalContext.class,i);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public List<ConcatenarContext> concatenar() {
			return getRuleContexts(ConcatenarContext.class);
		}
		public ConcatenarContext concatenar(int i) {
			return getRuleContext(ConcatenarContext.class,i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
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
		enterRule(_localctx, 46, RULE_condicion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expresion_condicional();
			setState(292);
			condicional();
			setState(293);
			expresion_condicional();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					concatenar();
					setState(295);
					condicion();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class CondicionalContext extends ParserRuleContext {
		public IgualdadesContext igualdades() {
			return getRuleContext(IgualdadesContext.class,0);
		}
		public DesigualdadesContext desigualdades() {
			return getRuleContext(DesigualdadesContext.class,0);
		}
		public ConcatenarContext concatenar() {
			return getRuleContext(ConcatenarContext.class,0);
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
		enterRule(_localctx, 48, RULE_condicional);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALIGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				igualdades();
				}
				break;
			case DISTINTO:
			case MAYOR:
			case MENOR:
			case MENORIGUAL:
			case MAYORIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				desigualdades();
				}
				break;
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				concatenar();
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

	public static class ConcatenarContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public TerminalNode OR() { return getToken(Anasint.OR, 0); }
		public TerminalNode NOT() { return getToken(Anasint.NOT, 0); }
		public ConcatenarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterConcatenar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitConcatenar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitConcatenar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenarContext concatenar() throws RecognitionException {
		ConcatenarContext _localctx = new ConcatenarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_concatenar);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(NOT);
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

	public static class IgualdadesContext extends ParserRuleContext {
		public TerminalNode IGUALIGUAL() { return getToken(Anasint.IGUALIGUAL, 0); }
		public IgualdadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIgualdades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIgualdades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIgualdades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadesContext igualdades() throws RecognitionException {
		IgualdadesContext _localctx = new IgualdadesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_igualdades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IGUALIGUAL);
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

	public static class DesigualdadesContext extends ParserRuleContext {
		public TerminalNode DISTINTO() { return getToken(Anasint.DISTINTO, 0); }
		public TerminalNode MAYOR() { return getToken(Anasint.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Anasint.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Anasint.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Anasint.MAYORIGUAL, 0); }
		public DesigualdadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigualdades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDesigualdades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDesigualdades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDesigualdades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesigualdadesContext desigualdades() throws RecognitionException {
		DesigualdadesContext _localctx = new DesigualdadesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_desigualdades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISTINTO) | (1L << MAYOR) | (1L << MENOR) | (1L << MENORIGUAL) | (1L << MAYORIGUAL))) != 0)) ) {
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

	public static class Expresion_condicionalContext extends ParserRuleContext {
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_condicionalContext expresion_condicional() throws RecognitionException {
		Expresion_condicionalContext _localctx = new Expresion_condicionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expresion_condicional);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expresion_entera(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				expresion_logica(0);
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

	public static class IteracionContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(Anasint.MIENTRAS, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode HACER() { return getToken(Anasint.HACER, 0); }
		public TerminalNode FMIENTRAS() { return getToken(Anasint.FMIENTRAS, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIteracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIteracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_iteracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(MIENTRAS);
			setState(320);
			match(PA);
			setState(321);
			condicion();
			setState(322);
			match(PC);
			setState(323);
			match(HACER);
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				instruccion();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEV) | (1L << SI) | (1L << RUPTURA) | (1L << MIENTRAS) | (1L << MOSTRAR) | (1L << IDENT))) != 0) );
			setState(329);
			match(FMIENTRAS);
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
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
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
		enterRule(_localctx, 60, RULE_ruptura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(RUPTURA);
			setState(332);
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

	public static class ResultadoContext extends ParserRuleContext {
		public TerminalNode DEV() { return getToken(Anasint.DEV, 0); }
		public Valor_devueltoContext valor_devuelto() {
			return getRuleContext(Valor_devueltoContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public ResultadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterResultado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitResultado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitResultado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultadoContext resultado() throws RecognitionException {
		ResultadoContext _localctx = new ResultadoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resultado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(DEV);
			setState(335);
			valor_devuelto();
			setState(336);
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

	public static class Valor_devueltoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode VERDADERO() { return getToken(Anasint.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(Anasint.FALSO, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Valor_devueltoContext valor_devuelto() {
			return getRuleContext(Valor_devueltoContext.class,0);
		}
		public Valor_devueltoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_devuelto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterValor_devuelto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitValor_devuelto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitValor_devuelto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_devueltoContext valor_devuelto() throws RecognitionException {
		Valor_devueltoContext _localctx = new Valor_devueltoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valor_devuelto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSO) | (1L << VERDADERO) | (1L << IDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(339);
				match(COMA);
				setState(340);
				valor_devuelto();
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(Anasint.MOSTRAR, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(MOSTRAR);
			setState(344);
			match(PA);
			setState(345);
			expresion();
			setState(346);
			match(PC);
			setState(347);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expresion_entera_sempred((Expresion_enteraContext)_localctx, predIndex);
		case 21:
			return expresion_logica_sempred((Expresion_logicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_entera_sempred(Expresion_enteraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expresion_logica_sempred(Expresion_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0160\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\7\3\7\5\7r\n\7\3\7\3"+
		"\7\3\7\5\7w\n\7\3\b\3\b\3\b\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f\5\f\u0090\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c0\n"+
		"\22\3\22\3\22\5\22\u00c4\n\22\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22"+
		"\u00cc\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6"+
		"\13\23\5\23\u00d8\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\7\25\u00e5\n\25\f\25\16\25\u00e8\13\25\5\25\u00ea\n\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\7\26\u00f2\n\26\f\26\16\26\u00f5\13\26\5\26\u00f7"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0106\n\27\3\27\3\27\3\27\7\27\u010b\n\27\f\27\16\27\u010e\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0116\n\30\f\30\16\30\u0119\13\30"+
		"\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\5\30\u0122\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u012c\n\31\f\31\16\31\u012f\13"+
		"\31\3\32\3\32\3\32\5\32\u0134\n\32\3\33\3\33\5\33\u0138\n\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\5\36\u0140\n\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37"+
		"\u0148\n\37\r\37\16\37\u0149\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\5\"\u0158\n\"\3#\3#\3#\3#\3#\3#\3#\2\4\",$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\6\7\3\2\20\22\3\2"+
		"\23\24\3\2\30\34\4\2\36\37\61\61\2\u016e\2F\3\2\2\2\4K\3\2\2\2\6M\3\2"+
		"\2\2\b]\3\2\2\2\nm\3\2\2\2\fq\3\2\2\2\16x\3\2\2\2\20{\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u0087\3\2\2\2\26\u008f\3\2\2\2\30\u0091\3\2\2\2\32\u0096\3"+
		"\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00b5\3\2\2\2\"\u00c3\3\2\2"+
		"\2$\u00cd\3\2\2\2&\u00db\3\2\2\2(\u00e0\3\2\2\2*\u00ed\3\2\2\2,\u0105"+
		"\3\2\2\2.\u010f\3\2\2\2\60\u0125\3\2\2\2\62\u0133\3\2\2\2\64\u0137\3\2"+
		"\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u013f\3\2\2\2<\u0141\3\2\2\2>\u014d"+
		"\3\2\2\2@\u0150\3\2\2\2B\u0154\3\2\2\2D\u0159\3\2\2\2FG\5\4\3\2GH\7\2"+
		"\2\3H\3\3\2\2\2IL\5\6\4\2JL\5\b\5\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7"+
		"+\2\2NO\7\61\2\2OP\7\t\2\2PQ\5\n\6\2QR\7\n\2\2RS\7!\2\2SV\7\t\2\2TW\5"+
		"\f\7\2UW\5\16\b\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\7\n\2\2YZ\5\20\t\2Z"+
		"[\5\32\16\2[\\\7,\2\2\\\7\3\2\2\2]^\7-\2\2^_\7\61\2\2_`\7\t\2\2`a\5\n"+
		"\6\2ab\7\n\2\2bc\5\20\t\2cd\5\32\16\2de\7.\2\2e\t\3\2\2\2fg\5\26\f\2g"+
		"j\7\61\2\2hi\7\17\2\2ik\5\n\6\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2ln\3\2\2"+
		"\2mf\3\2\2\2ml\3\2\2\2n\13\3\2\2\2or\7\6\2\2pr\5\30\r\2qo\3\2\2\2qp\3"+
		"\2\2\2rs\3\2\2\2sv\7\61\2\2tu\7\17\2\2uw\5\f\7\2vt\3\2\2\2vw\3\2\2\2w"+
		"\r\3\2\2\2xy\7\7\2\2yz\7\61\2\2z\17\3\2\2\2{\177\7*\2\2|~\5\22\n\2}|\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7\r\2\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\7\16\2\2\u0086\23\3\2\2\2\u0087\u008a\7\61\2\2\u0088"+
		"\u0089\7\17\2\2\u0089\u008b\5\24\13\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\25\3\2\2\2\u008c\u0090\7\6\2\2\u008d\u0090\7\7\2\2\u008e"+
		"\u0090\5\30\r\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\27\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0094\t\2\2\2\u0094\u0095\7\n\2\2\u0095\31\3\2\2\2\u0096\u009a\7\60\2"+
		"\2\u0097\u0099\5\34\17\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u00a4\5\36\20\2\u009e\u00a4\5.\30\2\u009f\u00a4\5<\37\2\u00a0"+
		"\u00a4\5> \2\u00a1\u00a4\5@!\2\u00a2\u00a4\5D#\2\u00a3\u009d\3\2\2\2\u00a3"+
		"\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6"+
		"\u00a7\7\26\2\2\u00a7\u00ac\5 \21\2\u00a8\u00a9\7\17\2\2\u00a9\u00ab\5"+
		" \21\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\16"+
		"\2\2\u00b0\37\3\2\2\2\u00b1\u00b6\5\"\22\2\u00b2\u00b6\5,\27\2\u00b3\u00b6"+
		"\5*\26\2\u00b4\u00b6\5(\25\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b8\b\22\1\2"+
		"\u00b8\u00b9\7\t\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\7\n\2\2\u00bb\u00c4"+
		"\3\2\2\2\u00bc\u00c4\5$\23\2\u00bd\u00c4\5&\24\2\u00be\u00c0\7\21\2\2"+
		"\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4"+
		"\7)\2\2\u00c2\u00c4\7\61\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00ca\3\2"+
		"\2\2\u00c5\u00c6\f\b\2\2\u00c6\u00c7\t\3\2\2\u00c7\u00c9\5\"\22\t\u00c8"+
		"\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb#\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00d7"+
		"\7\t\2\2\u00cf\u00d4\5 \21\2\u00d0\u00d1\7\17\2\2\u00d1\u00d3\5 \21\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\n\2\2\u00da%\3\2\2\2"+
		"\u00db\u00dc\7\61\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5\"\22\2\u00de"+
		"\u00df\7\f\2\2\u00df\'\3\2\2\2\u00e0\u00e9\7\13\2\2\u00e1\u00e6\5\"\22"+
		"\2\u00e2\u00e3\7\17\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec)\3\2\2\2\u00ed\u00f6\7\13\2\2"+
		"\u00ee\u00f3\5,\27\2\u00ef\u00f0\7\17\2\2\u00f0\u00f2\5,\27\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9+\3\2\2\2\u00fa\u00fb"+
		"\b\27\1\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\n\2\2"+
		"\u00fe\u0106\3\2\2\2\u00ff\u0106\5$\23\2\u0100\u0106\5&\24\2\u0101\u0106"+
		"\7 \2\2\u0102\u0106\7\37\2\2\u0103\u0106\7\36\2\2\u0104\u0106\7\61\2\2"+
		"\u0105\u00fa\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u010c\3\2\2\2\u0107\u0108\f\n\2\2\u0108\u0109\t\4\2\2\u0109\u010b\5,"+
		"\27\13\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d-\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\"\2\2"+
		"\u0110\u0111\7\t\2\2\u0111\u0112\5\60\31\2\u0112\u0113\7\n\2\2\u0113\u0117"+
		"\7#\2\2\u0114\u0116\5\34\17\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0121\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011e\7%\2\2\u011b\u011d\5\34\17\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7$\2\2\u0124/\3\2\2\2\u0125\u0126\5:\36\2\u0126"+
		"\u0127\5\62\32\2\u0127\u012d\5:\36\2\u0128\u0129\5\64\33\2\u0129\u012a"+
		"\5\60\31\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\61\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0134\5\66\34\2\u0131\u0134\58\35\2\u0132\u0134\5\64\33"+
		"\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\63"+
		"\3\2\2\2\u0135\u0138\t\4\2\2\u0136\u0138\7\25\2\2\u0137\u0135\3\2\2\2"+
		"\u0137\u0136\3\2\2\2\u0138\65\3\2\2\2\u0139\u013a\7\27\2\2\u013a\67\3"+
		"\2\2\2\u013b\u013c\t\5\2\2\u013c9\3\2\2\2\u013d\u0140\5\"\22\2\u013e\u0140"+
		"\5,\27\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140;\3\2\2\2\u0141"+
		"\u0142\7\'\2\2\u0142\u0143\7\t\2\2\u0143\u0144\5\60\31\2\u0144\u0145\7"+
		"\n\2\2\u0145\u0147\7\35\2\2\u0146\u0148\5\34\17\2\u0147\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\7(\2\2\u014c=\3\2\2\2\u014d\u014e\7&\2\2\u014e\u014f"+
		"\7\16\2\2\u014f?\3\2\2\2\u0150\u0151\7!\2\2\u0151\u0152\5B\"\2\u0152\u0153"+
		"\7\16\2\2\u0153A\3\2\2\2\u0154\u0157\t\6\2\2\u0155\u0156\7\17\2\2\u0156"+
		"\u0158\5B\"\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158C\3\2\2\2\u0159"+
		"\u015a\7/\2\2\u015a\u015b\7\t\2\2\u015b\u015c\5 \21\2\u015c\u015d\7\n"+
		"\2\2\u015d\u015e\7\16\2\2\u015eE\3\2\2\2#KVjmqv\177\u008a\u008f\u009a"+
		"\u00a3\u00ac\u00b5\u00bf\u00c3\u00ca\u00d4\u00d7\u00e6\u00e9\u00f3\u00f6"+
		"\u0105\u010c\u0117\u011e\u0121\u012d\u0133\u0137\u013f\u0149\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}