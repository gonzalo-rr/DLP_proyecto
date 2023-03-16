package ast.language;

import java.util.List;

public class FuncDefinition extends AbstractNode implements Definition {

    private String name;
    private Type functionType;
    public List<Statement> statements;

    public FuncDefinition(String name, Type functionType, List<Statement> statements, int line, int column) {
        super(line, column);
        this.name = name;
        this.functionType = functionType;
        this.statements = statements;
    }

    public Type getType() {
        return functionType;
    }

    public String getName() {
        return name;
    }

}
