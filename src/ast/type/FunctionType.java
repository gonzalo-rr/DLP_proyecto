package ast.type;

import ast.language.AbstractNode;
import ast.language.Type;
import ast.language.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractNode implements Type {

    public List<VarDefinition> paramsType;
    public Type returnType;

    public FunctionType(List<VarDefinition> paramsType, Type returnType, int line, int column) {
        super(line, column);
        this.paramsType = paramsType;
        this.returnType = returnType;
    }

}
