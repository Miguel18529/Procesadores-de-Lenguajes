// Generated from C:/Users/amigo/IdeaProjects/Ejemplo1/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, INSTRUCCIONES=5, EVAL=6, 
		DEF=7, NUMERO=8, VAR=9, PA=10, PC=11, PyC=12, COMA=13, MAS=14, MENOS=15, 
		POR=16, COMENTARIO_BLOQUE=17, COMENTARIO_LINEA=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "INSTRUCCIONES", 
			"EVAL", "DEF", "NUMERO", "VAR", "PA", "PC", "PyC", "COMA", "MAS", "MENOS", 
			"POR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13a\n\13\r\13\16\13b\3\f"+
		"\6\ff\n\f\r\f\16\fg\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24|\n\24\f\24\16\24\177\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u008a\n\25\f\25\16"+
		"\25\u008d\13\25\3\25\3\25\3\25\3\25\4}\u008b\2\26\3\3\5\4\7\5\t\2\13\2"+
		"\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24\3\2\4\3\2\62;\4\2C\\c|\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2"+
		"\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17H\3\2\2\2\21V\3\2\2"+
		"\2\23[\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2"+
		"\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)\u0085\3\2\2"+
		"\2+,\7\"\2\2,-\3\2\2\2-.\b\2\2\2.\4\3\2\2\2/\60\7\13\2\2\60\61\3\2\2\2"+
		"\61\62\b\3\2\2\62\6\3\2\2\2\63\65\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\7\f\2\2\678\3\2\2\289\b\4\2\29\b\3\2\2\2:;\t\2\2"+
		"\2;\n\3\2\2\2<=\t\3\2\2=\f\3\2\2\2>?\7X\2\2?@\7C\2\2@A\7T\2\2AB\7K\2\2"+
		"BC\7C\2\2CD\7D\2\2DE\7N\2\2EF\7G\2\2FG\7U\2\2G\16\3\2\2\2HI\7K\2\2IJ\7"+
		"P\2\2JK\7U\2\2KL\7V\2\2LM\7T\2\2MN\7W\2\2NO\7E\2\2OP\7E\2\2PQ\7K\2\2Q"+
		"R\7Q\2\2RS\7P\2\2ST\7G\2\2TU\7U\2\2U\20\3\2\2\2VW\7G\2\2WX\7X\2\2XY\7"+
		"C\2\2YZ\7N\2\2Z\22\3\2\2\2[\\\7F\2\2\\]\7G\2\2]^\7H\2\2^\24\3\2\2\2_a"+
		"\5\t\5\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\26\3\2\2\2df\5\13\6"+
		"\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\30\3\2\2\2ij\7*\2\2j\32\3"+
		"\2\2\2kl\7+\2\2l\34\3\2\2\2mn\7=\2\2n\36\3\2\2\2op\7.\2\2p \3\2\2\2qr"+
		"\7-\2\2r\"\3\2\2\2st\7/\2\2t$\3\2\2\2uv\7,\2\2v&\3\2\2\2wx\7\61\2\2xy"+
		"\7,\2\2y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2"+
		"\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7,\2\2\u0081\u0082\7\61\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0084\b\24\2\2\u0084(\3\2\2\2\u0085\u0086\7"+
		"\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088\u008a\13\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\7\4\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\25\2\2\u0091*\3\2\2\2\b\2\64bg}\u008b\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}