package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;
import visitor.Visitor;

import java.util.Objects;

public class ArrayType extends AbstractNode implements Type {

    public int size;
    public Type type;

    public ArrayType(int size, Type type, int line, int column) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if ((type instanceof IntType)) {
            return type;
        }
        return new ErrorType("The index " + node + " of the ArrayAccess must be of IntType", node.getLine(), node.getColumn());
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof ArrayType arrayType) {
            if (arrayType.size == this.size) {
                Type resultType = arrayType.type.mustBeEquals(this.type, node);
                if (!(resultType instanceof ErrorType)) {
                    return this;
                }
            }
        }
        return new ErrorType(type + " is not " + this, node.getLine(), node.getColumn());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayType[size=" + size + ",type=" + type + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayType arrayType = (ArrayType) o;
        return size == arrayType.size && type.equals(arrayType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type);
    }
}
