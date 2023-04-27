package codegenerator;

import ast.Type;
import ast.type.CharType;
import ast.type.IntType;
import com.sun.jdi.FloatType;

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
        this.source(sourceFilename);
    }

    public void write(String string) {
        out.println(string);
        out.flush();
    }

    // Debugging

    public void source(String sourceFilename) {
        out.println("#source \"" + sourceFilename + "\"");
        out.flush();
    }

    public void line(int line) {
        out.println("#line " + line);
        out.flush();
    }

    // Push

    public void pushb(char character) {
        out.println("pushb " + character);
        out.flush();
    }

    public void pushi(int integer) {
        out.println("pushi " + integer);
        out.flush();
    }

    public void pushf(double real) {
        out.println("pushf " + real);
        out.flush();
    }

    public void pusha(int address) {
        out.println("pusha " + address);
        out.flush();
    }

    public void pushaBp() {
        out.println("pusha bp");
        out.flush();
    }

    // Load (b, i, f)

    public void load(char suffix) {
        out.println("load" + suffix);
        out.flush();
    }

    // Store (b, i, f)

    public void store(char suffix) {
        out.println("store" + suffix);
        out.flush();
    }

    // Pop (b, i, f)

    public void pop(char suffix) {
        out.println("popb" + suffix);
        out.flush();
    }

    // Dup (b, i, f)

    public void dup(char suffix) {
        out.println("dup" + suffix);
        out.flush();
    }

    // Arithmetic (i, f)

    public void add(char suffix) {
        out.println("add" + suffix);
        out.flush();
    }

    public void sub(char suffix) {
        out.println("sub" + suffix);
        out.flush();
    }

    public void mul(char suffix) {
        out.println("mul" + suffix);
        out.flush();
    }

    public void div(char suffix) {
        out.println("div" + suffix);
        out.flush();
    }

    public void mod(char suffix) {
        out.println("mod" + suffix);
        out.flush();
    }

    // Comparison

    public void gt(char suffix) {
        out.println("gt" + suffix);
        out.flush();
    }

    public void lt(char suffix) {
        out.println("lt" + suffix);
        out.flush();
    }

    public void ge(char suffix) {
        out.println("ge" + suffix);
        out.flush();
    }

    public void le(char suffix) {
        out.println("le" + suffix);
        out.flush();
    }

    public void eq(char suffix) {
        out.println("eq" + suffix);
        out.flush();
    }

    public void ne(char suffix) {
        out.println("ne" + suffix);
        out.flush();
    }

    // Logical

    public void and() {
        out.println("and");
        out.flush();
    }

    public void or() {
        out.println("or");
        out.flush();
    }

    public void not() {
        out.println("not");
        out.flush();
    }

    // Input (b, i, f)

    public void in(char suffix) {
        out.println("in");
        out.flush();
    }

    // Output (b, i, f)

    public void out(char suffix) {
        out.println("out");
        out.flush();
    }

    // Cast

    public void b2i() {
        out.println("b2i");
        out.flush();
    }

    public void i2f() {
        out.println("i2f");
        out.flush();
    }

    public void f2i() {
        out.println("f2i");
        out.flush();
    }

    public void i2b() {
        out.println("i2b");
        out.flush();
    }

    // Jumps

    public String getLabel() {
        return "";
    }

    public void jmp(String label) {
        out.println("jmp " + label);
        out.flush();
    }

    public void jz(String label) {
        out.println("jz " + label);
        out.flush();
    }

    public void jnz(String label) {
        out.println("jnz " + label);
        out.flush();
    }

    // Functions

    public void addLabel(String label) {
        out.println(label + ":");
        out.flush();
    }

    public void call(String label) {
        out.println("call " + label);
        out.flush();
    }

    public void enter(int integer) {
        out.println("enter " + integer);
        out.flush();
    }

    public void ret(int bytesToReturn, int bytesLocals, int bytesArguments) {
        out.println("ret " + bytesToReturn + ", " + bytesLocals + ", " + bytesArguments);
        out.flush();
    }

    public void halt() {
        out.println("halt");
        out.flush();
    }

    // Utilities

    public void convert(Type type1, Type type2) {
        if (type1 instanceof CharType && type2 instanceof IntType) {
            out.println("b2i");
        } else if (type1 instanceof IntType && type2 instanceof FloatType) {
            out.println("i2f");
        } else if (type1 instanceof FloatType && type2 instanceof IntType) {
            out.println("f2i");
        } else if (type1 instanceof IntType && type2 instanceof CharType) {
            out.println("i2b");
        }
        out.flush();
    }

    public void arithmetic(String operation, Type type) {
        switch (operation) {
            case "+": {
                add(type.suffix());
                break;
            }
            case "-": {
                sub(type.suffix());
                break;
            }
            case "*": {
                mul(type.suffix());
                break;
            }
            case "/": {
                div(type.suffix());
                break;
            }
            case "%": {
                mod(type.suffix());
                break;
            }
        }
    }

    public void compare(String operation, Type type) {
        switch (operation) {
            case ">": {
                gt(type.suffix());
                break;
            }
            case "<": {
                lt(type.suffix());
                break;
            }
            case ">=": {
                ge(type.suffix());
                break;
            }
            case "<=": {
                le(type.suffix());
                break;
            }
            case "==": {
                eq(type.suffix());
                break;
            }
            case "!=": {
                ne(type.suffix());
                break;
            }
        }
    }

    public void logical(String operation) {
        switch (operation) {
            case "&&": {
                and();
                break;
            }
            case "||": {
                or();
                break;
            }
        }
    }
}
