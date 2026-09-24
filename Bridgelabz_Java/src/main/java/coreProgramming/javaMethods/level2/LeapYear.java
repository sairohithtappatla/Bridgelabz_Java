package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class LeapYear {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {

        // Check the leap year conditions
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        // Check whether the year is divisible by 4
        return year % 4 == 0;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate the year
        if (year <= 0) {
            System.out.println("Invalid year.");
            input.close();
            return;
        }

        // Check whether the year is a leap year
        boolean leapYear = isLeapYear(year);

        // Display the result
        if (leapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close Scanner
        input.close();
    }
}
