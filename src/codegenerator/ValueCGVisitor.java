package codegenerator;

import ast.expression.*;
import visitor.AbstractCGVisitor;

// SOLO EXPRESIONES
public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    protected AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

    /**
     * value[[ Arithmetic : exp1 -> exp2 exp3 ]] =
     * value[[ exp2 ]]
     * value[[ exp3 ]]
     * <add> | <mul> | ...
     */
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        return null;
    }

    /**
     * value[[ ArrayAccess : exp1 -> exp2 exp3 ]] =
     * address[[ exp1 ]]
     * <load>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        return null;
    }

    /**
     * value[[ Cast : exp1 -> type exp2 ]] =
     * value[[ exp2 ]]
     * <x2y>
     */
    @Override
    public Void visit(Cast cast, Void param) {
        return null;
    }

    /**
     * value[[ Comparison : exp1 -> exp2 exp3 ]] =
     * value[[ exp2 ]]
     * value[[ exp3 ]]
     * <gt> | <lt> | ...
     */
    @Override
    public Void visit(Comparison comparison, Void param) {
        return null;
    }

    /**
     * value[[ LitChar : exp -> CHAR_CONSTANT ]] =
     * <pushb> CHAR_CONSTANT
     */
    @Override
    public Void visit(LitChar litChar, Void param) {
        return null;
    }

    /**
     * value[[ LitDouble : exp -> REAL_CONSTANT ]] =
     * <pushf> REAL_CONSTANT
     */
    @Override
    public Void visit(LitDouble litDouble, Void param) {
        return null;
    }

    /**
     * value[[ LitDouble : exp -> INT_CONSTANT ]] =
     * <pushi> INT_CONSTANT
     */
    @Override
    public Void visit(LitInt litInt, Void param) {
        return null;
    }

    /**
     * value[[ Logical : exp1 -> exp2 exp3 ]] =
     * value[[ exp2 ]]
     * value[[ exp3 ]]
     * <not> | <or> | ...
     */
    @Override
    public Void visit(Logical logical, Void param) {
        return null;
    }

    /**
     * value[[ MinusUnary exp1 -> exp2 ]] =
     * value[[ exp2 ]]
     * <loadi> -1
     * <mul>
     */
    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        return null;
    }

    /**
     * value[[ Not exp1 -> exp2 ]] =
     * value[[ exp1 ]]
     * <not>
     */
    @Override
    public Void visit(Not not, Void param) {
        return null;
    }

    /**
     * value[[ StructAccess : exp1 -> exp2 ID ]] =
     * address[[ exp2 ]]
     * <load>
     */
    @Override
    public Void visit(StructAccess structAccess, Void param) {
        return null;
    }

    /**
     * value[[ Var : exp -> ID ]] =
     * address[[ exp ]]()
     * <load>
     */
    @Override
    public Void visit(Var var, Void param) {
        return null;
    }

}
