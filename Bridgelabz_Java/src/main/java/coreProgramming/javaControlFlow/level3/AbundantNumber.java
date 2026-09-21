package coreProgramming.javaControlFlow.level3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Initialize sum of divisors
        int sum = 0;

        // Find all proper divisors
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor
            if (number % i == 0) {
                // Add divisor to sum
                sum += i;
            }
        }

        // Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // Close Scanner
        input.close();
    }
}