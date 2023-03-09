package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class MinusUnary extends AbstractNode implements Expression {

    public Expression expression;

    public MinusUnary(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

}
