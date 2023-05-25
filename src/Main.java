import codegenerator.CodeGenerator;
import codegenerator.ExecuteCGVisitor;
import codegenerator.OffSetVisitor;
import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;

import ast.ASTNode;
import errorhandler.ErrorHandler;
import introspector.view.IntrospectorView;
import parser.*;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

public class Main {

	private static boolean xor(boolean a, boolean b) {
		return nand(nand(a, nand(a, b)), nand(b, nand(a, b)));
	}

	private static boolean nand(boolean a, boolean b) {
		return !(a && b);
	}

	public static void main(String... args) throws Exception {
		System.out.println(xor(false, false));
		System.out.println(xor(false, true));
		System.out.println(xor(true, false));
		System.out.println(xor(true, true));


		//		if (args.length<2) {
//			System.err.println("Please, pass me the input and output files.");
//			return;
//		}
//
//		// create a lexer that feeds off of input CharStream
//		CharStream input = CharStreams.fromFileName(args[0]);
//		PmmLexer lexer = new PmmLexer(input);
//
//		// create a parser that feeds off the tokens buffer
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		PmmParser parser = new PmmParser(tokens);
//		ASTNode ast = parser.program().ast;
//
//		ast.accept(new IdentificationVisitor(), null);
//		ast.accept(new TypeCheckingVisitor(),null);
//
//		// * Check errors
//		if(ErrorHandler.getInstance().anyError()){
//			// * Show errors
//			ErrorHandler.getInstance().showErrors(System.err);
//		}
//		else{
//			// * The AST is shown
//			ast.accept(new OffSetVisitor(),null);
//			ast.accept(new ExecuteCGVisitor(new CodeGenerator(args[1], args[0])), null);
//			IntrospectorModel model=new IntrospectorModel("Program", ast);
//			new IntrospectorView("Introspector", model);
//		}
	}
}
