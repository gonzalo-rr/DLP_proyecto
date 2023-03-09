package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;

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

}
