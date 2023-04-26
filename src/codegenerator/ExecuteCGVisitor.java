package codegenerator;

import ast.FuncDefinition;
import ast.Program;
import ast.Statement;
import ast.VarDefinition;
import ast.statement.*;
import visitor.AbstractCGVisitor;

import java.util.List;

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
     * <enter> definitions*.stream().filter(definition => definition.offset < 0).reduce(0, (definition1, definition2) => definition1.type.numberOfBytes() + definition2.type.numberOfBytes())
     * statements*.forEach(statement => execute[[ statement ]])
     * <ret> type.numberOfBytes(), definitions*.stream().filter(definition => definition.offset < 0).reduce(0, (definition1, definition2) => definition1.type.numberOfBytes() + definition2.type.numberOfBytes()), definitions*.stream().filter(definition => definition.offset > 0).reduce(0, (definition1, definition2) => definition1.type.numberOfBytes() + definition2.type.numberOfBytes())
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        cG.write(funcDefinition.getName() + ":");

        List<VarDefinition> varDefinitions = funcDefinition.statements.stream().filter(statement -> statement instanceof VarDefinition).map(statement -> (VarDefinition) statement).toList();
        List<Statement> statements = funcDefinition.statements.stream().filter(statement -> !(statement instanceof VarDefinition)).toList();

        List<VarDefinition> paramDefinitions = varDefinitions.stream().filter(varDefinition -> varDefinition.getOffset() > 0).toList();
        List<VarDefinition> localDefinitions = varDefinitions.stream().filter(varDefinition -> varDefinition.getOffset() < 0).toList();

        cG.write("\' Parameters");
        paramDefinitions.forEach(varDefinition -> varDefinition.accept(this, param));
        cG.write("\' LocalVariables");
        localDefinitions.forEach(varDefinition -> varDefinition.accept(this, param));

        cG.enter(localDefinitions.stream().map(varDefinition -> varDefinition.type.numberOfBytes()).reduce(0, Integer::sum));

        statements.forEach(statement -> statement.accept(this, param));

        cG.ret(funcDefinition.getType().numberOfBytes(), localDefinitions.stream().map(varDefinition -> varDefinition.type.numberOfBytes()).reduce(0, Integer::sum), paramDefinitions.stream().map(varDefinition -> varDefinition.type.numberOfBytes()).reduce(0, Integer::sum));
        return null;
    }

    /**
     * execute[[ Program : program -> varDefinitions* functionDefinitions* ]] =
     * varDefinitions*.forEach(varDefinition => execute[[ varDefinition ]]) // para comentarios de variables
     * <call> main
     * <halt>
     * definitions*.forEach(functionDefinition => execute[[ functionDefinition ]]) // para etiquetas y código
     */
    @Override
    public Void visit(Program program, Void param) {
        program.definitions.stream().filter(definition -> definition instanceof VarDefinition).forEach(varDefinition -> varDefinition.accept(this, param));
        cG.call("main");
        cG.halt();
        program.definitions.stream().filter(definition -> definition instanceof FuncDefinition).forEach(funcDefinition -> funcDefinition.accept(this, param));
        return null;
    }

    /**
     * execute[[ VarDefinition : varDefinition -> ID type ]] =
     * ' type ID (offset varDefinition.offset)
     */
    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        cG.write("\' " + varDefinition.getType() + " (offset " + varDefinition.getOffset() + ")");
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
        assignment.left.accept(addressCGVisitor, param);
        assignment.right.accept(valueCGVisitor, param);
        cG.store(assignment.left.getType().suffix());
        return null;
    }

    /**
     * execute[[ FunctionInvocation functionInvocation : var expressions* ]] =
     * expressions*.forEach(expression => value[[ expression ]])
     * <call> var.definition.name
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.arguments.forEach(argument -> argument.accept(valueCGVisitor, param));
        cG.call(functionInvocation.name.name);
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

}
