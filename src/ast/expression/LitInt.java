package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class LitInt extends AbstractNode implements Expression {

    public int val;

    public LitInt(int line, int column, int val) {
        super(line, column);
        this.val = val;
    }

}
