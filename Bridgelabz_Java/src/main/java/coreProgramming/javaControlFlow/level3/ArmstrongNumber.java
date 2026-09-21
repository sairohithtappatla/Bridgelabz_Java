package coreProgramming.javaControlFlow.level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Store original number and initialize sum
        int originalNumber = number;
        int sum = 0;

        // Access each digit using while loop
        while (number != 0) {
            // Find last digit
            int digit = number % 10;

            // Find cube of digit and add to sum
            sum += digit * digit * digit;

            // Remove last digit
            number = number / 10;
        }

        // Check if sum is equal to original number
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        // Close Scanner
        input.close();
    }
}