// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.language.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(PmmParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definitions(PmmParser.Var_definitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_definition(PmmParser.Func_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_params(PmmParser.Func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PmmParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PmmParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#complex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_type(PmmParser.Complex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(PmmParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(PmmParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(PmmParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#registers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisters(PmmParser.RegistersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(PmmParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(PmmParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PmmParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(PmmParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(PmmParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(PmmParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invocation(PmmParser.Func_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#separated_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparated_expressions(PmmParser.Separated_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(PmmParser.IdsContext ctx);
}