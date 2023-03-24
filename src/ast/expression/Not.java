package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class Not extends AbstractExpression implements Expression {

    public Expression expression;

    public Not(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
