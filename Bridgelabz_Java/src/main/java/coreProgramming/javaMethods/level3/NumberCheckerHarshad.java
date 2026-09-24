package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerHarshad {

    // Method to count digits
    public static int countDigits(int number) {

        // Handle zero
        if (number == 0) {
            return 1;
        }

        // Initialize count
        int count = 0;

        // Count digits
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Return count
        return count;
    }

    // Method to get digits array
    public static int[] getDigits(int number, int count) {

        // Create array
        int[] digits = new int[count];

        // Store absolute number
        number = Math.abs(number);

        // Extract digits
        for (int i = count - 1; i >= 0; i--) {

            // Store last digit
            digits[i] = number % 10;

            // Remove last digit
            number /= 10;
        }

        // Return array
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumDigits(int[] digits) {

        // Initialize sum
        int sum = 0;

        // Add every digit
        for (int digit : digits) {
            sum += digit;
        }

        // Return sum
        return sum;
    }

    // Method to calculate sum of squares
    public static int sumOfSquares(int[] digits) {

        // Initialize sum
        int sum = 0;

        // Calculate square of every digit
        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        // Return sum
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshad(int number, int[] digits) {

        // Calculate digit sum
        int sum = sumDigits(digits);

        // Check divisibility
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of every digit
    public static int[][] digitFrequency(int[] digits) {

        // Create frequency array
        int[] frequency = new int[10];

        // Count each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Create result matrix
        int[][] result = new int[10][2];

        // Store digit and frequency
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = frequency[i];
        }

        // Return frequency matrix
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Enter a positive number.");
            input.close();
            return;
        }

        // Count digits
        int count = countDigits(number);

        // Create digits array
        int[] digits = getDigits(number, count);

        // Calculate sum
        int sum = sumDigits(digits);

        // Calculate square sum
        int squareSum = sumOfSquares(digits);

        // Check Harshad
        boolean harshad = isHarshad(number, digits);

        // Display results
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares: " + squareSum);
        System.out.println("Harshad Number: " + harshad);

        // Display frequency table
        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {

            // Display only digits that occur
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + " -> " + frequency[i][1]);
            }
        }

        // Close Scanner
        input.close();
    }
}