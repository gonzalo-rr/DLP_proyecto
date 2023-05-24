package codegenerator;

import ast.expression.*;
import ast.statement.FunctionInvocation;
import ast.type.IntType;
import ast.type.StructType;
import visitor.AbstractCGVisitor;

// SOLO EXPRESIONES
public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private final CodeGenerator cG;
    protected AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

    /**
     * value[[ Arithmetic : exp1 -> exp2 OP exp3 ]] =
     * value[[ exp2 ]]
     * cG.convert(exp2.getType(), exp1.getType())
     * value[[ exp3 ]]
     * cG.convert(exp3.getType(), exp1.getType())
     * cG.arithmetic(OP, exp1.getType())
     */
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.left.accept(this, param);
        cG.convert(arithmetic.left.getType(), arithmetic.getType());
        arithmetic.right.accept(this, param);
        cG.convert(arithmetic.right.getType(), arithmetic.getType());
        cG.arithmetic(arithmetic.operation, arithmetic.getType());
        return null;
    }

    /**
     * value[[ ArrayAccess : exp1 -> exp2 exp3 ]] =
     * address[[ exp1 ]]
     * cG.load(exp1.getType().suffix())
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.accept(addressCGVisitor, param);
        cG.load(arrayAccess.getType().suffix());
        return null;
    }

    /**
     * value[[ Cast : exp1 -> type exp2 ]] =
     * value[[ exp2 ]]
     * cG.convert(exp2.getType(), exp1.getType())
     */
    @Override
    public Void visit(Cast cast, Void param) {
        cast.expression.accept(this, param);
        cG.convert(cast.expression.getType(), cast.type);
        return null;
    }

    /**
     * value[[ Comparison : exp1 -> exp2 OP exp3 ]] =
     * value[[ exp2 ]]
     * value[[ exp3 ]]
     * cG.compare(OP, exp2.getType())
     */
    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.left.accept(this, param);
        comparison.right.accept(this, param);
        cG.compare(comparison.operation, comparison.left.getType());
        return null;
    }

    /**
     * value[[ LitChar : exp -> CHAR_CONSTANT ]] =
     * <pushb> CHAR_CONSTANT
     */
    @Override
    public Void visit(LitChar litChar, Void param) {
        cG.pushb(litChar.val);
        return null;
    }

    /**
     * value[[ LitDouble : exp -> REAL_CONSTANT ]] =
     * <pushf> REAL_CONSTANT
     */
    @Override
    public Void visit(LitDouble litDouble, Void param) {
        cG.pushf(litDouble.val);
        return null;
    }

    /**
     * value[[ LitInt : exp -> INT_CONSTANT ]] =
     * <pushi> INT_CONSTANT
     */
    @Override
    public Void visit(LitInt litInt, Void param) {
        cG.pushi(litInt.val);
        return null;
    }

    /**
     * value[[ LitBool : exp -> BOOL_CONSTANT ]] =
     * if (BOOL_CONSTANT)
     *  <pushi 1>
     * else
     *  <pushi 0>
     */
    @Override
    public Void visit(LitBool litBool, Void param) {
        if (litBool.val) {
            cG.pushi(1);
        } else {
            cG.pushi(0);
        }
        return null;
    }

    /**
     * value[[ Logical : exp1 -> exp2 OP exp3 ]] =
     * value[[ exp2 ]]
     * value[[ exp3 ]]
     * cG.logical(OP);
     */
    @Override
    public Void visit(Logical logical, Void param) {
        logical.left.accept(this, param);
        logical.right.accept(this, param);
        cG.logical(logical.operation);
        return null;
    }

    /**
     * value[[ MinusUnary exp1 -> exp2 ]] =
     * value[[ exp2 ]]
     * <pushi> -1
     * cG.convert(IntType.getInstance(), exp1.getType())
     * cG.mul(exp1.getType())
     */
    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        minusUnary.expression.accept(this, param);
        cG.pushi(-1);
        cG.convert(IntType.getInstance(), minusUnary.getType());
        cG.mul(minusUnary.getType().suffix());
        return null;
    }

    /**
     * value[[ Not exp1 -> exp2 ]] =
     * value[[ exp1 ]]
     * <not>
     */
    @Override
    public Void visit(Not not, Void param) {
        not.expression.accept(this, param);
        cG.not();
        return null;
    }

    /**
     * value[[ StructAccess : exp1 -> exp2 ID ]] =
     * address[[ exp1 ]]
     * cG.load(exp2.getType().recordField*.get(ID).type.suffix())
     */
    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.accept(addressCGVisitor, param); // OJO: structAccess.struct.accept(addressCGVisitor, param); [MAL]
        cG.load(((StructType) structAccess.struct.getType()).recordFieldList.stream().filter(recordField -> recordField.name.equals(structAccess.id)).findFirst().get().type.suffix());
        return null;
    }

    /**
     * value[[ Var : exp -> ID ]] =
     * address[[ exp ]]
     * cG.load(exp.getType().suffix());
     */
    @Override
    public Void visit(Var var, Void param) {
        var.accept(addressCGVisitor, param);
        cG.load(var.getType().suffix());
        return null;
    }

    /**
     * value[[ FunctionInvocation : exp1 -> exp2 exp3* ]] =
     * exp3*.forEach(arg => value[[ arg ]])
     * <call> exp2.name
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.arguments.forEach(arg -> arg.accept(this, param));
        cG.call(functionInvocation.name.name);
        return null;
    }

}
