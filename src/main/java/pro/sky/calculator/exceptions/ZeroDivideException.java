package pro.sky.calculator.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
    }

    public ZeroDivideException(String s) {
        super("U can't divide on zero");
    }

    public ZeroDivideException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDivideException(Throwable cause) {
        super(cause);
    }
}
