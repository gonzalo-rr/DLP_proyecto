package codegenerator;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

import java.util.List;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int globalBytesSum = 0;
    private int localBytesSum;

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        localBytesSum = 0;
        funcDefinition.statements.forEach(statement -> statement.accept(this, param));

        funcDefinition.localBytes = localBytesSum;

        int paramBytesSum = 4;

        List<VarDefinition> params = ((FunctionType) funcDefinition.getType()).params;

        for (int i = params.size() - 1; i >= 0; i--) {
            VarDefinition varDefinition = params.get(i);
            varDefinition.setOffset(paramBytesSum);
            paramBytesSum += varDefinition.type.numberOfBytes();
        }

//        if (paramBytesSum == 4) {
//            paramBytesSum = 0;
//        }

        funcDefinition.paramBytes = paramBytesSum - 4;

        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        varDefinition.type.accept(this, param);

        if (varDefinition.getScope() == 0) {
            varDefinition.setOffset(globalBytesSum);
            globalBytesSum += varDefinition.getType().numberOfBytes();
        } else {
            localBytesSum += varDefinition.getType().numberOfBytes();
            varDefinition.setOffset(-localBytesSum);
        }
        return null;
    }

    @Override
    public Void visit(StructType structType, Void param) {
        int fieldBytesSum = 0;
        for (RecordField field : structType.recordFieldList) {
            field.setOffset(fieldBytesSum);
            fieldBytesSum += field.type.numberOfBytes();
        }
        return null;
    }

}
