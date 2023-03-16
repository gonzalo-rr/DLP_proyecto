package ast.language;

public class VarDefinition extends AbstractNode implements Definition, Statement {

    public String name;
    public Type type;

    public VarDefinition(String name, Type type, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

}
