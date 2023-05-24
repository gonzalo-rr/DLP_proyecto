package ast;

import visitor.Visitor;

public interface ASTNode {

    int getLine();

    int getColumn();

    // Visitor
    <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}
