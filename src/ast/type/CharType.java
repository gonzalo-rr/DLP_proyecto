package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

public class CharType extends AbstractType implements Type {

    private static CharType instance;

    private CharType(int line, int column) {
        super(line, column);
    }

    public static CharType getInstance() {
        if (instance == null) {
            instance = new CharType(0, 0);
        }
        return instance;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof CharType) {
            return IntType.getInstance();
        }
        return new ErrorType("It is not possible to perform an arithmetic operation between a CharType and a " +
                type, node.getLine(), node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        if (type instanceof CharType) {
            return CharType.getInstance();
        }
        return new ErrorType("A CharType can not be cast to " + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof CharType) {
            return CharType.getInstance();
        }
        return new ErrorType(type + " is not a CharType", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBuiltInType(Type type, ASTNode node) {
        return CharType.getInstance();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharType";
    }

}
