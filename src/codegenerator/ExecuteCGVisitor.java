package codegenerator;

import visitor.AbstractCGVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cG;
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cG) {
        this.cG = cG;
        addressCGVisitor = new AddressCGVisitor(cG);
        valueCGVisitor = new ValueCGVisitor(cG);

        addressCGVisitor.valueCGVisitor = valueCGVisitor;
        valueCGVisitor.addressCGVisitor = addressCGVisitor;
    }
}
