package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Continue until zero or negative number is entered
        while (true) {

            // Get number from user
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            // Stop if number is zero or negative
            if (number <= 0) {
                break;
            }

            // Add number to total
            total += number;
        }

        // Display total
        System.out.println("The total sum is " + total);

        // Close Scanner
        input.close();
    }
}
