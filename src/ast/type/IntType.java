package ast.type;

import ast.ASTNode;
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
        return new ErrorType("It is not possible to perform an arithmetic operation between an IntType and a "
                + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return new ErrorType("It is not possible to perform a logical operation between an IntType and a "
                + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        return new ErrorType("An IntType can not be compared with a " + type,
                node.getLine(), node.getColumn());
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
        return new ErrorType("An IntType can not be cast to " + type, node.getLine(), node.getColumn());
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
        return new ErrorType(type + " is not an IntType", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBuiltInType(Type type, ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public Type asBoolean(ASTNode node) {
        return IntType.getInstance();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "IntType";
    }

}
