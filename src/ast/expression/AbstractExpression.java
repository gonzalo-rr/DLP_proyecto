package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public abstract class AbstractExpression extends AbstractNode implements Expression {

    public boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }

}
