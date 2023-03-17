package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;
import visitor.Visitor;

public class Assignment extends AbstractNode implements Statement {

    public Expression left;
    public Expression right;

    public Assignment(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
