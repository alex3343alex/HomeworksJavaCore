package com.company;

public enum Month {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    int numberOfDays;
    Seasons season;

    Month(int numberOfDays, Seasons season) {
        this.numberOfDays = numberOfDays;
        this.season = season;
    }

    public static boolean checkIfExists(String string) {
        boolean isThereSuchAMonth = false;
        for (Month m : Month.values()) {
            if (string.toUpperCase().equals(m.name())) {
                System.out.println("You select  - " + m.name());
                isThereSuchAMonth = true;
            }
        }
        if (!isThereSuchAMonth) {
            System.out.println("The month - " + string + "  doesn't exist");
        }
        System.out.println();
        return isThereSuchAMonth;
    }

    public void displayMonthsWithTheSameSeason() {
        for (Month m : Month.values()) {
            if (season == m.season && !name().equals(m.name())) {
                System.out.println(m + "- This month is from the same season - " + m.season);
            }
        }
        System.out.println();
    }

    public void displayMonthsWithTheSameNumberOfDays() {
        for (Month m : Month.values()) {
            if (numberOfDays == m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- Month with the same number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
    }

    public void displayAllMonthsThatHaveFewerDays() {
        for (Month m : Month.values()) {
            if (numberOfDays > m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- This month has fewer days - " + m.numberOfDays);
            }
        }
        if (numberOfDays == 28) {
            System.out.println("February alone can have 28 days");
        }
        System.out.println();
    }

    public void displayAllMonthsThatHaveMoreDays() {
        for (Month m : Month.values()) {
            if (numberOfDays < m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- This month has more days - " + m.numberOfDays);
            }
        }
        if (numberOfDays == 31) {
            System.out.println("31 - This is the largest number of days");
        }
        System.out.println();
    }

    public void displayTheNextSeason() {
        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i]) && i != 3) {
                System.out.println("Next season is - " + seasons[i + 1]);
            } else if (season.equals(seasons[i]) && i == 3) {
                System.out.println("Next season is - " + seasons[0]);
            }
        }
        System.out.println();
    }

    public void displayThePreviousSeason() {
        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i]) && i != 0) {
                System.out.println("Previous season is - " + seasons[i - 1]);
            } else if (season.equals(seasons[i]) && i == 0) {
                System.out.println("Previous season is - " + seasons[3]);
            }
        }
        System.out.println();
    }

    public void displayMonthsWithOddNumberOfDays() {
        for (Month m : Month.values()) {
            if (m.numberOfDays % 2 != 0) {
                System.out.println(m.name() + " - This month has an odd number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
    }

    public void displayMonthsWithEvenNumberOfDays() {
        for (Month m : Month.values()) {
            if (m.numberOfDays % 2 == 0) {
                System.out.println(m.name() + " - This month has an even number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
    }

    public void displayWhetherMonthHasAnEvenNumberOfDays() {
        if (numberOfDays % 2 == 0) {
            System.out.println(name() + " - This month has an even number of days - " + numberOfDays);
        } else {
            System.out.println(name() + " - This month has an odd number of days - " + numberOfDays);
        }
        System.out.println();
    }
}











