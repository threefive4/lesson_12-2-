package ua.lviv.lgs;

/**
 * this class is used for exception for Season enum
 */
public class SeasonException extends Throwable {

    public SeasonException(String ssn) {
        super(ssn);
    }
}
