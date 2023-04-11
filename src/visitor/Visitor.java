package visitor;

import ast.errors.ErrorType;
import ast.expression.*;
import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.statement.*;
import ast.type.*;

public interface Visitor<TP, TR> {

    // Language
    public TR visit(FuncDefinition funcDefinition, TP param);

    public TR visit(Program program, TP param);

    public TR visit(VarDefinition varDefinition, TP param);

    // Expressions
    public TR visit(Arithmetic arithmetic, TP param);

    public TR visit(ArrayAccess arrayAccess, TP param);

    public TR visit(Cast cast, TP param);

    public TR visit(Comparison comparison, TP param);

    public TR visit(LitChar litChar, TP param);

    public TR visit(LitDouble litDouble, TP param);

    public TR visit(LitInt litInt, TP param);

    public TR visit(Logical logical, TP param);

    public TR visit(MinusUnary minusUnary, TP param);

    public TR visit(Not not, TP param);

    public TR visit(StructAccess structAccess, TP param);

    public TR visit(Var var, TP param);

    // Statements
    public TR visit(Assignment assignment, TP param);

    public TR visit(FunctionInvocation functionInvocation, TP param);

    public TR visit(IfElse ifElse, TP param);

    public TR visit(Input input, TP param);

    public TR visit(Print print, TP param);

    public TR visit(Return return_statement, TP param);

    public TR visit(While while_statement, TP param);

    // Types
    public TR visit(ArrayType arrayType, TP param);

    public TR visit(CharType charType, TP param);

    public TR visit(DoubleType doubleType, TP param);

    public TR visit(FunctionType functionType, TP param);

    public TR visit(IntType intType, TP param);

    public TR visit(RecordField recordField, TP param);

    public TR visit(StructType structType, TP param);

    public TR visit(VoidType voidType, TP param);

    public TR visit(ErrorType errorType, TP param);

}
