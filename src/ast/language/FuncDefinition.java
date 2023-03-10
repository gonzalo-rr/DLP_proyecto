package ast.language;

import java.util.List;

public class FuncDefinition extends AbstractNode implements Definition {

    private String name;
    private Type type;
    public List<Statement> statements;

    public FuncDefinition(String name, Type type, List<Statement> statements, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
        this.statements = statements;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
