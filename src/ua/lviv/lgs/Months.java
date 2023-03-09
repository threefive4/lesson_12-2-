package ua.lviv.lgs;

import java.util.Arrays;
import java.util.List;

/**
 * enum to show months with days and seasons
 */
public enum Months  {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(30, Seasons.SUMMER),
    SEPTEMBER(31, Seasons.FALL),
    OCTOBER(30, Seasons.FALL),
    NOVEMBER(31, Seasons.FALL),
    DECEMBER(30, Seasons.WINTER);
    /**
     * int days for enum Months
     */





    private int days;
    /**
     * variable Seasons for seasons in enum Months
     */
    private Seasons season;

    /**
     *
     * @param days int variable from Months enum
     * @param season Seasons variable from Months enum
     */
    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }
}
