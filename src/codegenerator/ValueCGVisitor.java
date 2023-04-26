package codegenerator;

import ast.expression.*;
import ast.type.CharType;
import ast.type.IntType;
import com.sun.jdi.FloatType;
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
        arithmetic.left.accept(this, param);
        arithmetic.right.accept(this, param);
        switch (arithmetic.operation) {
            case "+": {
                cG.add(arithmetic.type.suffix());
                break;
            }
            case "-": {
                cG.sub(arithmetic.type.suffix());
                break;
            }
            case "*": {
                cG.mul(arithmetic.type.suffix());
                break;
            }
            case "/": {
                cG.div(arithmetic.type.suffix());
                break;
            }
            case "%": {
                cG.mod(arithmetic.type.suffix());
                break;
            }
        }
        return null;
    }

    /**
     * value[[ ArrayAccess : exp1 -> exp2 exp3 ]] =
     * address[[ exp1 ]]
     * <load>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.accept(addressCGVisitor, param);
        cG.load(arrayAccess.type.suffix());
        return null;
    }

    /**
     * value[[ Cast : exp1 -> type exp2 ]] =
     * value[[ exp2 ]]
     * <x2y>
     */
    @Override
    public Void visit(Cast cast, Void param) {
        cast.expression.accept(this, param);
        if (cast.expression.getType() instanceof CharType && cast.type instanceof IntType) {
            cG.b2i();
        } else if (cast.expression.getType() instanceof IntType && cast.type instanceof FloatType) {
            cG.i2f();
        } else if (cast.expression.getType() instanceof FloatType && cast.type instanceof IntType) {
            cG.f2i();
        } else if (cast.expression.getType() instanceof IntType && cast.type instanceof CharType) {
            cG.i2b();
        }
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
        comparison.left.accept(this, param);
        comparison.right.accept(this, param);
        switch (comparison.operation) {
            case ">": {
                cG.gt(comparison.type.suffix());
                break;
            }
            case "<": {
                cG.lt(comparison.type.suffix());
                break;
            }
            case ">=": {
                cG.ge(comparison.type.suffix());
                break;
            }
            case "<=": {
                cG.le(comparison.type.suffix());
                break;
            }
            case "==": {
                cG.eq(comparison.type.suffix());
                break;
            }
            case "!=": {
                cG.ne(comparison.type.suffix());
                break;
            }
        }
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
     * value[[ LitDouble : exp -> INT_CONSTANT ]] =
     * <pushi> INT_CONSTANT
     */
    @Override
    public Void visit(LitInt litInt, Void param) {
        cG.pushi(litInt.val);
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
        logical.left.accept(this, param);
        logical.right.accept(this, param);
        switch (logical.operation) {
            case "&&": {
                cG.and();
                break;
            }
            case "||": {
                cG.or();
                break;
            }
        }
        return null;
    }

    /**
     * value[[ MinusUnary exp1 -> exp2 ]] =
     * value[[ exp2 ]]
     * <pushi> -1
     * <x2y>
     * <mul>
     */
    @Override
    public Void visit(MinusUnary minusUnary, Void param) {
        minusUnary.expression.accept(this, param);
        cG.pushi(-1);
        boolean needsCast = false;
        if (minusUnary.expression instanceof FloatType) {
            needsCast = true;
            cG.i2f();
        }
        cG.mul(needsCast ? 'f' : 'i');
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
     * address[[ exp2 ]]
     * <load>
     */
    @Override
    public Void visit(StructAccess structAccess, Void param) {
        structAccess.struct.accept(addressCGVisitor, param);
        cG.load(structAccess.struct.getType().suffix());
        return null;
    }

    /**
     * value[[ Var : exp -> ID ]] =
     * address[[ exp ]]
     * <load>
     */
    @Override
    public Void visit(Var var, Void param) {
        var.accept(addressCGVisitor, param);
        cG.load(var.getType().suffix());
        return null;
    }

}
