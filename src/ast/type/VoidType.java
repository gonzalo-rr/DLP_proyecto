package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import visitor.Visitor;

public class VoidType extends AbstractNode implements Type {

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

}
