package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Take input for each number
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {

            // Check whether number is positive, negative or zero
            if (numbers[i] > 0) {

                // Check whether positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        // Close Scanner
        input.close();
    }
}