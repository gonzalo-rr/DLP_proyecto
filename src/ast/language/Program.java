package ast.language;

import visitor.Visitor;

import java.util.List;

public class Program extends AbstractNode implements ASTNode {

    public List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column) {
        super(line, column);
        this.definitions = definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
