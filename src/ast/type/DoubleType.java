package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import visitor.Visitor;

public class DoubleType extends AbstractNode implements Type {

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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
