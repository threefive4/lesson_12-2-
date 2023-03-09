package ua.lviv.lgs;

/**
 * this class is used for custom exception
 */
public class MyException extends RuntimeException {
    /**
     * constructor for custom exception for method exceptionMethod in class Methods
     * @param number String variable for exception
     */
    public MyException(String number) {
        super(number);
    }
}
