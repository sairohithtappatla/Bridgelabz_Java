package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerPalindrome {

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

    // Method to store digits
    public static int[] getDigits(int number, int count) {

        // Create digit array
        int[] digits = new int[count];

        // Extract absolute digits
        number = Math.abs(number);

        // Store digits
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Return digits
        return digits;
    }

    // Method to reverse an array
    public static int[] reverseArray(int[] array) {

        // Create reversed array
        int[] reversed = new int[array.length];

        // Copy elements in reverse order
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        // Return reversed array
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] first, int[] second) {

        // Check array lengths
        if (first.length != second.length) {
            return false;
        }

        // Compare every element
        for (int i = 0; i < first.length; i++) {

            // Return false when elements differ
            if (first[i] != second[i]) {
                return false;
            }
        }

        // Arrays are equal
        return true;
    }

    // Method to check palindrome
    public static boolean isPalindrome(int[] digits) {

        // Reverse the digits
        int[] reversed = reverseArray(digits);

        // Compare original and reversed arrays
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {

        // Check all digits
        for (int digit : digits) {

            // Check for zero
            if (digit == 0) {
                return true;
            }
        }

        // No zero found
        return false;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Enter a non-negative number.");
            input.close();
            return;
        }

        // Count digits
        int count = countDigits(number);

        // Store digits
        int[] digits = getDigits(number, count);

        // Check palindrome
        boolean palindrome = isPalindrome(digits);

        // Check Duck Number
        boolean duck = isDuckNumber(digits);

        // Display results
        System.out.println("Palindrome Number: " + palindrome);
        System.out.println("Duck Number: " + duck);

        // Close Scanner
        input.close();
    }
}