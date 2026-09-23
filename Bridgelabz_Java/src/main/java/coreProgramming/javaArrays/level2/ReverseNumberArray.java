package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid Number.");
            input.close();
            return;
        }

        // Find number of digits
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

        // Create digits array
        int[] digits = new int[count];

        // Store digits
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create reverse array
        int[] reverseDigits = new int[digits.length];

        // Store digits in reverse order
        for (int i = 0; i < digits.length; i++) {
            reverseDigits[i] = digits[digits.length - 1 - i];
        }

        // Display reverse array
        System.out.print("Digits in reverse order: ");

        for (int i = 0; i < reverseDigits.length; i++) {
            System.out.print(reverseDigits[i] + " ");
        }

        System.out.println();

        // Close Scanner
        input.close();
    }
}