package coreProgramming.javaControlFlow.level3;

import java.util.Scanner;

public class HarshadNumber {
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

            // Add digit to sum
            sum += digit;

            // Remove last digit
            number = number / 10;
        }

        // Check divisibility by sum of digits
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        // Close Scanner
        input.close();
    }
}