package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        // Check factors from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check whether i is a factor
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display greatest factor
        System.out.println("Greatest factor of " + number + " is " + greatestFactor);

        // Close Scanner
        input.close();
    }
}