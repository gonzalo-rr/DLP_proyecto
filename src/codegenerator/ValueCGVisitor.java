package codegenerator;

import visitor.AbstractCGVisitor;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    protected AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

}
