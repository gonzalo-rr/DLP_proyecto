package ast;

import java.util.List;

public interface Expression extends ASTNode {

    boolean getLValue();

    void setLValue(boolean lValue);

    Type getType();

    void setType(Type type);

    Type arithmetic(Type type, ASTNode node);

    Type logical(Type type, ASTNode node);

    Type comparison(Type type, ASTNode node);

    Type dot(String id, ASTNode node);

    Type squareBrackets(Type type, ASTNode node);

    Type canBeCastTo(Type type, ASTNode node);

    Type not(ASTNode node);

    Type minusUnary(ASTNode node);

    Type parenthesis(List<Type> types, ASTNode node);

    Type mustBeEquals(Type type, ASTNode node);

    Type asBuiltInType(ASTNode node);

    Type asBoolean(ASTNode node);

}
