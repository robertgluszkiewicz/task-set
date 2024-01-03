package homework.bank.exception;

public class DbCRUDException extends RuntimeException {
    public DbCRUDException(String message, Exception e) {
        super(message, e);
    }
}
