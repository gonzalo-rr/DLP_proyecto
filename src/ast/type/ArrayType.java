package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import visitor.Visitor;

public class ArrayType extends AbstractNode implements Type {

    public int size;
    public Type type;

    public ArrayType(int size, Type type, int line, int column) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
    
}
