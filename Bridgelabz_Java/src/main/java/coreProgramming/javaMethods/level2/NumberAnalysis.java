package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class NumberAnalysis {

    // Method to check positive number
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check even number
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        }

        if (number1 == number2) {
            return 0;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_COUNT = 5;
        int[] numbers = new int[NUMBER_COUNT];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (isPositive(numbers[i])) {

                if (isEven(numbers[i])) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }

            } else {
                System.out.println("Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);

        if (comparison == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparison == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        input.close();
    }
}