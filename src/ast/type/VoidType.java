package ast.type;

import ast.AbstractNode;
import ast.Type;
import visitor.Visitor;

public class VoidType extends AbstractType implements Type {

    private static VoidType instance;

    private VoidType(int line, int column) {
        super(line, column);
    }

    public static VoidType getInstance() {
        if (instance == null) {
            instance = new VoidType(0, 0);
        }
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidType";
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }
}
