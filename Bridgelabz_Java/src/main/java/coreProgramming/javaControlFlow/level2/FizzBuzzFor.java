package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class FizzBuzzFor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Check whether number is positive
        if (number > 0) {

            // Loop from 0 to number
            for (int i = 0; i <= number; i++) {

                // Check multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                // Check multiples of 3
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                // Check multiples of 5
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}