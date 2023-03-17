package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import visitor.Visitor;

public class LitInt extends AbstractExpression implements Expression {

    public int val;

    public LitInt(int line, int column, int val) {
        super(line, column);
        this.val = val;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
