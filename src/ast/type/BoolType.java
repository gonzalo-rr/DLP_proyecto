package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class BoolType extends AbstractType implements Type {

    private static BoolType instance;

    private BoolType(int line, int column) {
        super(line, column);
    }

    public static BoolType getInstance() {
        if (instance == null) {
            instance = new BoolType(0, 0);
        }
        return instance;
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type instanceof BoolType) {
            return BoolType.getInstance();
        }
        return super.logical(type, node);
    }

    @Override
    public Type not(ASTNode node) {
        return BoolType.getInstance();
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof BoolType) {
            return BoolType.getInstance();
        }
        return super.mustBeEquals(type, node);
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return BoolType.getInstance();
    }

    @Override
    public Type asLogical(ASTNode node) {
        return BoolType.getInstance();
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
        return "BoolType";
    }

    @Override
    public char suffix() {
        return 'i';
    }

}
