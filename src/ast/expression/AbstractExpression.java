package ast.expression;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Expression;
import ast.Type;
import ast.errors.ErrorType;

import java.util.List;

public abstract class AbstractExpression extends AbstractNode implements Expression {

    public boolean lValue;

    public Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type dot(String id, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type not(ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type minusUnary(ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBoolean(ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

}
