package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class MinusUnary extends AbstractExpression implements Expression {

    public Expression expression;

    public MinusUnary(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
