package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class NumberSign {

    // Method to check whether number is positive, negative or zero
    public static int checkNumberSign(int number) {

        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get result from method
        int result = checkNumberSign(number);

        // Display result
        if (result == 1) {
            System.out.println("Positive");
        } else if (result == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close Scanner
        input.close();
    }
}