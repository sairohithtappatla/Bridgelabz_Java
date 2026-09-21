package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Assume number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Close Scanner
        input.close();
    }
}