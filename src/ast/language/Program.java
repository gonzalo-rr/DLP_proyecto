package ast.language;

import java.util.List;

public class Program extends AbstractNode implements ASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column) {
        super(line, column);
        this.definitions = definitions;
    }

}
