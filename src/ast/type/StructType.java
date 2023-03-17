package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import visitor.Visitor;

import java.util.List;

public class StructType extends AbstractNode implements Type {

    public List<RecordField> recordFieldList;

    public StructType(List<RecordField> recordFieldList, int line, int column) {
        super(line, column);
        this.recordFieldList = recordFieldList;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
    
}
