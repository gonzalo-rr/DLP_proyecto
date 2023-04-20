package ast.type;

import ast.ASTNode;
import ast.Type;
import ast.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType implements Type {

    public List<VarDefinition> params;
    public Type returnType;

    public FunctionType(List<VarDefinition> paramsType, Type returnType, int line, int column) {
        super(line, column);
        this.params = paramsType;
        this.returnType = returnType;
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode node) {
        if (params.stream().map(varDefinition -> varDefinition.type).toList().equals(types)) {
            return returnType;
        }
        return super.parenthesis(types, node);
    }

    @Override
    public int numberOfBytes() {
        int bytes = 0;
        for (VarDefinition param : params) {
            bytes += param.getType().numberOfBytes();
        }
        bytes += returnType.numberOfBytes();
        return bytes;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FuncType";
    }

}
