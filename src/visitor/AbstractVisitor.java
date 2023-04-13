package visitor;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(FuncDefinition funcDefinition, TP param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.statements.forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Program program, TP param) {
        program.definitions.forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public TR visit(VarDefinition varDefinition, TP param) {
        varDefinition.type.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        arithmetic.left.accept(this, param);
        arithmetic.right.accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess arrayAccess, TP param) {
        arrayAccess.array.accept(this, param);
        arrayAccess.index.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.expression.accept(this, param);
        cast.type.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        comparison.left.accept(this, param);
        comparison.right.accept(this, param);
        return null;
    }

    @Override
    public TR visit(LitChar litChar, TP param) {
        return null;
    }

    @Override
    public TR visit(LitDouble litDouble, TP param) {
        return null;
    }

    @Override
    public TR visit(LitInt litInt, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        logical.left.accept(this, param);
        logical.right.accept(this, param);
        return null;
    }

    @Override
    public TR visit(MinusUnary minusUnary, TP param) {
        minusUnary.expression.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Not not, TP param) {
        not.expression.accept(this, param);
        return null;
    }

    @Override
    public TR visit(StructAccess structAccess, TP param) {
        structAccess.struct.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Var var, TP param) {
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.left.accept(this, param);
        assignment.right.accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.name.accept(this, param);
        functionInvocation.arguments.forEach(expression -> expression.accept(this, param));
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        ifElse.condition.accept(this, param);
        ifElse.ifBody.forEach(statement -> statement.accept(this, param));
        ifElse.elseBody.forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Input input, TP param) {
        input.expression.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Print print, TP param) {
        print.expression.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Return return_statement, TP param) {
        return_statement.expression.accept(this, param);
        return null;
    }

    @Override
    public TR visit(While while_statement, TP param) {
        while_statement.condition.accept(this, param);
        while_statement.body.forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        arrayType.type.accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.paramsType.forEach(varDefinition -> varDefinition.accept(this, param));
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.type.accept(this, param);
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        structType.recordFieldList.forEach(recordField -> recordField.accept(this, param));
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

}
