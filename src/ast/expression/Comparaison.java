package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Comparaison extends AbstractNode implements Expression {

    public String operation;
    public Expression left;
    public Expression right;

    public Comparaison(Expression left, String operation, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operation = operation;
        this.right =right;
    }

}
