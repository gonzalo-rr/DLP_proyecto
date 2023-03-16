import ast.language.ASTNode;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import org.antlr.v4.runtime.*;
import parser.PmmLexer;
import parser.PmmParser;

import java.util.List;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		ASTNode ast = parser.program().ast; // Cambiar por el no terminal que se quiera
		
		// * The AST is shown
		IntrospectorModel model=new IntrospectorModel("Program", ast);
		new IntrospectorView("Introspector", model);
	}
}
