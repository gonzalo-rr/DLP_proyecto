package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;

public class Input extends AbstractNode implements Statement {

    public Expression expression;

    public Input(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

}
