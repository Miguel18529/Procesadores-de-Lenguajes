// Generated from C:/Users/amigo/IdeaProjects/BLQ/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, BLOQUE=4, FBLOQUE=5, COMA=6, PyC=7, 
		IGUAL=8, MAS=9, MENOS=10, POR=11, DIV=12, PA=13, PC=14, NUMERO=15, IDENT=16, 
		COMENT_BLOQUE=17, COMENT_LINEA=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "LETRA", "DIGITO", "BLOQUE", "FBLOQUE", 
			"COMA", "PyC", "IGUAL", "MAS", "MENOS", "POR", "DIV", "PA", "PC", "NUMERO", 
			"IDENT", "COMENT_BLOQUE", "COMENT_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'BLOQUE'", "'FBLOQUE'", "','", "';'", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "BLOQUE", "FBLOQUE", "COMA", 
			"PyC", "IGUAL", "MAS", "MENOS", "POR", "DIV", "PA", "PC", "NUMERO", "IDENT", 
			"COMENT_BLOQUE", "COMENT_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22a\n\22\r\22"+
		"\16\22b\3\23\3\23\3\23\7\23h\n\23\f\23\16\23k\13\23\3\24\3\24\3\24\3\24"+
		"\7\24q\n\24\f\24\16\24t\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\177\n\25\f\25\16\25\u0082\13\25\3\25\3\25\3\25\3\25\4r\u0080"+
		"\2\26\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24\3\2\4\4\2C\\c|\3\2\62;\2\u008a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\3+\3\2\2\2\5/\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2"+
		"\2\2\17E\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3"+
		"\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#`\3\2\2\2%d\3\2\2"+
		"\2\'l\3\2\2\2)z\3\2\2\2+,\7\"\2\2,-\3\2\2\2-.\b\2\2\2.\4\3\2\2\2/\60\7"+
		"\13\2\2\60\61\3\2\2\2\61\62\b\3\2\2\62\6\3\2\2\2\63\65\7\17\2\2\64\63"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\f\2\2\678\3\2\2\289\b\4\2"+
		"\29\b\3\2\2\2:;\t\2\2\2;\n\3\2\2\2<=\t\3\2\2=\f\3\2\2\2>?\7D\2\2?@\7N"+
		"\2\2@A\7Q\2\2AB\7S\2\2BC\7W\2\2CD\7G\2\2D\16\3\2\2\2EF\7H\2\2FG\7D\2\2"+
		"GH\7N\2\2HI\7Q\2\2IJ\7S\2\2JK\7W\2\2KL\7G\2\2L\20\3\2\2\2MN\7.\2\2N\22"+
		"\3\2\2\2OP\7=\2\2P\24\3\2\2\2QR\7?\2\2R\26\3\2\2\2ST\7-\2\2T\30\3\2\2"+
		"\2UV\7/\2\2V\32\3\2\2\2WX\7,\2\2X\34\3\2\2\2YZ\7\61\2\2Z\36\3\2\2\2[\\"+
		"\7*\2\2\\ \3\2\2\2]^\7+\2\2^\"\3\2\2\2_a\5\13\6\2`_\3\2\2\2ab\3\2\2\2"+
		"b`\3\2\2\2bc\3\2\2\2c$\3\2\2\2di\5\t\5\2eh\5\t\5\2fh\5\13\6\2ge\3\2\2"+
		"\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j&\3\2\2\2ki\3\2\2\2lm\7\61"+
		"\2\2mn\7,\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3\2"+
		"\2\2su\3\2\2\2tr\3\2\2\2uv\7,\2\2vw\7\61\2\2wx\3\2\2\2xy\b\24\2\2y(\3"+
		"\2\2\2z{\7\61\2\2{|\7\61\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\5\7\4\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\25\2\2\u0086*\3\2\2\2\t\2\64bgir\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}