package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close Scanner
        input.close();
    }
}
