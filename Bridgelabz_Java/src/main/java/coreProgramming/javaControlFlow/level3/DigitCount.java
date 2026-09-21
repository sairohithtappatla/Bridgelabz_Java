package coreProgramming.javaControlFlow.level3;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Initialize count
        int count = 0;

        // Count digits using while loop
        while (number != 0) {
            // Remove last digit
            number = number / 10;

            // Increase count
            count++;
        }

        // Display number of digits
        System.out.println("Number of digits: " + count);

        // Close Scanner
        input.close();
    }
}