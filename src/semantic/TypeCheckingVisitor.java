package semantic;

import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> implements Visitor<Void, Void> {

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
        structAccess.setLValue(true);
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
            new ErrorType("The left part of an assignment must be a Variable, Array Access or Struct Access", assignment.left.getLine(), assignment.left.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        input.expression.accept(this, param);
        if (!input.expression.getLValue()) {
            new ErrorType("The expression of an input must be a Variable, Array Access or Struct Access", input.expression.getLine(), input.expression.getColumn());
        }
        return null;
    }

}
