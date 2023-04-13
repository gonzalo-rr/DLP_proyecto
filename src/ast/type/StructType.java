package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

import java.util.List;
import java.util.Objects;
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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructType";

//        StringBuilder sB = new StringBuilder("StructType[fields=");
//        if (recordFieldList.size() > 0) {
//            sB.append(recordFieldList.get(0));
//            if (recordFieldList.size() > 1) {
//                recordFieldList.stream().skip(1).forEach(recordField -> sB.append(",").append(recordField.name));
//            }
//        }
//        sB.append("]");
//        return sB.toString();
    }

}
