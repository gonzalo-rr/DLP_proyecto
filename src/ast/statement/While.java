package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;
import visitor.Visitor;

import java.util.List;

public class While extends AbstractNode implements Statement {

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
