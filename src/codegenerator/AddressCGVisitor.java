package codegenerator;

import ast.expression.*;
import visitor.AbstractCGVisitor;

// SOLO L-VALUES (Var, ArrayAccess, StructAccess)
public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    protected ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

    // TODO
    /**
     * address[[ ArrayAccess : exp1 -> exp2 exp3 ]] =
     * if (exp2.type == ArrayAccess)
     *  address[[ exp2 ]]
     * else
     *  address[[ exp2 ]]
     *  value[[ exp3 ]]
     *  exp2.definition.type.numberOfBytes()
     *  <muli>
     *  <addi>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        return null;
    }

    /**
     * address[[ StructAccess : exp1 -> exp2 ID ]] =
     * address[[ exp2 ]]
     * <pushi> exp2.definition.type.recordField*.get(ID).offset
     * <addi>
     */
    @Override
    public Void visit(StructAccess structAccess, Void param) {
        return null;
    }

    /**
     * address[[ Var : exp -> ID ]] =
     * if (exp.definition.scope == 0)
     *  <pusha> exp.definition.offset
     * else
     *  <push> bp
     *  <pushi> exp.definition.offset
     *  <addi>
     */
    @Override
    public Void visit(Var var, Void param) {
        return null;
    }

}
