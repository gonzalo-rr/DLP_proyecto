package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Logical extends AbstractNode implements Expression {

    public String operation;
    public Expression left;
    public Expression right;

    public Logical(Expression left, String operation, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

}
