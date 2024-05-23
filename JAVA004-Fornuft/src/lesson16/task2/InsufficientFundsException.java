package lesson16.task2;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

//    public InsufficientFundsException(Throwable cause) {
//        super(cause);
//    }


//    public InsufficientFundsException(String message, Throwable cause) {
//        super(message, cause);
//    }
}
