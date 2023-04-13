package ast;

public interface Expression extends ASTNode {

    boolean getLValue();

    void setLValue(boolean lValue);

    Type getType();

    void setType(Type type);

}
