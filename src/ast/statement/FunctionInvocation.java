package ast.statement;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractNode implements Statement, Expression {

    public String name;
    public List<Expression> arguments;

    public FunctionInvocation(String name, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
