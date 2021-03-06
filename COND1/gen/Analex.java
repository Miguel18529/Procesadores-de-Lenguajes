// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/COND1/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, PROGRAMA=4, VARIABLES=5, INSTRUCCIONES=6, 
		RUPTURA=7, MOSTRAR=8, ENTONCES=9, FINSI=10, SINO=11, MAYOR=12, MENOR=13, 
		IGUAL=14, DISTINTO=15, MAYORIGUAL=16, MENORIGUAL=17, MAS=18, MENOS=19, 
		POR=20, PUNTOYCOMA=21, COMA=22, ASIG=23, SI=24, PARENTESISABIERTO=25, 
		PARENTESISCERRADO=26, NUM=27, VAR=28, NUMERO=29, IDENT=30, COMENT_BLOQUE=31, 
		COMENT_LINEA=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "LETRA", "DIGITO", "PROGRAMA", "VARIABLES", 
			"INSTRUCCIONES", "RUPTURA", "MOSTRAR", "ENTONCES", "FINSI", "SINO", "MAYOR", 
			"MENOR", "IGUAL", "DISTINTO", "MAYORIGUAL", "MENORIGUAL", "MAS", "MENOS", 
			"POR", "PUNTOYCOMA", "COMA", "ASIG", "SI", "PARENTESISABIERTO", "PARENTESISCERRADO", 
			"NUM", "VAR", "NUMERO", "IDENT", "COMENT_BLOQUE", "COMENT_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4Q\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \6 \u00c8\n \r \16 \u00c9\3!\3!\3!\7!\u00cf\n!\f"+
		"!\16!\u00d2\13!\3\"\3\"\3\"\3\"\7\"\u00d8\n\"\f\"\16\"\u00db\13\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00e6\n#\f#\16#\u00e9\13#\3#\3#\3#\3#"+
		"\4\u00d9\u00e7\2$\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"\3\2\4\4\2C\\c|\3\2\62;\2\u00f1\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7P\3\2\2\2\tV\3\2\2\2"+
		"\13X\3\2\2\2\rZ\3\2\2\2\17c\3\2\2\2\21m\3\2\2\2\23{\3\2\2\2\25\u0083\3"+
		"\2\2\2\27\u008b\3\2\2\2\31\u0094\3\2\2\2\33\u009a\3\2\2\2\35\u009f\3\2"+
		"\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a6\3\2\2\2%\u00a9\3\2\2\2\'\u00ac"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00be\3\2\2\29\u00c0"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c7\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00d3\3\2\2\2E\u00e1\3\2\2\2GH\7\"\2\2HI\3\2\2\2IJ\b\2\2\2J\4\3\2\2\2"+
		"KL\7\13\2\2LM\3\2\2\2MN\b\3\2\2N\6\3\2\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2"+
		"\2\2QR\3\2\2\2RS\7\f\2\2ST\3\2\2\2TU\b\4\2\2U\b\3\2\2\2VW\t\2\2\2W\n\3"+
		"\2\2\2XY\t\3\2\2Y\f\3\2\2\2Z[\7R\2\2[\\\7T\2\2\\]\7Q\2\2]^\7I\2\2^_\7"+
		"T\2\2_`\7C\2\2`a\7O\2\2ab\7C\2\2b\16\3\2\2\2cd\7X\2\2de\7C\2\2ef\7T\2"+
		"\2fg\7K\2\2gh\7C\2\2hi\7D\2\2ij\7N\2\2jk\7G\2\2kl\7U\2\2l\20\3\2\2\2m"+
		"n\7K\2\2no\7P\2\2op\7U\2\2pq\7V\2\2qr\7T\2\2rs\7W\2\2st\7E\2\2tu\7E\2"+
		"\2uv\7K\2\2vw\7Q\2\2wx\7P\2\2xy\7G\2\2yz\7U\2\2z\22\3\2\2\2{|\7t\2\2|"+
		"}\7w\2\2}~\7r\2\2~\177\7v\2\2\177\u0080\7w\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7c\2\2\u0082\24\3\2\2\2\u0083\u0084\7o\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7t\2\2\u008a\26\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7"+
		"p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7g\2\2\u0092\u0093\7u\2\2\u0093\30\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7k\2\2\u0099\32\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7q\2\2\u009e\34\3\2\2\2\u009f\u00a0\7@\2\2\u00a0"+
		"\36\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		"$\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\u00ab\7?\2\2\u00ab&\3\2\2\2\u00ac\u00ad"+
		"\7>\2\2\u00ad\u00ae\7?\2\2\u00ae(\3\2\2\2\u00af\u00b0\7-\2\2\u00b0*\3"+
		"\2\2\2\u00b1\u00b2\7/\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4.\3\2"+
		"\2\2\u00b5\u00b6\7=\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8\62\3"+
		"\2\2\2\u00b9\u00ba\7?\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7*\2\2\u00bf8\3\2\2\2\u00c0\u00c1"+
		"\7+\2\2\u00c1:\3\2\2\2\u00c2\u00c3\5? \2\u00c3<\3\2\2\2\u00c4\u00c5\5"+
		"A!\2\u00c5>\3\2\2\2\u00c6\u00c8\5\13\6\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca@\3\2\2\2\u00cb"+
		"\u00d0\5\t\5\2\u00cc\u00cf\5\t\5\2\u00cd\u00cf\5\13\6\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1B\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\61\2\2"+
		"\u00d4\u00d5\7,\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7\61"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\"\2\2\u00e0D\3\2\2\2\u00e1\u00e2"+
		"\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\13\2\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\7\4\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\b#\2\2\u00edF\3\2\2\2\t\2P\u00c9\u00ce\u00d0"+
		"\u00d9\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}