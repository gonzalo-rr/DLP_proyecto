package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class ArrayAccess extends AbstractNode implements Expression {

    public Expression array;
    public Expression index;

    public ArrayAccess(Expression array, Expression index, int line, int column) {
        super(line, column);
        this.array = array;
        this.index = index;
    }

}
