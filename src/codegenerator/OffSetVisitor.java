package codegenerator;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.Visitor;

import java.util.List;

public class OffSetVisitor implements Visitor<Void, Void> {

    private int globalBytesSum = 0;
    private int localBytesSum;

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        localBytesSum = 0;
        funcDefinition.statements.forEach(statement -> statement.accept(this, param));

        int paramBytesSum = 0;

        List<VarDefinition> params = ((FunctionType) funcDefinition.getType()).params;

        for (int i = params.size() - 1; i >= 0; i--) {
            VarDefinition varDefinition = params.get(i);
            varDefinition.setOffset(4 + paramBytesSum);
            paramBytesSum += varDefinition.type.numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(Program program, Void param) {
        program.definitions.forEach(definition -> definition.accept(this, param));
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
    public Void visit(Arithmetic arithmetic, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        return null;
    }

    @Override
    public Void visit(LitChar litChar, Void param) {
        return null;
    }

    @Override
    public Void visit(LitDouble litDouble, Void param) {
        return null;
    }

    @Override
    public Void visit(LitInt litInt, Void param) {
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        return null;
    }

    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        return null;
    }

    @Override
    public Void visit(Not not, Void param) {
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess, Void param) {
        return null;
    }

    @Override
    public Void visit(Var var, Void param) {
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        return null;
    }

    @Override
    public Void visit(Print print, Void param) {
        return null;
    }

    @Override
    public Void visit(Return return_statement, Void param) {
        return null;
    }

    @Override
    public Void visit(While while_statement, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        return null;
    }

    @Override
    public Void visit(IntType intType, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
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

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        return null;
    }

}
