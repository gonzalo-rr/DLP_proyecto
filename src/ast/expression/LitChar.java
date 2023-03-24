package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class LitChar extends AbstractExpression implements Expression {

    public char val;

    public LitChar(int line, int column, char val) {
        super(line, column);
        this.val = val;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
