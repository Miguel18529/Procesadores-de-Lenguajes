// Generated from C:/Users/amigo/IdeaProjects/Proyecto Septiembre/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, ESPECIFICACION=4, CLASE=5, CLASES=6, 
		CLASEM=7, ASOCIACIONES=8, ASOCIACION=9, ROL=10, MULTIPLICIDAD=11, GENERALIZACIONES=12, 
		GENERALIZACION=13, SUPERCLASE=14, SUBCLASES=15, RESTRICCIONES=16, INSTRUCCIONES=17, 
		OBJETO=18, ENLACE=19, ASOCIACIONM=20, CONSISTENCIA=21, OBJETOM=22, NUM=23, 
		TXT=24, PA=25, PC=26, PyC=27, DP=28, COMA=29, IGUAL=30, MAYOR=31, MENOR=32, 
		IGUALIGUAL=33, MAS=34, MENOS=35, POR=36, DIV=37, COMILLAS=38, GUIONBAJO=39, 
		NUMERO=40, NOMBRE=41, IDENT=42, VALORTXT=43, COMENTARIO_BLOQUE=44, COMENTARIO_LINEA=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "CARACTERES_ESPECIALES", 
			"ESPECIFICACION", "CLASE", "CLASES", "CLASEM", "ASOCIACIONES", "ASOCIACION", 
			"ROL", "MULTIPLICIDAD", "GENERALIZACIONES", "GENERALIZACION", "SUPERCLASE", 
			"SUBCLASES", "RESTRICCIONES", "INSTRUCCIONES", "OBJETO", "ENLACE", "ASOCIACIONM", 
			"CONSISTENCIA", "OBJETOM", "NUM", "TXT", "PA", "PC", "PyC", "DP", "COMA", 
			"IGUAL", "MAYOR", "MENOR", "IGUALIGUAL", "MAS", "MENOS", "POR", "DIV", 
			"COMILLAS", "GUIONBAJO", "NUMERO", "NOMBRE", "IDENT", "VALORTXT", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\5,\u016b\n,\3,\6,\u016e"+
		"\n,\r,\16,\u016f\3-\3-\6-\u0174\n-\r-\16-\u0175\3.\3.\3.\7.\u017b\n.\f"+
		".\16.\u017e\13.\3/\3/\3/\3/\3/\3/\6/\u0186\n/\r/\16/\u0187\3/\3/\3\60"+
		"\3\60\3\60\3\60\7\60\u0190\n\60\f\60\16\60\u0193\13\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u019e\n\61\f\61\16\61\u01a1\13\61"+
		"\3\61\3\61\3\61\3\61\4\u0191\u019f\2\62\3\3\5\4\7\5\t\2\13\2\r\2\17\6"+
		"\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25"+
		"/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U"+
		")W*Y+[,]-_.a/\3\2\6\3\2\62;\6\2C\\c|\u00d3\u00d3\u00f3\u00f3\16\2\u00c3"+
		"\u00c3\u00cb\u00cb\u00cf\u00cf\u00d3\u00d3\u00d5\u00d5\u00dc\u00dc\u00e3"+
		"\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc\3\2"+
		"C\\\2\u01af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5g\3\2\2"+
		"\2\7l\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21\u0087\3"+
		"\2\2\2\23\u008d\3\2\2\2\25\u0094\3\2\2\2\27\u009a\3\2\2\2\31\u00a7\3\2"+
		"\2\2\33\u00b2\3\2\2\2\35\u00b6\3\2\2\2\37\u00c4\3\2\2\2!\u00d5\3\2\2\2"+
		"#\u00e4\3\2\2\2%\u00ef\3\2\2\2\'\u00f9\3\2\2\2)\u0107\3\2\2\2+\u0115\3"+
		"\2\2\2-\u011c\3\2\2\2/\u0123\3\2\2\2\61\u012e\3\2\2\2\63\u013b\3\2\2\2"+
		"\65\u0142\3\2\2\2\67\u0146\3\2\2\29\u014a\3\2\2\2;\u014c\3\2\2\2=\u014e"+
		"\3\2\2\2?\u0150\3\2\2\2A\u0152\3\2\2\2C\u0154\3\2\2\2E\u0156\3\2\2\2G"+
		"\u0158\3\2\2\2I\u015a\3\2\2\2K\u015d\3\2\2\2M\u015f\3\2\2\2O\u0161\3\2"+
		"\2\2Q\u0163\3\2\2\2S\u0165\3\2\2\2U\u0167\3\2\2\2W\u016a\3\2\2\2Y\u0171"+
		"\3\2\2\2[\u0177\3\2\2\2]\u017f\3\2\2\2_\u018b\3\2\2\2a\u0199\3\2\2\2c"+
		"d\7\"\2\2de\3\2\2\2ef\b\2\2\2f\4\3\2\2\2gh\7\13\2\2hi\3\2\2\2ij\b\3\2"+
		"\2j\6\3\2\2\2km\7\17\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2op\3\2"+
		"\2\2pq\b\4\2\2q\b\3\2\2\2rs\t\2\2\2s\n\3\2\2\2tu\t\3\2\2u\f\3\2\2\2vw"+
		"\t\4\2\2w\16\3\2\2\2xy\7G\2\2yz\7U\2\2z{\7R\2\2{|\7G\2\2|}\7E\2\2}~\7"+
		"K\2\2~\177\7H\2\2\177\u0080\7K\2\2\u0080\u0081\7E\2\2\u0081\u0082\7C\2"+
		"\2\u0082\u0083\7E\2\2\u0083\u0084\7K\2\2\u0084\u0085\7Q\2\2\u0085\u0086"+
		"\7P\2\2\u0086\20\3\2\2\2\u0087\u0088\7E\2\2\u0088\u0089\7N\2\2\u0089\u008a"+
		"\7C\2\2\u008a\u008b\7U\2\2\u008b\u008c\7G\2\2\u008c\22\3\2\2\2\u008d\u008e"+
		"\7E\2\2\u008e\u008f\7N\2\2\u008f\u0090\7C\2\2\u0090\u0091\7U\2\2\u0091"+
		"\u0092\7G\2\2\u0092\u0093\7U\2\2\u0093\24\3\2\2\2\u0094\u0095\7e\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7c\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2"+
		"\u0099\26\3\2\2\2\u009a\u009b\7C\2\2\u009b\u009c\7U\2\2\u009c\u009d\7"+
		"Q\2\2\u009d\u009e\7E\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1"+
		"\7E\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7P\2\2\u00a4"+
		"\u00a5\7G\2\2\u00a5\u00a6\7U\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7C\2\2\u00a8"+
		"\u00a9\7U\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7K\2\2"+
		"\u00ac\u00ad\7C\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af\7K\2\2\u00af\u00b0"+
		"\7Q\2\2\u00b0\u00b1\7P\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8"+
		"\7w\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7e\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7f\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7I\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7"+
		"\7P\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7C\2\2\u00ca"+
		"\u00cb\7N\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7\\\2\2\u00cd\u00ce\7C\2"+
		"\2\u00ce\u00cf\7E\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2"+
		"\7P\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7U\2\2\u00d4 \3\2\2\2\u00d5\u00d6"+
		"\7I\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\7G\2\2\u00d9"+
		"\u00da\7T\2\2\u00da\u00db\7C\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7K\2\2"+
		"\u00dd\u00de\7\\\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1"+
		"\7K\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7P\2\2\u00e3\"\3\2\2\2\u00e4\u00e5"+
		"\7u\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7c\2\2"+
		"\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7u\2"+
		"\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4"+
		"\7n\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7G\2\2\u00fb"+
		"\u00fc\7U\2\2\u00fc\u00fd\7V\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7K\2\2"+
		"\u00ff\u0100\7E\2\2\u0100\u0101\7E\2\2\u0101\u0102\7K\2\2\u0102\u0103"+
		"\7Q\2\2\u0103\u0104\7P\2\2\u0104\u0105\7G\2\2\u0105\u0106\7U\2\2\u0106"+
		"(\3\2\2\2\u0107\u0108\7K\2\2\u0108\u0109\7P\2\2\u0109\u010a\7U\2\2\u010a"+
		"\u010b\7V\2\2\u010b\u010c\7T\2\2\u010c\u010d\7W\2\2\u010d\u010e\7E\2\2"+
		"\u010e\u010f\7E\2\2\u010f\u0110\7K\2\2\u0110\u0111\7Q\2\2\u0111\u0112"+
		"\7P\2\2\u0112\u0113\7G\2\2\u0113\u0114\7U\2\2\u0114*\3\2\2\2\u0115\u0116"+
		"\7Q\2\2\u0116\u0117\7D\2\2\u0117\u0118\7L\2\2\u0118\u0119\7G\2\2\u0119"+
		"\u011a\7V\2\2\u011a\u011b\7Q\2\2\u011b,\3\2\2\2\u011c\u011d\7G\2\2\u011d"+
		"\u011e\7P\2\2\u011e\u011f\7N\2\2\u011f\u0120\7C\2\2\u0120\u0121\7E\2\2"+
		"\u0121\u0122\7G\2\2\u0122.\3\2\2\2\u0123\u0124\7c\2\2\u0124\u0125\7u\2"+
		"\2\u0125\u0126\7q\2\2\u0126\u0127\7e\2\2\u0127\u0128\7k\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7e\2\2\u012a\u012b\7k\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7p\2\2\u012d\60\3\2\2\2\u012e\u012f\7E\2\2\u012f\u0130\7Q\2\2\u0130"+
		"\u0131\7P\2\2\u0131\u0132\7U\2\2\u0132\u0133\7K\2\2\u0133\u0134\7U\2\2"+
		"\u0134\u0135\7V\2\2\u0135\u0136\7G\2\2\u0136\u0137\7P\2\2\u0137\u0138"+
		"\7E\2\2\u0138\u0139\7K\2\2\u0139\u013a\7C\2\2\u013a\62\3\2\2\2\u013b\u013c"+
		"\7q\2\2\u013c\u013d\7d\2\2\u013d\u013e\7l\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7v\2\2\u0140\u0141\7q\2\2\u0141\64\3\2\2\2\u0142\u0143\7P\2\2\u0143"+
		"\u0144\7W\2\2\u0144\u0145\7O\2\2\u0145\66\3\2\2\2\u0146\u0147\7V\2\2\u0147"+
		"\u0148\7Z\2\2\u0148\u0149\7V\2\2\u01498\3\2\2\2\u014a\u014b\7*\2\2\u014b"+
		":\3\2\2\2\u014c\u014d\7+\2\2\u014d<\3\2\2\2\u014e\u014f\7=\2\2\u014f>"+
		"\3\2\2\2\u0150\u0151\7<\2\2\u0151@\3\2\2\2\u0152\u0153\7.\2\2\u0153B\3"+
		"\2\2\2\u0154\u0155\7?\2\2\u0155D\3\2\2\2\u0156\u0157\7@\2\2\u0157F\3\2"+
		"\2\2\u0158\u0159\7>\2\2\u0159H\3\2\2\2\u015a\u015b\7?\2\2\u015b\u015c"+
		"\7?\2\2\u015cJ\3\2\2\2\u015d\u015e\7-\2\2\u015eL\3\2\2\2\u015f\u0160\7"+
		"/\2\2\u0160N\3\2\2\2\u0161\u0162\7,\2\2\u0162P\3\2\2\2\u0163\u0164\7\61"+
		"\2\2\u0164R\3\2\2\2\u0165\u0166\7$\2\2\u0166T\3\2\2\2\u0167\u0168\7a\2"+
		"\2\u0168V\3\2\2\2\u0169\u016b\7/\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\5\t\5\2\u016d\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170X\3\2\2\2"+
		"\u0171\u0173\t\5\2\2\u0172\u0174\5\13\6\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176Z\3\2\2\2\u0177"+
		"\u017c\5\13\6\2\u0178\u017b\5\13\6\2\u0179\u017b\5\t\5\2\u017a\u0178\3"+
		"\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\\\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0185\5S*\2\u0180"+
		"\u0186\5\13\6\2\u0181\u0186\5\t\5\2\u0182\u0186\5U+\2\u0183\u0186\5\r"+
		"\7\2\u0184\u0186\5\3\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\5S*\2\u018a^\3\2\2\2\u018b\u018c\7\61\2\2\u018c\u018d\7,\2\2\u018d"+
		"\u0191\3\2\2\2\u018e\u0190\13\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0195\7,\2\2\u0195\u0196\7\61\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\b\60\2\2\u0198`\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b"+
		"\7\61\2\2\u019b\u019f\3\2\2\2\u019c\u019e\13\2\2\2\u019d\u019c\3\2\2\2"+
		"\u019e\u01a1\3\2\2\2\u019f\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\5\7\4\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\b\61\2\2\u01a5b\3\2\2\2\r\2l\u016a\u016f\u0175\u017a\u017c\u0185"+
		"\u0187\u0191\u019f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}