package ast.statement;

import ast.Expression;
import ast.Statement;
import ast.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class For extends AbstractStatement implements Statement {

    public VarDefinition definition;
    public Assignment initialization;
    public Expression condition;
    public Statement increment;
    public List<Statement> body;

    public For(VarDefinition definition, Assignment initialization, Expression condition, Statement increment, List<Statement> body, int line, int column) {
        super(line, column);
        this.definition = definition;
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
