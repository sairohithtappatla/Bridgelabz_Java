package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class DigitFrequency {
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

        // Create frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " time(s)");
            }
        }

        // Close Scanner
        input.close();
    }
}