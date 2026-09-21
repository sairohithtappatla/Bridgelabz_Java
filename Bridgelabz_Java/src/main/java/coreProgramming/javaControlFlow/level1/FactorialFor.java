package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check whether number is positive
        if (number > 0) {

            // Calculate factorial using for loop
            long factorial = 1;

            for (int counter = 1; counter <= number; counter++) {
                factorial *= counter;
            }

            // Display factorial
            System.out.println(
                    "The factorial of " + number + " is " + factorial
            );

        } else {
            System.out.println(
                    "The number " + number + " is not a positive integer"
            );
        }

        // Close Scanner
        input.close();
    }
}
