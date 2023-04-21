package visitor;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(FuncDefinition funcDefinition, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + funcDefinition);
    }

    @Override
    public TR visit(Program program, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + program);
    }

    @Override
    public TR visit(VarDefinition varDefinition, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + varDefinition);
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + arithmetic);
    }

    @Override
    public TR visit(ArrayAccess arrayAccess, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + arrayAccess);
    }

    @Override
    public TR visit(Cast cast, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + cast);
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + comparison);
    }

    @Override
    public TR visit(LitChar litChar, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + litChar);
    }

    @Override
    public TR visit(LitDouble litDouble, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + litDouble);
    }

    @Override
    public TR visit(LitInt litInt, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + litInt);
    }

    @Override
    public TR visit(Logical logical, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + logical);
    }

    @Override
    public TR visit(MinusUnary minusUnary, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + minusUnary);
    }

    @Override
    public TR visit(Not not, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + not);
    }

    @Override
    public TR visit(StructAccess structAccess, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + structAccess);
    }

    @Override
    public TR visit(Var var, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + var);
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + assignment);
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + functionInvocation);
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + ifElse);
    }

    @Override
    public TR visit(Input input, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + input);
    }

    @Override
    public TR visit(Print print, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + print);
    }

    @Override
    public TR visit(Return return_statement, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + return_statement);
    }

    @Override
    public TR visit(While while_statement, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + while_statement);
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + arrayType);
    }

    @Override
    public TR visit(CharType charType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + charType);
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + doubleType);
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + functionType);
    }

    @Override
    public TR visit(IntType intType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + intType);
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + recordField);
    }

    @Override
    public TR visit(StructType structType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass()
                + " for " + structType);
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + voidType);
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        throw new IllegalStateException("It is not possible to generate code " + this.getClass() + " for " + errorType);
    }

}
