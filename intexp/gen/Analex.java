// Generated from C:/Users/amigo/IdeaProjects/intexp\Analex.g4 by ANTLR 4.8
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
		CC=10, DOSPUNTOS=11, PyC=12, COMA=13, MAS=14, MENOS=15, POR=16, DIV=17, 
		AND=18, OR=19, NOT=20, ASIG=21, IGUALIGUAL=22, DISTINTO=23, MAYOR=24, 
		MENOR=25, MENORIGUAL=26, MAYORIGUAL=27, HACER=28, FALSO=29, VERDADERO=30, 
		INDEFINIDO=31, DEV=32, SI=33, ENTONCES=34, FSI=35, SINO=36, RUPTURA=37, 
		MIENTRAS=38, FMIENTRAS=39, NUMERO=40, VARIABLES=41, FUNCION=42, FFUNCION=43, 
		PROCEDIMIENTO=44, FPROCEDIMIENTO=45, MOSTRAR=46, INSTRUCCIONES=47, IDENT=48, 
		COMENTARIO_BLOQUE=49, COMENTARIO_LINEA=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUM", "LOG", 
			"SEQ", "PA", "PC", "CA", "CC", "DOSPUNTOS", "PyC", "COMA", "MAS", "MENOS", 
			"POR", "DIV", "AND", "OR", "NOT", "ASIG", "IGUALIGUAL", "DISTINTO", "MAYOR", 
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
			"']'", "':'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", 
			"'!'", "'='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'hacer'", 
			"'false'", "'true'", "'unknown'", "'dev'", "'si'", "'entonces'", "'fsi'", 
			"'sino'", "'ruptura'", "'mientras'", "'fmientras'", null, "'VARIABLES'", 
			"'FUNCION'", "'FFUNCION'", "'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", "'mostrar'", 
			"'INSTRUCCIONES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "LOG", "SEQ", "PA", 
			"PC", "CA", "CC", "DOSPUNTOS", "PyC", "COMA", "MAS", "MENOS", "POR", 
			"DIV", "AND", "OR", "NOT", "ASIG", "IGUALIGUAL", "DISTINTO", "MAYOR", 
			"MENOR", "MENORIGUAL", "MAYORIGUAL", "HACER", "FALSO", "VERDADERO", "INDEFINIDO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0181\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4u\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3+\5+\u010a\n+\3+\6+\u010d\n+\r+\16+\u010e\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\7\63\u0162\n\63\f\63\16\63\u0165\13\63\3"+
		"\64\3\64\3\64\3\64\7\64\u016b\n\64\f\64\16\64\u016e\13\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0179\n\65\f\65\16\65\u017c\13"+
		"\65\3\65\3\65\3\65\3\65\4\u016c\u017a\2\66\3\3\5\4\7\5\t\2\13\2\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S"+
		")U*W+Y,[-]._/a\60c\61e\62g\63i\64\3\2\4\3\2\62;\5\2C\\aac|\2\u0185\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t\3\2\2\2\tz\3\2\2\2\13}\3"+
		"\2\2\2\r\177\3\2\2\2\17\u0083\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2"+
		"\2\25\u008d\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2"+
		"\35\u0095\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d"+
		"\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2"+
		"/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b1\3\2\2\2\67"+
		"\u00b3\3\2\2\29\u00b5\3\2\2\2;\u00b8\3\2\2\2=\u00bb\3\2\2\2?\u00c1\3\2"+
		"\2\2A\u00c7\3\2\2\2C\u00cc\3\2\2\2E\u00d4\3\2\2\2G\u00d8\3\2\2\2I\u00db"+
		"\3\2\2\2K\u00e4\3\2\2\2M\u00e8\3\2\2\2O\u00ed\3\2\2\2Q\u00f5\3\2\2\2S"+
		"\u00fe\3\2\2\2U\u0109\3\2\2\2W\u0110\3\2\2\2Y\u011a\3\2\2\2[\u0122\3\2"+
		"\2\2]\u012b\3\2\2\2_\u0139\3\2\2\2a\u0148\3\2\2\2c\u0150\3\2\2\2e\u015e"+
		"\3\2\2\2g\u0166\3\2\2\2i\u0174\3\2\2\2kl\7\"\2\2lm\3\2\2\2mn\b\2\2\2n"+
		"\4\3\2\2\2op\7\13\2\2pq\3\2\2\2qr\b\3\2\2r\6\3\2\2\2su\7\17\2\2ts\3\2"+
		"\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2wx\3\2\2\2xy\b\4\2\2y\b\3\2\2\2z{\t"+
		"\2\2\2{\n\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\f\3\2\2\2\177\u0080\7P\2\2\u0080"+
		"\u0081\7W\2\2\u0081\u0082\7O\2\2\u0082\16\3\2\2\2\u0083\u0084\7N\2\2\u0084"+
		"\u0085\7Q\2\2\u0085\u0086\7I\2\2\u0086\20\3\2\2\2\u0087\u0088\7U\2\2\u0088"+
		"\u0089\7G\2\2\u0089\u008a\7S\2\2\u008a\22\3\2\2\2\u008b\u008c\7*\2\2\u008c"+
		"\24\3\2\2\2\u008d\u008e\7+\2\2\u008e\26\3\2\2\2\u008f\u0090\7]\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7_\2\2\u0092\32\3\2\2\2\u0093\u0094\7<\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7=\2\2\u0096\36\3\2\2\2\u0097\u0098\7.\2\2\u0098"+
		" \3\2\2\2\u0099\u009a\7-\2\2\u009a\"\3\2\2\2\u009b\u009c\7/\2\2\u009c"+
		"$\3\2\2\2\u009d\u009e\7,\2\2\u009e&\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"(\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3\7(\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7~\2\2\u00a5\u00a6\7~\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8.\3"+
		"\2\2\2\u00a9\u00aa\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7?\2\2\u00b0\64"+
		"\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"8\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7:\3\2\2\2\u00b8\u00b9"+
		"\7@\2\2\u00b9\u00ba\7?\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		">\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7g\2\2\u00cbB\3\2\2\2\u00cc"+
		"\u00cd\7w\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\u00d1\7q\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7p\2\2\u00d3D\3\2\2"+
		"\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7x\2\2\u00d7F\3\2"+
		"\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7k\2\2\u00daH\3\2\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7u\2\2"+
		"\u00e3J\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7k\2"+
		"\2\u00e7L\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7"+
		"p\2\2\u00eb\u00ec\7q\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7w\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7c\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7o\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fdR\3\2\2"+
		"\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7t\2\2\u0105"+
		"\u0106\7c\2\2\u0106\u0107\7u\2\2\u0107T\3\2\2\2\u0108\u010a\7/\2\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u010d\5\t"+
		"\5\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010fV\3\2\2\2\u0110\u0111\7X\2\2\u0111\u0112\7C\2\2\u0112"+
		"\u0113\7T\2\2\u0113\u0114\7K\2\2\u0114\u0115\7C\2\2\u0115\u0116\7D\2\2"+
		"\u0116\u0117\7N\2\2\u0117\u0118\7G\2\2\u0118\u0119\7U\2\2\u0119X\3\2\2"+
		"\2\u011a\u011b\7H\2\2\u011b\u011c\7W\2\2\u011c\u011d\7P\2\2\u011d\u011e"+
		"\7E\2\2\u011e\u011f\7K\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7P\2\2\u0121"+
		"Z\3\2\2\2\u0122\u0123\7H\2\2\u0123\u0124\7H\2\2\u0124\u0125\7W\2\2\u0125"+
		"\u0126\7P\2\2\u0126\u0127\7E\2\2\u0127\u0128\7K\2\2\u0128\u0129\7Q\2\2"+
		"\u0129\u012a\7P\2\2\u012a\\\3\2\2\2\u012b\u012c\7R\2\2\u012c\u012d\7T"+
		"\2\2\u012d\u012e\7Q\2\2\u012e\u012f\7E\2\2\u012f\u0130\7G\2\2\u0130\u0131"+
		"\7F\2\2\u0131\u0132\7K\2\2\u0132\u0133\7O\2\2\u0133\u0134\7K\2\2\u0134"+
		"\u0135\7G\2\2\u0135\u0136\7P\2\2\u0136\u0137\7V\2\2\u0137\u0138\7Q\2\2"+
		"\u0138^\3\2\2\2\u0139\u013a\7H\2\2\u013a\u013b\7R\2\2\u013b\u013c\7T\2"+
		"\2\u013c\u013d\7Q\2\2\u013d\u013e\7E\2\2\u013e\u013f\7G\2\2\u013f\u0140"+
		"\7F\2\2\u0140\u0141\7K\2\2\u0141\u0142\7O\2\2\u0142\u0143\7K\2\2\u0143"+
		"\u0144\7G\2\2\u0144\u0145\7P\2\2\u0145\u0146\7V\2\2\u0146\u0147\7Q\2\2"+
		"\u0147`\3\2\2\2\u0148\u0149\7o\2\2\u0149\u014a\7q\2\2\u014a\u014b\7u\2"+
		"\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7c\2\2\u014e\u014f"+
		"\7t\2\2\u014fb\3\2\2\2\u0150\u0151\7K\2\2\u0151\u0152\7P\2\2\u0152\u0153"+
		"\7U\2\2\u0153\u0154\7V\2\2\u0154\u0155\7T\2\2\u0155\u0156\7W\2\2\u0156"+
		"\u0157\7E\2\2\u0157\u0158\7E\2\2\u0158\u0159\7K\2\2\u0159\u015a\7Q\2\2"+
		"\u015a\u015b\7P\2\2\u015b\u015c\7G\2\2\u015c\u015d\7U\2\2\u015dd\3\2\2"+
		"\2\u015e\u0163\5\13\6\2\u015f\u0162\5\13\6\2\u0160\u0162\5\t\5\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164f\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167"+
		"\7\61\2\2\u0167\u0168\7,\2\2\u0168\u016c\3\2\2\2\u0169\u016b\13\2\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7,\2\2\u0170"+
		"\u0171\7\61\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\64\2\2\u0173h\3\2\2"+
		"\2\u0174\u0175\7\61\2\2\u0175\u0176\7\61\2\2\u0176\u017a\3\2\2\2\u0177"+
		"\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\5\7\4\2\u017e\u017f\3\2\2\2\u017f\u0180\b\65\2\2\u0180j\3\2\2\2"+
		"\13\2t}\u0109\u010e\u0161\u0163\u016c\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}