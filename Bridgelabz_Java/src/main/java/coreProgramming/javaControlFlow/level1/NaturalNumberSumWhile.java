package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check whether number is a natural number
        if (number > 0) {

            // Calculate sum using while loop
            int sumUsingWhile = 0;
            int counter = 1;

            while (counter <= number) {
                sumUsingWhile += counter;
                counter++;
            }

            // Calculate sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Compare both results
            boolean isCorrect = sumUsingWhile == sumUsingFormula;

            // Display results
            System.out.println("Sum using while loop = " + sumUsingWhile);
            System.out.println("Sum using formula = " + sumUsingFormula);
            System.out.println("Are both results correct? " + isCorrect);

        } else {
            System.out.println(
                    "The number " + number + " is not a natural number"
            );
        }

        // Close Scanner
        input.close();
    }
}
