package coreProgramming.javaArrays.level1;

import java.util.Scanner;
import java.util.Arrays;

public class FactorsOfNumberArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Validate number
        if (number <= 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Initialize maximum factor capacity and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {

            // Check whether i is a factor
            if (number % i == 0) {

                // Resize array when capacity is reached
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];

                    // Copy old factors to temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign resized array
                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();

        // Close Scanner
        input.close();
    }
}