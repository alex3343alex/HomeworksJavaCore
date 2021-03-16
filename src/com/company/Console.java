package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Do you want to start? ( YES/NO )");
        while (doYouWantToContinue()) {
            System.out.println("Enter the name of the month on English ");
            String str = scanner.nextLine();
            if (Month.checkIfExists(str)){
                System.out.println("Enter the operation: " +
                        "1 = Check if such Month exists\n" +
                        "2 = Get month with the same season\n" +
                        "3 = Get months with the same number of Days\n" +
                        "4 = Get months with fever days\n" +
                        "5 = Get months with more days\n" +
                        "6 = Get the nex season \n" +
                        "7 = Get the previous season\n" +
                        "8 = Get all months with odd number of days\n" +
                        "9 = Get all months with even number of days\n" +
                        "10 = Check whether the given month has even number of days\n");
                try {
                    int number = scanner.nextInt();

                    switch (number){
                        case 1:
                            Month.checkIfExists(str);
                            break;
                        case 2:
                            Month.valueOf(str.toUpperCase())
                                    .displayMonthsWithTheSameSeason();
                            break;
                        case 3:
                            Month.valueOf(str.toUpperCase())
                                    .displayMonthsWithTheSameNumberOfDays();
                            break;
                        case 4:
                            Month.valueOf(str.toUpperCase())
                                    .displayAllMonthsThatHaveFewerDays();
                            break;
                        case 5:
                            Month.valueOf(str.toUpperCase())
                                    .displayAllMonthsThatHaveMoreDays();
                            break;
                        case 6:
                            Month.valueOf(str.toUpperCase())
                                    .displayTheNextSeason();
                            break;
                        case 7:
                            Month.valueOf(str.toUpperCase())
                                    .displayThePreviousSeason();
                            break;
                        case 8:
                            Month.valueOf(str.toUpperCase())
                                    .displayMonthsWithOddNumberOfDays();
                            break;
                        case 9:
                            Month.valueOf(str.toUpperCase())
                                    .displayMonthsWithEvenNumberOfDays();
                            break;
                        case 10:
                            Month.valueOf(str.toUpperCase())
                                    .displayWhetherMonthHasAnEvenNumberOfDays();
                            break;
                        default:
                            System.out.println("Not recognized command");
                    }
                } catch (InputMismatchException e) {
                    System.out.println();
                }
            }else System.out.println("Would you like to continue work with the months ( YES/NO )");
        }
    }

        private static boolean doYouWantToContinue() {
            boolean yesOrNo = true;
            String s = scanner.nextLine();
            System.out.println();
            while (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no")) {
                System.out.println("You entered an incorrect value - " + s + "\n" +
                        "Would you like to continue work with the months ( YES/NO )");
                s = scanner.nextLine();
                System.out.println();
            }
            if (s.equalsIgnoreCase("no")) {
                yesOrNo = false;
                System.out.println("Goodbye!");
            }
            return yesOrNo;
        }
    }
