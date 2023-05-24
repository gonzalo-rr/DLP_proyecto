package semantic;

import ast.Expression;
import ast.FuncDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.CharType;
import ast.type.DoubleType;
import ast.type.FunctionType;
import ast.type.IntType;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> implements Visitor<Void, Void> {

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        funcDefinition.statements.forEach(statement -> statement.setReturnType(
                ((FunctionType) funcDefinition.getType()).returnType));
        super.visit(funcDefinition, param);
        return null;
    }

    // Expressions
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        super.visit(arithmetic, param);
        arithmetic.setLValue(false);
        arithmetic.setType(arithmetic.left.getType().arithmetic(arithmetic.right.getType(), arithmetic));
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        super.visit(arrayAccess, param);
        arrayAccess.setLValue(true);
        arrayAccess.setType(arrayAccess.array.getType().squareBrackets(arrayAccess.index.getType(), arrayAccess));
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        super.visit(cast, param);
        cast.setLValue(false);
        cast.setType(cast.expression.getType().canBeCastTo(cast.type, cast));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        super.visit(comparison, param);
        comparison.setLValue(false);
        comparison.setType(comparison.right.getType().comparison(comparison.left.getType(), comparison));
        return null;
    }

    @Override
    public Void visit(LitChar litChar, Void param) {
        super.visit(litChar, param);
        litChar.setLValue(false);
        litChar.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(LitDouble litDouble, Void param) {
        super.visit(litDouble, param);
        litDouble.setLValue(false);
        litDouble.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(LitInt litInt, Void param) {
        super.visit(litInt, param);
        litInt.setLValue(false);
        litInt.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        super.visit(logical, param);
        logical.setLValue(false);
        logical.setType(logical.left.getType().logical(logical.right.getType(), logical));
        return null;
    }

    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        super.visit(minusUnary, param);
        minusUnary.setLValue(false);
        minusUnary.setType(minusUnary.expression.getType().minusUnary(minusUnary));
        return null;
    }

    @Override
    public Void visit(Not not, Void param) {
        super.visit(not, param);
        not.setLValue(false);
        not.setType(not.expression.getType().not(not));
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        super.visit(structAccess, param);
        structAccess.setLValue(true);
        structAccess.setType(structAccess.struct.getType().dot(structAccess.id, structAccess));
        return null;
    }

    @Override
    public Void visit(Var var, Void param) {
        super.visit(var, param);
        var.setLValue(true);
        var.setType(var.definition.getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        super.visit(functionInvocation, param);
        functionInvocation.setType(functionInvocation.name.getType().parenthesis(
                functionInvocation.arguments.stream().map(Expression::getType).toList(), functionInvocation));
        return null;
    }

    // Statements
    @Override
    public Void visit(Assignment assignment, Void param) {
        super.visit(assignment, param);
        if (!assignment.left.getLValue()) {
            new ErrorType("The left part of an assignment must be a Variable, Array Access or Struct Access", assignment.left.getLine(), assignment.left.getColumn());
        }
        assignment.left.setType(assignment.left.getType().mustBeEquals(assignment.right.getType(), assignment));
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        super.visit(input, param);
        if (!input.expression.getLValue()) {
            new ErrorType("The expression of an input must be a Variable, Array Access or Struct Access", input.expression.getLine(), input.expression.getColumn());
        }
        input.expression.setType(input.expression.getType().asBuiltInType(input));
        return null;
    }

    @Override
    public Void visit(Print print, Void param) {
        super.visit(print, param);
        print.expression.setType(print.expression.getType().asBuiltInType(print));
        return null;
    }

    @Override
    public Void visit(Return ret, Void param) {
        super.visit(ret, param);
        ret.expression.setType(ret.expression.getType().asBuiltInType(ret));
        ret.expression.getType().mustBeEquals(ret.getReturnType(), ret);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        super.visit(ifElse, param);
        ifElse.ifBody.forEach(statement -> statement.setReturnType(ifElse.getReturnType()));
        ifElse.elseBody.forEach(statement -> statement.setReturnType(ifElse.getReturnType()));
        ifElse.condition.setType(ifElse.condition.getType().asLogical(ifElse));
        return null;
    }

    @Override
    public Void visit(While whileStatement, Void param) {
        super.visit(whileStatement, param);
        whileStatement.body.forEach(statement -> statement.setReturnType(whileStatement.getReturnType()));
        whileStatement.condition.setType(whileStatement.condition.getType().asLogical(whileStatement));
        return null;
    }

    @Override
    public Void visit(PlusEquals plusEquals, Void param) {
        super.visit(plusEquals, param);
        if (!plusEquals.left.getLValue()) {
            new ErrorType("The left part of an assignment must be a Variable, Array Access or Struct Access", plusEquals.left.getLine(), plusEquals.left.getColumn());
        }
        plusEquals.left.setType(plusEquals.left.getType().mustBeEquals(plusEquals.right.getType(), plusEquals));
        return null;
    }

}
