package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

public class IntType extends AbstractType implements Type {

    private static IntType instance;

    private IntType(int line, int column) {
        super(line, column);
    }

    public static IntType getInstance() {
        if (instance == null) {
            instance = new IntType(0, 0);
        }
        return instance;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return super.arithmetic(type, node);
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return super.logical(type, node);
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return super.comparison(type, node);
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        if (type instanceof CharType) {
            return CharType.getInstance();
        }
        return super.canBeCastTo(type, node);
    }

    @Override
    public Type not(ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public Type minusUnary(ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return super.mustBeEquals(type, node);
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public Type asLogical(ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "IntType";
    }

    @Override
    public char suffix() {
        return 'i';
    }

}
