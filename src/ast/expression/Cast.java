package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Type;

public class Cast extends AbstractNode implements Expression {

    public Expression expression;
    public Type type;

    public Cast(Expression expression, Type type, int line, int column) {
        super(line, column);
    }

}
