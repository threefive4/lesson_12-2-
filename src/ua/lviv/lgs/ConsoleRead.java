/*
Logos IT Academy lesson 8 file
 */

package ua.lviv.lgs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Daria
 * @version 1.1
 * @since java 1.8
 * This is a program for console read for enums.
 */

public class ConsoleRead {
    /**
     * In Main method program is searching and displays a right enum variables
     *
     * @param args
     * @throws MonthException
     * @throws SeasonException
     */
    public static void main(String[] args) {
        /**
         * Arrays for Month and Season enums
         */
//        Months[] mas = Months.values();
  //      Seasons[] mas2 = Seasons.values();

        List<Months> monthList =  Arrays.asList(Months.values());
        List<Seasons> seasonList =  Arrays.asList(Seasons.values());
        System.out.println(monthList);
        System.out.println(seasonList);

        /**
         * Class Scanner is used for users console input
         */
        Scanner sc = new Scanner(System.in);


        while (true) {
            menu();
            try {
                switch (sc.next()) {
                    case "1": {
                        System.out.println("Enter month: ");
                        sc = new Scanner(System.in);
                        String month = sc.next().toUpperCase();
                        boolean flag = isMonthPresent(monthList, month);

                        if (!flag) {
                            throw new MonthException("Month doesn't exist");
                            // System.out.println("Month doesn't exist");
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Enter season: ");
                        sc = new Scanner(System.in);
                        String monthSc = sc.next().toUpperCase();


                        boolean flag = false;

                        for (Months c : monthList) {
                            if (c.getSeason().name().equals(monthSc)) {
                                flag = true;
                            }
                        }
                        if (flag) {
                            Seasons ssns = Seasons.valueOf(monthSc);
                            for (Months mnths : monthList) {
                                if (mnths.getSeason().toString().equalsIgnoreCase(monthSc)) {
                                    System.out.println(mnths);
                                }
                            }
                        }
                        if (!flag) {
                            throw new MonthException("Month doesn't exist");
                            //System.out.println("This month is in a different season");
                        }
                        break;

                    }
                    case "3": {
                        System.out.println("Enter amount of days: ");
                        sc = new Scanner(System.in);
                        int days = sc.nextInt();

                        boolean isMonthFound = false;

                        for (Months m : monthList) {
                            if (m.getDays() == days) {
                                isMonthFound = true;
                                System.out.println(m);
                            }
                        }
                        if (!isMonthFound) {
                            throw new MonthException("Month doesn't exist");
                            //System.out.println("Month with this amount of days doesn't exist");
                        }
                        break;
                    }

                    case "4": {
                        int min = monthList.get(0).getDays();
                        for (Months m : monthList) {
                            if (min > m.getDays()) {
                                min = m.getDays();
                            }
                        }
                        for (Months m : monthList) {
                            if (min == m.getDays())
                                System.out.println(m);
                        }
                    }
                    case "5": {
                        int max = monthList.get(0).getDays();
                        for (Months m : monthList) {
                            if (max < m.getDays()) {
                                max = m.getDays();
                            }
                        }
                        for (Months m : monthList) {
                            if (max == m.getDays())
                                System.out.println(m);
                        }
                    }
                    case "6": {
                        System.out.println("Enter a season, to see the next one after it: ");
                        sc = new Scanner(System.in);
                        String season = sc.next().toUpperCase();
                        boolean flag = isSeasonPresent(seasonList, season);

                        if (flag) {
                            Seasons seasons2 = Seasons.valueOf(season);
                            int ordinal = seasons2.ordinal();

                            if (ordinal == (seasonList.size() - 1)) {
                                ordinal = 0;
                                System.out.println(seasonList.get(ordinal));
                            } else {
                                System.out.println(seasonList.get(ordinal + 1));
                            }
                        }
                        if (!flag) {
                            throw new SeasonException("Season doesn't exist");
                            // System.out.println("Season doesn't exist");
                        }
                        break;


                    }
                    case "7": {
                        System.out.println("Enter a season, to see the previous one: ");
                        sc = new Scanner(System.in);
                        String season = sc.next().toUpperCase();
                        boolean flag = isSeasonPresent(seasonList, season);

                        if (flag) {
                            Seasons seasons2 = Seasons.valueOf(season);
                            int ordinal = seasons2.ordinal();

                            if (ordinal == (seasonList.size() + 1)) {
                                ordinal = 0;
                                System.out.println(seasonList.get(ordinal));
                            } else {
                                System.out.println(seasonList.get(ordinal - 1));
                            }
                        }
                        if (!flag) {
                            throw new SeasonException("Season doesn't exist");
                            //System.out.println("Season doesn't exist");
                        }
                        break;
                    }
                    case "8": {
                        for (Months m : monthList) {
                            if (m.getDays() % 2 == 0) {
                                System.out.println(m);
                            }
                        }
                    }
                    case "9": {
                        for (Months m : monthList) {
                            if (m.getDays() % 2 != 0) {
                                System.out.println(m);
                            }
                        }
                    }
                    case "10": {
                        System.out.println("Enter a month, to see ones that has an even number of days: ");
                        sc = new Scanner(System.in);
                        String month = sc.next().toUpperCase();
                        boolean flag = isMonthPresent(monthList, month);
                        if (!flag) {
                            throw new MonthException("Month doesn't exist");
                            //System.out.println("Month doesn't exist");
                            // break;
                        }
                        for (Months m : monthList) {
                            if (m.name().equals(month)) {

                                if (m.getDays() % 2 == 0) {
                                    System.out.println("This month has even number of days");

                                } else {
                                    throw new MonthException("this month doesn't have an even number of days");
                                    //System.out.println("this month doesn't have an even number of days");
                                }
                            }
                        }

                        break;
                    }

                }
            } catch (SeasonException | MonthException e) {
                System.err.println(e.getMessage());


            }
        }

    }

    private static boolean isMonthPresent(List<Months> monthList, String month) {
        boolean flag = false;

        for (Months c : monthList) {
            if (c.name().equals(month)) {
                System.out.println("Month exist");
                flag = true;
            }
        }
        return flag;
    }

    private static boolean isSeasonPresent(List<Seasons> seasonList, String season) {
        boolean flag = false;
        for (Seasons seasons2 : seasonList) {
            if (seasons2.name().equals(season)) {
                System.out.println("Season exist");
                flag = true;
            }
        }
        return flag;
    }

    /**
     * menu() method is used to show switch cases in console
     */
    static void menu() {
        System.out.println("Press 1, to check if this month exist");
        System.out.println("Press 2, to show months with with this season");
        System.out.println("Press 3, to show months with same amount of days");
        System.out.println("Press 4, to show months with smallest amount of days");
        System.out.println("Press 5, to show months with biggest amount of days");
        System.out.println("Press 6, to show next season");
        System.out.println("Press 7, to show previous season");
        System.out.println("Press 8, to show months that having an even number of days");
        System.out.println("Press 9, to show months that having an odd number of days");
        System.out.println("Press 10, to get on the screen month that has an even number of days");
    }


}
