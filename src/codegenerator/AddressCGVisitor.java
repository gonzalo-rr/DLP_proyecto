package codegenerator;

import ast.VarDefinition;
import ast.expression.*;
import ast.type.RecordField;
import ast.type.StructType;
import visitor.AbstractCGVisitor;

// SOLO L-VALUES (Var, ArrayAccess, StructAccess)
public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    protected ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

    /**
     * address[[ ArrayAccess : exp1 -> exp2 exp3 ]] =
     * address[[ exp2 ]]
     * value[[ exp3 ]]
     * <pushi> exp1.getType().numberOfBytes()
     * <muli>
     * <addi>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.array.accept(this, param);
        arrayAccess.index.accept(valueCGVisitor, param);
        cG.pushi(arrayAccess.getType().numberOfBytes());
        cG.mul('i');
        cG.add('i');
        return null;
    }

    /**
     * address[[ StructAccess : exp1 -> exp2 ID ]] =
     * address[[ exp2 ]]
     * <pushi> exp2.definition.getType().recordField*.get(ID).offset
     * <addi>
     */
    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.struct.accept(this, param);
        RecordField recordField = ((StructType) structAccess.struct.getType()).recordFieldList.stream()
                .filter(rF -> rF.name == structAccess.id).findFirst().get();
        cG.pushi(recordField.getOffset());
        cG.add('i');
        return null;
    }

    /**
     * address[[ Var : exp -> ID ]] =
     * if (exp.definition.scope == 0)
     *  <pusha> exp.definition.offset
     * else
     *  <pusha bp>
     *  <pushi> exp.definition.offset
     *  <addi>
     */
    @Override
    public Void visit(Var var, Void param) {
        if (var.definition.getScope() == 0) {
            cG.pusha(((VarDefinition) var.definition).getOffset());
        } else {
            cG.pushaBp();
            cG.pushi(((VarDefinition) var.definition).getOffset());
        }
        return null;
    }

}
