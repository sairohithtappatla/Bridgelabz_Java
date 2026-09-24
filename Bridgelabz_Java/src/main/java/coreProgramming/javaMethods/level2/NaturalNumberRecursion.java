package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class NaturalNumberRecursion {

    // Method to calculate the sum of natural numbers using recursion
    public static int sumNaturalNumbers(int number) {

        // Base condition
        if (number <= 1) {
            return number;
        }

        // Recursive calculation
        return number + sumNaturalNumbers(number - 1);
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            input.close();
            return;
        }

        // Calculate the sum
        int sum = sumNaturalNumbers(number);

        // Display the result
        System.out.println("Sum of natural numbers: " + sum);

        // Close Scanner
        input.close();
    }
}
