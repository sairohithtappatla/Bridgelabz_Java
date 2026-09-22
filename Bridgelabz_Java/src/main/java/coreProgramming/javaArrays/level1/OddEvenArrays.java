package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("Invalid Number. Enter a natural number.");
            input.close();
            return;
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize indexes
        int oddIndex = 0;
        int evenIndex = 0;

        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {

            // Check whether number is odd or even
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Display odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println();

        // Display even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        // Close Scanner
        input.close();
    }
}