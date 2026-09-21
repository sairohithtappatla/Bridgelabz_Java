package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get year input
        int year = input.nextInt();

        // Check whether the year belongs to Gregorian calendar
        if (year >= 1582) {

            // Check if year is divisible by 400
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");

            // Check if year is divisible by 100
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");

            // Check if year is divisible by 4
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");

            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Invalid year");
        }

        // Close Scanner
        input.close();
    }
}