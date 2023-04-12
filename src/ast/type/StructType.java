package ast.type;

import ast.ASTNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

import java.util.List;
import java.util.Objects;

public class StructType extends AbstractType implements Type {

    public List<RecordField> recordFieldList;

    public StructType(List<RecordField> recordFieldList, int line, int column) {
        super(line, column);
        this.recordFieldList = recordFieldList;
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof StructType structType) {
            if (this.recordFieldList.containsAll(structType.recordFieldList)) {
                return this;
            }
        }
        return new ErrorType(type + " is not " + this, node.getLine(), node.getColumn());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder("StructType[fields=");
        if (recordFieldList.size() > 0) {
            sB.append(recordFieldList.get(0));
            if (recordFieldList.size() > 1) {
                recordFieldList.stream().skip(1).forEach(recordField -> sB.append(",").append(recordField.name));
            }
        }
        sB.append("]");
        return sB.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructType that = (StructType) o;
        return recordFieldList.equals(that.recordFieldList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordFieldList);
    }
}
