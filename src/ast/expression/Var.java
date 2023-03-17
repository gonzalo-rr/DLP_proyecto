package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.VarDefinition;
import visitor.Visitor;

public class Var extends AbstractExpression implements Expression {

    public String name;

    public Var(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
