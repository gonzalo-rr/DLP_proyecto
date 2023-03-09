package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Arithmetic extends AbstractNode implements Expression {

    public String operation;
    public Expression left;
    public Expression right;

    public Arithmetic(Expression left, String operation, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

}
