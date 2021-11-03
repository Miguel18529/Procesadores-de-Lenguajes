// Generated from C:/Users/amigo/IdeaProjects/Break Inalcanzable/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, ASIG=4, WHILE=5, IF=6, BREAK=7, MAS=8, 
		MENOS=9, POR=10, DIV=11, MENOR=12, MAYOR=13, MENORIGUAL=14, MAYORIGUAL=15, 
		IGUAL=16, DISTINTO=17, PA=18, PC=19, LLA=20, LLC=21, PyC=22, IDENT=23, 
		NUMERO=24, COMENTARIO_BLOQUE=25, COMENTARIO_LINEA=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "ASIG", "WHILE", 
			"IF", "BREAK", "MAS", "MENOS", "POR", "DIV", "MENOR", "MAYOR", "MENORIGUAL", 
			"MAYORIGUAL", "IGUAL", "DISTINTO", "PA", "PC", "LLA", "LLC", "PyC", "IDENT", 
			"NUMERO", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'='", "'while'", "'if'", "'break'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'('", 
			"')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "ASIG", "WHILE", "IF", "BREAK", 
			"MAS", "MENOS", "POR", "DIV", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", 
			"IGUAL", "DISTINTO", "PA", "PC", "LLA", "LLC", "PyC", "IDENT", "NUMERO", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\7\32\u0085\n\32\f\32\16\32\u0088\13\32\3\33\5"+
		"\33\u008b\n\33\3\33\6\33\u008e\n\33\r\33\16\33\u008f\3\34\3\34\3\34\3"+
		"\34\7\34\u0096\n\34\f\34\16\34\u0099\13\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\7\35\u00a4\n\35\f\35\16\35\u00a7\13\35\3\35\3\35\3"+
		"\35\3\35\4\u0097\u00a5\2\36\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30"+
		"\63\31\65\32\67\339\34\3\2\4\3\2\62;\4\2C\\c|\2\u00b0\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tJ\3\2\2\2\13"+
		"L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25_\3\2\2\2\27"+
		"a\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#n"+
		"\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)w\3\2\2\2+y\3\2\2\2-{\3\2\2\2/}\3\2\2\2"+
		"\61\177\3\2\2\2\63\u0081\3\2\2\2\65\u008a\3\2\2\2\67\u0091\3\2\2\29\u009f"+
		"\3\2\2\2;<\7\"\2\2<=\3\2\2\2=>\b\2\2\2>\4\3\2\2\2?@\7\13\2\2@A\3\2\2\2"+
		"AB\b\3\2\2B\6\3\2\2\2CE\7\17\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2"+
		"\2GH\3\2\2\2HI\b\4\2\2I\b\3\2\2\2JK\t\2\2\2K\n\3\2\2\2LM\t\3\2\2M\f\3"+
		"\2\2\2NO\7?\2\2O\16\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7g\2"+
		"\2U\20\3\2\2\2VW\7k\2\2WX\7h\2\2X\22\3\2\2\2YZ\7d\2\2Z[\7t\2\2[\\\7g\2"+
		"\2\\]\7c\2\2]^\7m\2\2^\24\3\2\2\2_`\7-\2\2`\26\3\2\2\2ab\7/\2\2b\30\3"+
		"\2\2\2cd\7,\2\2d\32\3\2\2\2ef\7\61\2\2f\34\3\2\2\2gh\7>\2\2h\36\3\2\2"+
		"\2ij\7@\2\2j \3\2\2\2kl\7>\2\2lm\7?\2\2m\"\3\2\2\2no\7@\2\2op\7?\2\2p"+
		"$\3\2\2\2qr\7?\2\2rs\7?\2\2s&\3\2\2\2tu\7#\2\2uv\7?\2\2v(\3\2\2\2wx\7"+
		"*\2\2x*\3\2\2\2yz\7+\2\2z,\3\2\2\2{|\7}\2\2|.\3\2\2\2}~\7\177\2\2~\60"+
		"\3\2\2\2\177\u0080\7=\2\2\u0080\62\3\2\2\2\u0081\u0086\5\13\6\2\u0082"+
		"\u0085\5\t\5\2\u0083\u0085\5\13\6\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\64\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7/\2\2\u008a\u0089\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5\t\5\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\66\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2"+
		"\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7,\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\34\2\2\u009e8\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2"+
		"\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\7\4\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\35\2\2\u00ab:\3\2\2\2\n\2D\u0084\u0086\u008a\u008f\u0097\u00a5"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}