public class MyArraySizeException extends Exception{
    public MyArraySizeException(String message) {
        super(message);
        System.out.println(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
