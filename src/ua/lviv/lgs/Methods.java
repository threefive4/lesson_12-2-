package ua.lviv.lgs;

/**
 * this class is used to show exceptions in method
 */
public class Methods {
    /**
     * this method is used to display methods in console
     *
     * @param args
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws IllegalAccessException {
        /**
         * arithmetic methods with int variables
         */
        sum(45, 22);
        sub(45, 22);
        multiplication(45, 22);
        division(45, 22);

    }

    /**
     * Method which is showing different exceptions using if statement
     *
     * @param a first int variable for arithmetic methods
     * @param b second int variable for arithmetic methods
     * @throws IllegalAccessException
     */
    private static void exceptionMethod(int a, int b) throws IllegalAccessException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Exception");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("Exception");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("Exception");
        }

        if (a > 0 && b > 0) {
            throw new MyException("Exception");
        }

    }

    /**
     * methods that summarizes int variables and displays in console if correct,
     * if not - displays exception
     *
     * @param a first int variable for arithmetic methods
     * @param b second int variable for arithmetic methods
     * @throws IllegalAccessException
     */
    private static void sum(int a, int b) throws IllegalAccessException {
        exceptionMethod(a, b);
        System.out.println(a + b);
    }

    /**
     * methods that subtract int variables and displays in console if correct,
     * if not - displays exception
     *
     * @param a first int variable for arithmetic methods
     * @param b second int variable for arithmetic methods
     * @throws IllegalAccessException
     */
    private static void sub(int a, int b) throws IllegalAccessException {
        exceptionMethod(a, b);
        System.out.println(a - b);
    }

    /**
     * methods that multiply int variables and displays in console if correct,
     * if not - displays exception
     *
     * @param a first int variable for arithmetic methods
     * @param b second int variable for arithmetic methods
     * @throws IllegalAccessException
     */
    private static void multiplication(int a, int b) throws IllegalAccessException {
        exceptionMethod(a, b);
        System.out.println(a * b);
    }

    /**
     * methods that divides int variables and displays in console if correct,
     * if not - displays exception
     *
     * @param a first int variable for arithmetic methods
     * @param b second int variable for arithmetic methods
     * @throws IllegalAccessException
     */
    private static void division(int a, int b) throws IllegalAccessException {
        exceptionMethod(a, b);
        System.out.println(a / b);
    }
}