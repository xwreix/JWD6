package by.epamtc.exception;

public class WrongRangeException extends Exception{
    public WrongRangeException(){
        super();
    }

    public WrongRangeException(String message){
        super(message);
    }

    public WrongRangeException(Throwable cause){
        super(cause);
    }

    public WrongRangeException(String message, Throwable cause){
        super(message, cause);
    }
}
