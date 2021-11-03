// Generated from C:/Users/amigo/IdeaProjects/Proyecto en grupo\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, LOG=5, SEQ=6, PA=7, PC=8, CA=9, 
		CC=10, DOSPUNTOS=11, PyC=12, COMA=13, SUMA=14, RESTA=15, POR=16, AND=17, 
		OR=18, NOT=19, IGUAL=20, IGUALIGUAL=21, DISTINTO=22, MAYOR=23, MENOR=24, 
		MENORIGUAL=25, MAYORIGUAL=26, HACER=27, FALSO=28, VERDADERO=29, INDEFINIDO=30, 
		DEV=31, SI=32, ENTONCES=33, FSI=34, SINO=35, RUPTURA=36, MIENTRAS=37, 
		FMIENTRAS=38, NUMERO=39, VARIABLES=40, FUNCION=41, FFUNCION=42, PROCEDIMIENTO=43, 
		FPROCEDIMIENTO=44, MOSTRAR=45, INSTRUCCIONES=46, IDENT=47, COMENTARIO_BLOQUE=48, 
		COMENTARIO_LINEA=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUM", "LOG", 
			"SEQ", "PA", "PC", "CA", "CC", "DOSPUNTOS", "PyC", "COMA", "SUMA", "RESTA", 
			"POR", "AND", "OR", "NOT", "IGUAL", "IGUALIGUAL", "DISTINTO", "MAYOR", 
			"MENOR", "MENORIGUAL", "MAYORIGUAL", "HACER", "FALSO", "VERDADERO", "INDEFINIDO", 
			"DEV", "SI", "ENTONCES", "FSI", "SINO", "RUPTURA", "MIENTRAS", "FMIENTRAS", 
			"NUMERO", "VARIABLES", "FUNCION", "FFUNCION", "PROCEDIMIENTO", "FPROCEDIMIENTO", 
			"MOSTRAR", "INSTRUCCIONES", "IDENT", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4s\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\6*\u00ff\n*\r*\16*\u0100\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\7\62\u0154\n\62\f\62\16\62\u0157\13\62\3\63\3\63\3\63\3"+
		"\63\7\63\u015d\n\63\f\63\16\63\u0160\13\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\7\64\u016b\n\64\f\64\16\64\u016e\13\64\3\64\3\64\3"+
		"\64\3\64\4\u015e\u016c\2\65\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30"+
		"\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a"+
		"\60c\61e\62g\63\3\2\4\3\2\62;\5\2C\\aac|\2\u0176\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2"+
		"\2\5m\3\2\2\2\7r\3\2\2\2\tx\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\u0081\3"+
		"\2\2\2\21\u0085\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2"+
		"\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2"+
		"\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u00a0"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00aa\3\2\2\2"+
		"\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b7"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C\u00c9\3\2\2\2E"+
		"\u00cd\3\2\2\2G\u00d0\3\2\2\2I\u00d9\3\2\2\2K\u00dd\3\2\2\2M\u00e2\3\2"+
		"\2\2O\u00ea\3\2\2\2Q\u00f3\3\2\2\2S\u00fe\3\2\2\2U\u0102\3\2\2\2W\u010c"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u011d\3\2\2\2]\u012b\3\2\2\2_\u013a\3\2\2\2a"+
		"\u0142\3\2\2\2c\u0150\3\2\2\2e\u0158\3\2\2\2g\u0166\3\2\2\2ij\7\"\2\2"+
		"jk\3\2\2\2kl\b\2\2\2l\4\3\2\2\2mn\7\13\2\2no\3\2\2\2op\b\3\2\2p\6\3\2"+
		"\2\2qs\7\17\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\f\2\2uv\3\2\2\2vw\b"+
		"\4\2\2w\b\3\2\2\2xy\t\2\2\2y\n\3\2\2\2z|\t\3\2\2{z\3\2\2\2|\f\3\2\2\2"+
		"}~\7P\2\2~\177\7W\2\2\177\u0080\7O\2\2\u0080\16\3\2\2\2\u0081\u0082\7"+
		"N\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7I\2\2\u0084\20\3\2\2\2\u0085\u0086"+
		"\7U\2\2\u0086\u0087\7G\2\2\u0087\u0088\7S\2\2\u0088\22\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\24\3\2\2\2\u008b\u008c\7+\2\2\u008c\26\3\2\2\2\u008d\u008e"+
		"\7]\2\2\u008e\30\3\2\2\2\u008f\u0090\7_\2\2\u0090\32\3\2\2\2\u0091\u0092"+
		"\7<\2\2\u0092\34\3\2\2\2\u0093\u0094\7=\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7.\2\2\u0096 \3\2\2\2\u0097\u0098\7-\2\2\u0098\"\3\2\2\2\u0099\u009a"+
		"\7/\2\2\u009a$\3\2\2\2\u009b\u009c\7,\2\2\u009c&\3\2\2\2\u009d\u009e\7"+
		"(\2\2\u009e\u009f\7(\2\2\u009f(\3\2\2\2\u00a0\u00a1\7~\2\2\u00a1\u00a2"+
		"\7~\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7"+
		"?\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7?\2\2\u00a9\60\3"+
		"\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\7?\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\66\3\2\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2\u00b3\7?\2\2\u00b38\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc<\3\2\2\2\u00bd\u00be"+
		"\7H\2\2\u00be>\3\2\2\2\u00bf\u00c0\7V\2\2\u00c0@\3\2\2\2\u00c1\u00c2\7"+
		"w\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7p\2\2\u00c8B\3\2\2\2\u00c9\u00ca"+
		"\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7x\2\2\u00ccD\3\2\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7k\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8H\3\2\2\2\u00d9"+
		"\u00da\7h\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7k\2\2\u00dcJ\3\2\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7q\2\2"+
		"\u00e1L\3\2\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7r\2"+
		"\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7u\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7o\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2"+
		"\u00f8\u00f9\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
		"\7u\2\2\u00fcR\3\2\2\2\u00fd\u00ff\5\t\5\2\u00fe\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101T\3\2\2\2\u0102"+
		"\u0103\7X\2\2\u0103\u0104\7C\2\2\u0104\u0105\7T\2\2\u0105\u0106\7K\2\2"+
		"\u0106\u0107\7C\2\2\u0107\u0108\7D\2\2\u0108\u0109\7N\2\2\u0109\u010a"+
		"\7G\2\2\u010a\u010b\7U\2\2\u010bV\3\2\2\2\u010c\u010d\7H\2\2\u010d\u010e"+
		"\7W\2\2\u010e\u010f\7P\2\2\u010f\u0110\7E\2\2\u0110\u0111\7K\2\2\u0111"+
		"\u0112\7Q\2\2\u0112\u0113\7P\2\2\u0113X\3\2\2\2\u0114\u0115\7H\2\2\u0115"+
		"\u0116\7H\2\2\u0116\u0117\7W\2\2\u0117\u0118\7P\2\2\u0118\u0119\7E\2\2"+
		"\u0119\u011a\7K\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7P\2\2\u011cZ\3\2\2"+
		"\2\u011d\u011e\7R\2\2\u011e\u011f\7T\2\2\u011f\u0120\7Q\2\2\u0120\u0121"+
		"\7E\2\2\u0121\u0122\7G\2\2\u0122\u0123\7F\2\2\u0123\u0124\7K\2\2\u0124"+
		"\u0125\7O\2\2\u0125\u0126\7K\2\2\u0126\u0127\7G\2\2\u0127\u0128\7P\2\2"+
		"\u0128\u0129\7V\2\2\u0129\u012a\7Q\2\2\u012a\\\3\2\2\2\u012b\u012c\7H"+
		"\2\2\u012c\u012d\7R\2\2\u012d\u012e\7T\2\2\u012e\u012f\7Q\2\2\u012f\u0130"+
		"\7E\2\2\u0130\u0131\7G\2\2\u0131\u0132\7F\2\2\u0132\u0133\7K\2\2\u0133"+
		"\u0134\7O\2\2\u0134\u0135\7K\2\2\u0135\u0136\7G\2\2\u0136\u0137\7P\2\2"+
		"\u0137\u0138\7V\2\2\u0138\u0139\7Q\2\2\u0139^\3\2\2\2\u013a\u013b\7o\2"+
		"\2\u013b\u013c\7q\2\2\u013c\u013d\7u\2\2\u013d\u013e\7v\2\2\u013e\u013f"+
		"\7t\2\2\u013f\u0140\7c\2\2\u0140\u0141\7t\2\2\u0141`\3\2\2\2\u0142\u0143"+
		"\7K\2\2\u0143\u0144\7P\2\2\u0144\u0145\7U\2\2\u0145\u0146\7V\2\2\u0146"+
		"\u0147\7T\2\2\u0147\u0148\7W\2\2\u0148\u0149\7E\2\2\u0149\u014a\7E\2\2"+
		"\u014a\u014b\7K\2\2\u014b\u014c\7Q\2\2\u014c\u014d\7P\2\2\u014d\u014e"+
		"\7G\2\2\u014e\u014f\7U\2\2\u014fb\3\2\2\2\u0150\u0155\5\13\6\2\u0151\u0154"+
		"\5\13\6\2\u0152\u0154\5\t\5\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2"+
		"\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156d\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7,\2\2\u015a"+
		"\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7\61\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\b\63\2\2\u0165f\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168"+
		"\7\61\2\2\u0168\u016c\3\2\2\2\u0169\u016b\13\2\2\2\u016a\u0169\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\5\7\4\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\b\64\2\2\u0172h\3\2\2\2\n\2r{\u0100\u0153\u0155\u015e\u016c\3\b"+
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