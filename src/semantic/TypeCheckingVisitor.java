package semantic;

import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.CharType;
import ast.type.DoubleType;
import ast.type.IntType;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> implements Visitor<Void, Void> {

    // Expressions
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.left.accept(this, param);
        arithmetic.right.accept(this, param);
        arithmetic.setLValue(false);
        arithmetic.setType(arithmetic.left.getType().arithmetic(arithmetic.right.getType(), arithmetic));
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.array.accept(this, param);
        arrayAccess.index.accept(this, param);
        arrayAccess.setLValue(true);
        arrayAccess.setType(arrayAccess.array.getType().squareBrackets(arrayAccess.index.getType(), arrayAccess));
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.expression.accept(this, param);
        cast.type.accept(this, param);
        cast.setLValue(false);
        cast.setType(cast.expression.getType().canBeCastTo(cast.type, cast));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.left.accept(this, param);
        comparison.right.accept(this, param);
        comparison.setLValue(false);
        comparison.setType(comparison.right.getType().comparison(comparison.left.getType(), comparison));
        return null;
    }

    @Override
    public Void visit(LitChar litChar, Void param) {
        litChar.setLValue(false);
        litChar.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(LitDouble litDouble, Void param) {
        litDouble.setLValue(false);
        litDouble.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(LitInt litInt, Void param) {
        litInt.setLValue(false);
        litInt.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.left.accept(this, param);
        logical.right.accept(this, param);
        logical.setLValue(false);
        logical.setType(logical.left.getType().logical(logical.left.getType(), logical));
        return null;
    }

    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        minusUnary.expression.accept(this, param);
        minusUnary.setLValue(false);
        minusUnary.setType(minusUnary.expression.getType().minusUnary(minusUnary));
        return null;
    }

    @Override
    public Void visit(Not not, Void param) {
        not.expression.accept(this, param);
        not.setLValue(false);
        not.setType(not.expression.getType().not(not));
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.struct.accept(this, param);
        structAccess.setLValue(true);
        structAccess.setType(structAccess.struct.getType().dot(structAccess.id, structAccess));
        return null;
    }

    @Override
    public Void visit(Var var, Void param) {
        var.setLValue(true);
        var.setType(var.definition.getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.name.accept(this, param);
        functionInvocation.arguments.stream().forEach(argument -> argument.accept(this, param));
        functionInvocation.setType(functionInvocation.name.getType().parenthesis(
                functionInvocation.arguments.stream().map(argument ->
                        argument.getType()).toList(), functionInvocation));
        return null;
    }

    // Statements
    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.left.accept(this, param);
        assignment.right.accept(this, param);
        if (!assignment.left.getLValue()) {
            new ErrorType("The left part of an assignment must be a Variable, Array Access or Struct Access", assignment.left.getLine(), assignment.left.getColumn());
        }
        assignment.left.setType(assignment.left.getType().mustBeEquals(assignment.right.getType(), assignment));
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        input.expression.accept(this, param);
        if (!input.expression.getLValue()) {
            new ErrorType("The expression of an input must be a Variable, Array Access or Struct Access", input.expression.getLine(), input.expression.getColumn());
        }
        input.expression.setType(input.expression.getType().asBuiltInType(input.expression));
        return null;
    }

    @Override
    public Void visit(Print print, Void param) {
        print.expression.accept(this, param);
        print.expression.setType(print.expression.getType().asBuiltInType(print.expression));
        return null;
    }

    @Override
    public Void visit(Return ret, Void param) {
        ret.expression.accept(this, param);
        ret.expression.setType(ret.expression.getType().asBuiltInType(ret.expression));
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.condition.setType(ifElse.condition.);
        return null;
    }

}
