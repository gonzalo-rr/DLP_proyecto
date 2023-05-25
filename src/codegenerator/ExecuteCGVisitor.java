package codegenerator;

import ast.*;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;
import visitor.AbstractCGVisitor;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

    private final CodeGenerator cG;
    private final AddressCGVisitor addressCGVisitor;
    private final ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cG) {
        this.cG = cG;
        addressCGVisitor = new AddressCGVisitor(cG);
        valueCGVisitor = new ValueCGVisitor(cG);

        addressCGVisitor.valueCGVisitor = valueCGVisitor;
        valueCGVisitor.addressCGVisitor = addressCGVisitor;
    }

    /**
     * execute[[ FuncDefinition : funcDefinition -> ID type statement* ]]( returnBytes, localBytes, paramBytes ) =
     * ID <:>
     * <' Parameters>
     * funcDefinition.getType().params.forEach(param -> execute[[ param ]])
     * <' Local Variables>
     * statement*.filter(statement -> statement instanceof VarDefinition).map(statement -> (VarDefinition) statement).forEach(localVariable -> execute[[ localVariable ]])
     * <enter> funcDefinition.localBytesSum
     * int returnBytes = type.returnType.numberOfBytes()
     * statement*.filter(statement -> !(statement instanceof VarDefinition)).forEach(statement => execute[[ statement ]]( returnBytes, localBytes, paramBytes ))
     * if (returnBytes == 0) // Type Void
     *  <ret> 0, funcDefinition.localBytesSum, funcDefinition.paramBytes
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, FuncDefinition param) {
        cG.line(funcDefinition.getLine());
        cG.write(funcDefinition.getName() + ":");

        List<VarDefinition> paramDefinitions = ((FunctionType) funcDefinition.getType()).params;
        List<VarDefinition> localDefinitions = funcDefinition.statements.stream().filter(statement -> statement instanceof VarDefinition).map(statement -> (VarDefinition) statement).toList();
        List<Statement> statements = funcDefinition.statements.stream().filter(statement -> !(statement instanceof VarDefinition)).toList();

        cG.write("' Parameters");
        paramDefinitions.forEach(varDefinition -> varDefinition.accept(this, param));
        cG.write("' LocalVariables");
        localDefinitions.forEach(varDefinition -> varDefinition.accept(this, param));

        cG.enter(funcDefinition.localBytes);
        cG.write("");

        statements.forEach(statement -> {
            cG.line(statement.getLine());
            statement.accept(this, param);
        });

        if (((FunctionType) funcDefinition.getType()).returnType instanceof VoidType) {
            cG.ret(0, funcDefinition.localBytes, funcDefinition.paramBytes);
        }
        return null;
    }

    /**
     * execute[[ Program : program -> definition* ]]( returnBytes, localBytes, paramBytes ) =
     * definition*.stream().filter(definition => definition instanceof VarDefinition).forEach(varDefinition => execute[[ varDefinition ]]) // para comentarios de variables
     * <call> main
     * <halt>
     * definition*.stream().filter(definition => definition instanceof FuncDefinition).forEach(functionDefinition => execute[[ functionDefinition ]]) // para etiquetas y código
     */
    @Override
    public Void visit(Program program, FuncDefinition param) {
        program.definitions.stream().filter(definition -> definition instanceof VarDefinition).forEach(varDefinition -> varDefinition.accept(this, param));
        cG.callMain();
        program.definitions.stream().filter(definition -> definition instanceof FuncDefinition).forEach(funcDefinition -> funcDefinition.accept(this, (FuncDefinition) funcDefinition));
        return null;
    }

    /**
     * execute[[ VarDefinition : varDefinition -> ID type ]]( returnBytes, localBytes, paramBytes ) =
     * <'> type ID <(offset> varDefinition.offset<)>
     */
    @Override
    public Void visit(VarDefinition varDefinition, FuncDefinition param) {
        cG.write("' " + varDefinition.getType() + " " + varDefinition.name + " (offset " + varDefinition.getOffset() + ")");
        return null;
    }

    /**
     * execute[[ Assignment : statement -> exp1 exp2 ]]( returnBytes, localBytes, paramBytes ) =
     * address[[ exp1 ]]
     * value[[ exp2 ]]
     * cG.store(exp1.getType().suffix())
     */
    @Override
    public Void visit(Assignment assignment, FuncDefinition param) {
        cG.write("' Assignment");
        assignment.left.accept(addressCGVisitor, null);
        assignment.right.accept(valueCGVisitor, null);
        cG.store(assignment.left.getType().suffix());
        return null;
    }

    /**
     * execute[[ FunctionInvocation : statement -> exp1 exp2* ]]( returnBytes, localBytes, paramBytes ) =
     * value[[ (Expression) statement ]]
     * if (!statement.returnType instanceof VoidType))
     *  <pop> statement.returnType.suffix()
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, FuncDefinition param) {
        cG.write("' Function Invocation");
        functionInvocation.accept(valueCGVisitor, null);

        if (!(functionInvocation.returnType instanceof VoidType)) {
            cG.pop(functionInvocation.returnType.suffix());
        }

        return null;
    }

    /**
     * execute[[ IfElse : statement1 -> exp statement2* statement3* ]]( returnBytes, localBytes, paramBytes ) =
     * String fail = cG.getLabel()
     * String end = cG.getLabel()
     * value[[ exp ]]
     * <jz> fail
     * statement2*.forEach(statement => execute[[ statement ]])
     * <jmp> end
     * <label> fail <:>
     * statement3*.forEach(statement => execute[[ statement ]])
     * <label> end <:>
     */
    @Override
    public Void visit(IfElse ifElse, FuncDefinition param) {
        cG.write("' If");
        String fail = cG.getLabel();
        String end = cG.getLabel();
        ifElse.condition.accept(valueCGVisitor, null);
        cG.jz(fail);
        ifElse.ifBody.forEach(statement -> statement.accept(this, param));
        cG.jmp(end);
        cG.addLabel(fail);
        if (!ifElse.elseBody.isEmpty()) {
            ifElse.elseBody.forEach(statement -> statement.accept(this, param));
        }
        cG.addLabel(end);
        return null;
    }

    /**
     * execute[[ Input input -> exp ]]( returnBytes, localBytes, paramBytes ) =
     * address[[ exp ]]
     * cG.in(exp.getType().suffix())
     * store(exp.getType().suffix())
     */
    @Override
    public Void visit(Input input, FuncDefinition param) {
        cG.write("' Read");
        input.expression.accept(addressCGVisitor, null);
        cG.in(input.expression.getType().suffix());
        cG.store(input.expression.getType().suffix());
        return null;
    }

    /**
     * execute[[ Print print -> exp ]]( returnBytes, localBytes, paramBytes ) =
     * value[[ exp ]]
     * cG.out(exp.getType().suffix())
     */
    @Override
    public Void visit(Print print, FuncDefinition param) {
        cG.write("' Write");
        print.expression.accept(valueCGVisitor, null);
        cG.out(print.expression.getType().suffix());
        return null;
    }

    /**
     * execute[[ Return : statement -> exp ]]( returnBytes, localBytes, paramBytes ) =
     * value[[ exp ]]
     * <ret> returnBytes, localBytes, paramBytes
     */
    @Override
    public Void visit(Return return_statement, FuncDefinition funcDefinition) {
        return_statement.expression.accept(valueCGVisitor, null);
        cG.ret(((FunctionType) funcDefinition.getType()).returnType.numberOfBytes(), funcDefinition.localBytes, funcDefinition.paramBytes);
        return null;
    }

    /**
     * execute[[ While : statement -> expression statement* ]]( returnBytes, localBytes, paramBytes ) =
     * String condition = cG.getLabel()
     * String end = cG.getLabel()
     * <label> condition <:>
     * value[[ expression ]]
     * <jz> end
     * statement*.forEach(statement => execute[[ statement ]]
     * <jmp> condition
     * <label> end <:>
     */
    @Override
    public Void visit(While while_statement, FuncDefinition param) {
        cG.write("' While");
        String condition = cG.getLabel();
        String end = cG.getLabel();
        cG.addLabel(condition + "");
        while_statement.condition.accept(valueCGVisitor, null);
        cG.jz(end);
        while_statement.body.forEach(statement -> statement.accept(this, param));
        cG.jmp(condition);
        cG.addLabel(end + "");
        return null;
    }

    /**
     * execute[[ For : statement1 -> statement2 expression statement3 statement* statement* ]]( returnBytes, localBytes, paramBytes ) =
     * String condition = cG.getLabel()
     * String end = cG.getLabel()
     * execute[[ statement2 ]]
     * <label> condition <:>
     * value[[ expression ]]
     * <jz> end
     * statement*.forEach(statement => execute[[ statement ]]
     * execute[[ statement3 ]]
     * <jmp> condition
     * <label> end <:>
     */
    @Override
    public Void visit(For for_statement, FuncDefinition param) {
        cG.write("' For");
        String condition = cG.getLabel();
        String end = cG.getLabel();
        for_statement.definition.accept(this, param);
        for_statement.initialization.accept(this, param);
        cG.addLabel(condition + "");
        for_statement.condition.accept(valueCGVisitor, null);
        cG.jz(end);
        for_statement.body.forEach(statement -> statement.accept(this, param));
        for_statement.increment.accept(this, param);
        cG.jmp(condition);
        cG.addLabel(end + "");
        return null;
    }

    /**
     * execute[[ PlusEquals : statement -> exp1 exp2 ]]( returnBytes, localBytes, paramBytes ) =
     * address[[ exp1 ]]
     * value[[ exp1 ]]
     * value[[ exp2 ]]
     * <add> exp1.getType().suffix()
     * cG.store(exp1.getType().suffix())
     */
    @Override
    public Void visit(PlusEquals plusEquals, FuncDefinition param) {
        plusEquals.left.accept(addressCGVisitor, null);
        plusEquals.left.accept(valueCGVisitor, null);
        plusEquals.right.accept(valueCGVisitor, null);
        cG.add(plusEquals.left.getType().suffix());
        cG.store(plusEquals.left.getType().suffix());
        return null;
    }

}
