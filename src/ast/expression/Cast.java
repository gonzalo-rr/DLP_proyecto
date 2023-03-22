package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression implements Expression {

    public Expression expression;
    public Type type;

    public Cast(Expression expression, Type type, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
