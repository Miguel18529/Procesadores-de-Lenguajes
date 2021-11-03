// Generated from C:/Users/amigo/IdeaProjects/Proyecto PL/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, PROGRAMA=4, VARIABLES=5, SUBPROGRAMAS=6, 
		INSTRUCCIONES=7, FUNCION=8, FFUNCION=9, PROCEDIMIENTO=10, FPROCEDIMIENTO=11, 
		VERDADERO=12, FALSO=13, DEV=14, COMA=15, DP=16, PyC=17, LOG=18, NUM=19, 
		SEQ=20, PA=21, PC=22, CA=23, CC=24, IGUAL=25, POR=26, SUMA=27, RESTA=28, 
		SI=29, SINO=30, FSI=31, ENTONCES=32, IGUALIGUAL=33, MENORQUE=34, MAYORQUE=35, 
		DISTINTODE=36, MENOROIGUAL=37, MAYOROIGUAL=38, MIENTRAS=39, FMIENTRAS=40, 
		HACER=41, RUPTURA=42, MOSTRAR=43, NOT=44, AND=45, OR=46, NUMERO=47, IDENT=48, 
		COMENTARIO_BLOQUE=49, COMENTARIO_LINEA=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "PROGRAMA", "VARIABLES", 
			"SUBPROGRAMAS", "INSTRUCCIONES", "FUNCION", "FFUNCION", "PROCEDIMIENTO", 
			"FPROCEDIMIENTO", "VERDADERO", "FALSO", "DEV", "COMA", "DP", "PyC", "LOG", 
			"NUM", "SEQ", "PA", "PC", "CA", "CC", "IGUAL", "POR", "SUMA", "RESTA", 
			"SI", "SINO", "FSI", "ENTONCES", "IGUALIGUAL", "MENORQUE", "MAYORQUE", 
			"DISTINTODE", "MENOROIGUAL", "MAYOROIGUAL", "MIENTRAS", "FMIENTRAS", 
			"HACER", "RUPTURA", "MOSTRAR", "NOT", "AND", "OR", "NUMERO", "IDENT", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'PROGRAMA'", "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'FUNCION'", "'FFUNCION'", "'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", 
			"'T'", "'F'", "'dev'", "','", "':'", "';'", "'LOG'", "'NUM'", "'SEQ'", 
			"'('", "')'", "'['", "']'", "'='", "'*'", "'+'", "'-'", "'si'", "'sino'", 
			"'fsi'", "'entonces'", "'=='", "'<'", "'>'", "'!='", "'<='", "'>='", 
			"'mientras'", "'fmientras'", "'hacer'", "'ruptura'", "'mostrar'", "'!'", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "FUNCION", "FFUNCION", "PROCEDIMIENTO", "FPROCEDIMIENTO", 
			"VERDADERO", "FALSO", "DEV", "COMA", "DP", "PyC", "LOG", "NUM", "SEQ", 
			"PA", "PC", "CA", "CC", "IGUAL", "POR", "SUMA", "RESTA", "SI", "SINO", 
			"FSI", "ENTONCES", "IGUALIGUAL", "MENORQUE", "MAYORQUE", "DISTINTODE", 
			"MENOROIGUAL", "MAYOROIGUAL", "MIENTRAS", "FMIENTRAS", "HACER", "RUPTURA", 
			"MOSTRAR", "NOT", "AND", "OR", "NUMERO", "IDENT", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0183\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4u\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\6\62\u015d\n\62\r\62\16\62\u015e\3\63\3\63\3\63\7\63\u0164\n\63"+
		"\f\63\16\63\u0167\13\63\3\64\3\64\3\64\3\64\7\64\u016d\n\64\f\64\16\64"+
		"\u0170\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u017b\n"+
		"\65\f\65\16\65\u017e\13\65\3\65\3\65\3\65\3\65\4\u016e\u017c\2\66\3\3"+
		"\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64\3\2\4\3\2\62"+
		";\5\2C\\aac|\2\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t"+
		"\3\2\2\2\tz\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0088\3\2\2\2\21\u0092"+
		"\3\2\2\2\23\u009f\3\2\2\2\25\u00ad\3\2\2\2\27\u00b5\3\2\2\2\31\u00be\3"+
		"\2\2\2\33\u00cc\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2"+
		"\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00ed"+
		"\3\2\2\2-\u00f1\3\2\2\2/\u00f5\3\2\2\2\61\u00f7\3\2\2\2\63\u00f9\3\2\2"+
		"\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0103"+
		"\3\2\2\2?\u0105\3\2\2\2A\u0108\3\2\2\2C\u010d\3\2\2\2E\u0111\3\2\2\2G"+
		"\u011a\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u0127\3\2\2\2S\u012a\3\2\2\2U\u0133\3\2\2\2W\u013d\3\2\2\2Y\u0143"+
		"\3\2\2\2[\u014b\3\2\2\2]\u0153\3\2\2\2_\u0155\3\2\2\2a\u0158\3\2\2\2c"+
		"\u015c\3\2\2\2e\u0160\3\2\2\2g\u0168\3\2\2\2i\u0176\3\2\2\2kl\7\"\2\2"+
		"lm\3\2\2\2mn\b\2\2\2n\4\3\2\2\2op\7\13\2\2pq\3\2\2\2qr\b\3\2\2r\6\3\2"+
		"\2\2su\7\17\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2wx\3\2\2\2xy\b"+
		"\4\2\2y\b\3\2\2\2z{\t\2\2\2{\n\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\f\3\2\2\2"+
		"\177\u0080\7R\2\2\u0080\u0081\7T\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7"+
		"I\2\2\u0083\u0084\7T\2\2\u0084\u0085\7C\2\2\u0085\u0086\7O\2\2\u0086\u0087"+
		"\7C\2\2\u0087\16\3\2\2\2\u0088\u0089\7X\2\2\u0089\u008a\7C\2\2\u008a\u008b"+
		"\7T\2\2\u008b\u008c\7K\2\2\u008c\u008d\7C\2\2\u008d\u008e\7D\2\2\u008e"+
		"\u008f\7N\2\2\u008f\u0090\7G\2\2\u0090\u0091\7U\2\2\u0091\20\3\2\2\2\u0092"+
		"\u0093\7U\2\2\u0093\u0094\7W\2\2\u0094\u0095\7D\2\2\u0095\u0096\7R\2\2"+
		"\u0096\u0097\7T\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7I\2\2\u0099\u009a"+
		"\7T\2\2\u009a\u009b\7C\2\2\u009b\u009c\7O\2\2\u009c\u009d\7C\2\2\u009d"+
		"\u009e\7U\2\2\u009e\22\3\2\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7P\2\2\u00a1"+
		"\u00a2\7U\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7T\2\2\u00a4\u00a5\7W\2\2"+
		"\u00a5\u00a6\7E\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9"+
		"\7Q\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7U\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7H\2\2\u00ae\u00af\7W\2\2\u00af\u00b0\7P\2\2\u00b0"+
		"\u00b1\7E\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7Q\2\2\u00b3\u00b4\7P\2\2"+
		"\u00b4\26\3\2\2\2\u00b5\u00b6\7H\2\2\u00b6\u00b7\7H\2\2\u00b7\u00b8\7"+
		"W\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7E\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc"+
		"\7Q\2\2\u00bc\u00bd\7P\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7R\2\2\u00bf\u00c0"+
		"\7T\2\2\u00c0\u00c1\7Q\2\2\u00c1\u00c2\7E\2\2\u00c2\u00c3\7G\2\2\u00c3"+
		"\u00c4\7F\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c7\7K\2\2"+
		"\u00c7\u00c8\7G\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb"+
		"\7Q\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7H\2\2\u00cd\u00ce\7R\2\2\u00ce\u00cf"+
		"\7T\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2\7G\2\2\u00d2"+
		"\u00d3\7F\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6\7K\2\2"+
		"\u00d6\u00d7\7G\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da"+
		"\7Q\2\2\u00da\34\3\2\2\2\u00db\u00dc\7V\2\2\u00dc\36\3\2\2\2\u00dd\u00de"+
		"\7H\2\2\u00de \3\2\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7x\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7.\2\2\u00e4$\3\2\2\2\u00e5\u00e6"+
		"\7<\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7"+
		"N\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7I\2\2\u00ec*\3\2\2\2\u00ed\u00ee"+
		"\7P\2\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7O\2\2\u00f0,\3\2\2\2\u00f1\u00f2"+
		"\7U\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f4\7S\2\2\u00f4.\3\2\2\2\u00f5\u00f6"+
		"\7*\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8\62\3\2\2\2\u00f9\u00fa"+
		"\7]\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7_\2\2\u00fc\66\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe8\3\2\2\2\u00ff\u0100\7,\2\2\u0100:\3\2\2\2\u0101\u0102\7"+
		"-\2\2\u0102<\3\2\2\2\u0103\u0104\7/\2\2\u0104>\3\2\2\2\u0105\u0106\7u"+
		"\2\2\u0106\u0107\7k\2\2\u0107@\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a"+
		"\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7q\2\2\u010cB\3\2\2\2\u010d\u010e"+
		"\7h\2\2\u010e\u010f\7u\2\2\u010f\u0110\7k\2\2\u0110D\3\2\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7p\2\2\u0113\u0114\7v\2\2\u0114\u0115\7q\2\2\u0115"+
		"\u0116\7p\2\2\u0116\u0117\7e\2\2\u0117\u0118\7g\2\2\u0118\u0119\7u\2\2"+
		"\u0119F\3\2\2\2\u011a\u011b\7?\2\2\u011b\u011c\7?\2\2\u011cH\3\2\2\2\u011d"+
		"\u011e\7>\2\2\u011eJ\3\2\2\2\u011f\u0120\7@\2\2\u0120L\3\2\2\2\u0121\u0122"+
		"\7#\2\2\u0122\u0123\7?\2\2\u0123N\3\2\2\2\u0124\u0125\7>\2\2\u0125\u0126"+
		"\7?\2\2\u0126P\3\2\2\2\u0127\u0128\7@\2\2\u0128\u0129\7?\2\2\u0129R\3"+
		"\2\2\2\u012a\u012b\7o\2\2\u012b\u012c\7k\2\2\u012c\u012d\7g\2\2\u012d"+
		"\u012e\7p\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131\7c\2\2"+
		"\u0131\u0132\7u\2\2\u0132T\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135\7o\2"+
		"\2\u0135\u0136\7k\2\2\u0136\u0137\7g\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7c\2\2\u013b\u013c\7u\2\2\u013c"+
		"V\3\2\2\2\u013d\u013e\7j\2\2\u013e\u013f\7c\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7g\2\2\u0141\u0142\7t\2\2\u0142X\3\2\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7w\2\2\u0145\u0146\7r\2\2\u0146\u0147\7v\2\2\u0147\u0148\7w\2\2"+
		"\u0148\u0149\7t\2\2\u0149\u014a\7c\2\2\u014aZ\3\2\2\2\u014b\u014c\7o\2"+
		"\2\u014c\u014d\7q\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2\u014f\u0150"+
		"\7t\2\2\u0150\u0151\7c\2\2\u0151\u0152\7t\2\2\u0152\\\3\2\2\2\u0153\u0154"+
		"\7#\2\2\u0154^\3\2\2\2\u0155\u0156\7(\2\2\u0156\u0157\7(\2\2\u0157`\3"+
		"\2\2\2\u0158\u0159\7~\2\2\u0159\u015a\7~\2\2\u015ab\3\2\2\2\u015b\u015d"+
		"\5\t\5\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015fd\3\2\2\2\u0160\u0165\5\13\6\2\u0161\u0164\5\13\6"+
		"\2\u0162\u0164\5\t\5\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166f\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7\61\2\2\u0169\u016a\7,\2\2\u016a\u016e\3\2"+
		"\2\2\u016b\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\7,\2\2\u0172\u0173\7\61\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\b\64\2\2\u0175h\3\2\2\2\u0176\u0177\7\61\2\2\u0177\u0178\7\61\2"+
		"\2\u0178\u017c\3\2\2\2\u0179\u017b\13\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\5\7\4\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\b\65\2\2\u0182j\3\2\2\2\n\2t}\u015e\u0163\u0165\u016e\u017c\3\b"+
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