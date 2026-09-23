package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class NaturalNumberRecursion {

    // Method to calculate sum using recursion
    public static int recursiveSum(int number) {

        if (number == 1) {
            return 1;
        }

        return number + recursiveSum(number - 1);
    }

    // Method to calculate sum using formula
    public static int formulaSum(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number < 1) {
            System.err.println("Invalid natural number.");
            input.close();
            return;
        }

        int recursiveResult = recursiveSum(number);
        int formulaResult = formulaSum(number);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are different.");
        }

        input.close();
    }
}