package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate sum of n natural numbers
    public static int calculateSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 1) {
            System.err.println("Invalid natural number.");
            input.close();
            return;
        }

        // Calculate sum
        int sum = calculateSum(number);

        // Display result
        System.out.println("Sum of natural numbers: " + sum);

        // Close Scanner
        input.close();
    }
}