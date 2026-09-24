package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerPrimeNeonSpy {

    // Method to check Prime Number
    public static boolean isPrime(int number) {

        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }

        // Check divisors
        for (int i = 2; i <= Math.sqrt(number); i++) {

            // Check divisibility
            if (number % i == 0) {
                return false;
            }
        }

        // Number is prime
        return true;
    }

    // Method to calculate sum of digits
    public static int sumDigits(int number) {

        // Initialize sum
        int sum = 0;

        // Process every digit
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Return sum
        return sum;
    }

    // Method to check Neon Number
    public static boolean isNeon(int number) {

        // Calculate square
        int square = number * number;

        // Calculate digit sum of square
        int sum = sumDigits(square);

        // Compare sum with original number
        return sum == number;
    }

    // Method to calculate digit product
    public static int productDigits(int number) {

        // Handle zero
        if (number == 0) {
            return 0;
        }

        // Initialize product
        int product = 1;

        // Multiply every digit
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }

        // Return product
        return product;
    }

    // Method to check Spy Number
    public static boolean isSpy(int number) {

        // Calculate digit sum
        int sum = sumDigits(number);

        // Calculate digit product
        int product = productDigits(number);

        // Compare sum and product
        return sum == product;
    }

    // Method to check Automorphic Number
    public static boolean isAutomorphic(int number) {

        // Calculate square
        int square = number * number;

        // Check ending digits
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check Buzz Number
    public static boolean isBuzz(int number) {

        // Check divisibility by 7 or ending digit 7
        return number % 7 == 0 || number % 10 == 7;
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

        // Check all number classifications
        boolean prime = isPrime(number);
        boolean neon = isNeon(number);
        boolean spy = isSpy(number);
        boolean automorphic = isAutomorphic(number);
        boolean buzz = isBuzz(number);

        // Display results
        System.out.println("Prime Number: " + prime);
        System.out.println("Neon Number: " + neon);
        System.out.println("Spy Number: " + spy);
        System.out.println("Automorphic Number: " + automorphic);
        System.out.println("Buzz Number: " + buzz);

        // Close Scanner
        input.close();
    }
}