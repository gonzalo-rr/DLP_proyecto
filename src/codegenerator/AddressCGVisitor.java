package codegenerator;

import visitor.AbstractCGVisitor;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    protected ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

}
