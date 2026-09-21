package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Display factors
        System.out.println("Factors of " + number + " are:");

        // Check numbers from 1 to number - 1
        for (int i = 1; i < number; i++) {

            // Check whether i is a factor
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close Scanner
        input.close();
    }
}