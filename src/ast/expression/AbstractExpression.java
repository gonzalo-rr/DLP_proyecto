package ast.expression;

import ast.AbstractNode;
import ast.Expression;
import ast.Type;

public abstract class AbstractExpression extends AbstractNode implements Expression {

    public boolean lValue;

    public Type type;

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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

}
