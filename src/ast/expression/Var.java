package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Var extends AbstractNode implements Expression {

    public String name;

    public Var(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

}
