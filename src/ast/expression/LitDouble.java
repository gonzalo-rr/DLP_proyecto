package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class LitDouble extends AbstractExpression implements Expression {

    public double val;

    public LitDouble(int line, int column, double val) {
        super(line, column);
        this.val = val;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
