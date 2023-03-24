package ast;

public abstract class AbstractNode implements ASTNode {

    private int line;
    private int column;

    public AbstractNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

}
