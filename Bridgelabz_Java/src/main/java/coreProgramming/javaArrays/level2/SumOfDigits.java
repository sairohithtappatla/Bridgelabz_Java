package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number < 0) {
            System.err.println("Invalid Number.");
            input.close();
            return;
        }

        // Find the count of digits
        int count = 0;
        int temp = number;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        // Create array to store digits
        int[] digits = new int[count];

        // Store digits in the array
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Calculate sum of digits
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        // Display the result
        System.out.println("Sum of Digits: " + sum);

        // Close Scanner
        input.close();
    }
}