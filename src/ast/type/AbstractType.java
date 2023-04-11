package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;

import java.util.List;

public abstract class AbstractType extends AbstractNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
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
    public Type asBuiltInType(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBoolean(Type type, ASTNode node) {
        return new ErrorType("", node.getLine(), node.getColumn());
    }

}
