package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Store month names
    private static final String[] MONTHS = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    // Store normal number of days in every month
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Apply Gregorian leap-year rules
        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get month name
    public static String getMonthName(int month) {

        // Return month name from array
        return MONTHS[month - 1];
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(
            int month,
            int year) {

        // Handle February during a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        // Return normal number of days
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to find the first day of the month
    // using the Gregorian calendar algorithm
    public static int getFirstDay(
            int month,
            int year) {

        // Set the day to 1
        int day = 1;

        // Calculate y0
        int y0 =
                year - (14 - month) / 12;

        // Calculate x
        int x =
                y0
                        + y0 / 4
                        - y0 / 100
                        + y0 / 400;

        // Calculate m0
        int m0 =
                month
                        + 12 * ((14 - month) / 12)
                        - 2;

        // Calculate first day
        int dayOfWeek =
                (day + x + 31 * m0 / 12) % 7;

        // Return day where Sunday = 0
        return dayOfWeek;
    }

    // Method to display the calendar
    public static void displayCalendar(
            int month,
            int year) {

        // Get month name
        String monthName =
                getMonthName(month);

        // Get number of days
        int numberOfDays =
                getDaysInMonth(month, year);

        // Get first day of month
        int firstDay =
                getFirstDay(month, year);

        // Display calendar heading
        System.out.println(
                "\n" + monthName + " " + year
        );

        // Display weekdays
        System.out.println(
                "Sun Mon Tue Wed Thu Fri Sat"
        );

        // Print spaces until the first day
        for (int i = 0; i < firstDay; i++) {

            // Print three spaces for each empty day
            System.out.print("    ");
        }

        // Display every day of the month
        for (int day = 1;
             day <= numberOfDays;
             day++) {

            // Print day using width 3
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Ensure final line ends correctly
        System.out.println();
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take month input
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Take year input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Validate month
        if (month < 1 || month > 12) {

            // Display validation message
            System.out.println(
                    "Month must be between 1 and 12."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Validate year
        if (year <= 0) {

            // Display validation message
            System.out.println(
                    "Year must be positive."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Display the calendar
        displayCalendar(month, year);

        // Close Scanner
        input.close();
    }
}
