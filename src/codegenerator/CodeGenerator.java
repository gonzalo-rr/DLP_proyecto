package codegenerator;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private int labels = 0;
    private PrintWriter out;

    public CodeGenerator(String outputFilename, String sourceFilename) {
        try {
            this.out = new PrintWriter(outputFilename);
        } catch (IOException e) {
            System.err.println("Error opening the file " + outputFilename + ".");
            System.exit(-1);
        }
        //this.source(sourceFilename);
    }

}
