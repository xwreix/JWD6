package by.epamtc.exception;

public class NoSuchAircraftException extends Exception {
    public NoSuchAircraftException() {
        super();
    }

    public NoSuchAircraftException(String message) {
        super(message);
    }

    public NoSuchAircraftException(Throwable cause) {
        super(cause);
    }

    public NoSuchAircraftException(String message, Throwable cause) {
        super(message, cause);
    }
}

