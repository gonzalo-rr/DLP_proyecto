package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

import java.util.List;
import java.util.Optional;

public class StructType extends AbstractType implements Type {

    public List<RecordField> recordFieldList;

    public StructType(List<RecordField> recordFieldList, int line, int column) {
        super(line, column);
        this.recordFieldList = recordFieldList;
    }

    @Override
    public Type dot(String id, ASTNode node) {
        Optional<RecordField> foundRecordField = recordFieldList.stream().filter(
                recordField -> recordField.name.equals(id)).findFirst();
        if (foundRecordField.isPresent()) {
            return foundRecordField.get().type;
        }
        return super.dot(id, node);
    }

    @Override
    public int numberOfBytes() {
        int bytes = 0;
        for (RecordField recordField : recordFieldList) {
            bytes += recordField.type.numberOfBytes();
        }
        return bytes;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder("StructType");
        if (!recordFieldList.isEmpty()) {
            sB.append("[recordFields=");
            for (int i = 0; i < recordFieldList.size() - 1; i++) {
                sB.append(recordFieldList.get(i)).append(",");
            }
            sB.append(recordFieldList.get(recordFieldList.size() - 1)).append("]");
        }
        return sB.toString();
    }

}
