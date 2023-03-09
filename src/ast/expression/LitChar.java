package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class LitChar extends AbstractNode implements Expression {

    public char val;

    public LitChar(int line, int column, char val) {
        super(line, column);
        this.val = val;
    }

}
