package semantic;

import ast.errors.ErrorType;
import ast.expression.*;
import ast.language.FuncDefinition;
import ast.language.Program;
import ast.language.VarDefinition;
import ast.statement.*;
import ast.type.*;
import visitor.Visitor;

public class TypeCheckingVisitor implements Visitor<Void, Void> {

    @Override
    public Void visit(Program program, Void param) {
        program.definitions.stream().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        varDefinition.type.accept(this, param);
        return null;
    }

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        funcDefinition.statements.stream().forEach(statement -> statement.accept(this, param));
        return null;
    }

    // Expressions
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.left.accept(this, param);
        arithmetic.right.accept(this, param);
        arithmetic.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.array.accept(this, param);
        arrayAccess.index.accept(this, param);
        arrayAccess.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.expression.accept(this, param);
        cast.type.accept(this, param);
        cast.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparaison comparaison, Void param) {
        comparaison.left.accept(this, param);
        comparaison.right.accept(this, param);
        comparaison.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LitChar litChar, Void param) {
        litChar.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LitDouble litDouble, Void param) {
        litDouble.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LitInt litInt, Void param) {
        litInt.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.left.accept(this, param);
        logical.right.accept(this, param);
        logical.setLValue(false);
        return null;
    }

    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        minusUnary.expression.accept(this, param);
        minusUnary.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Not not, Void param) {
        not.expression.accept(this, param);
        not.setLValue(false);
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.struct.accept(this, param);
        structAccess.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Var var, Void param) {
        var.setLValue(true);
        return null;
    }

    // Statements
    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.left.accept(this, param);
        assignment.right.accept(this, param);
        if (!assignment.left.getLValue()) {
            new ErrorType("Error: the left part of an assignment must be a Variable, Array Access or Struct Access line: " + assignment.left.getLine() + ", column: " + assignment.left.getColumn(), assignment.left.getLine(), assignment.left.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.arguments.stream().forEach(expression -> expression.accept(this, param));
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.condition.accept(this, param);
        ifElse.ifBody.stream().forEach(statement -> statement.accept(this, param));
        ifElse.elseBody.stream().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        input.expression.accept(this, param);
        if (!input.expression.getLValue()) {
            new ErrorType("Error: the expression of an input must be a Variable, Array Access or Struct Access line: " + input.expression.getLine() + ", column: " + input.expression.getColumn(), input.expression.getLine(), input.expression.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(Print print, Void param) {
        print.expression.accept(this, param);
        return null;
    }

    @Override
    public Void visit(Return return_statement, Void param) {
        return_statement.expression.accept(this, param);
        return null;
    }

    @Override
    public Void visit(While while_statement, Void param) {
        while_statement.condition.accept(this, param);
        while_statement.body.stream().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        arrayType.type.accept(this, param);
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.paramsType.stream().forEach(varDefinition -> varDefinition.accept(this, param));
        return null;
    }

    @Override
    public Void visit(IntType intType, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        recordField.type.accept(this, param);
        return null;
    }

    @Override
    public Void visit(StructType structType, Void param) {
        structType.recordFieldList.stream().forEach(recordField -> recordField.accept(this, param));
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        return null;
    }


}
