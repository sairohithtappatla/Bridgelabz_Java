package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class LeapYearLogical {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get year input
        int year = input.nextInt();

        // Check leap year using logical operators
        if (year >= 1582 && (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {

            System.out.println(year + " is a Leap Year");

        } else if (year >= 1582) {

            System.out.println(year + " is not a Leap Year");

        } else {

            System.out.println("Invalid year");
        }

        // Close Scanner
        input.close();
    }
}