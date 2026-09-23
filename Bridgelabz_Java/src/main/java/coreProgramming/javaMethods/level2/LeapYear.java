package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class LeapYear {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.err.println("Year must be 1582 or later.");
            input.close();
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}