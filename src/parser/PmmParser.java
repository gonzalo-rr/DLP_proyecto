// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
    import ast.errors.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, WS=41, SL_COMMENT=42, ML_COMMENT=43, BOOL_CONSTANT=44, 
		INT_CONSTANT=45, REAL_CONSTANT=46, CHAR_CONSTANT=47, ID=48;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_main = 2, RULE_definition = 3, 
		RULE_var_definitions = 4, RULE_var_definition = 5, RULE_unique_var_definition = 6, 
		RULE_func_definition = 7, RULE_func_params = 8, RULE_params = 9, RULE_param = 10, 
		RULE_type = 11, RULE_complex_type = 12, RULE_array_type = 13, RULE_dimension = 14, 
		RULE_struct_type = 15, RULE_registers = 16, RULE_register = 17, RULE_simple_type = 18, 
		RULE_statements = 19, RULE_statement = 20, RULE_if_else = 21, RULE_else_statement = 22, 
		RULE_while_loop = 23, RULE_for_loop = 24, RULE_plus_equals = 25, RULE_assignment = 26, 
		RULE_func_invocation = 27, RULE_arguments = 28, RULE_separated_expressions = 29, 
		RULE_expression = 30, RULE_ids = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "main", "definition", "var_definitions", "var_definition", 
			"unique_var_definition", "func_definition", "func_params", "params", 
			"param", "type", "complex_type", "array_type", "dimension", "struct_type", 
			"registers", "register", "simple_type", "statements", "statement", "if_else", 
			"else_statement", "while_loop", "for_loop", "plus_equals", "assignment", 
			"func_invocation", "arguments", "separated_expressions", "expression", 
			"ids"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "','", "'['", 
			"']'", "'struct'", "';'", "'int'", "'char'", "'double'", "'bool'", "'print'", 
			"'input'", "'return'", "'if'", "'else'", "'while'", "'for'", "'+='", 
			"'='", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "SL_COMMENT", "ML_COMMENT", "BOOL_CONSTANT", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> defs = new ArrayList<Definition>();
		public DefinitionsContext definitions;
		public MainContext main;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((ProgramContext)_localctx).definitions = definitions();
			setState(65);
			((ProgramContext)_localctx).main = main();
			setState(66);
			match(EOF);
			 ((ProgramContext)_localctx).defs =  ((ProgramContext)_localctx).definitions.ast; _localctx.defs.add(((ProgramContext)_localctx).main.ast); ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, 1, 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public DefinitionContext definition;
		public DefinitionsContext definitions;
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((DefinitionsContext)_localctx).definition = definition();
				setState(71);
				((DefinitionsContext)_localctx).definitions = definitions();
				 ((DefinitionsContext)_localctx).definitions.ast.addAll(0, ((DefinitionsContext)_localctx).definition.ast); ((DefinitionsContext)_localctx).ast =  ((DefinitionsContext)_localctx).definitions.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token OP;
		public Token NAME;
		public StatementsContext statements;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((MainContext)_localctx).OP = match(T__0);
			setState(77);
			((MainContext)_localctx).NAME = match(T__1);
			setState(78);
			match(T__2);
			setState(79);
			match(T__3);
			setState(80);
			match(T__4);
			setState(81);
			match(T__5);
			setState(82);
			((MainContext)_localctx).statements = statements();
			setState(83);
			match(T__6);
			 ((MainContext)_localctx).ast =  new FuncDefinition((((MainContext)_localctx).NAME!=null?((MainContext)_localctx).NAME.getText():null), new FunctionType(new ArrayList<VarDefinition>(), VoidType.getInstance(), ((MainContext)_localctx).NAME.getLine(), ((MainContext)_localctx).NAME.getCharPositionInLine() + 1), ((MainContext)_localctx).statements.ast, ((MainContext)_localctx).OP.getLine(), ((MainContext)_localctx).OP.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Var_definitionContext var_definition;
		public Func_definitionContext func_definition;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).var_definition.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((DefinitionContext)_localctx).func_definition = func_definition();
				 _localctx.ast.add(((DefinitionContext)_localctx).func_definition.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definitionsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Var_definitionContext var_definition;
		public Var_definitionsContext var_definitions;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Var_definitionsContext var_definitions() {
			return getRuleContext(Var_definitionsContext.class,0);
		}
		public Var_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionsContext var_definitions() throws RecognitionException {
		Var_definitionsContext _localctx = new Var_definitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_definitions);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((Var_definitionsContext)_localctx).var_definition = var_definition();
				setState(96);
				((Var_definitionsContext)_localctx).var_definitions = var_definitions();
				 ((Var_definitionsContext)_localctx).var_definitions.ast.addAll(0, ((Var_definitionsContext)_localctx).var_definition.ast); ((Var_definitionsContext)_localctx).ast =  ((Var_definitionsContext)_localctx).var_definitions.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public IdsContext ids;
		public TypeContext type;
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((Var_definitionContext)_localctx).ids = ids();
			setState(102);
			match(T__4);
			setState(103);
			((Var_definitionContext)_localctx).type = type();
			 ((Var_definitionContext)_localctx).ids.ast.stream().forEach((id) -> _localctx.ast.add(new VarDefinition(id.name, ((Var_definitionContext)_localctx).type.ast, id.getLine(), id.getColumn()))); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unique_var_definitionContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Unique_var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitUnique_var_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unique_var_definitionContext unique_var_definition() throws RecognitionException {
		Unique_var_definitionContext _localctx = new Unique_var_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unique_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((Unique_var_definitionContext)_localctx).ID = match(ID);
			setState(107);
			match(T__4);
			setState(108);
			((Unique_var_definitionContext)_localctx).type = type();
			 ((Unique_var_definitionContext)_localctx).ast =  new VarDefinition((((Unique_var_definitionContext)_localctx).ID!=null?((Unique_var_definitionContext)_localctx).ID.getText():null), ((Unique_var_definitionContext)_localctx).type.ast, ((Unique_var_definitionContext)_localctx).ID.getLine(), ((Unique_var_definitionContext)_localctx).ID.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public FunctionType functionType;
		public Type returnType = VoidType.getInstance();
		public Token OP;
		public Token ID;
		public Func_paramsContext func_params;
		public TypeContext type;
		public StatementsContext statements;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Func_paramsContext func_params() {
			return getRuleContext(Func_paramsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((Func_definitionContext)_localctx).OP = match(T__0);
			setState(112);
			((Func_definitionContext)_localctx).ID = match(ID);
			setState(113);
			match(T__2);
			setState(114);
			((Func_definitionContext)_localctx).func_params = func_params();
			setState(115);
			match(T__3);
			setState(116);
			match(T__4);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 125440L) != 0) {
				{
				{
				setState(117);
				((Func_definitionContext)_localctx).type = type();
				}
				 ((Func_definitionContext)_localctx).returnType =  ((Func_definitionContext)_localctx).type.ast; 
				}
			}

			{
			 ((Func_definitionContext)_localctx).functionType =  new FunctionType(((Func_definitionContext)_localctx).func_params.ast, _localctx.returnType, ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getLine(), ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getCharPositionInLine() + 1); 
			}
			setState(123);
			match(T__5);
			setState(124);
			((Func_definitionContext)_localctx).statements = statements();
			setState(125);
			match(T__6);
			 ((Func_definitionContext)_localctx).ast =  new FuncDefinition((((Func_definitionContext)_localctx).ID!=null?((Func_definitionContext)_localctx).ID.getText():null), _localctx.functionType, ((Func_definitionContext)_localctx).statements.ast, ((Func_definitionContext)_localctx).OP.getLine(), ((Func_definitionContext)_localctx).OP.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_paramsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public ParamsContext params;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramsContext func_params() throws RecognitionException {
		Func_paramsContext _localctx = new Func_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_params);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((Func_paramsContext)_localctx).params = params();
				 ((Func_paramsContext)_localctx).ast =  ((Func_paramsContext)_localctx).params.ast; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public ParamContext param;
		public ParamsContext params;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((ParamsContext)_localctx).param = param();
				 _localctx.ast.add(0, ((ParamsContext)_localctx).param.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((ParamsContext)_localctx).param = param();
				setState(138);
				match(T__7);
				setState(139);
				((ParamsContext)_localctx).params = params();
				 ((ParamsContext)_localctx).params.ast.add(0, ((ParamsContext)_localctx).param.ast); ((ParamsContext)_localctx).ast =  ((ParamsContext)_localctx).params.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token ID;
		public Simple_typeContext simple_type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ParamContext)_localctx).ID = match(ID);
			setState(145);
			match(T__4);
			setState(146);
			((ParamContext)_localctx).simple_type = simple_type();
			 ((ParamContext)_localctx).ast =  new VarDefinition((((ParamContext)_localctx).ID!=null?((ParamContext)_localctx).ID.getText():null), ((ParamContext)_localctx).simple_type.ast, ((ParamContext)_localctx).ID.getLine(), ((ParamContext)_localctx).ID.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext simple_type;
		public Complex_typeContext complex_type;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__8:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((TypeContext)_localctx).complex_type = complex_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).complex_type.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Complex_typeContext extends ParserRuleContext {
		public Type ast;
		public Array_typeContext array_type;
		public Struct_typeContext struct_type;
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitComplex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_complex_type);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((Complex_typeContext)_localctx).array_type = array_type();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array_type.ast; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((Complex_typeContext)_localctx).struct_type = struct_type();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).struct_type.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public ArrayType ast;
		public DimensionContext dimension;
		public TypeContext type;
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((Array_typeContext)_localctx).dimension = dimension();
			setState(166);
			((Array_typeContext)_localctx).type = type();
			 ((Array_typeContext)_localctx).ast =  new ArrayType(((Array_typeContext)_localctx).dimension.ast, ((Array_typeContext)_localctx).type.ast, ((Array_typeContext)_localctx).type.ast.getLine(), ((Array_typeContext)_localctx).type.ast.getColumn()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public int ast;
		public Token INT_CONSTANT;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			setState(170);
			((DimensionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(171);
			match(T__9);
			 ((DimensionContext)_localctx).ast =  LexerHelper.lexemeToInt((((DimensionContext)_localctx).INT_CONSTANT!=null?((DimensionContext)_localctx).INT_CONSTANT.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_typeContext extends ParserRuleContext {
		public StructType ast;
		public Token OP;
		public RegistersContext registers;
		public RegistersContext registers() {
			return getRuleContext(RegistersContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Struct_typeContext)_localctx).OP = match(T__10);
			setState(175);
			match(T__5);
			setState(176);
			((Struct_typeContext)_localctx).registers = registers();
			setState(177);
			match(T__6);
			 ((Struct_typeContext)_localctx).ast =  new StructType(((Struct_typeContext)_localctx).registers.ast, ((Struct_typeContext)_localctx).OP.getLine(), ((Struct_typeContext)_localctx).OP.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegistersContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public RegisterContext register;
		public RegistersContext registers;
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public RegistersContext registers() {
			return getRuleContext(RegistersContext.class,0);
		}
		public RegistersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRegisters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistersContext registers() throws RecognitionException {
		RegistersContext _localctx = new RegistersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_registers);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((RegistersContext)_localctx).register = register();
				setState(182);
				((RegistersContext)_localctx).registers = registers();
				 if (((RegistersContext)_localctx).registers.ast.stream().anyMatch(field -> ((RegistersContext)_localctx).register.ast.stream().anyMatch(field2 -> field.name.equals(field2.name)))) { new ErrorType("Duplicated field", ((RegistersContext)_localctx).register.ast.get(0).getLine(), ((RegistersContext)_localctx).register.ast.get(0).getColumn()); } else { ((RegistersContext)_localctx).registers.ast.addAll(0, ((RegistersContext)_localctx).register.ast); ((RegistersContext)_localctx).ast =  ((RegistersContext)_localctx).registers.ast; } 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegisterContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public IdsContext ids;
		public TypeContext type;
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((RegisterContext)_localctx).ids = ids();
			setState(188);
			match(T__4);
			setState(189);
			((RegisterContext)_localctx).type = type();
			setState(190);
			match(T__11);
			 ((RegisterContext)_localctx).ids.ast.stream().forEach((id) -> _localctx.ast.add(new RecordField(id.name, ((RegisterContext)_localctx).type.ast, id.getLine(), id.getColumn()))); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_type);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__12);
				 ((Simple_typeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__13);
				 ((Simple_typeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(T__14);
				 ((Simple_typeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(T__15);
				 ((Simple_typeContext)_localctx).ast =  BoolType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statements);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((StatementsContext)_localctx).statement = statement();
				setState(205);
				((StatementsContext)_localctx).statements = statements();
				 ((StatementsContext)_localctx).statements.ast.addAll(0, ((StatementsContext)_localctx).statement.ast); ((StatementsContext)_localctx).ast =  ((StatementsContext)_localctx).statements.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token OP;
		public Separated_expressionsContext separated_expressions;
		public AssignmentContext assignment;
		public If_elseContext if_else;
		public While_loopContext while_loop;
		public For_loopContext for_loop;
		public ExpressionContext expression;
		public Func_invocationContext func_invocation;
		public Var_definitionContext var_definition;
		public Plus_equalsContext plus_equals;
		public Separated_expressionsContext separated_expressions() {
			return getRuleContext(Separated_expressionsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Plus_equalsContext plus_equals() {
			return getRuleContext(Plus_equalsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((StatementContext)_localctx).OP = match(T__16);
				setState(211);
				((StatementContext)_localctx).separated_expressions = separated_expressions();
				setState(212);
				match(T__11);
				 ((StatementContext)_localctx).separated_expressions.ast.stream().forEach((expression) -> _localctx.ast.add(new Print(expression, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((StatementContext)_localctx).OP = match(T__17);
				setState(216);
				((StatementContext)_localctx).separated_expressions = separated_expressions();
				setState(217);
				match(T__11);
				 ((StatementContext)_localctx).separated_expressions.ast.stream().forEach((expression) -> _localctx.ast.add(new Input(expression, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				((StatementContext)_localctx).assignment = assignment();
				setState(221);
				match(T__11);
				 _localctx.ast.add(0, ((StatementContext)_localctx).assignment.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				((StatementContext)_localctx).if_else = if_else();
				 _localctx.ast.add(0, ((StatementContext)_localctx).if_else.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				((StatementContext)_localctx).while_loop = while_loop();
				 _localctx.ast.add(0, ((StatementContext)_localctx).while_loop.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				((StatementContext)_localctx).for_loop = for_loop();
				 _localctx.ast.add(0, ((StatementContext)_localctx).for_loop.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				((StatementContext)_localctx).OP = match(T__18);
				setState(234);
				((StatementContext)_localctx).expression = expression(0);
				setState(235);
				match(T__11);
				 _localctx.ast.add(0, new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				((StatementContext)_localctx).func_invocation = func_invocation();
				setState(239);
				match(T__11);
				 _localctx.ast.add(0, ((StatementContext)_localctx).func_invocation.ast); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242);
				((StatementContext)_localctx).var_definition = var_definition();
				setState(243);
				match(T__11);
				 _localctx.ast.addAll(0, ((StatementContext)_localctx).var_definition.ast); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				((StatementContext)_localctx).plus_equals = plus_equals();
				setState(247);
				match(T__11);
				 _localctx.ast.add(0, ((StatementContext)_localctx).plus_equals.ast); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_elseContext extends ParserRuleContext {
		public IfElse ast;
		public List<Statement> elseBody = new ArrayList<Statement>();
		public Token OP;
		public ExpressionContext condition;
		public StatementsContext statements;
		public StatementContext statement;
		public Else_statementContext else_statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((If_elseContext)_localctx).OP = match(T__19);
			setState(253);
			((If_elseContext)_localctx).condition = expression(0);
			setState(254);
			match(T__4);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(255);
				match(T__5);
				{
				setState(256);
				((If_elseContext)_localctx).statements = statements();
				 ((If_elseContext)_localctx).ast =  new IfElse(((If_elseContext)_localctx).condition.ast, ((If_elseContext)_localctx).statements.ast, _localctx.elseBody, ((If_elseContext)_localctx).OP.getLine(), ((If_elseContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				setState(259);
				match(T__6);
				}
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				{
				{
				setState(261);
				((If_elseContext)_localctx).statement = statement();
				 ((If_elseContext)_localctx).ast =  new IfElse(((If_elseContext)_localctx).condition.ast, ((If_elseContext)_localctx).statement.ast, _localctx.elseBody, ((If_elseContext)_localctx).OP.getLine(), ((If_elseContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(266);
				((If_elseContext)_localctx).else_statement = else_statement();
				 _localctx.elseBody.addAll(((If_elseContext)_localctx).else_statement.ast); 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementsContext statements;
		public StatementContext statement;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__20);
			setState(272);
			match(T__4);
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(273);
				match(T__5);
				{
				setState(274);
				((Else_statementContext)_localctx).statements = statements();
				 _localctx.ast.addAll(((Else_statementContext)_localctx).statements.ast); 
				}
				setState(277);
				match(T__6);
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				{
				{
				setState(279);
				((Else_statementContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((Else_statementContext)_localctx).statement.ast); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public While ast;
		public Token OP;
		public ExpressionContext expression;
		public StatementsContext statements;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((While_loopContext)_localctx).OP = match(T__21);
			setState(285);
			((While_loopContext)_localctx).expression = expression(0);
			setState(286);
			match(T__4);
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(287);
				match(T__5);
				{
				setState(288);
				((While_loopContext)_localctx).statements = statements();
				 ((While_loopContext)_localctx).ast =  new While(((While_loopContext)_localctx).expression.ast, ((While_loopContext)_localctx).statements.ast, ((While_loopContext)_localctx).OP.getLine(), ((While_loopContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				setState(291);
				match(T__6);
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				{
				{
				setState(293);
				((While_loopContext)_localctx).statement = statement();
				 ((While_loopContext)_localctx).ast =  new While(((While_loopContext)_localctx).expression.ast, ((While_loopContext)_localctx).statement.ast, ((While_loopContext)_localctx).OP.getLine(), ((While_loopContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public For ast;
		public Token OP;
		public Unique_var_definitionContext unique_var_definition;
		public AssignmentContext assignment;
		public ExpressionContext expression;
		public StatementContext inc;
		public StatementContext statement;
		public StatementsContext statements;
		public Unique_var_definitionContext unique_var_definition() {
			return getRuleContext(Unique_var_definitionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((For_loopContext)_localctx).OP = match(T__22);
			setState(299);
			((For_loopContext)_localctx).unique_var_definition = unique_var_definition();
			setState(300);
			match(T__11);
			setState(301);
			((For_loopContext)_localctx).assignment = assignment();
			setState(302);
			match(T__11);
			setState(303);
			((For_loopContext)_localctx).expression = expression(0);
			setState(304);
			match(T__11);
			setState(305);
			((For_loopContext)_localctx).inc = ((For_loopContext)_localctx).statement = statement();
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(306);
				match(T__5);
				{
				setState(307);
				((For_loopContext)_localctx).statements = statements();
				 ((For_loopContext)_localctx).ast =  new For(((For_loopContext)_localctx).unique_var_definition.ast, ((For_loopContext)_localctx).assignment.ast, ((For_loopContext)_localctx).expression.ast, ((For_loopContext)_localctx).inc.ast.get(0), ((For_loopContext)_localctx).statements.ast, ((For_loopContext)_localctx).OP.getLine(), ((For_loopContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				setState(310);
				match(T__6);
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				{
				{
				setState(312);
				((For_loopContext)_localctx).statement = statement();
				 ((For_loopContext)_localctx).ast =  new For(((For_loopContext)_localctx).unique_var_definition.ast, ((For_loopContext)_localctx).assignment.ast, ((For_loopContext)_localctx).expression.ast, ((For_loopContext)_localctx).inc.ast.get(0), ((For_loopContext)_localctx).statement.ast, ((For_loopContext)_localctx).OP.getLine(), ((For_loopContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Plus_equalsContext extends ParserRuleContext {
		public PlusEquals ast;
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Plus_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitPlus_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_equalsContext plus_equals() throws RecognitionException {
		Plus_equalsContext _localctx = new Plus_equalsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_plus_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((Plus_equalsContext)_localctx).left = expression(0);
			setState(318);
			match(T__23);
			setState(319);
			((Plus_equalsContext)_localctx).right = expression(0);
			 ((Plus_equalsContext)_localctx).ast =  new PlusEquals(((Plus_equalsContext)_localctx).left.ast, ((Plus_equalsContext)_localctx).right.ast, ((Plus_equalsContext)_localctx).left.ast.getLine(), ((Plus_equalsContext)_localctx).left.ast.getColumn()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Assignment ast;
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			((AssignmentContext)_localctx).left = expression(0);
			setState(323);
			match(T__24);
			setState(324);
			((AssignmentContext)_localctx).right = expression(0);
			 ((AssignmentContext)_localctx).ast =  new Assignment(((AssignmentContext)_localctx).left.ast, ((AssignmentContext)_localctx).right.ast, ((AssignmentContext)_localctx).left.ast.getLine(), ((AssignmentContext)_localctx).left.ast.getColumn()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_invocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Func_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invocationContext func_invocation() throws RecognitionException {
		Func_invocationContext _localctx = new Func_invocationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_func_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((Func_invocationContext)_localctx).ID = match(ID);
			setState(328);
			match(T__2);
			setState(329);
			((Func_invocationContext)_localctx).arguments = arguments();
			setState(330);
			match(T__3);
			 ((Func_invocationContext)_localctx).ast =  new FunctionInvocation(new Var((((Func_invocationContext)_localctx).ID!=null?((Func_invocationContext)_localctx).ID.getText():null), ((Func_invocationContext)_localctx).ID.getLine(), ((Func_invocationContext)_localctx).ID.getCharPositionInLine() + 1), ((Func_invocationContext)_localctx).arguments.ast, ((Func_invocationContext)_localctx).ID.getLine(), ((Func_invocationContext)_localctx).ID.getCharPositionInLine() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public Separated_expressionsContext separated_expressions;
		public Separated_expressionsContext separated_expressions() {
			return getRuleContext(Separated_expressionsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arguments);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__26:
			case T__27:
			case BOOL_CONSTANT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				((ArgumentsContext)_localctx).separated_expressions = separated_expressions();
				 ((ArgumentsContext)_localctx).ast =  ((ArgumentsContext)_localctx).separated_expressions.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Separated_expressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext expression;
		public Separated_expressionsContext separated_expressions;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Separated_expressionsContext separated_expressions() {
			return getRuleContext(Separated_expressionsContext.class,0);
		}
		public Separated_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separated_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSeparated_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separated_expressionsContext separated_expressions() throws RecognitionException {
		Separated_expressionsContext _localctx = new Separated_expressionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_separated_expressions);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				((Separated_expressionsContext)_localctx).expression = expression(0);
				 _localctx.ast.add(0, ((Separated_expressionsContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				((Separated_expressionsContext)_localctx).expression = expression(0);
				setState(343);
				match(T__7);
				setState(344);
				((Separated_expressionsContext)_localctx).separated_expressions = separated_expressions();
				 ((Separated_expressionsContext)_localctx).separated_expressions.ast.add(0, ((Separated_expressionsContext)_localctx).expression.ast); ((Separated_expressionsContext)_localctx).ast =  ((Separated_expressionsContext)_localctx).separated_expressions.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext left;
		public Func_invocationContext func_invocation;
		public Token BOOL_CONSTANT;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public ExpressionContext expression;
		public Token OP;
		public Simple_typeContext simple_type;
		public Token ID;
		public ExpressionContext right;
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public TerminalNode BOOL_CONSTANT() { return getToken(PmmParser.BOOL_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(350);
				((ExpressionContext)_localctx).func_invocation = func_invocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_invocation.ast; 
				}
				break;
			case 2:
				{
				setState(353);
				((ExpressionContext)_localctx).BOOL_CONSTANT = match(BOOL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitBool(((ExpressionContext)_localctx).BOOL_CONSTANT.getLine(), ((ExpressionContext)_localctx).BOOL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToBool((((ExpressionContext)_localctx).BOOL_CONSTANT!=null?((ExpressionContext)_localctx).BOOL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(355);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitInt(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(357);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(359);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitDouble(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(361);
				match(T__2);
				setState(362);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(363);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 7:
				{
				setState(366);
				((ExpressionContext)_localctx).OP = match(T__2);
				setState(367);
				((ExpressionContext)_localctx).simple_type = simple_type();
				setState(368);
				match(T__3);
				setState(369);
				((ExpressionContext)_localctx).expression = expression(9);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).expression.ast, ((ExpressionContext)_localctx).simple_type.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 8:
				{
				setState(372);
				((ExpressionContext)_localctx).OP = match(T__26);
				setState(373);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).expression = expression(8);
				 ((ExpressionContext)_localctx).ast =  new MinusUnary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 9:
				{
				setState(376);
				((ExpressionContext)_localctx).OP = match(T__27);
				setState(377);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).expression = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 10:
				{
				setState(380);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Var((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(385);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(390);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__31) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(391);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(395);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(396);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						 ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(400);
						((ExpressionContext)_localctx).OP = match(T__38);
						setState(401);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(405);
						((ExpressionContext)_localctx).OP = match(T__39);
						setState(406);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(410);
						match(T__8);
						setState(411);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(412);
						match(T__9);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(416);
						match(T__25);
						setState(417);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ParserRuleContext {
		public List<Var> ast = new ArrayList<Var>();
		public Token ID;
		public IdsContext ids;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ids);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				((IdsContext)_localctx).ID = match(ID);
				 if (_localctx.ast.stream().anyMatch(variable -> variable.name.equals((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null)))) { new ErrorType("Duplicated identifier" + (((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1); } else { _localctx.ast.add(0, new Var((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1)); } 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				((IdsContext)_localctx).ID = match(ID);
				setState(427);
				match(T__7);
				setState(428);
				((IdsContext)_localctx).ids = ids();
				 if (((IdsContext)_localctx).ids.ast.stream().anyMatch(variable -> variable.name.equals((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null)))) { new ErrorType("Duplicated identifier " + (((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1); } else { ((IdsContext)_localctx).ids.ast.add(0, new Var((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1)); } ((IdsContext)_localctx).ast =  ((IdsContext)_localctx).ids.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u01b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003]\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a4\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ba\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00ca\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d1\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fb\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0109\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010e\b"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u011b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u013c\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0152\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u015c"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u017f\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01a4"+
		"\b\u001e\n\u001e\f\u001e\u01a7\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b0\b\u001f"+
		"\u0001\u001f\u0000\u0001< \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003\u0001"+
		"\u0000\u001d\u001f\u0002\u0000\u001b\u001b  \u0001\u0000!&\u01bf\u0000"+
		"@\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004L\u0001"+
		"\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000"+
		"\u0000\ne\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u008e\u0001"+
		"\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u009b\u0001"+
		"\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00a5\u0001"+
		"\u0000\u0000\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e\u00ae\u0001"+
		"\u0000\u0000\u0000 \u00b9\u0001\u0000\u0000\u0000\"\u00bb\u0001\u0000"+
		"\u0000\u0000$\u00c9\u0001\u0000\u0000\u0000&\u00d0\u0001\u0000\u0000\u0000"+
		"(\u00fa\u0001\u0000\u0000\u0000*\u00fc\u0001\u0000\u0000\u0000,\u010f"+
		"\u0001\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u00000\u012a\u0001\u0000"+
		"\u0000\u00002\u013d\u0001\u0000\u0000\u00004\u0142\u0001\u0000\u0000\u0000"+
		"6\u0147\u0001\u0000\u0000\u00008\u0151\u0001\u0000\u0000\u0000:\u015b"+
		"\u0001\u0000\u0000\u0000<\u017e\u0001\u0000\u0000\u0000>\u01af\u0001\u0000"+
		"\u0000\u0000@A\u0003\u0002\u0001\u0000AB\u0003\u0004\u0002\u0000BC\u0005"+
		"\u0000\u0000\u0001CD\u0006\u0000\uffff\uffff\u0000D\u0001\u0001\u0000"+
		"\u0000\u0000EK\u0001\u0000\u0000\u0000FG\u0003\u0006\u0003\u0000GH\u0003"+
		"\u0002\u0001\u0000HI\u0006\u0001\uffff\uffff\u0000IK\u0001\u0000\u0000"+
		"\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000K\u0003\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0005\u0002\u0000\u0000"+
		"NO\u0005\u0003\u0000\u0000OP\u0005\u0004\u0000\u0000PQ\u0005\u0005\u0000"+
		"\u0000QR\u0005\u0006\u0000\u0000RS\u0003&\u0013\u0000ST\u0005\u0007\u0000"+
		"\u0000TU\u0006\u0002\uffff\uffff\u0000U\u0005\u0001\u0000\u0000\u0000"+
		"VW\u0003\n\u0005\u0000WX\u0006\u0003\uffff\uffff\u0000X]\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u000e\u0007\u0000Z[\u0006\u0003\uffff\uffff\u0000[]\u0001"+
		"\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000"+
		"]\u0007\u0001\u0000\u0000\u0000^d\u0001\u0000\u0000\u0000_`\u0003\n\u0005"+
		"\u0000`a\u0003\b\u0004\u0000ab\u0006\u0004\uffff\uffff\u0000bd\u0001\u0000"+
		"\u0000\u0000c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000d\t\u0001"+
		"\u0000\u0000\u0000ef\u0003>\u001f\u0000fg\u0005\u0005\u0000\u0000gh\u0003"+
		"\u0016\u000b\u0000hi\u0006\u0005\uffff\uffff\u0000i\u000b\u0001\u0000"+
		"\u0000\u0000jk\u00050\u0000\u0000kl\u0005\u0005\u0000\u0000lm\u0003\u0016"+
		"\u000b\u0000mn\u0006\u0006\uffff\uffff\u0000n\r\u0001\u0000\u0000\u0000"+
		"op\u0005\u0001\u0000\u0000pq\u00050\u0000\u0000qr\u0005\u0003\u0000\u0000"+
		"rs\u0003\u0010\b\u0000st\u0005\u0004\u0000\u0000tx\u0005\u0005\u0000\u0000"+
		"uv\u0003\u0016\u000b\u0000vw\u0006\u0007\uffff\uffff\u0000wy\u0001\u0000"+
		"\u0000\u0000xu\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0006\u0007\uffff\uffff\u0000{|\u0005\u0006\u0000"+
		"\u0000|}\u0003&\u0013\u0000}~\u0005\u0007\u0000\u0000~\u007f\u0006\u0007"+
		"\uffff\uffff\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0003"+
		"\u0012\t\u0000\u0081\u0082\u0006\b\uffff\uffff\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0011\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087\u0088\u0006\t"+
		"\uffff\uffff\u0000\u0088\u008f\u0001\u0000\u0000\u0000\u0089\u008a\u0003"+
		"\u0014\n\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c\u0003\u0012"+
		"\t\u0000\u008c\u008d\u0006\t\uffff\uffff\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000"+
		"\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091\u00050\u0000"+
		"\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092\u0093\u0003$\u0012\u0000"+
		"\u0093\u0094\u0006\n\uffff\uffff\u0000\u0094\u0015\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0003$\u0012\u0000\u0096\u0097\u0006\u000b\uffff\uffff\u0000"+
		"\u0097\u009c\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099"+
		"\u009a\u0006\u000b\uffff\uffff\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u001a\r\u0000\u009e"+
		"\u009f\u0006\f\uffff\uffff\u0000\u009f\u00a4\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a2\u0006\f\uffff\uffff\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7"+
		"\u00a8\u0006\r\uffff\uffff\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\t\u0000\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00ac"+
		"\u0005\n\u0000\u0000\u00ac\u00ad\u0006\u000e\uffff\uffff\u0000\u00ad\u001d"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0"+
		"\u0005\u0006\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1\u00b2\u0005"+
		"\u0007\u0000\u0000\u00b2\u00b3\u0006\u000f\uffff\uffff\u0000\u00b3\u001f"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ba\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0003\"\u0011\u0000\u00b6\u00b7\u0003 \u0010\u0000\u00b7\u00b8\u0006"+
		"\u0010\uffff\uffff\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00ba!\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003>\u001f\u0000\u00bc\u00bd\u0005\u0005"+
		"\u0000\u0000\u00bd\u00be\u0003\u0016\u000b\u0000\u00be\u00bf\u0005\f\u0000"+
		"\u0000\u00bf\u00c0\u0006\u0011\uffff\uffff\u0000\u00c0#\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\r\u0000\u0000\u00c2\u00ca\u0006\u0012\uffff\uffff"+
		"\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4\u00ca\u0006\u0012\uffff"+
		"\uffff\u0000\u00c5\u00c6\u0005\u000f\u0000\u0000\u00c6\u00ca\u0006\u0012"+
		"\uffff\uffff\u0000\u00c7\u00c8\u0005\u0010\u0000\u0000\u00c8\u00ca\u0006"+
		"\u0012\uffff\uffff\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0003(\u0014\u0000\u00cd\u00ce\u0003&\u0013"+
		"\u0000\u00ce\u00cf\u0006\u0013\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d1\'\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0011\u0000"+
		"\u0000\u00d3\u00d4\u0003:\u001d\u0000\u00d4\u00d5\u0005\f\u0000\u0000"+
		"\u00d5\u00d6\u0006\u0014\uffff\uffff\u0000\u00d6\u00fb\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0012\u0000\u0000\u00d8\u00d9\u0003:\u001d\u0000"+
		"\u00d9\u00da\u0005\f\u0000\u0000\u00da\u00db\u0006\u0014\uffff\uffff\u0000"+
		"\u00db\u00fb\u0001\u0000\u0000\u0000\u00dc\u00dd\u00034\u001a\u0000\u00dd"+
		"\u00de\u0005\f\u0000\u0000\u00de\u00df\u0006\u0014\uffff\uffff\u0000\u00df"+
		"\u00fb\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003*\u0015\u0000\u00e1\u00e2"+
		"\u0006\u0014\uffff\uffff\u0000\u00e2\u00fb\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0003.\u0017\u0000\u00e4\u00e5\u0006\u0014\uffff\uffff\u0000\u00e5"+
		"\u00fb\u0001\u0000\u0000\u0000\u00e6\u00e7\u00030\u0018\u0000\u00e7\u00e8"+
		"\u0006\u0014\uffff\uffff\u0000\u00e8\u00fb\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0013\u0000\u0000\u00ea\u00eb\u0003<\u001e\u0000\u00eb\u00ec"+
		"\u0005\f\u0000\u0000\u00ec\u00ed\u0006\u0014\uffff\uffff\u0000\u00ed\u00fb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u00036\u001b\u0000\u00ef\u00f0\u0005"+
		"\f\u0000\u0000\u00f0\u00f1\u0006\u0014\uffff\uffff\u0000\u00f1\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0003\n\u0005\u0000\u00f3\u00f4\u0005\f"+
		"\u0000\u0000\u00f4\u00f5\u0006\u0014\uffff\uffff\u0000\u00f5\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u00032\u0019\u0000\u00f7\u00f8\u0005\f"+
		"\u0000\u0000\u00f8\u00f9\u0006\u0014\uffff\uffff\u0000\u00f9\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fa\u00d2\u0001\u0000\u0000\u0000\u00fa\u00d7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00dc\u0001\u0000\u0000\u0000\u00fa\u00e0\u0001"+
		"\u0000\u0000\u0000\u00fa\u00e3\u0001\u0000\u0000\u0000\u00fa\u00e6\u0001"+
		"\u0000\u0000\u0000\u00fa\u00e9\u0001\u0000\u0000\u0000\u00fa\u00ee\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001"+
		"\u0000\u0000\u0000\u00fb)\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0014"+
		"\u0000\u0000\u00fd\u00fe\u0003<\u001e\u0000\u00fe\u0108\u0005\u0005\u0000"+
		"\u0000\u00ff\u0100\u0005\u0006\u0000\u0000\u0100\u0101\u0003&\u0013\u0000"+
		"\u0101\u0102\u0006\u0015\uffff\uffff\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005\u0007\u0000\u0000\u0104\u0109\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0003(\u0014\u0000\u0106\u0107\u0006\u0015\uffff\uffff"+
		"\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000\u0000"+
		"\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0109\u010d\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0003,\u0016\u0000\u010b\u010c\u0006\u0015\uffff\uffff"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e+\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005\u0015\u0000\u0000\u0110\u011a\u0005\u0005\u0000\u0000"+
		"\u0111\u0112\u0005\u0006\u0000\u0000\u0112\u0113\u0003&\u0013\u0000\u0113"+
		"\u0114\u0006\u0016\uffff\uffff\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0007\u0000\u0000\u0116\u011b\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0003(\u0014\u0000\u0118\u0119\u0006\u0016\uffff\uffff\u0000"+
		"\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0111\u0001\u0000\u0000\u0000"+
		"\u011a\u0117\u0001\u0000\u0000\u0000\u011b-\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u0016\u0000\u0000\u011d\u011e\u0003<\u001e\u0000\u011e\u0128"+
		"\u0005\u0005\u0000\u0000\u011f\u0120\u0005\u0006\u0000\u0000\u0120\u0121"+
		"\u0003&\u0013\u0000\u0121\u0122\u0006\u0017\uffff\uffff\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0007\u0000\u0000\u0124\u0129"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0003(\u0014\u0000\u0126\u0127\u0006"+
		"\u0017\uffff\uffff\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u011f"+
		"\u0001\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129/\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005\u0017\u0000\u0000\u012b\u012c\u0003"+
		"\f\u0006\u0000\u012c\u012d\u0005\f\u0000\u0000\u012d\u012e\u00034\u001a"+
		"\u0000\u012e\u012f\u0005\f\u0000\u0000\u012f\u0130\u0003<\u001e\u0000"+
		"\u0130\u0131\u0005\f\u0000\u0000\u0131\u013b\u0003(\u0014\u0000\u0132"+
		"\u0133\u0005\u0006\u0000\u0000\u0133\u0134\u0003&\u0013\u0000\u0134\u0135"+
		"\u0006\u0018\uffff\uffff\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005\u0007\u0000\u0000\u0137\u013c\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0003(\u0014\u0000\u0139\u013a\u0006\u0018\uffff\uffff\u0000\u013a"+
		"\u013c\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000\u013b"+
		"\u0138\u0001\u0000\u0000\u0000\u013c1\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0003<\u001e\u0000\u013e\u013f\u0005\u0018\u0000\u0000\u013f\u0140\u0003"+
		"<\u001e\u0000\u0140\u0141\u0006\u0019\uffff\uffff\u0000\u01413\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0003<\u001e\u0000\u0143\u0144\u0005\u0019\u0000"+
		"\u0000\u0144\u0145\u0003<\u001e\u0000\u0145\u0146\u0006\u001a\uffff\uffff"+
		"\u0000\u01465\u0001\u0000\u0000\u0000\u0147\u0148\u00050\u0000\u0000\u0148"+
		"\u0149\u0005\u0003\u0000\u0000\u0149\u014a\u00038\u001c\u0000\u014a\u014b"+
		"\u0005\u0004\u0000\u0000\u014b\u014c\u0006\u001b\uffff\uffff\u0000\u014c"+
		"7\u0001\u0000\u0000\u0000\u014d\u0152\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0003:\u001d\u0000\u014f\u0150\u0006\u001c\uffff\uffff\u0000\u0150\u0152"+
		"\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u014e"+
		"\u0001\u0000\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153\u0154\u0003"+
		"<\u001e\u0000\u0154\u0155\u0006\u001d\uffff\uffff\u0000\u0155\u015c\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0003<\u001e\u0000\u0157\u0158\u0005\b"+
		"\u0000\u0000\u0158\u0159\u0003:\u001d\u0000\u0159\u015a\u0006\u001d\uffff"+
		"\uffff\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0153\u0001\u0000"+
		"\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015c;\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0006\u001e\uffff\uffff\u0000\u015e\u015f\u00036\u001b"+
		"\u0000\u015f\u0160\u0006\u001e\uffff\uffff\u0000\u0160\u017f\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0005,\u0000\u0000\u0162\u017f\u0006\u001e\uffff"+
		"\uffff\u0000\u0163\u0164\u0005-\u0000\u0000\u0164\u017f\u0006\u001e\uffff"+
		"\uffff\u0000\u0165\u0166\u0005/\u0000\u0000\u0166\u017f\u0006\u001e\uffff"+
		"\uffff\u0000\u0167\u0168\u0005.\u0000\u0000\u0168\u017f\u0006\u001e\uffff"+
		"\uffff\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0003<\u001e"+
		"\u0000\u016b\u016c\u0005\u0004\u0000\u0000\u016c\u016d\u0006\u001e\uffff"+
		"\uffff\u0000\u016d\u017f\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0003"+
		"\u0000\u0000\u016f\u0170\u0003$\u0012\u0000\u0170\u0171\u0005\u0004\u0000"+
		"\u0000\u0171\u0172\u0003<\u001e\t\u0172\u0173\u0006\u001e\uffff\uffff"+
		"\u0000\u0173\u017f\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u001b\u0000"+
		"\u0000\u0175\u0176\u0003<\u001e\b\u0176\u0177\u0006\u001e\uffff\uffff"+
		"\u0000\u0177\u017f\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u001c\u0000"+
		"\u0000\u0179\u017a\u0003<\u001e\u0007\u017a\u017b\u0006\u001e\uffff\uffff"+
		"\u0000\u017b\u017f\u0001\u0000\u0000\u0000\u017c\u017d\u00050\u0000\u0000"+
		"\u017d\u017f\u0006\u001e\uffff\uffff\u0000\u017e\u015d\u0001\u0000\u0000"+
		"\u0000\u017e\u0161\u0001\u0000\u0000\u0000\u017e\u0163\u0001\u0000\u0000"+
		"\u0000\u017e\u0165\u0001\u0000\u0000\u0000\u017e\u0167\u0001\u0000\u0000"+
		"\u0000\u017e\u0169\u0001\u0000\u0000\u0000\u017e\u016e\u0001\u0000\u0000"+
		"\u0000\u017e\u0174\u0001\u0000\u0000\u0000\u017e\u0178\u0001\u0000\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u01a5\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\n\u0006\u0000\u0000\u0181\u0182\u0007\u0000\u0000\u0000"+
		"\u0182\u0183\u0003<\u001e\u0007\u0183\u0184\u0006\u001e\uffff\uffff\u0000"+
		"\u0184\u01a4\u0001\u0000\u0000\u0000\u0185\u0186\n\u0005\u0000\u0000\u0186"+
		"\u0187\u0007\u0001\u0000\u0000\u0187\u0188\u0003<\u001e\u0006\u0188\u0189"+
		"\u0006\u001e\uffff\uffff\u0000\u0189\u01a4\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\n\u0004\u0000\u0000\u018b\u018c\u0007\u0002\u0000\u0000\u018c\u018d"+
		"\u0003<\u001e\u0005\u018d\u018e\u0006\u001e\uffff\uffff\u0000\u018e\u01a4"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\n\u0003\u0000\u0000\u0190\u0191\u0005"+
		"\'\u0000\u0000\u0191\u0192\u0003<\u001e\u0004\u0192\u0193\u0006\u001e"+
		"\uffff\uffff\u0000\u0193\u01a4\u0001\u0000\u0000\u0000\u0194\u0195\n\u0002"+
		"\u0000\u0000\u0195\u0196\u0005(\u0000\u0000\u0196\u0197\u0003<\u001e\u0003"+
		"\u0197\u0198\u0006\u001e\uffff\uffff\u0000\u0198\u01a4\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\n\u000b\u0000\u0000\u019a\u019b\u0005\t\u0000\u0000"+
		"\u019b\u019c\u0003<\u001e\u0000\u019c\u019d\u0005\n\u0000\u0000\u019d"+
		"\u019e\u0006\u001e\uffff\uffff\u0000\u019e\u01a4\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\n\n\u0000\u0000\u01a0\u01a1\u0005\u001a\u0000\u0000\u01a1"+
		"\u01a2\u00050\u0000\u0000\u01a2\u01a4\u0006\u001e\uffff\uffff\u0000\u01a3"+
		"\u0180\u0001\u0000\u0000\u0000\u01a3\u0185\u0001\u0000\u0000\u0000\u01a3"+
		"\u018a\u0001\u0000\u0000\u0000\u01a3\u018f\u0001\u0000\u0000\u0000\u01a3"+
		"\u0194\u0001\u0000\u0000\u0000\u01a3\u0199\u0001\u0000\u0000\u0000\u01a3"+
		"\u019f\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"=\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u00050\u0000\u0000\u01a9\u01b0\u0006\u001f\uffff\uffff\u0000\u01aa\u01ab"+
		"\u00050\u0000\u0000\u01ab\u01ac\u0005\b\u0000\u0000\u01ac\u01ad\u0003"+
		">\u001f\u0000\u01ad\u01ae\u0006\u001f\uffff\uffff\u0000\u01ae\u01b0\u0001"+
		"\u0000\u0000\u0000\u01af\u01a8\u0001\u0000\u0000\u0000\u01af\u01aa\u0001"+
		"\u0000\u0000\u0000\u01b0?\u0001\u0000\u0000\u0000\u0017J\\cx\u0084\u008e"+
		"\u009b\u00a3\u00b9\u00c9\u00d0\u00fa\u0108\u010d\u011a\u0128\u013b\u0151"+
		"\u015b\u017e\u01a3\u01a5\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}