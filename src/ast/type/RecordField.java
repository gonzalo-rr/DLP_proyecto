package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import visitor.Visitor;

public class RecordField extends AbstractNode {

    public String name;
    public Type type;

    public RecordField(String name, Type type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
