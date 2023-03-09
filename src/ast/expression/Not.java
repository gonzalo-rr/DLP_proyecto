package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Not extends AbstractNode implements Expression {

    public Expression expression;

    public Not(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

}
