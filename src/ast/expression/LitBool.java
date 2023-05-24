package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class LitBool extends AbstractExpression implements Expression {

    public boolean val;

    public LitBool(int line, int column, boolean val) {
        super(line, column);
        this.val = val;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
