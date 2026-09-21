package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check whether number is a natural number
        if (number > 0) {

            // Calculate sum using for loop
            int sumUsingFor = 0;

            for (int counter = 1; counter <= number; counter++) {
                sumUsingFor += counter;
            }

            // Calculate sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Compare both results
            boolean isCorrect = sumUsingFor == sumUsingFormula;

            // Display results
            System.out.println("Sum using for loop = " + sumUsingFor);
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
