package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find and return all factors
    public static int[] findFactors(int number) {

        int count = 0;

        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array using factor count
        int[] factors = new int[count];

        int index = 0;

        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {

        double sum = 0;

        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number.");
            input.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        input.close();
    }
}