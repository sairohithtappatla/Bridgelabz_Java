package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerClassification {

    // Method to find factors
    public static int[] findFactors(int number) {

        // Count factors
        int count = 0;

        // First loop counts factors
        for (int i = 1; i <= number; i++) {

            // Check factor
            if (number % i == 0) {
                count++;
            }
        }

        // Create factors array
        int[] factors = new int[count];

        // Initialize index
        int index = 0;

        // Second loop stores factors
        for (int i = 1; i <= number; i++) {

            // Check factor
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return factors
        return factors;
    }

    // Method to find greatest factor excluding number
    public static int greatestProperFactor(int[] factors) {

        // Return second-last factor
        if (factors.length > 1) {
            return factors[factors.length - 2];
        }

        // Return 0 when no proper factor exists
        return 0;
    }

    // Method to find sum of factors
    public static int sumFactors(int[] factors) {

        // Initialize sum
        int sum = 0;

        // Add factors
        for (int factor : factors) {
            sum += factor;
        }

        // Return sum
        return sum;
    }

    // Method to find product of factors
    public static long productFactors(int[] factors) {

        // Initialize product
        long product = 1;

        // Multiply factors
        for (int factor : factors) {
            product *= factor;
        }

        // Return product
        return product;
    }

    // Method to find product of cubes of factors
    public static double productCubeFactors(int[] factors) {

        // Initialize product
        double product = 1;

        // Multiply cubes
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        // Return product
        return product;
    }

    // Method to calculate sum of proper factors
    public static int sumProperFactors(int[] factors) {

        // Initialize sum
        int sum = 0;

        // Exclude the number itself
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }

        // Return proper factor sum
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int number, int[] factors) {

        // Calculate proper factor sum
        int sum = sumProperFactors(factors);

        // Compare sum with number
        return sum == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int number, int[] factors) {

        // Calculate proper factor sum
        int sum = sumProperFactors(factors);

        // Check whether sum is greater
        return sum > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int number, int[] factors) {

        // Calculate proper factor sum
        int sum = sumProperFactors(factors);

        // Check whether sum is smaller
        return sum < number;
    }

    // Method to calculate factorial
    public static int factorial(int number) {

        // Initialize factorial
        int result = 1;

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        // Return factorial
        return result;
    }

    // Method to check Strong Number
    public static boolean isStrong(int number) {

        // Store original number
        int originalNumber = number;

        // Initialize sum
        int sum = 0;

        // Process digits
        while (number > 0) {

            // Extract digit
            int digit = number % 10;

            // Add factorial of digit
            sum += factorial(digit);

            // Remove last digit
            number /= 10;
        }

        // Compare sum with original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input.");
            input.close();
            return;
        }

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculate factor values
        int greatestFactor = greatestProperFactor(factors);
        int sum = sumFactors(factors);
        long product = productFactors(factors);
        double cubeProduct = productCubeFactors(factors);

        // Display factor calculations
        System.out.println("\nGreatest Proper Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Product of Cubes: " + cubeProduct);

        // Display classifications
        System.out.println("Perfect Number: " + isPerfect(number, factors));
        System.out.println("Abundant Number: " + isAbundant(number, factors));
        System.out.println("Deficient Number: " + isDeficient(number, factors));
        System.out.println("Strong Number: " + isStrong(number));

        // Close Scanner
        input.close();
    }
}