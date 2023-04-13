package ast.type;

import ast.ASTNode;
import ast.Type;
import ast.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType implements Type {

    public List<VarDefinition> paramsType;
    public Type returnType;

    public FunctionType(List<VarDefinition> paramsType, Type returnType, int line, int column) {
        super(line, column);
        this.paramsType = paramsType;
        this.returnType = returnType;
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode node) {
        if (paramsType.stream().map(varDefinition -> varDefinition.type).toList().equals(types)) {
            return returnType;
        }
        return super.parenthesis(types, node);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FuncType";
//        StringBuilder sB = new StringBuilder("FuncType[arguments=");
//        if (paramsType.size() > 0) {
//            sB.append(paramsType.get(0));
//            if (paramsType.size() > 1) {
//                paramsType.stream().skip(1).forEach(param -> sB.append(",").append(param.type));
//            }
//        }
//        sB.append("]");
//        return sB.toString();
    }

}
