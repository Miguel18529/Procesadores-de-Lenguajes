// Generated from C:/Users/amigo/IdeaProjects/Ejemplo1/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, INSTRUCCIONES=5, EVAL=6, 
		DEF=7, NUMERO=8, VAR=9, PA=10, PC=11, PyC=12, COMA=13, MAS=14, MENOS=15, 
		POR=16, COMENTARIO_BLOQUE=17, COMENTARIO_LINEA=18;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_idents = 2, RULE_instrucciones = 3, 
		RULE_definicion = 4, RULE_evaluacion = 5, RULE_expresion = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "idents", "instrucciones", "definicion", "evaluacion", 
			"expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'INSTRUCCIONES'", "'EVAL'", 
			"'DEF'", null, null, "'('", "')'", "';'", "','", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "INSTRUCCIONES", 
			"EVAL", "DEF", "NUMERO", "VAR", "PA", "PC", "PyC", "COMA", "MAS", "MENOS", 
			"POR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramaContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public ProgContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			variables();
			setState(15);
			instrucciones();
			setState(16);
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
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarsContext extends VariablesContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public VarsContext(VariablesContext ctx) { copyFrom(ctx); }
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

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		try {
			_localctx = new VarsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(VARIABLES);
			setState(19);
			idents();
			setState(20);
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

	public static class IdentsContext extends ParserRuleContext {
		public IdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idents; }
	 
		public IdentsContext() { }
		public void copyFrom(IdentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdsContext extends IdentsContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public IdsContext(IdentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends IdentsContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public IdContext(IdentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentsContext idents() throws RecognitionException {
		IdentsContext _localctx = new IdentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idents);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new IdsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(VAR);
				setState(23);
				match(COMA);
				setState(24);
				idents();
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
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
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	 
		public InstruccionesContext() { }
		public void copyFrom(InstruccionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstrsContext extends InstruccionesContext {
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<EvaluacionContext> evaluacion() {
			return getRuleContexts(EvaluacionContext.class);
		}
		public EvaluacionContext evaluacion(int i) {
			return getRuleContext(EvaluacionContext.class,i);
		}
		public InstrsContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		int _la;
		try {
			_localctx = new InstrsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(INSTRUCCIONES);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EVAL || _la==VAR) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(29);
					definicion();
					}
					break;
				case EVAL:
					{
					setState(30);
					evaluacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
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

	public static class DefinicionContext extends ParserRuleContext {
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	 
		public DefinicionContext() { }
		public void copyFrom(DefinicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefContext extends DefinicionContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode DEF() { return getToken(Anasint.DEF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public DefContext(DefinicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion);
		try {
			_localctx = new DefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(VAR);
			setState(37);
			match(DEF);
			setState(38);
			expresion(0);
			setState(39);
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

	public static class EvaluacionContext extends ParserRuleContext {
		public EvaluacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluacion; }
	 
		public EvaluacionContext() { }
		public void copyFrom(EvaluacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EvContext extends EvaluacionContext {
		public TerminalNode EVAL() { return getToken(Anasint.EVAL, 0); }
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public EvContext(EvaluacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluacionContext evaluacion() throws RecognitionException {
		EvaluacionContext _localctx = new EvaluacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evaluacion);
		try {
			_localctx = new EvContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(EVAL);
			setState(42);
			match(VAR);
			setState(43);
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
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExprContext extends ExpresionContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public IdExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpresionContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public NumExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExpresionContext {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ParExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenosExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public MenosExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMenosExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMenosExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMenosExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnarioMenosExprContext extends ExpresionContext {
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UnarioMenosExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterUnarioMenosExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitUnarioMenosExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitUnarioMenosExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PorExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public PorExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MasExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public MasExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMasExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMasExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMasExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(46);
				match(PA);
				setState(47);
				expresion(0);
				setState(48);
				match(PC);
				}
				break;
			case MENOS:
				{
				_localctx = new UnarioMenosExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(MENOS);
				setState(51);
				expresion(6);
				}
				break;
			case NUMERO:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(NUMERO);
				}
				break;
			case VAR:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PorExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						match(POR);
						setState(58);
						expresion(6);
						}
						break;
					case 2:
						{
						_localctx = new MasExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						match(MAS);
						setState(61);
						expresion(5);
						}
						break;
					case 3:
						{
						_localctx = new MenosExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						match(MENOS);
						setState(64);
						expresion(4);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 6:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\7\5\"\n\5\f\5\16\5%\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bD\n\b\f\b\16\bG\13\b"+
		"\3\b\2\3\16\t\2\4\6\b\n\f\16\2\2\2J\2\20\3\2\2\2\4\24\3\2\2\2\6\34\3\2"+
		"\2\2\b\36\3\2\2\2\n&\3\2\2\2\f+\3\2\2\2\168\3\2\2\2\20\21\5\4\3\2\21\22"+
		"\5\b\5\2\22\23\7\2\2\3\23\3\3\2\2\2\24\25\7\6\2\2\25\26\5\6\4\2\26\27"+
		"\7\16\2\2\27\5\3\2\2\2\30\31\7\13\2\2\31\32\7\17\2\2\32\35\5\6\4\2\33"+
		"\35\7\13\2\2\34\30\3\2\2\2\34\33\3\2\2\2\35\7\3\2\2\2\36#\7\7\2\2\37\""+
		"\5\n\6\2 \"\5\f\7\2!\37\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$\t\3\2\2\2%#\3\2\2\2&\'\7\13\2\2\'(\7\t\2\2()\5\16\b\2)*\7\16\2\2*"+
		"\13\3\2\2\2+,\7\b\2\2,-\7\13\2\2-.\7\16\2\2.\r\3\2\2\2/\60\b\b\1\2\60"+
		"\61\7\f\2\2\61\62\5\16\b\2\62\63\7\r\2\2\639\3\2\2\2\64\65\7\21\2\2\65"+
		"9\5\16\b\b\669\7\n\2\2\679\7\13\2\28/\3\2\2\28\64\3\2\2\28\66\3\2\2\2"+
		"8\67\3\2\2\29E\3\2\2\2:;\f\7\2\2;<\7\22\2\2<D\5\16\b\b=>\f\6\2\2>?\7\20"+
		"\2\2?D\5\16\b\7@A\f\5\2\2AB\7\21\2\2BD\5\16\b\6C:\3\2\2\2C=\3\2\2\2C@"+
		"\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GE\3\2\2\2\b\34!#8C"+
		"E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}