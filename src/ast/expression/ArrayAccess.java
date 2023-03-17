package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import visitor.Visitor;

public class ArrayAccess extends AbstractExpression implements Expression {

    public Expression array;
    public Expression index;

    public ArrayAccess(Expression array, Expression index, int line, int column) {
        super(line, column);
        this.array = array;
        this.index = index;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
