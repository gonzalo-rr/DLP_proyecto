package ast.type;

import ast.AbstractNode;
import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractNode implements Type {

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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
