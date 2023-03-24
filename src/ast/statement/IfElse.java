package ast.statement;

import ast.AbstractNode;
import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractNode implements Statement {

    public Expression condition;
    public List<Statement> ifBody;
    public List<Statement> elseBody;

    public IfElse(Expression condition, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
