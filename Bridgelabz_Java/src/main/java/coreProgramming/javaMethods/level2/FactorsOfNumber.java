package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find all factors of a number
    public static int[] findFactors(int number) {

        // Count the number of factors
        int count = 0;

        // Check every number from 1 to the given number
        for (int i = 1; i <= number; i++) {

            // Check whether the number is a factor
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];

        // Initialize array index
        int index = 0;

        // Store all factors in the array
        for (int i = 1; i <= number; i++) {

            // Check whether the number is a factor
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return the factors array
        return factors;
    }

    // Method to calculate the sum of factors
    public static int findSum(int[] factors) {

        // Initialize sum
        int sum = 0;

        // Add each factor to the sum
        for (int factor : factors) {
            sum += factor;
        }

        // Return the sum
        return sum;
    }

    // Method to calculate the product of factors
    public static long findProduct(int[] factors) {

        // Initialize product
        long product = 1;

        // Multiply each factor
        for (int factor : factors) {
            product *= factor;
        }

        // Return the product
        return product;
    }

    // Method to calculate the sum of squares of factors
    public static int findSumOfSquares(int[] factors) {

        // Initialize sum of squares
        int sum = 0;

        // Add square of each factor
        for (int factor : factors) {
            sum += factor * factor;
        }

        // Return the sum of squares
        return sum;
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

        // Find all factors
        int[] factors = findFactors(number);

        // Display all factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculate factor results
        int sum = findSum(factors);
        long product = findProduct(factors);
        int sumOfSquares = findSumOfSquares(factors);

        // Display calculated results
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares: " + sumOfSquares);

        // Close Scanner
        input.close();
    }
}
