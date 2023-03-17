package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import visitor.Visitor;

public class Arithmetic extends AbstractExpression implements Expression {

    public String operation;
    public Expression left;
    public Expression right;

    public Arithmetic(Expression left, String operation, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
