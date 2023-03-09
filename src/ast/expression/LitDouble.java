package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class LitDouble extends AbstractNode implements Expression {

    public double val;

    public LitDouble(int line, int column, double val) {
        super(line, column);
        this.val = val;
    }

}
