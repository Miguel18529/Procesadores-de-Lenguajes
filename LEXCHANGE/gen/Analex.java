// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/LEXCHANGE/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, ESQUEMA=4, FUENTE=5, DATOS=6, DESTINO=7, 
		RESTRICCIONES=8, IMPLICA=9, VAR=10, COMA=11, PA=12, PC=13, PyC=14, NUMERO=15, 
		IDENT=16, COMENTARIO_BLOQUE=17, COMENTARIO_LINEA=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "ESQUEMA", "FUENTE", 
			"DATOS", "DESTINO", "RESTRICCIONES", "IMPLICA", "VAR", "COMA", "PA", 
			"PC", "PyC", "NUMERO", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22\177\n\22\r\22\16"+
		"\22\u0080\3\23\3\23\3\23\7\23\u0086\n\23\f\23\16\23\u0089\13\23\3\24\3"+
		"\24\3\24\3\24\7\24\u008f\n\24\f\24\16\24\u0092\13\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\7\25\u009d\n\25\f\25\16\25\u00a0\13\25\3"+
		"\25\3\25\3\25\3\25\4\u0090\u009e\2\26\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21"+
		"\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24\3\2\4\3"+
		"\2\62;\4\2C\\c|\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\64\3\2\2"+
		"\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17F\3\2\2\2\21M\3\2\2\2\23S\3\2\2"+
		"\2\25[\3\2\2\2\27i\3\2\2\2\31q\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2"+
		"\2\2!{\3\2\2\2#~\3\2\2\2%\u0082\3\2\2\2\'\u008a\3\2\2\2)\u0098\3\2\2\2"+
		"+,\7\"\2\2,-\3\2\2\2-.\b\2\2\2.\4\3\2\2\2/\60\7\13\2\2\60\61\3\2\2\2\61"+
		"\62\b\3\2\2\62\6\3\2\2\2\63\65\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\7\f\2\2\678\3\2\2\289\b\4\2\29\b\3\2\2\2:;\t\2\2\2;"+
		"\n\3\2\2\2<=\t\3\2\2=\f\3\2\2\2>?\7G\2\2?@\7U\2\2@A\7S\2\2AB\7W\2\2BC"+
		"\7G\2\2CD\7O\2\2DE\7C\2\2E\16\3\2\2\2FG\7H\2\2GH\7W\2\2HI\7G\2\2IJ\7P"+
		"\2\2JK\7V\2\2KL\7G\2\2L\20\3\2\2\2MN\7F\2\2NO\7C\2\2OP\7V\2\2PQ\7Q\2\2"+
		"QR\7U\2\2R\22\3\2\2\2ST\7F\2\2TU\7G\2\2UV\7U\2\2VW\7V\2\2WX\7K\2\2XY\7"+
		"P\2\2YZ\7Q\2\2Z\24\3\2\2\2[\\\7T\2\2\\]\7G\2\2]^\7U\2\2^_\7V\2\2_`\7T"+
		"\2\2`a\7K\2\2ab\7E\2\2bc\7E\2\2cd\7K\2\2de\7Q\2\2ef\7P\2\2fg\7G\2\2gh"+
		"\7U\2\2h\26\3\2\2\2ij\7k\2\2jk\7o\2\2kl\7r\2\2lm\7n\2\2mn\7k\2\2no\7e"+
		"\2\2op\7c\2\2p\30\3\2\2\2qr\7X\2\2rs\7C\2\2st\7T\2\2t\32\3\2\2\2uv\7."+
		"\2\2v\34\3\2\2\2wx\7*\2\2x\36\3\2\2\2yz\7+\2\2z \3\2\2\2{|\7=\2\2|\"\3"+
		"\2\2\2}\177\5\t\5\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081$\3\2\2\2\u0082\u0087\5\13\6\2\u0083\u0086\5\13\6\2\u0084"+
		"\u0086\5\t\5\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7,\2\2\u008c\u0090\3\2\2\2\u008d"+
		"\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7,\2\2\u0094\u0095\7\61\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\24"+
		"\2\2\u0097(\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7\61\2\2\u009a\u009e"+
		"\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\5\7\4\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\25\2\2"+
		"\u00a4*\3\2\2\2\t\2\64\u0080\u0085\u0087\u0090\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}