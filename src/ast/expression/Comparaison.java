package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class Comparaison extends AbstractExpression implements Expression {

    public String operation;
    public Expression left;
    public Expression right;

    public Comparaison(Expression left, String operation, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right =right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
