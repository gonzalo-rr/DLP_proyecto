package ast;

public interface Statement extends ASTNode {

    Type getReturnType();

    void setReturnType(Type type);

}
