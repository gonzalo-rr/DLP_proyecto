package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;

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
}
