package semantic;

import ast.FuncDefinition;
import ast.Program;
import ast.VarDefinition;
import ast.errors.ErrorType;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> implements Visitor<Void, Void> {

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        if (!symbolTable.insert(funcDefinition)) {
            new ErrorType(
                    "The Function Definition " + funcDefinition.getName() + " is already defined in this scope",
                    funcDefinition.getLine(), funcDefinition.getColumn());
        } // Si no se puede insertar la definición se lanza un error

        symbolTable.set(); // Nuevo ámbito

        funcDefinition.getType().accept(this, param);
        funcDefinition.statements.stream().forEach(statement -> statement.accept(this, param));

        symbolTable.reset(); // Se elimina el ámbito
        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        varDefinition.type.accept(this, param);

        if (!symbolTable.insert(varDefinition)) {
            new ErrorType(
                    "The Variable Definition " + varDefinition.getName() + " is already defined in this scope",
                    varDefinition.getLine(), varDefinition.getColumn());
        } // Si no se puede insertar la definición se lanza un error
        return null;
    }

    @Override
    public Void visit(Var var, Void param) {
        if (symbolTable.find(var.name) == null) {
            var.definition = new VarDefinition(var.name, new ErrorType(
                    "The Variable " + var.name + " is not defined in this scope",
                    var.getLine(), var.getColumn()), var.getLine(), var.getColumn());
        } // Se asocia a una definición de tipo error
        return null;
    }

}
