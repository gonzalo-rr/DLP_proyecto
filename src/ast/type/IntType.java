package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;

public class IntType extends AbstractNode implements Type {

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

}
