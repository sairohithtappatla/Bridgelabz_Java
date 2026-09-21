package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check whether number is a natural number
        if (number > 0) {

            // Iterate from 1 to the given number
            for (int counter = 1; counter <= number; counter++) {

                // Check whether current number is even or odd
                if (counter % 2 == 0) {
                    System.out.println(counter + " is an even number");
                } else {
                    System.out.println(counter + " is an odd number");
                }
            }

        } else {
            System.out.println(
                    "The number " + number + " is not a natural number"
            );
        }

        // Close Scanner
        input.close();
    }
}
