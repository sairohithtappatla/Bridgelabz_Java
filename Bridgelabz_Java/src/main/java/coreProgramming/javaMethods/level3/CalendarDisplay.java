package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Store names of all months
    static final String[] MONTHS = {
        "", "January", "February", "March", "April",
        "May", "June", "July", "August", "September",
        "October", "November", "December"
    };

    // Store number of days in each month
    static final int[] DAYS = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Apply Gregorian leap year rules
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get month name
    public static String getMonthName(int month) {

        // Return month name
        return MONTHS[month];
    }

    // Method to get number of days
    public static int getDaysInMonth(int month, int year) {

        // Handle February in leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        // Return normal month days
        return DAYS[month];
    }

    // Method to calculate first day of month
    public static int getFirstDay(int month, int year) {

        // Apply Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;

        // Calculate adjusted year
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate adjusted month
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of week
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Get year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            input.close();
            return;
        }

        // Get month name
        String monthName = getMonthName(month);

        // Get number of days
        int days = getDaysInMonth(month, year);

        // Get first day
        int firstDay = getFirstDay(month, year);

        // Display calendar heading
        System.out.println("\n      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print indentation before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Display all days
        for (int day = 1; day <= days; day++) {

            // Print day with three-character width
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to next line after calendar
        System.out.println();

        // Close Scanner
        input.close();
    }
}