package ast.errors;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.type.AbstractType;
import errorhandler.ErrorHandler;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType implements Type {

    public String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;

        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error: " + message + ", line: " + super.getLine()  + " column: " + super.getColumn();
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type dot(String id, ASTNode node) {
        return this;
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        return null;
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type not(ASTNode node) {
        return this;
    }

    @Override
    public Type minusUnary(ASTNode node) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode node) {
        return this;
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return this;
    }

    @Override
    public Type asLogical(ASTNode node) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }
}
