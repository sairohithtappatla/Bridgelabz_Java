package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Check whether number is positive
        if (number > 0) {

            // Initialize counter
            int i = 0;

            // Loop from 0 to number
            while (i <= number) {

                // Check multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                // Check multiple of 3
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                // Check multiple of 5
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else {
                    System.out.println(i);
                }

                // Increment counter
                i++;
            }

        } else {
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}