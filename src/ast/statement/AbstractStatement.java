package ast.statement;

import ast.AbstractNode;
import ast.Expression;
import ast.Statement;
import ast.Type;

public abstract class AbstractStatement extends AbstractNode implements Statement {

    public Type returnType;

    public AbstractStatement(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getReturnType() {
        return returnType;
    }

    @Override
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
