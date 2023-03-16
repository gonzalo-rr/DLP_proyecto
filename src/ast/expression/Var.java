package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;
import ast.language.VarDefinition;

public class Var extends AbstractNode implements Expression {

    public String name;

    public Var(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != Var.class) return false;
        if (!((Var) obj).name.equals(this.name)) return false;
        return true;
    }

}
