package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class StructAccess extends AbstractNode implements Expression {

    public Expression struct;
    public String id;

    public StructAccess(Expression struct, String id, int line, int column) {
        super(line, column);
        this.struct = struct;
        this.id = id;
    }

}
