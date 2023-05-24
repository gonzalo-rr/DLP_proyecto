package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

public class DoubleType extends AbstractType implements Type {

    private static DoubleType instance;

    private DoubleType(int line, int column) {
        super(line, column);
    }

    public static DoubleType getInstance() {
        if (instance == null) {
            instance = new DoubleType(0, 0);
        }
        return instance;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return DoubleType.getInstance();
        }
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        if (type instanceof CharType) {
            return DoubleType.getInstance();
        }
        return super.arithmetic(type, node);
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof DoubleType) {
            return IntType.getInstance();
        }
        return super.comparison(type, node);
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        if (type instanceof CharType) {
            return CharType.getInstance();
        }
        return super.canBeCastTo(type, node);
    }

    @Override
    public Type minusUnary(ASTNode node) {
        return DoubleType.getInstance();
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        return super.mustBeEquals(type, node);
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return DoubleType.getInstance();
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "DoubleType";
    }

    @Override
    public char suffix() {
        return 'f';
    }

}
