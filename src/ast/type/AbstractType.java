package ast.type;

import ast.ASTNode;
import ast.AbstractNode;
import ast.Type;
import ast.errors.ErrorType;

import java.util.List;
import java.util.Optional;

public abstract class AbstractType extends AbstractNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType("It is not possible to perform an arithmetic operation between " + this + " and "
                + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType("It is not possible to perform a logical operation between " + this + " and "
                + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType("It is not possible to perform a comparison between " + this + " and " + type
                , node.getLine(), node.getColumn());
    }

    @Override
    public Type dot(String id, ASTNode node) {
        return new ErrorType("It is not possible to access the field " + id + " of " + this,
                node.getLine(), node.getColumn());
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType("The index " + this + " of an ArrayAccess can not be " + type,
                node.getLine(), node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType(this + " can not be cast to " + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type not(ASTNode node) {
        return new ErrorType(this + " can not be negated", node.getLine(), node.getColumn());
    }

    @Override
    public Type minusUnary(ASTNode node) {
        return new ErrorType(this + " can not be converted to negative", node.getLine(), node.getColumn());
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode node) {
        Optional<Type> firstError = types.stream().filter(type -> type instanceof ErrorType).findFirst();
        return firstError.orElseGet(() -> new ErrorType(this + " can not have the parameter types " +
                types.stream().collect(StringBuilder::new,
                        StringBuilder::append,
                        (sB1, sB2) -> sB1.append(",").append(sB2)),
                node.getLine(), node.getColumn()));
    }

    @Override
    public Type mustBeEquals(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }
        return new ErrorType(this + " must be equal to " + type, node.getLine(), node.getColumn());
    }

    @Override
    public Type asBuiltInType(ASTNode node) {
        return new ErrorType(this + " is not a BuiltInType", node.getLine(), node.getColumn());
    }

    @Override
    public Type asLogical(ASTNode node) {
        return new ErrorType(this + " is not a Logical expression", node.getLine(), node.getColumn());
    }

}