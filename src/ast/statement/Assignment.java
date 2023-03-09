package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;

public class Assignment extends AbstractNode implements Statement {

    public Expression left;
    public Expression right;

    public Assignment(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

}
