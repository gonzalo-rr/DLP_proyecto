package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;

public class Return extends AbstractNode implements Statement {

    public Expression expression;

    public Return(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

}
