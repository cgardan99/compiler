// Generated from tiny.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tinyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, INT=3, FLOAT=4, BOOL=5, VOID=6, WHILE=7, PROGRAM=8, THEN=9, 
		FI=10, TTRUE=11, TFALSE=12, AND=13, OR=14, NOT=15, WRITE=16, READ=17, 
		DO=18, UNTIL=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, LESS_OR_EQUAL=24, 
		LESS_THAN=25, GREATER_OR_EQUAL=26, GREATER_THAN=27, EQUALS=28, NOT_EQUALS=29, 
		ASSIGNMENT=30, EOL=31, COMMA=32, LEFT_PARANTHESIS=33, RIGHT_PARANTHESIS=34, 
		LEFT_BRACKET=35, RIGHT_BRACKET=36, LEFT_SQR_BRACKET=37, RIGHT_SQR_BRACKET=38, 
		ID=39, NUM=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "INT", "FLOAT", "BOOL", "VOID", "WHILE", "PROGRAM", "THEN", 
			"FI", "TTRUE", "TFALSE", "AND", "OR", "NOT", "WRITE", "READ", "DO", "UNTIL", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "LESS_OR_EQUAL", "LESS_THAN", 
			"GREATER_OR_EQUAL", "GREATER_THAN", "EQUALS", "NOT_EQUALS", "ASSIGNMENT", 
			"EOL", "COMMA", "LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_SQR_BRACKET", "RIGHT_SQR_BRACKET", "ID", "NUM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'int'", "'float'", "'bool'", "'void'", "'while'", 
			"'program'", "'then'", "'fi'", "'true'", "'false'", "'and'", "'or'", 
			"'not'", "'write'", "'read'", "'do'", "'until'", "'+'", "'-'", "'*'", 
			"'/'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'='", "';'", "','", 
			"'{'", "'}'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "INT", "FLOAT", "BOOL", "VOID", "WHILE", "PROGRAM", 
			"THEN", "FI", "TTRUE", "TFALSE", "AND", "OR", "NOT", "WRITE", "READ", 
			"DO", "UNTIL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "LESS_OR_EQUAL", 
			"LESS_THAN", "GREATER_OR_EQUAL", "GREATER_THAN", "EQUALS", "NOT_EQUALS", 
			"ASSIGNMENT", "EOL", "COMMA", "LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQR_BRACKET", "RIGHT_SQR_BRACKET", 
			"ID", "NUM", "WS"
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


	public tinyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tiny.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\7(\u00de\n(\f(\16(\u00e1\13(\3)\3)\7)\u00e5\n"+
		")\f)\16)\u00e8\13)\3*\6*\u00eb\n*\r*\16*\u00ec\3*\3*\2\2+\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+\3\2\5\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00f2\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5X\3\2\2\2\7]\3\2\2\2\ta\3\2\2\2\13g\3\2\2\2\rl\3\2\2\2\17q\3"+
		"\2\2\2\21w\3\2\2\2\23\177\3\2\2\2\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31"+
		"\u008c\3\2\2\2\33\u0092\3\2\2\2\35\u0096\3\2\2\2\37\u0099\3\2\2\2!\u009d"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00b1\3\2\2\2"+
		"+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bc"+
		"\3\2\2\2\65\u00be\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c6\3\2\2"+
		"\2=\u00c9\3\2\2\2?\u00cb\3\2\2\2A\u00cd\3\2\2\2C\u00cf\3\2\2\2E\u00d1"+
		"\3\2\2\2G\u00d3\3\2\2\2I\u00d5\3\2\2\2K\u00d7\3\2\2\2M\u00d9\3\2\2\2O"+
		"\u00db\3\2\2\2Q\u00e2\3\2\2\2S\u00ea\3\2\2\2UV\7k\2\2VW\7h\2\2W\4\3\2"+
		"\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\\6\3\2\2\2]^\7k\2\2^_\7p\2"+
		"\2_`\7v\2\2`\b\3\2\2\2ab\7h\2\2bc\7n\2\2cd\7q\2\2de\7c\2\2ef\7v\2\2f\n"+
		"\3\2\2\2gh\7d\2\2hi\7q\2\2ij\7q\2\2jk\7n\2\2k\f\3\2\2\2lm\7x\2\2mn\7q"+
		"\2\2no\7k\2\2op\7f\2\2p\16\3\2\2\2qr\7y\2\2rs\7j\2\2st\7k\2\2tu\7n\2\2"+
		"uv\7g\2\2v\20\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7q\2\2z{\7i\2\2{|\7t\2\2|}\7"+
		"c\2\2}~\7o\2\2~\22\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7j\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7p\2\2\u0083\24\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7k\2\2\u0086\26\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7w\2\2\u008a\u008b\7g\2\2\u008b\30\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2\u0095"+
		"\34\3\2\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\36\3\2\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7q\2\2\u009b\u009c\7v\2\2\u009c \3\2\2\2\u009d"+
		"\u009e\7y\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g"+
		"\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7f\2\2\u00a9\u00aa\7q\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"(\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4,"+
		"\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		"\60\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb\62\3\2\2\2\u00bc"+
		"\u00bd\7>\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7@\2\2\u00c28\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8"+
		"<\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc@"+
		"\3\2\2\2\u00cd\u00ce\7.\2\2\u00ceB\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0D\3"+
		"\2\2\2\u00d1\u00d2\7\177\2\2\u00d2F\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4H"+
		"\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6J\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8L\3"+
		"\2\2\2\u00d9\u00da\7_\2\2\u00daN\3\2\2\2\u00db\u00df\t\2\2\2\u00dc\u00de"+
		"\t\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0P\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\t\3\2\2"+
		"\u00e3\u00e5\t\3\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7R\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b*\2\2\u00ef"+
		"T\3\2\2\2\6\2\u00df\u00e6\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}