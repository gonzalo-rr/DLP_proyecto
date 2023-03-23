// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.language.*;
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WS=38, SL_COMMENT=39, 
		ML_COMMENT=40, ID=41, INT_CONSTANT=42, REAL_CONSTANT=43, CHAR_CONSTANT=44;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_main = 2, RULE_definition = 3, 
		RULE_var_definitions = 4, RULE_var_definition = 5, RULE_func_definition = 6, 
		RULE_func_params = 7, RULE_params = 8, RULE_param = 9, RULE_type = 10, 
		RULE_complex_type = 11, RULE_array_type = 12, RULE_dimension = 13, RULE_struct_type = 14, 
		RULE_registers = 15, RULE_register = 16, RULE_simple_type = 17, RULE_statements = 18, 
		RULE_statement = 19, RULE_if_else = 20, RULE_else_statement = 21, RULE_while_loop = 22, 
		RULE_func_invocation = 23, RULE_arguments = 24, RULE_separated_expressions = 25, 
		RULE_expression = 26, RULE_ids = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "main", "definition", "var_definitions", "var_definition", 
			"func_definition", "func_params", "params", "param", "type", "complex_type", 
			"array_type", "dimension", "struct_type", "registers", "register", "simple_type", 
			"statements", "statement", "if_else", "else_statement", "while_loop", 
			"func_invocation", "arguments", "separated_expressions", "expression", 
			"ids"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
			"'['", "']'", "'struct'", "'int'", "'char'", "'double'", "'print'", "'input'", 
			"'='", "'return'", "'if'", "'else'", "'while'", "'.'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "SL_COMMENT", "ML_COMMENT", "ID", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT"
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
			setState(56);
			((ProgramContext)_localctx).definitions = definitions();
			setState(57);
			((ProgramContext)_localctx).main = main();
			setState(58);
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
			setState(66);
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
				setState(62);
				((DefinitionsContext)_localctx).definition = definition();
				setState(63);
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
			setState(68);
			((MainContext)_localctx).OP = match(T__0);
			setState(69);
			((MainContext)_localctx).NAME = match(T__1);
			setState(70);
			match(T__2);
			setState(71);
			match(T__3);
			setState(72);
			match(T__4);
			setState(73);
			match(T__5);
			setState(74);
			((MainContext)_localctx).statements = statements();
			setState(75);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).var_definition.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
			setState(91);
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
				setState(87);
				((Var_definitionsContext)_localctx).var_definition = var_definition();
				setState(88);
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
			setState(93);
			((Var_definitionContext)_localctx).ids = ids();
			setState(94);
			match(T__4);
			setState(95);
			((Var_definitionContext)_localctx).type = type();
			setState(96);
			match(T__7);
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
	public static class Func_definitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public FunctionType functionType;
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
		enterRule(_localctx, 12, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((Func_definitionContext)_localctx).OP = match(T__0);
			setState(100);
			((Func_definitionContext)_localctx).ID = match(ID);
			setState(101);
			match(T__2);
			setState(102);
			((Func_definitionContext)_localctx).func_params = func_params();
			setState(103);
			match(T__3);
			setState(104);
			match(T__4);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 62464L) != 0) {
				{
				{
				setState(105);
				((Func_definitionContext)_localctx).type = type();
				}
				 ((Func_definitionContext)_localctx).functionType =  new FunctionType(((Func_definitionContext)_localctx).func_params.ast, ((Func_definitionContext)_localctx).type.ast, ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getLine(), ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
			}

			{
			 ((Func_definitionContext)_localctx).functionType =  new FunctionType(((Func_definitionContext)_localctx).func_params.ast, VoidType.getInstance(), ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getLine(), ((Func_definitionContext)_localctx).func_params.ast.size() > 0 ? ((Func_definitionContext)_localctx).func_params.ast.get(0).getLine() : ((Func_definitionContext)_localctx).OP.getCharPositionInLine() + 1); 
			}
			setState(111);
			match(T__5);
			setState(112);
			((Func_definitionContext)_localctx).statements = statements();
			setState(113);
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
		enterRule(_localctx, 14, RULE_func_params);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
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
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((ParamsContext)_localctx).param = param();
				 _localctx.ast.add(0, ((ParamsContext)_localctx).param.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((ParamsContext)_localctx).param = param();
				setState(126);
				match(T__8);
				setState(127);
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
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((ParamContext)_localctx).ID = match(ID);
			setState(133);
			match(T__4);
			setState(134);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case T__9:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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
		enterRule(_localctx, 22, RULE_complex_type);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((Complex_typeContext)_localctx).array_type = array_type();
				 ((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array_type.ast; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		enterRule(_localctx, 24, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((Array_typeContext)_localctx).dimension = dimension();
			setState(154);
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
		enterRule(_localctx, 26, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__9);
			setState(158);
			((DimensionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(159);
			match(T__10);
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
		enterRule(_localctx, 28, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((Struct_typeContext)_localctx).OP = match(T__11);
			setState(163);
			match(T__5);
			setState(164);
			((Struct_typeContext)_localctx).registers = registers();
			setState(165);
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
		enterRule(_localctx, 30, RULE_registers);
		try {
			setState(173);
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
				setState(169);
				((RegistersContext)_localctx).register = register();
				setState(170);
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
		enterRule(_localctx, 32, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((RegisterContext)_localctx).ids = ids();
			setState(176);
			match(T__4);
			setState(177);
			((RegisterContext)_localctx).type = type();
			setState(178);
			match(T__7);
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
		enterRule(_localctx, 34, RULE_simple_type);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__12);
				 ((Simple_typeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__13);
				 ((Simple_typeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(T__14);
				 ((Simple_typeContext)_localctx).ast =  DoubleType.getInstance(); 
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
		enterRule(_localctx, 36, RULE_statements);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((StatementsContext)_localctx).statement = statement();
				setState(191);
				((StatementsContext)_localctx).statements = statements();
				 ((StatementsContext)_localctx).statements.ast.addAll(0, ((StatementsContext)_localctx).statement.ast); ((StatementsContext)_localctx).ast =  ((StatementsContext)_localctx).statements.ast; 
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
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token OP;
		public Separated_expressionsContext separated_expressions;
		public ExpressionContext left;
		public ExpressionContext right;
		public If_elseContext if_else;
		public While_loopContext while_loop;
		public ExpressionContext expression;
		public Func_invocationContext func_invocation;
		public Var_definitionContext var_definition;
		public Separated_expressionsContext separated_expressions() {
			return getRuleContext(Separated_expressionsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
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
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((StatementContext)_localctx).OP = match(T__15);
				setState(197);
				((StatementContext)_localctx).separated_expressions = separated_expressions();
				setState(198);
				match(T__7);
				 ((StatementContext)_localctx).separated_expressions.ast.stream().forEach((expression) -> _localctx.ast.add(new Print(expression, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((StatementContext)_localctx).OP = match(T__16);
				setState(202);
				((StatementContext)_localctx).separated_expressions = separated_expressions();
				setState(203);
				match(T__7);
				 ((StatementContext)_localctx).separated_expressions.ast.stream().forEach((expression) -> _localctx.ast.add(new Input(expression, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				((StatementContext)_localctx).left = expression(0);
				setState(207);
				match(T__17);
				setState(208);
				((StatementContext)_localctx).right = expression(0);
				setState(209);
				match(T__7);
				 _localctx.ast.add(0, new Assignment(((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast, ((StatementContext)_localctx).left.ast.getLine(), ((StatementContext)_localctx).left.ast.getColumn())); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((StatementContext)_localctx).if_else = if_else();
				 _localctx.ast.add(0, ((StatementContext)_localctx).if_else.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				((StatementContext)_localctx).while_loop = while_loop();
				 _localctx.ast.add(0, ((StatementContext)_localctx).while_loop.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				((StatementContext)_localctx).OP = match(T__18);
				setState(219);
				((StatementContext)_localctx).expression = expression(0);
				setState(220);
				match(T__7);
				 _localctx.ast.add(0, new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine() + 1)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				((StatementContext)_localctx).func_invocation = func_invocation();
				setState(224);
				match(T__7);
				 _localctx.ast.add(0, ((StatementContext)_localctx).func_invocation.ast); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				((StatementContext)_localctx).var_definition = var_definition();
				 _localctx.ast.addAll(0, ((StatementContext)_localctx).var_definition.ast); 
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
		public StatementsContext body;
		public Else_statementContext else_statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
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
		enterRule(_localctx, 40, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((If_elseContext)_localctx).OP = match(T__19);
			setState(233);
			((If_elseContext)_localctx).condition = expression(0);
			setState(234);
			match(T__4);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(235);
				match(T__5);
				setState(236);
				((If_elseContext)_localctx).body = statements();
				setState(237);
				match(T__6);
				}
				}
				break;
			case T__2:
			case T__6:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				{
				setState(239);
				((If_elseContext)_localctx).body = statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(242);
				((If_elseContext)_localctx).else_statement = else_statement();
				 _localctx.elseBody.addAll(((If_elseContext)_localctx).else_statement.ast); 
				}
				break;
			}
			 ((If_elseContext)_localctx).ast =  new IfElse(((If_elseContext)_localctx).condition.ast, ((If_elseContext)_localctx).body.ast, _localctx.elseBody, ((If_elseContext)_localctx).OP.getLine(), ((If_elseContext)_localctx).OP.getCharPositionInLine() + 1); 
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
		public StatementsContext body;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		enterRule(_localctx, 42, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__20);
			setState(250);
			match(T__4);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(251);
				match(T__5);
				setState(252);
				((Else_statementContext)_localctx).body = statements();
				setState(253);
				match(T__6);
				}
				break;
			case T__2:
			case T__6:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				{
				setState(255);
				((Else_statementContext)_localctx).body = statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.ast.addAll(((Else_statementContext)_localctx).body.ast); 
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
		public StatementsContext st;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		enterRule(_localctx, 44, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((While_loopContext)_localctx).OP = match(T__21);
			setState(261);
			((While_loopContext)_localctx).expression = expression(0);
			setState(262);
			match(T__4);
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(263);
				match(T__5);
				setState(264);
				((While_loopContext)_localctx).st = statements();
				setState(265);
				match(T__6);
				}
				break;
			case T__2:
			case T__6:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				{
				setState(267);
				((While_loopContext)_localctx).st = statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((While_loopContext)_localctx).ast =  new While(((While_loopContext)_localctx).expression.ast, ((While_loopContext)_localctx).st.ast, ((While_loopContext)_localctx).OP.getLine(), ((While_loopContext)_localctx).OP.getCharPositionInLine() + 1); 
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
		enterRule(_localctx, 46, RULE_func_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((Func_invocationContext)_localctx).ID = match(ID);
			setState(273);
			match(T__2);
			setState(274);
			((Func_invocationContext)_localctx).arguments = arguments();
			setState(275);
			match(T__3);
			 ((Func_invocationContext)_localctx).ast =  new FunctionInvocation((((Func_invocationContext)_localctx).ID!=null?((Func_invocationContext)_localctx).ID.getText():null), ((Func_invocationContext)_localctx).arguments.ast, ((Func_invocationContext)_localctx).ID.getLine(), ((Func_invocationContext)_localctx).ID.getCharPositionInLine() + 1); 
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
		enterRule(_localctx, 48, RULE_arguments);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__23:
			case T__24:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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
		enterRule(_localctx, 50, RULE_separated_expressions);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((Separated_expressionsContext)_localctx).expression = expression(0);
				 _localctx.ast.add(0, ((Separated_expressionsContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((Separated_expressionsContext)_localctx).expression = expression(0);
				setState(288);
				match(T__8);
				setState(289);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(295);
				((ExpressionContext)_localctx).func_invocation = func_invocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_invocation.ast; 
				}
				break;
			case 2:
				{
				setState(298);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitInt(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(300);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(302);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new LitDouble(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(304);
				match(T__2);
				setState(305);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(306);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 6:
				{
				setState(309);
				((ExpressionContext)_localctx).OP = match(T__2);
				setState(310);
				((ExpressionContext)_localctx).simple_type = simple_type();
				setState(311);
				match(T__3);
				setState(312);
				((ExpressionContext)_localctx).expression = expression(9);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).expression.ast, ((ExpressionContext)_localctx).simple_type.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 7:
				{
				setState(315);
				((ExpressionContext)_localctx).OP = match(T__23);
				setState(316);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).expression = expression(8);
				 ((ExpressionContext)_localctx).ast =  new MinusUnary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 8:
				{
				setState(319);
				((ExpressionContext)_localctx).OP = match(T__24);
				setState(320);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).expression = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine() + 1); 
				}
				break;
			case 9:
				{
				setState(323);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Var((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(362);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(328);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						 ((ExpressionContext)_localctx).ast =  new Comparaison(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(343);
						((ExpressionContext)_localctx).OP = match(T__35);
						setState(344);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
						((ExpressionContext)_localctx).OP = match(T__36);
						setState(349);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(353);
						match(T__9);
						setState(354);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(355);
						match(T__10);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(359);
						match(T__22);
						setState(360);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn()); 
						}
						break;
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 54, RULE_ids);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				((IdsContext)_localctx).ID = match(ID);
				 if (_localctx.ast.stream().anyMatch(variable -> variable.name.equals((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null)))) { new ErrorType("Duplicated identifier" + (((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1); } else { _localctx.ast.add(0, new Var((((IdsContext)_localctx).ID!=null?((IdsContext)_localctx).ID.getText():null), ((IdsContext)_localctx).ID.getLine(), ((IdsContext)_localctx).ID.getCharPositionInLine() + 1)); } 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				((IdsContext)_localctx).ID = match(ID);
				setState(370);
				match(T__8);
				setState(371);
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
		case 26:
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
		"\u0004\u0001,\u0179\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\\\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0083\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ae"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00bc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00c3\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00f1\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f6"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0101\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010d\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u011b\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0125\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0146\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u016b\b\u001a\n\u001a\f\u001a\u016e\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0177\b\u001b\u0001\u001b\u0000\u00014\u001c"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0246\u0000\u0003\u0001\u0000\u001a\u001c\u0002\u0000"+
		"\u0018\u0018\u001d\u001d\u0001\u0000\u001e#\u0185\u00008\u0001\u0000\u0000"+
		"\u0000\u0002B\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006"+
		"T\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000"+
		"\u0000\fc\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"\u0082\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014"+
		"\u008f\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u0099\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c"+
		"\u00a2\u0001\u0000\u0000\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00af"+
		"\u0001\u0000\u0000\u0000\"\u00bb\u0001\u0000\u0000\u0000$\u00c2\u0001"+
		"\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000(\u00e8\u0001\u0000\u0000"+
		"\u0000*\u00f9\u0001\u0000\u0000\u0000,\u0104\u0001\u0000\u0000\u0000."+
		"\u0110\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u0124\u0001"+
		"\u0000\u0000\u00004\u0145\u0001\u0000\u0000\u00006\u0176\u0001\u0000\u0000"+
		"\u000089\u0003\u0002\u0001\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0000"+
		"\u0000\u0001;<\u0006\u0000\uffff\uffff\u0000<\u0001\u0001\u0000\u0000"+
		"\u0000=C\u0001\u0000\u0000\u0000>?\u0003\u0006\u0003\u0000?@\u0003\u0002"+
		"\u0001\u0000@A\u0006\u0001\uffff\uffff\u0000AC\u0001\u0000\u0000\u0000"+
		"B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005\u0002\u0000\u0000FG\u0005"+
		"\u0003\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0005\u0006\u0000\u0000JK\u0003$\u0012\u0000KL\u0005\u0007\u0000\u0000"+
		"LM\u0006\u0002\uffff\uffff\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0003"+
		"\n\u0005\u0000OP\u0006\u0003\uffff\uffff\u0000PU\u0001\u0000\u0000\u0000"+
		"QR\u0003\f\u0006\u0000RS\u0006\u0003\uffff\uffff\u0000SU\u0001\u0000\u0000"+
		"\u0000TN\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000U\u0007\u0001"+
		"\u0000\u0000\u0000V\\\u0001\u0000\u0000\u0000WX\u0003\n\u0005\u0000XY"+
		"\u0003\b\u0004\u0000YZ\u0006\u0004\uffff\uffff\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000\\\t\u0001\u0000"+
		"\u0000\u0000]^\u00036\u001b\u0000^_\u0005\u0005\u0000\u0000_`\u0003\u0014"+
		"\n\u0000`a\u0005\b\u0000\u0000ab\u0006\u0005\uffff\uffff\u0000b\u000b"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0001\u0000\u0000de\u0005)\u0000\u0000"+
		"ef\u0005\u0003\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005\u0004\u0000"+
		"\u0000hl\u0005\u0005\u0000\u0000ij\u0003\u0014\n\u0000jk\u0006\u0006\uffff"+
		"\uffff\u0000km\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u0006\uffff\uffff"+
		"\u0000op\u0005\u0006\u0000\u0000pq\u0003$\u0012\u0000qr\u0005\u0007\u0000"+
		"\u0000rs\u0006\u0006\uffff\uffff\u0000s\r\u0001\u0000\u0000\u0000tu\u0003"+
		"\u0010\b\u0000uv\u0006\u0007\uffff\uffff\u0000vy\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0003\u0012\t\u0000{|\u0006\b"+
		"\uffff\uffff\u0000|\u0083\u0001\u0000\u0000\u0000}~\u0003\u0012\t\u0000"+
		"~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080\u0081"+
		"\u0006\b\uffff\uffff\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082z"+
		"\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0083\u0011\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005)\u0000\u0000\u0085\u0086\u0005\u0005"+
		"\u0000\u0000\u0086\u0087\u0003\"\u0011\u0000\u0087\u0088\u0006\t\uffff"+
		"\uffff\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0003\"\u0011"+
		"\u0000\u008a\u008b\u0006\n\uffff\uffff\u0000\u008b\u0090\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d\u008e\u0006\n\uffff\uffff"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000"+
		"\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u0090\u0015\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0006\u000b\uffff\uffff"+
		"\u0000\u0093\u0098\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u001c\u000e"+
		"\u0000\u0095\u0096\u0006\u000b\uffff\uffff\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000"+
		"\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u001a"+
		"\r\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b\u009c\u0006\f\uffff\uffff"+
		"\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000"+
		"\u009e\u009f\u0005*\u0000\u0000\u009f\u00a0\u0005\u000b\u0000\u0000\u00a0"+
		"\u00a1\u0006\r\uffff\uffff\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\f\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4\u00a5"+
		"\u0003\u001e\u000f\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u00a7"+
		"\u0006\u000e\uffff\uffff\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ae\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u00ab"+
		"\u0003\u001e\u000f\u0000\u00ab\u00ac\u0006\u000f\uffff\uffff\u0000\u00ac"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u00036\u001b\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b2"+
		"\u0003\u0014\n\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0006"+
		"\u0010\uffff\uffff\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\r\u0000\u0000\u00b6\u00bc\u0006\u0011\uffff\uffff\u0000\u00b7\u00b8\u0005"+
		"\u000e\u0000\u0000\u00b8\u00bc\u0006\u0011\uffff\uffff\u0000\u00b9\u00ba"+
		"\u0005\u000f\u0000\u0000\u00ba\u00bc\u0006\u0011\uffff\uffff\u0000\u00bb"+
		"\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00c3"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0003&\u0013\u0000\u00bf\u00c0\u0003"+
		"$\u0012\u0000\u00c0\u00c1\u0006\u0012\uffff\uffff\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001"+
		"\u0000\u0000\u0000\u00c3%\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0010"+
		"\u0000\u0000\u00c5\u00c6\u00032\u0019\u0000\u00c6\u00c7\u0005\b\u0000"+
		"\u0000\u00c7\u00c8\u0006\u0013\uffff\uffff\u0000\u00c8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0011\u0000\u0000\u00ca\u00cb\u00032\u0019"+
		"\u0000\u00cb\u00cc\u0005\b\u0000\u0000\u00cc\u00cd\u0006\u0013\uffff\uffff"+
		"\u0000\u00cd\u00e7\u0001\u0000\u0000\u0000\u00ce\u00cf\u00034\u001a\u0000"+
		"\u00cf\u00d0\u0005\u0012\u0000\u0000\u00d0\u00d1\u00034\u001a\u0000\u00d1"+
		"\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0006\u0013\uffff\uffff\u0000\u00d3"+
		"\u00e7\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003(\u0014\u0000\u00d5\u00d6"+
		"\u0006\u0013\uffff\uffff\u0000\u00d6\u00e7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0003,\u0016\u0000\u00d8\u00d9\u0006\u0013\uffff\uffff\u0000\u00d9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0013\u0000\u0000\u00db"+
		"\u00dc\u00034\u001a\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00de"+
		"\u0006\u0013\uffff\uffff\u0000\u00de\u00e7\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0003.\u0017\u0000\u00e0\u00e1\u0005\b\u0000\u0000\u00e1\u00e2"+
		"\u0006\u0013\uffff\uffff\u0000\u00e2\u00e7\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0003\n\u0005\u0000\u00e4\u00e5\u0006\u0013\uffff\uffff\u0000\u00e5"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e6\u00c4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00e6\u00ce\u0001\u0000\u0000\u0000\u00e6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e6\u00d7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00da\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e7\'\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0014\u0000\u0000\u00e9\u00ea\u00034\u001a\u0000\u00ea\u00f0\u0005"+
		"\u0005\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u00ed\u0003"+
		"$\u0012\u0000\u00ed\u00ee\u0005\u0007\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0003$\u0012\u0000\u00f0\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0003*\u0015\u0000\u00f3\u00f4\u0006\u0014\uffff\uffff"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0006\u0014\uffff\uffff\u0000\u00f8)\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\u0015\u0000\u0000\u00fa\u0100\u0005\u0005\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0006\u0000\u0000\u00fc\u00fd\u0003$\u0012\u0000"+
		"\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0003$\u0012\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0006\u0015\uffff\uffff\u0000\u0103+\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u0016\u0000\u0000\u0105\u0106\u00034\u001a\u0000\u0106\u010c"+
		"\u0005\u0005\u0000\u0000\u0107\u0108\u0005\u0006\u0000\u0000\u0108\u0109"+
		"\u0003$\u0012\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u010d\u0003$\u0012\u0000\u010c\u0107\u0001\u0000"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0006\u0016\uffff\uffff\u0000\u010f-\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005)\u0000\u0000\u0111\u0112\u0005\u0003\u0000"+
		"\u0000\u0112\u0113\u00030\u0018\u0000\u0113\u0114\u0005\u0004\u0000\u0000"+
		"\u0114\u0115\u0006\u0017\uffff\uffff\u0000\u0115/\u0001\u0000\u0000\u0000"+
		"\u0116\u011b\u0001\u0000\u0000\u0000\u0117\u0118\u00032\u0019\u0000\u0118"+
		"\u0119\u0006\u0018\uffff\uffff\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u0116\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000"+
		"\u011b1\u0001\u0000\u0000\u0000\u011c\u011d\u00034\u001a\u0000\u011d\u011e"+
		"\u0006\u0019\uffff\uffff\u0000\u011e\u0125\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u00034\u001a\u0000\u0120\u0121\u0005\t\u0000\u0000\u0121\u0122"+
		"\u00032\u0019\u0000\u0122\u0123\u0006\u0019\uffff\uffff\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u011f"+
		"\u0001\u0000\u0000\u0000\u01253\u0001\u0000\u0000\u0000\u0126\u0127\u0006"+
		"\u001a\uffff\uffff\u0000\u0127\u0128\u0003.\u0017\u0000\u0128\u0129\u0006"+
		"\u001a\uffff\uffff\u0000\u0129\u0146\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005*\u0000\u0000\u012b\u0146\u0006\u001a\uffff\uffff\u0000\u012c\u012d"+
		"\u0005,\u0000\u0000\u012d\u0146\u0006\u001a\uffff\uffff\u0000\u012e\u012f"+
		"\u0005+\u0000\u0000\u012f\u0146\u0006\u001a\uffff\uffff\u0000\u0130\u0131"+
		"\u0005\u0003\u0000\u0000\u0131\u0132\u00034\u001a\u0000\u0132\u0133\u0005"+
		"\u0004\u0000\u0000\u0133\u0134\u0006\u001a\uffff\uffff\u0000\u0134\u0146"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137"+
		"\u0003\"\u0011\u0000\u0137\u0138\u0005\u0004\u0000\u0000\u0138\u0139\u0003"+
		"4\u001a\t\u0139\u013a\u0006\u001a\uffff\uffff\u0000\u013a\u0146\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0018\u0000\u0000\u013c\u013d\u0003"+
		"4\u001a\b\u013d\u013e\u0006\u001a\uffff\uffff\u0000\u013e\u0146\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005\u0019\u0000\u0000\u0140\u0141\u0003"+
		"4\u001a\u0007\u0141\u0142\u0006\u001a\uffff\uffff\u0000\u0142\u0146\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005)\u0000\u0000\u0144\u0146\u0006\u001a"+
		"\uffff\uffff\u0000\u0145\u0126\u0001\u0000\u0000\u0000\u0145\u012a\u0001"+
		"\u0000\u0000\u0000\u0145\u012c\u0001\u0000\u0000\u0000\u0145\u012e\u0001"+
		"\u0000\u0000\u0000\u0145\u0130\u0001\u0000\u0000\u0000\u0145\u0135\u0001"+
		"\u0000\u0000\u0000\u0145\u013b\u0001\u0000\u0000\u0000\u0145\u013f\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u016c\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\n\u0006\u0000\u0000\u0148\u0149\u0007\u0000"+
		"\u0000\u0000\u0149\u014a\u00034\u001a\u0007\u014a\u014b\u0006\u001a\uffff"+
		"\uffff\u0000\u014b\u016b\u0001\u0000\u0000\u0000\u014c\u014d\n\u0005\u0000"+
		"\u0000\u014d\u014e\u0007\u0001\u0000\u0000\u014e\u014f\u00034\u001a\u0006"+
		"\u014f\u0150\u0006\u001a\uffff\uffff\u0000\u0150\u016b\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\n\u0004\u0000\u0000\u0152\u0153\u0007\u0002\u0000\u0000"+
		"\u0153\u0154\u00034\u001a\u0005\u0154\u0155\u0006\u001a\uffff\uffff\u0000"+
		"\u0155\u016b\u0001\u0000\u0000\u0000\u0156\u0157\n\u0003\u0000\u0000\u0157"+
		"\u0158\u0005$\u0000\u0000\u0158\u0159\u00034\u001a\u0004\u0159\u015a\u0006"+
		"\u001a\uffff\uffff\u0000\u015a\u016b\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\n\u0002\u0000\u0000\u015c\u015d\u0005%\u0000\u0000\u015d\u015e\u0003"+
		"4\u001a\u0003\u015e\u015f\u0006\u001a\uffff\uffff\u0000\u015f\u016b\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\n\u000b\u0000\u0000\u0161\u0162\u0005\n"+
		"\u0000\u0000\u0162\u0163\u00034\u001a\u0000\u0163\u0164\u0005\u000b\u0000"+
		"\u0000\u0164\u0165\u0006\u001a\uffff\uffff\u0000\u0165\u016b\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\n\n\u0000\u0000\u0167\u0168\u0005\u0017\u0000"+
		"\u0000\u0168\u0169\u0005)\u0000\u0000\u0169\u016b\u0006\u001a\uffff\uffff"+
		"\u0000\u016a\u0147\u0001\u0000\u0000\u0000\u016a\u014c\u0001\u0000\u0000"+
		"\u0000\u016a\u0151\u0001\u0000\u0000\u0000\u016a\u0156\u0001\u0000\u0000"+
		"\u0000\u016a\u015b\u0001\u0000\u0000\u0000\u016a\u0160\u0001\u0000\u0000"+
		"\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d5\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0005)\u0000\u0000\u0170\u0177\u0006\u001b\uffff\uffff\u0000"+
		"\u0171\u0172\u0005)\u0000\u0000\u0172\u0173\u0005\t\u0000\u0000\u0173"+
		"\u0174\u00036\u001b\u0000\u0174\u0175\u0006\u001b\uffff\uffff\u0000\u0175"+
		"\u0177\u0001\u0000\u0000\u0000\u0176\u016f\u0001\u0000\u0000\u0000\u0176"+
		"\u0171\u0001\u0000\u0000\u0000\u01777\u0001\u0000\u0000\u0000\u0016BT"+
		"[lx\u0082\u008f\u0097\u00ad\u00bb\u00c2\u00e6\u00f0\u00f5\u0100\u010c"+
		"\u011a\u0124\u0145\u016a\u016c\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}