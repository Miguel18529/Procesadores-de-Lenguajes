// Generated from C:/Users/amigo/IdeaProjects/Proyecto Septiembre/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, ESPECIFICACION=4, CLASE=5, CLASES=6, 
		CLASEM=7, ASOCIACIONES=8, ASOCIACION=9, ROL=10, MULTIPLICIDAD=11, GENERALIZACIONES=12, 
		GENERALIZACION=13, SUPERCLASE=14, SUBCLASES=15, RESTRICCIONES=16, INSTRUCCIONES=17, 
		OBJETO=18, ENLACE=19, ASOCIACIONM=20, CONSISTENCIA=21, OBJETOM=22, NUM=23, 
		TXT=24, PA=25, PC=26, PyC=27, DP=28, COMA=29, IGUAL=30, MAYOR=31, MENOR=32, 
		IGUALIGUAL=33, MAS=34, MENOS=35, POR=36, DIV=37, COMILLAS=38, GUIONBAJO=39, 
		NUMERO=40, NOMBRE=41, IDENT=42, VALORTXT=43, COMENTARIO_BLOQUE=44, COMENTARIO_LINEA=45;
	public static final int
		RULE_programa = 0, RULE_especificaciones = 1, RULE_clases = 2, RULE_clase = 3, 
		RULE_atributos = 4, RULE_atributo = 5, RULE_tipo = 6, RULE_asociaciones = 7, 
		RULE_asociacion = 8, RULE_contenido = 9, RULE_cont1 = 10, RULE_cont2 = 11, 
		RULE_mult = 12, RULE_generalizaciones = 13, RULE_generalizacion = 14, 
		RULE_superclase = 15, RULE_subclases = 16, RULE_restricciones = 17, RULE_instrucciones = 18, 
		RULE_instruccion = 19, RULE_crear = 20, RULE_objeto = 21, RULE_cont_objeto = 22, 
		RULE_clase_objeto = 23, RULE_atrib_objeto = 24, RULE_valor_objeto = 25, 
		RULE_enlace = 26, RULE_contenido_enlace = 27, RULE_asociacion_enlace = 28, 
		RULE_objetos_enlace = 29, RULE_obj = 30, RULE_eliminar = 31, RULE_consistencia = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "especificaciones", "clases", "clase", "atributos", "atributo", 
			"tipo", "asociaciones", "asociacion", "contenido", "cont1", "cont2", 
			"mult", "generalizaciones", "generalizacion", "superclase", "subclases", 
			"restricciones", "instrucciones", "instruccion", "crear", "objeto", "cont_objeto", 
			"clase_objeto", "atrib_objeto", "valor_objeto", "enlace", "contenido_enlace", 
			"asociacion_enlace", "objetos_enlace", "obj", "eliminar", "consistencia"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'ESPECIFICACION'", "'CLASE'", "'CLASES'", 
			"'clase'", "'ASOCIACIONES'", "'ASOCIACION'", "'rol'", "'multiplicidad'", 
			"'GENERALIZACIONES'", "'GENERALIZACION'", "'superclase'", "'subclases'", 
			"'RESTRICCIONES'", "'INSTRUCCIONES'", "'OBJETO'", "'ENLACE'", "'asociacion'", 
			"'CONSISTENCIA'", "'objeto'", "'NUM'", "'TXT'", "'('", "')'", "';'", 
			"':'", "','", "'='", "'>'", "'<'", "'=='", "'+'", "'-'", "'*'", "'/'", 
			"'\"'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "ESPECIFICACION", "CLASE", 
			"CLASES", "CLASEM", "ASOCIACIONES", "ASOCIACION", "ROL", "MULTIPLICIDAD", 
			"GENERALIZACIONES", "GENERALIZACION", "SUPERCLASE", "SUBCLASES", "RESTRICCIONES", 
			"INSTRUCCIONES", "OBJETO", "ENLACE", "ASOCIACIONM", "CONSISTENCIA", "OBJETOM", 
			"NUM", "TXT", "PA", "PC", "PyC", "DP", "COMA", "IGUAL", "MAYOR", "MENOR", 
			"IGUALIGUAL", "MAS", "MENOS", "POR", "DIV", "COMILLAS", "GUIONBAJO", 
			"NUMERO", "NOMBRE", "IDENT", "VALORTXT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		public EspecificacionesContext especificaciones() {
			return getRuleContext(EspecificacionesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
			setState(66);
			especificaciones();
			setState(67);
			instrucciones();
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

	public static class EspecificacionesContext extends ParserRuleContext {
		public TerminalNode ESPECIFICACION() { return getToken(Anasint.ESPECIFICACION, 0); }
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public AsociacionesContext asociaciones() {
			return getRuleContext(AsociacionesContext.class,0);
		}
		public GeneralizacionesContext generalizaciones() {
			return getRuleContext(GeneralizacionesContext.class,0);
		}
		public RestriccionesContext restricciones() {
			return getRuleContext(RestriccionesContext.class,0);
		}
		public EspecificacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especificaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEspecificaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEspecificaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEspecificaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecificacionesContext especificaciones() throws RecognitionException {
		EspecificacionesContext _localctx = new EspecificacionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_especificaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ESPECIFICACION);
			setState(70);
			clases();
			setState(71);
			asociaciones();
			setState(72);
			generalizaciones();
			setState(73);
			restricciones();
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
		public TerminalNode CLASES() { return getToken(Anasint.CLASES, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public List<ClaseContext> clase() {
			return getRuleContexts(ClaseContext.class);
		}
		public ClaseContext clase(int i) {
			return getRuleContext(ClaseContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CLASES);
			setState(76);
			match(DP);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASE) {
				{
				{
				setState(77);
				clase();
				}
				}
				setState(82);
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

	public static class ClaseContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(Anasint.CLASE, 0); }
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public List<AtributosContext> atributos() {
			return getRuleContexts(AtributosContext.class);
		}
		public AtributosContext atributos(int i) {
			return getRuleContext(AtributosContext.class,i);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CLASE);
			setState(84);
			match(NOMBRE);
			setState(85);
			match(PA);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(86);
				atributos();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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

	public static class AtributosContext extends ParserRuleContext {
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			atributo();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(95);
				match(COMA);
				setState(96);
				atributo();
				}
				}
				setState(101);
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

	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IDENT);
			setState(103);
			match(DP);
			setState(104);
			tipo();
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
		public TerminalNode TXT() { return getToken(Anasint.TXT, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
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
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==TXT) ) {
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

	public static class AsociacionesContext extends ParserRuleContext {
		public TerminalNode ASOCIACIONES() { return getToken(Anasint.ASOCIACIONES, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public List<AsociacionContext> asociacion() {
			return getRuleContexts(AsociacionContext.class);
		}
		public AsociacionContext asociacion(int i) {
			return getRuleContext(AsociacionContext.class,i);
		}
		public AsociacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asociaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsociaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsociaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsociaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsociacionesContext asociaciones() throws RecognitionException {
		AsociacionesContext _localctx = new AsociacionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asociaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ASOCIACIONES);
			setState(109);
			match(DP);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASOCIACION) {
				{
				{
				setState(110);
				asociacion();
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

	public static class AsociacionContext extends ParserRuleContext {
		public TerminalNode ASOCIACION() { return getToken(Anasint.ASOCIACION, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public AsociacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asociacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsociacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsociacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsociacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsociacionContext asociacion() throws RecognitionException {
		AsociacionContext _localctx = new AsociacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asociacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ASOCIACION);
			setState(117);
			match(IDENT);
			setState(118);
			match(PA);
			setState(119);
			contenido();
			setState(120);
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

	public static class ContenidoContext extends ParserRuleContext {
		public Cont1Context cont1() {
			return getRuleContext(Cont1Context.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Cont2Context cont2() {
			return getRuleContext(Cont2Context.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterContenido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitContenido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contenido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			cont1();
			setState(123);
			match(COMA);
			setState(124);
			cont2();
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

	public static class Cont1Context extends ParserRuleContext {
		public TerminalNode CLASEM() { return getToken(Anasint.CLASEM, 0); }
		public List<TerminalNode> DP() { return getTokens(Anasint.DP); }
		public TerminalNode DP(int i) {
			return getToken(Anasint.DP, i);
		}
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public TerminalNode ROL() { return getToken(Anasint.ROL, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode MULTIPLICIDAD() { return getToken(Anasint.MULTIPLICIDAD, 0); }
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public Cont1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCont1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCont1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCont1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont1Context cont1() throws RecognitionException {
		Cont1Context _localctx = new Cont1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_cont1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CLASEM);
			setState(127);
			match(DP);
			setState(128);
			match(NOMBRE);
			setState(129);
			match(COMA);
			setState(130);
			match(ROL);
			setState(131);
			match(DP);
			setState(132);
			match(IDENT);
			setState(133);
			match(COMA);
			setState(134);
			match(MULTIPLICIDAD);
			setState(135);
			match(DP);
			setState(136);
			mult();
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

	public static class Cont2Context extends ParserRuleContext {
		public TerminalNode CLASEM() { return getToken(Anasint.CLASEM, 0); }
		public List<TerminalNode> DP() { return getTokens(Anasint.DP); }
		public TerminalNode DP(int i) {
			return getToken(Anasint.DP, i);
		}
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public TerminalNode ROL() { return getToken(Anasint.ROL, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode MULTIPLICIDAD() { return getToken(Anasint.MULTIPLICIDAD, 0); }
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public Cont2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCont2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCont2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCont2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont2Context cont2() throws RecognitionException {
		Cont2Context _localctx = new Cont2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CLASEM);
			setState(139);
			match(DP);
			setState(140);
			match(NOMBRE);
			setState(141);
			match(COMA);
			setState(142);
			match(ROL);
			setState(143);
			match(DP);
			setState(144);
			match(IDENT);
			setState(145);
			match(COMA);
			setState(146);
			match(MULTIPLICIDAD);
			setState(147);
			match(DP);
			setState(148);
			mult();
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << POR) | (1L << NUMERO))) != 0)) ) {
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

	public static class GeneralizacionesContext extends ParserRuleContext {
		public TerminalNode GENERALIZACIONES() { return getToken(Anasint.GENERALIZACIONES, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public List<GeneralizacionContext> generalizacion() {
			return getRuleContexts(GeneralizacionContext.class);
		}
		public GeneralizacionContext generalizacion(int i) {
			return getRuleContext(GeneralizacionContext.class,i);
		}
		public GeneralizacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalizaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterGeneralizaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitGeneralizaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitGeneralizaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralizacionesContext generalizaciones() throws RecognitionException {
		GeneralizacionesContext _localctx = new GeneralizacionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_generalizaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(GENERALIZACIONES);
			setState(153);
			match(DP);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GENERALIZACION) {
				{
				{
				setState(154);
				generalizacion();
				}
				}
				setState(159);
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

	public static class GeneralizacionContext extends ParserRuleContext {
		public TerminalNode GENERALIZACION() { return getToken(Anasint.GENERALIZACION, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public SuperclaseContext superclase() {
			return getRuleContext(SuperclaseContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public SubclasesContext subclases() {
			return getRuleContext(SubclasesContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public GeneralizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterGeneralizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitGeneralizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitGeneralizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralizacionContext generalizacion() throws RecognitionException {
		GeneralizacionContext _localctx = new GeneralizacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_generalizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(GENERALIZACION);
			setState(161);
			match(PA);
			setState(162);
			superclase();
			setState(163);
			match(COMA);
			setState(164);
			subclases();
			setState(165);
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

	public static class SuperclaseContext extends ParserRuleContext {
		public TerminalNode SUPERCLASE() { return getToken(Anasint.SUPERCLASE, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public SuperclaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSuperclase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSuperclase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSuperclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclaseContext superclase() throws RecognitionException {
		SuperclaseContext _localctx = new SuperclaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_superclase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(SUPERCLASE);
			setState(168);
			match(DP);
			setState(169);
			match(NOMBRE);
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

	public static class SubclasesContext extends ParserRuleContext {
		public TerminalNode SUBCLASES() { return getToken(Anasint.SUBCLASES, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public SubclasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subclases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSubclases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSubclases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSubclases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubclasesContext subclases() throws RecognitionException {
		SubclasesContext _localctx = new SubclasesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subclases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(SUBCLASES);
			setState(172);
			match(DP);
			setState(173);
			match(NOMBRE);
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

	public static class RestriccionesContext extends ParserRuleContext {
		public TerminalNode RESTRICCIONES() { return getToken(Anasint.RESTRICCIONES, 0); }
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public RestriccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRestricciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRestricciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRestricciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionesContext restricciones() throws RecognitionException {
		RestriccionesContext _localctx = new RestriccionesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_restricciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(RESTRICCIONES);
			setState(176);
			match(DP);
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
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
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
		enterRule(_localctx, 36, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(INSTRUCCIONES);
			setState(179);
			match(DP);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSISTENCIA) | (1L << MAS) | (1L << MENOS))) != 0)) {
				{
				{
				setState(180);
				instruccion();
				}
				}
				setState(185);
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
		public CrearContext crear() {
			return getRuleContext(CrearContext.class,0);
		}
		public EliminarContext eliminar() {
			return getRuleContext(EliminarContext.class,0);
		}
		public ConsistenciaContext consistencia() {
			return getRuleContext(ConsistenciaContext.class,0);
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
		enterRule(_localctx, 38, RULE_instruccion);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				crear();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				eliminar();
				}
				break;
			case CONSISTENCIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				consistencia();
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

	public static class CrearContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public EnlaceContext enlace() {
			return getRuleContext(EnlaceContext.class,0);
		}
		public CrearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCrear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCrear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCrear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrearContext crear() throws RecognitionException {
		CrearContext _localctx = new CrearContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_crear);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(MAS);
				setState(192);
				objeto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(MAS);
				setState(194);
				enlace();
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode OBJETO() { return getToken(Anasint.OBJETO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public Cont_objetoContext cont_objeto() {
			return getRuleContext(Cont_objetoContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(OBJETO);
			setState(198);
			match(IDENT);
			setState(199);
			match(PA);
			setState(200);
			cont_objeto();
			setState(201);
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

	public static class Cont_objetoContext extends ParserRuleContext {
		public Clase_objetoContext clase_objeto() {
			return getRuleContext(Clase_objetoContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public List<Atrib_objetoContext> atrib_objeto() {
			return getRuleContexts(Atrib_objetoContext.class);
		}
		public Atrib_objetoContext atrib_objeto(int i) {
			return getRuleContext(Atrib_objetoContext.class,i);
		}
		public Cont_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCont_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCont_objeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCont_objeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_objetoContext cont_objeto() throws RecognitionException {
		Cont_objetoContext _localctx = new Cont_objetoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cont_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			clase_objeto();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(204);
				match(COMA);
				setState(205);
				atrib_objeto();
				}
				}
				setState(210);
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

	public static class Clase_objetoContext extends ParserRuleContext {
		public TerminalNode CLASEM() { return getToken(Anasint.CLASEM, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public TerminalNode NOMBRE() { return getToken(Anasint.NOMBRE, 0); }
		public Clase_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterClase_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitClase_objeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitClase_objeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clase_objetoContext clase_objeto() throws RecognitionException {
		Clase_objetoContext _localctx = new Clase_objetoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_clase_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CLASEM);
			setState(212);
			match(IGUAL);
			setState(213);
			match(NOMBRE);
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

	public static class Atrib_objetoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public Valor_objetoContext valor_objeto() {
			return getRuleContext(Valor_objetoContext.class,0);
		}
		public Atrib_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAtrib_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAtrib_objeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAtrib_objeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atrib_objetoContext atrib_objeto() throws RecognitionException {
		Atrib_objetoContext _localctx = new Atrib_objetoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atrib_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENT);
			setState(216);
			match(IGUAL);
			setState(217);
			valor_objeto();
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

	public static class Valor_objetoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode VALORTXT() { return getToken(Anasint.VALORTXT, 0); }
		public Valor_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterValor_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitValor_objeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitValor_objeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_objetoContext valor_objeto() throws RecognitionException {
		Valor_objetoContext _localctx = new Valor_objetoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valor_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==VALORTXT) ) {
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

	public static class EnlaceContext extends ParserRuleContext {
		public TerminalNode ENLACE() { return getToken(Anasint.ENLACE, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public Contenido_enlaceContext contenido_enlace() {
			return getRuleContext(Contenido_enlaceContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public EnlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enlace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEnlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEnlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEnlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnlaceContext enlace() throws RecognitionException {
		EnlaceContext _localctx = new EnlaceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enlace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ENLACE);
			setState(222);
			match(IDENT);
			setState(223);
			match(PA);
			setState(224);
			contenido_enlace();
			setState(225);
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

	public static class Contenido_enlaceContext extends ParserRuleContext {
		public Asociacion_enlaceContext asociacion_enlace() {
			return getRuleContext(Asociacion_enlaceContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Objetos_enlaceContext objetos_enlace() {
			return getRuleContext(Objetos_enlaceContext.class,0);
		}
		public Contenido_enlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido_enlace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterContenido_enlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitContenido_enlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitContenido_enlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contenido_enlaceContext contenido_enlace() throws RecognitionException {
		Contenido_enlaceContext _localctx = new Contenido_enlaceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_contenido_enlace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			asociacion_enlace();
			setState(228);
			match(COMA);
			setState(229);
			objetos_enlace();
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

	public static class Asociacion_enlaceContext extends ParserRuleContext {
		public TerminalNode ASOCIACIONM() { return getToken(Anasint.ASOCIACIONM, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public Asociacion_enlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asociacion_enlace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsociacion_enlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsociacion_enlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsociacion_enlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asociacion_enlaceContext asociacion_enlace() throws RecognitionException {
		Asociacion_enlaceContext _localctx = new Asociacion_enlaceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asociacion_enlace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ASOCIACIONM);
			setState(232);
			match(IGUAL);
			setState(233);
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

	public static class Objetos_enlaceContext extends ParserRuleContext {
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Objetos_enlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetos_enlace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterObjetos_enlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitObjetos_enlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitObjetos_enlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Objetos_enlaceContext objetos_enlace() throws RecognitionException {
		Objetos_enlaceContext _localctx = new Objetos_enlaceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objetos_enlace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			obj();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(236);
				match(COMA);
				setState(237);
				obj();
				}
				}
				setState(242);
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

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode OBJETOM() { return getToken(Anasint.OBJETOM, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(OBJETOM);
			setState(244);
			match(IGUAL);
			setState(245);
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

	public static class EliminarContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public TerminalNode ENLACE() { return getToken(Anasint.ENLACE, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode OBJETO() { return getToken(Anasint.OBJETO, 0); }
		public EliminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEliminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEliminar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEliminar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminarContext eliminar() throws RecognitionException {
		EliminarContext _localctx = new EliminarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eliminar);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(MENOS);
				setState(248);
				match(ENLACE);
				setState(249);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(MENOS);
				setState(251);
				match(OBJETO);
				setState(252);
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

	public static class ConsistenciaContext extends ParserRuleContext {
		public TerminalNode CONSISTENCIA() { return getToken(Anasint.CONSISTENCIA, 0); }
		public ConsistenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consistencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterConsistencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitConsistencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitConsistencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsistenciaContext consistencia() throws RecognitionException {
		ConsistenciaContext _localctx = new ConsistenciaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_consistencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(CONSISTENCIA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tr"+
		"\n\t\f\t\16\tu\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u009e\n\17\f\17\16"+
		"\17\u00a1\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00b8\n\24\f\24"+
		"\16\24\u00bb\13\24\3\25\3\25\3\25\5\25\u00c0\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00c6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u00d1"+
		"\n\30\f\30\16\30\u00d4\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\7\37\u00f1\n\37\f\37\16\37\u00f4\13\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\5!\u0100\n!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\5\3\2\31\32\5\2$$&"+
		"&**\4\2**--\2\u00ee\2D\3\2\2\2\4G\3\2\2\2\6M\3\2\2\2\bU\3\2\2\2\n`\3\2"+
		"\2\2\fh\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24|\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2\2\2$\u00b1\3\2\2\2&\u00b4\3\2\2\2(\u00bf"+
		"\3\2\2\2*\u00c5\3\2\2\2,\u00c7\3\2\2\2.\u00cd\3\2\2\2\60\u00d5\3\2\2\2"+
		"\62\u00d9\3\2\2\2\64\u00dd\3\2\2\2\66\u00df\3\2\2\28\u00e5\3\2\2\2:\u00e9"+
		"\3\2\2\2<\u00ed\3\2\2\2>\u00f5\3\2\2\2@\u00ff\3\2\2\2B\u0101\3\2\2\2D"+
		"E\5\4\3\2EF\5&\24\2F\3\3\2\2\2GH\7\6\2\2HI\5\6\4\2IJ\5\20\t\2JK\5\34\17"+
		"\2KL\5$\23\2L\5\3\2\2\2MN\7\b\2\2NR\7\36\2\2OQ\5\b\5\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UV\7\7\2\2VW\7+\2\2W[\7\33"+
		"\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^_\7\34\2\2_\t\3\2\2\2`e\5\f\7\2ab\7\37\2\2bd\5\f\7\2ca\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\36\2"+
		"\2jk\5\16\b\2k\r\3\2\2\2lm\t\2\2\2m\17\3\2\2\2no\7\n\2\2os\7\36\2\2pr"+
		"\5\22\n\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2\2us\3\2\2"+
		"\2vw\7\13\2\2wx\7,\2\2xy\7\33\2\2yz\5\24\13\2z{\7\34\2\2{\23\3\2\2\2|"+
		"}\5\26\f\2}~\7\37\2\2~\177\5\30\r\2\177\25\3\2\2\2\u0080\u0081\7\t\2\2"+
		"\u0081\u0082\7\36\2\2\u0082\u0083\7+\2\2\u0083\u0084\7\37\2\2\u0084\u0085"+
		"\7\f\2\2\u0085\u0086\7\36\2\2\u0086\u0087\7,\2\2\u0087\u0088\7\37\2\2"+
		"\u0088\u0089\7\r\2\2\u0089\u008a\7\36\2\2\u008a\u008b\5\32\16\2\u008b"+
		"\27\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u008e\7\36\2\2\u008e\u008f\7+\2"+
		"\2\u008f\u0090\7\37\2\2\u0090\u0091\7\f\2\2\u0091\u0092\7\36\2\2\u0092"+
		"\u0093\7,\2\2\u0093\u0094\7\37\2\2\u0094\u0095\7\r\2\2\u0095\u0096\7\36"+
		"\2\2\u0096\u0097\5\32\16\2\u0097\31\3\2\2\2\u0098\u0099\t\3\2\2\u0099"+
		"\33\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u009f\7\36\2\2\u009c\u009e\5\36"+
		"\20\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\17\2"+
		"\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7\37\2\2\u00a6"+
		"\u00a7\5\"\22\2\u00a7\u00a8\7\34\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\7\20"+
		"\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7+\2\2\u00ac!\3\2\2\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00af\7\36\2\2\u00af\u00b0\7+\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\7\22\2\2\u00b2\u00b3\7\36\2\2\u00b3%\3\2\2\2\u00b4\u00b5\7\23\2"+
		"\2\u00b5\u00b9\7\36\2\2\u00b6\u00b8\5(\25\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\'\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00c0\5*\26\2\u00bd\u00c0\5@!\2\u00be\u00c0"+
		"\5B\"\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		")\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c6\5,\27\2\u00c3\u00c4\7$\2\2\u00c4"+
		"\u00c6\5\66\34\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6+\3\2\2"+
		"\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\33\2\2\u00ca"+
		"\u00cb\5.\30\2\u00cb\u00cc\7\34\2\2\u00cc-\3\2\2\2\u00cd\u00d2\5\60\31"+
		"\2\u00ce\u00cf\7\37\2\2\u00cf\u00d1\5\62\32\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3/\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8"+
		"\7+\2\2\u00d8\61\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db\7 \2\2\u00db\u00dc"+
		"\5\64\33\2\u00dc\63\3\2\2\2\u00dd\u00de\t\4\2\2\u00de\65\3\2\2\2\u00df"+
		"\u00e0\7\25\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5"+
		"8\35\2\u00e3\u00e4\7\34\2\2\u00e4\67\3\2\2\2\u00e5\u00e6\5:\36\2\u00e6"+
		"\u00e7\7\37\2\2\u00e7\u00e8\5<\37\2\u00e89\3\2\2\2\u00e9\u00ea\7\26\2"+
		"\2\u00ea\u00eb\7 \2\2\u00eb\u00ec\7,\2\2\u00ec;\3\2\2\2\u00ed\u00f2\5"+
		"> \2\u00ee\u00ef\7\37\2\2\u00ef\u00f1\5> \2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3=\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8"+
		"\7,\2\2\u00f8?\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7\25\2\2\u00fb\u0100"+
		"\7,\2\2\u00fc\u00fd\7%\2\2\u00fd\u00fe\7\24\2\2\u00fe\u0100\7,\2\2\u00ff"+
		"\u00f9\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100A\3\2\2\2\u0101\u0102\7\27\2\2"+
		"\u0102C\3\2\2\2\rR[es\u009f\u00b9\u00bf\u00c5\u00d2\u00f2\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}