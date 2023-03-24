package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class StructAccess extends AbstractExpression implements Expression {

    public Expression struct;
    public String id;

    public StructAccess(Expression struct, String id, int line, int column) {
        super(line, column);
        this.struct = struct;
        this.id = id;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
