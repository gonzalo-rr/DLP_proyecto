package ast.type;

import ast.AbstractNode;
import ast.Type;
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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
