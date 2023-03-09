package ast.expression;

import ast.language.AbstractNode;
import ast.language.Expression;

public class Comparaison extends AbstractNode implements Expression {

    public String operation;
    public Expression operatorLeft;
    public Expression operatorRight;

    public Comparaison(int line, int column, String operation) {
        super(line, column);
        this.operation = operation;
    }

}
