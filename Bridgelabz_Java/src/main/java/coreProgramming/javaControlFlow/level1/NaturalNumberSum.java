package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether number is a natural number
        if (number > 0) {

            // Calculate sum using formula
            int sum = number * (number + 1) / 2;

            // Display result
            System.out.println(
                    "The sum of " + number +
                    " natural numbers is " + sum
            );

        } else {
            System.out.println(
                    "The number " + number + " is not a natural number"
            );
        }

        // Close Scanner
        input.close();
    }
}
