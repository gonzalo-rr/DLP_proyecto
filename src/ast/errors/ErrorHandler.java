package ast.errors;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance;

    private List<ErrorType> errors;

    private ErrorHandler() {
        this.errors = new ArrayList<ErrorType>();
    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError() {
        return errors.isEmpty()? false : true;
    }

    public void showErrors(PrintStream printStream) {
        errors.stream().forEach(error -> printStream.println(error));
    }

    public void addError(ErrorType errorType) {
        errors.add(errorType);
    }

}
