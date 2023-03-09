package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;

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

}
