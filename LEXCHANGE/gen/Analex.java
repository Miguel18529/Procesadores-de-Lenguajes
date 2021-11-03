// Generated from C:/Users/amigo/IdeaProjects/LEXCHANGE/src\Analex.g4 by ANTLR 4.8
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
		IDENT_MAYUS=16, IDENT=17, COMENTARIO_BLOQUE=18, COMENTARIO_LINEA=19;
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
			"PC", "PyC", "NUMERO", "IDENT_MAYUS", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
			"NUMERO", "IDENT_MAYUS", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22\u0081\n"+
		"\22\r\22\16\22\u0082\3\23\6\23\u0086\n\23\r\23\16\23\u0087\3\24\3\24\3"+
		"\24\7\24\u008d\n\24\f\24\16\24\u0090\13\24\3\25\3\25\3\25\3\25\7\25\u0096"+
		"\n\25\f\25\16\25\u0099\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u00a4\n\26\f\26\16\26\u00a7\13\26\3\26\3\26\3\26\3\26\4\u0097"+
		"\u00a5\2\27\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25\3\2\5\3\2\62;\4\2C\\c|\3\2C\\"+
		"\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\61\3\2\2\2\7\66\3\2\2\2"+
		"\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17H\3\2\2\2\21O\3\2\2\2\23U\3\2\2\2"+
		"\25]\3\2\2\2\27k\3\2\2\2\31s\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2"+
		"\2!}\3\2\2\2#\u0080\3\2\2\2%\u0085\3\2\2\2\'\u0089\3\2\2\2)\u0091\3\2"+
		"\2\2+\u009f\3\2\2\2-.\7\"\2\2./\3\2\2\2/\60\b\2\2\2\60\4\3\2\2\2\61\62"+
		"\7\13\2\2\62\63\3\2\2\2\63\64\b\3\2\2\64\6\3\2\2\2\65\67\7\17\2\2\66\65"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\f\2\29:\3\2\2\2:;\b\4\2\2;\b\3"+
		"\2\2\2<=\t\2\2\2=\n\3\2\2\2>?\t\3\2\2?\f\3\2\2\2@A\7G\2\2AB\7U\2\2BC\7"+
		"S\2\2CD\7W\2\2DE\7G\2\2EF\7O\2\2FG\7C\2\2G\16\3\2\2\2HI\7H\2\2IJ\7W\2"+
		"\2JK\7G\2\2KL\7P\2\2LM\7V\2\2MN\7G\2\2N\20\3\2\2\2OP\7F\2\2PQ\7C\2\2Q"+
		"R\7V\2\2RS\7Q\2\2ST\7U\2\2T\22\3\2\2\2UV\7F\2\2VW\7G\2\2WX\7U\2\2XY\7"+
		"V\2\2YZ\7K\2\2Z[\7P\2\2[\\\7Q\2\2\\\24\3\2\2\2]^\7T\2\2^_\7G\2\2_`\7U"+
		"\2\2`a\7V\2\2ab\7T\2\2bc\7K\2\2cd\7E\2\2de\7E\2\2ef\7K\2\2fg\7Q\2\2gh"+
		"\7P\2\2hi\7G\2\2ij\7U\2\2j\26\3\2\2\2kl\7k\2\2lm\7o\2\2mn\7r\2\2no\7n"+
		"\2\2op\7k\2\2pq\7e\2\2qr\7c\2\2r\30\3\2\2\2st\7X\2\2tu\7C\2\2uv\7T\2\2"+
		"v\32\3\2\2\2wx\7.\2\2x\34\3\2\2\2yz\7*\2\2z\36\3\2\2\2{|\7+\2\2| \3\2"+
		"\2\2}~\7=\2\2~\"\3\2\2\2\177\u0081\5\t\5\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083$\3\2\2\2\u0084"+
		"\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u008e\5\13\6\2\u008a\u008d"+
		"\5\13\6\2\u008b\u008d\5\t\5\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f(\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7,\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\25\2\2\u009e*\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1"+
		"\7\61\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\7\4\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\26\2\2\u00ab,\3\2\2\2\n\2\66\u0082\u0087\u008c\u008e\u0097\u00a5"+
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