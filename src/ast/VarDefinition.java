package ast;

import ast.statement.AbstractStatement;
import visitor.Visitor;

public class VarDefinition extends AbstractStatement implements Definition, Statement {

    public String name;
    public Type type;
    private int scope;
    private int offset;

    public VarDefinition(String name, Type type, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
