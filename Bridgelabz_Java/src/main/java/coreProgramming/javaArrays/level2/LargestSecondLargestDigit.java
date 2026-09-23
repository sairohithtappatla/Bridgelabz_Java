package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class LargestSecondLargestDigit {
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

        // Maximum initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index for storing digits
        int index = 0;
        int temp = number;

        // Store digits in array
        if (temp == 0) {
            digits[index++] = 0;
        } else {
            while (temp != 0) {

                // Increase array size if required
                if (index == maxDigit) {
                    maxDigit += 10;

                    int[] tempArray = new int[maxDigit];

                    // Copy existing digits
                    for (int i = 0; i < digits.length; i++) {
                        tempArray[i] = digits[i];
                    }

                    digits = tempArray;
                }

                // Store last digit
                digits[index] = temp % 10;
                index++;

                // Remove last digit
                temp /= 10;
            }
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close Scanner
        input.close();
    }
}