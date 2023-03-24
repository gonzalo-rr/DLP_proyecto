package ast;

import visitor.Visitor;

public interface ASTNode {

    public int getLine();

    public int getColumn();

    // Visitor
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}
