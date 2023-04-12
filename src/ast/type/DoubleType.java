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
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        return new ErrorType("It is not possible to perform an arithmetic operation between a DoubleType and a "
                + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof DoubleType) {
            return IntType.getInstance();
        }
        return new ErrorType("A DoubleType can not be compared with a " + type,
                node.getLine(), node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type instanceof DoubleType) {
            return DoubleType.getInstance();
        }
        return new ErrorType("A DoubleType can not be cast to " + type, node.getLine(), node.getColumn());
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
        return new ErrorType(type + " is not a DoubleType", node.getLine(), node.getColumn());
    }

    @Override
    public Type asBuiltInType(Type type, ASTNode node) {
        return DoubleType.getInstance();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "DoubleType";
    }

}
