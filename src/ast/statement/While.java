package ast.statement;

import ast.AbstractNode;
import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class While extends AbstractStatement implements Statement {

    public Expression condition;
    public List<Statement> body;

    public While(Expression condition, List<Statement> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
