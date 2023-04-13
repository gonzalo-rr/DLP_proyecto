package ast.statement;

import ast.AbstractNode;
import ast.Expression;
import ast.Statement;
import visitor.Visitor;

public class Input extends AbstractStatement implements Statement {

    public Expression expression;

    public Input(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
