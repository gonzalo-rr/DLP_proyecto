package ast.errors;

import ast.language.AbstractNode;
import ast.language.Type;

public class ErrorType extends AbstractNode implements Type {

    public String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;

        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error: " + message + ", line: " + this.getLine()  + " column: " + this.getColumn();
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

}
