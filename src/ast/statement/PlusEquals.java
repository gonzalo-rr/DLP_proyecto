package ast.statement;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

public class PlusEquals extends AbstractStatement implements Statement {

    public Expression left;
    public Expression right;

    public PlusEquals(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
