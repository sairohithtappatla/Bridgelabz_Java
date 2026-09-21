package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Get first number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Continue until user enters zero
        while (number != 0) {

            // Add number to total
            total += number;

            // Ask for next number
            System.out.print("Enter a number: ");
            number = input.nextDouble();
        }

        // Display total
        System.out.println("The total sum is " + total);

        // Close Scanner
        input.close();
    }
}
