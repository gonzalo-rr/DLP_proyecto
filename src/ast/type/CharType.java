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
        if (type instanceof IntType) {
            return IntType.getInstance();
        }
        if (type instanceof CharType) {
            return IntType.getInstance();
        }
        if (type instanceof DoubleType) {
            return IntType.getInstance();
        }
        return new ErrorType("A CharType can only perform an arithmetic operation with an IntType, a CharType or" +
                " a DoubleType, the arithmetic operation can not be performed with " +
                type, node.getLine(), node.getColumn());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
