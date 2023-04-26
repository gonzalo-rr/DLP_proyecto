package ast.statement;

import ast.Type;
import ast.expression.AbstractExpression;
import ast.Expression;
import ast.Statement;
import ast.expression.Var;
import visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement, Expression {

    public Var name;
    public List<Expression> arguments;
    public Type returnType;

    public FunctionInvocation(Var name, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
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
