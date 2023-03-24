package ast.type;

import ast.AbstractNode;
import ast.Type;
import ast.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractNode implements Type {

    public List<VarDefinition> paramsType;
    public Type returnType;

    public FunctionType(List<VarDefinition> paramsType, Type returnType, int line, int column) {
        super(line, column);
        this.paramsType = paramsType;
        this.returnType = returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
