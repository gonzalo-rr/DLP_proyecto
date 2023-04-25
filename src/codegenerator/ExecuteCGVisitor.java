package codegenerator;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractCGVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cG) {
        this.cG = cG;
        addressCGVisitor = new AddressCGVisitor(cG);
        valueCGVisitor = new ValueCGVisitor(cG);

        addressCGVisitor.valueCGVisitor = valueCGVisitor;
        valueCGVisitor.addressCGVisitor = addressCGVisitor;
    }

    /**
     * execute[[ FuncDefinition : funcDefinition -> ID type definitions* statements* ]] =
     * ID:
     * definitions*.forEach(definition => execute[[ definition ]])
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        return null;
    }

    /**
     * execute[[ Program : program -> definitions* ]] =
     * definitions*.forEach(definition => execute[[ definition ]]) // para comentarios y etiquetas
     * <call> main
     * <halt>
     */
    @Override
    public Void visit(Program program, Void param) {
        return null;
    }

    /**
     * execute[[ VarDefinition : varDefinition -> ID type ]] =
     * ' type ID (offset varDefinition.offset)
     */
    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        return null;
    }

    /**
     * execute[[ Assignment : statement -> exp1 exp2 ]] =
     * address[[ exp1 ]]
     * value[[ exp2 ]]
     * <store>
     */
    @Override
    public Void visit(Assignment assignment, Void param) {
        return null;
    }

    /**
     * execute[[ FunctionInvocation functionInvocation : var expressions* ]] =
     * expressions*.forEach()
     */
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
