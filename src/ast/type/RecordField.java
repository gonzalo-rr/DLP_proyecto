package ast.type;

import ast.AbstractNode;
import ast.Type;
import visitor.Visitor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordField that = (RecordField) o;
        return name.equals(that.name) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
