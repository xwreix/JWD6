package by.epamtc.exception;

public class NullAircraftException extends Exception{
    public NullAircraftException(){
        super();
    }

    public NullAircraftException(String message){
        super(message);
    }

    public  NullAircraftException(Throwable cause){
        super(cause);
    }

    public NullAircraftException(String message, Throwable cause){
        super(message, cause);
    }
}
