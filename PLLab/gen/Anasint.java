// Generated from C:/Users/amigo/IdeaProjects/PLLab/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, ASIGNACIONES=5, PyC=6, 
		COMA=7, IGUAL=8, MAS=9, MENOS=10, POR=11, PA=12, PC=13, CA=14, CC=15, 
		TRUE=16, FALSE=17, NOT=18, OR=19, AND=20, HLIST=21, ILIST=22, BLIST=23, 
		INTEGER=24, BOOLEAN=25, IDENT=26, NUMERO=27, COMENTARIO_BLOQUE=28, COMENTARIO_LINEA=29;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_definicion_variables = 2, 
		RULE_l_hib = 3, RULE_l_bool = 4, RULE_l_int = 5, RULE_int = 6, RULE_bool = 7, 
		RULE_idents = 8, RULE_asignaciones = 9, RULE_asignacion = 10, RULE_valor = 11, 
		RULE_lista = 12, RULE_expr_lista = 13, RULE_lista_entera = 14, RULE_lista_booleana = 15, 
		RULE_lista_hibrida = 16, RULE_expresion_entera = 17, RULE_expresion_booleana = 18, 
		RULE_funcion_booleana = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "definicion_variables", "l_hib", "l_bool", "l_int", 
			"int", "bool", "idents", "asignaciones", "asignacion", "valor", "lista", 
			"expr_lista", "lista_entera", "lista_booleana", "lista_hibrida", "expresion_entera", 
			"expresion_booleana", "funcion_booleana"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'ASIGNACIONES'", "';'", "','", 
			"'='", "'+'", "'-'", "'*'", "'('", "')'", "'['", "']'", "'true'", "'false'", 
			"'NOT'", "'OR'", "'AND'", "'Hlist'", "'Ilist'", "'Blist'", "'Integer'", 
			"'Boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "ASIGNACIONES", 
			"PyC", "COMA", "IGUAL", "MAS", "MENOS", "POR", "PA", "PC", "CA", "CC", 
			"TRUE", "FALSE", "NOT", "OR", "AND", "HLIST", "ILIST", "BLIST", "INTEGER", 
			"BOOLEAN", "IDENT", "NUMERO", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
			setState(40);
			variables();
			setState(41);
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
			setState(43);
			match(VARIABLES);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				definicion_variables();
				setState(45);
				match(PyC);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HLIST) | (1L << ILIST) | (1L << BLIST) | (1L << INTEGER) | (1L << BOOLEAN))) != 0) );
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
		public L_hibContext l_hib() {
			return getRuleContext(L_hibContext.class,0);
		}
		public L_boolContext l_bool() {
			return getRuleContext(L_boolContext.class,0);
		}
		public L_intContext l_int() {
			return getRuleContext(L_intContext.class,0);
		}
		public IntContext int() {
			return getRuleContext(IntContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HLIST:
				{
				setState(51);
				l_hib();
				}
				break;
			case BLIST:
				{
				setState(52);
				l_bool();
				}
				break;
			case ILIST:
				{
				setState(53);
				l_int();
				}
				break;
			case INTEGER:
				{
				setState(54);
				int();
				}
				break;
			case BOOLEAN:
				{
				setState(55);
				bool();
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

	public static class L_hibContext extends ParserRuleContext {
		public TerminalNode HLIST() { return getToken(Anasint.HLIST, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public L_hibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_hib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterL_hib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitL_hib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitL_hib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_hibContext l_hib() throws RecognitionException {
		L_hibContext _localctx = new L_hibContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_l_hib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(HLIST);
			setState(59);
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

	public static class L_boolContext extends ParserRuleContext {
		public TerminalNode BLIST() { return getToken(Anasint.BLIST, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public L_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterL_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitL_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitL_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_boolContext l_bool() throws RecognitionException {
		L_boolContext _localctx = new L_boolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_l_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(BLIST);
			setState(62);
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

	public static class L_intContext extends ParserRuleContext {
		public TerminalNode ILIST() { return getToken(Anasint.ILIST, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public L_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterL_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitL_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitL_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_intContext l_int() throws RecognitionException {
		L_intContext _localctx = new L_intContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_l_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ILIST);
			setState(65);
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

	public static class IntContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Anasint.INTEGER, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(INTEGER);
			setState(68);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Anasint.BOOLEAN, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(BOOLEAN);
			setState(71);
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
		enterRule(_localctx, 16, RULE_idents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENT);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(74);
				match(COMA);
				setState(75);
				match(IDENT);
				}
				}
				setState(80);
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
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
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
		enterRule(_localctx, 18, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ASIGNACIONES);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(82);
				asignacion();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENT);
			setState(91);
			match(IGUAL);
			setState(92);
			valor();
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

	public static class ValorContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expresion_entera(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				expresion_booleana();
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public Expr_listaContext expr_lista() {
			return getRuleContext(Expr_listaContext.class,0);
		}
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(CA);
			setState(100);
			expr_lista();
			setState(101);
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

	public static class Expr_listaContext extends ParserRuleContext {
		public Lista_enteraContext lista_entera() {
			return getRuleContext(Lista_enteraContext.class,0);
		}
		public Lista_booleanaContext lista_booleana() {
			return getRuleContext(Lista_booleanaContext.class,0);
		}
		public Lista_hibridaContext lista_hibrida() {
			return getRuleContext(Lista_hibridaContext.class,0);
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
		enterRule(_localctx, 26, RULE_expr_lista);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				lista_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				lista_booleana();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				lista_hibrida();
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

	public static class Lista_enteraContext extends ParserRuleContext {
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
		public Lista_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_enteraContext lista_entera() throws RecognitionException {
		Lista_enteraContext _localctx = new Lista_enteraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expresion_entera(0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				expresion_entera(0);
				}
				}
				setState(115);
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

	public static class Lista_booleanaContext extends ParserRuleContext {
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Lista_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_booleanaContext lista_booleana() throws RecognitionException {
		Lista_booleanaContext _localctx = new Lista_booleanaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lista_booleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expresion_booleana();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(117);
				match(COMA);
				setState(118);
				expresion_booleana();
				}
				}
				setState(123);
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

	public static class Lista_hibridaContext extends ParserRuleContext {
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Lista_hibridaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_hibrida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_hibrida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_hibrida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_hibrida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_hibridaContext lista_hibrida() throws RecognitionException {
		Lista_hibridaContext _localctx = new Lista_hibridaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lista_hibrida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				expresion_entera(0);
				}
				break;
			case 2:
				{
				setState(125);
				expresion_booleana();
				}
				break;
			}
			{
			setState(128);
			match(COMA);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(129);
				expresion_booleana();
				}
				break;
			case 2:
				{
				setState(130);
				expresion_entera(0);
				}
				break;
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

	public static class Expresion_enteraContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expresion_entera, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(134);
				match(NUMERO);
				}
				break;
			case IDENT:
				{
				setState(135);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_entera);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(MAS);
						setState(140);
						expresion_entera(4);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_entera);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						match(MENOS);
						setState(143);
						expresion_entera(3);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_entera);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						match(POR);
						setState(146);
						expresion_entera(2);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Expresion_booleanaContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Anasint.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Anasint.FALSE, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NOT() { return getToken(Anasint.NOT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public Funcion_booleanaContext funcion_booleana() {
			return getRuleContext(Funcion_booleanaContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Expresion_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_booleanaContext expresion_booleana() throws RecognitionException {
		Expresion_booleanaContext _localctx = new Expresion_booleanaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion_booleana);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(FALSE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(IDENT);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(NOT);
				setState(156);
				match(PA);
				setState(157);
				expresion_booleana();
				setState(158);
				match(PC);
				}
				break;
			case OR:
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				funcion_booleana();
				setState(161);
				match(PA);
				setState(162);
				expresion_booleana();
				setState(163);
				match(COMA);
				setState(164);
				expresion_booleana();
				setState(165);
				match(PC);
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

	public static class Funcion_booleanaContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Anasint.OR, 0); }
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public Funcion_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterFuncion_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitFuncion_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitFuncion_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_booleanaContext funcion_booleana() throws RecognitionException {
		Funcion_booleanaContext _localctx = new Funcion_booleanaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcion_booleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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
		case 17:
			return expresion_entera_sempred((Expresion_enteraContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_entera_sempred(Expresion_enteraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3"+
		"\13\3\13\7\13V\n\13\f\13\16\13Y\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\5\rd\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17m\n\17\3\20\3\20"+
		"\3\20\7\20r\n\20\f\20\16\20u\13\20\3\21\3\21\3\21\7\21z\n\21\f\21\16\21"+
		"}\13\21\3\22\3\22\5\22\u0081\n\22\3\22\3\22\3\22\5\22\u0086\n\22\3\23"+
		"\3\23\3\23\5\23\u008b\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u0096\n\23\f\23\16\23\u0099\13\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00aa\n\24\3\25\3\25"+
		"\3\25\2\3$\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\25"+
		"\26\2\u00b0\2*\3\2\2\2\4-\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n?\3\2\2\2\fB"+
		"\3\2\2\2\16E\3\2\2\2\20H\3\2\2\2\22K\3\2\2\2\24S\3\2\2\2\26\\\3\2\2\2"+
		"\30c\3\2\2\2\32e\3\2\2\2\34l\3\2\2\2\36n\3\2\2\2 v\3\2\2\2\"\u0080\3\2"+
		"\2\2$\u008a\3\2\2\2&\u00a9\3\2\2\2(\u00ab\3\2\2\2*+\5\4\3\2+,\5\24\13"+
		"\2,\3\3\2\2\2-\61\7\6\2\2./\5\6\4\2/\60\7\b\2\2\60\62\3\2\2\2\61.\3\2"+
		"\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65;\5\b\5"+
		"\2\66;\5\n\6\2\67;\5\f\7\28;\5\16\b\29;\5\20\t\2:\65\3\2\2\2:\66\3\2\2"+
		"\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<=\7\27\2\2=>\5\22\n\2>\t"+
		"\3\2\2\2?@\7\31\2\2@A\5\22\n\2A\13\3\2\2\2BC\7\30\2\2CD\5\22\n\2D\r\3"+
		"\2\2\2EF\7\32\2\2FG\5\22\n\2G\17\3\2\2\2HI\7\33\2\2IJ\5\22\n\2J\21\3\2"+
		"\2\2KP\7\34\2\2LM\7\t\2\2MO\7\34\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\23\3\2\2\2RP\3\2\2\2SW\7\7\2\2TV\5\26\f\2UT\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\b\2\2[\25\3\2\2\2\\]\7\34"+
		"\2\2]^\7\n\2\2^_\5\30\r\2_\27\3\2\2\2`d\5\32\16\2ad\5$\23\2bd\5&\24\2"+
		"c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\31\3\2\2\2ef\7\20\2\2fg\5\34\17\2gh\7"+
		"\21\2\2h\33\3\2\2\2im\5\36\20\2jm\5 \21\2km\5\"\22\2li\3\2\2\2lj\3\2\2"+
		"\2lk\3\2\2\2m\35\3\2\2\2ns\5$\23\2op\7\t\2\2pr\5$\23\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\37\3\2\2\2us\3\2\2\2v{\5&\24\2wx\7\t\2\2xz\5"+
		"&\24\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|!\3\2\2\2}{\3\2\2\2~\u0081"+
		"\5$\23\2\177\u0081\5&\24\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\7\t\2\2\u0083\u0086\5&\24\2\u0084\u0086\5$\23\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086#\3\2\2\2\u0087\u0088\b\23\1\2"+
		"\u0088\u008b\7\35\2\2\u0089\u008b\7\34\2\2\u008a\u0087\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u0097\3\2\2\2\u008c\u008d\f\5\2\2\u008d\u008e\7\13\2\2"+
		"\u008e\u0096\5$\23\6\u008f\u0090\f\4\2\2\u0090\u0091\7\f\2\2\u0091\u0096"+
		"\5$\23\5\u0092\u0093\f\3\2\2\u0093\u0094\7\r\2\2\u0094\u0096\5$\23\4\u0095"+
		"\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098%\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u00aa\7\22\2\2\u009b\u00aa\7\23\2\2\u009c\u00aa\7\34\2"+
		"\2\u009d\u009e\7\24\2\2\u009e\u009f\7\16\2\2\u009f\u00a0\5&\24\2\u00a0"+
		"\u00a1\7\17\2\2\u00a1\u00aa\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7"+
		"\16\2\2\u00a4\u00a5\5&\24\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7\5&\24\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u009b\3"+
		"\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa"+
		"\'\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac)\3\2\2\2\20\63:PWcls{\u0080\u0085"+
		"\u008a\u0095\u0097\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}