package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class NumberAnalysis {

    // Method to count the number of digits
    public static int countDigits(int number) {

        // Convert negative number to positive
        number = Math.abs(number);

        // Handle zero separately
        if (number == 0) {
            return 1;
        }

        // Initialize digit count
        int count = 0;

        // Count digits
        while (number > 0) {
            number /= 10;
            count++;
        }

        // Return digit count
        return count;
    }

    // Method to find the sum of digits
    public static int sumDigits(int number) {

        // Convert negative number to positive
        number = Math.abs(number);

        // Initialize sum
        int sum = 0;

        // Extract and add each digit
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Return digit sum
        return sum;
    }

    // Method to reverse a number
    public static int reverseNumber(int number) {

        // Store sign of the number
        int sign = number < 0 ? -1 : 1;

        // Work with positive value
        number = Math.abs(number);

        // Initialize reversed number
        int reverse = 0;

        // Reverse the digits
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        // Return reversed number with original sign
        return reverse * sign;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Calculate number of digits
        int digitCount = countDigits(number);

        // Calculate sum of digits
        int digitSum = sumDigits(number);

        // Reverse the number
        int reversed = reverseNumber(number);

        // Display results
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Reversed number: " + reversed);

        // Close Scanner
        input.close();
    }
}
