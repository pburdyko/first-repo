package testng_first.dev;

public class WrongLoginException extends Exception
{
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
