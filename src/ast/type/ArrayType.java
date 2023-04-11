package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

public class ArrayType extends AbstractType implements Type {

    public int size;
    public Type type;

    public ArrayType(int size, Type type, int line, int column) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if ((type instanceof IntType)) {
            return type;
        }
        return new ErrorType("The index " + node + " of the ArrayAccess must be of IntType", node.getLine(), node.getColumn());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
    
}
