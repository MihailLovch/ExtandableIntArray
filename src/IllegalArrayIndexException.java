public class IllegalArrayIndexException extends RuntimeException {
    public IllegalArrayIndexException() {
    }

    public IllegalArrayIndexException(String message) {
        super(message);
    }

    public IllegalArrayIndexException(String message, Throwable cause) {
        super(message, cause);
    }
}
