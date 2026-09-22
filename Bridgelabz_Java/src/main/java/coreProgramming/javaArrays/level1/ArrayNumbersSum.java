package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class ArrayNumbersSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create array with maximum capacity of 10
        double[] numbers = new double[10];

        // Initialize index and total
        int index = 0;
        double total = 0.0;

        // Take input until zero, negative number or array limit
        while (true) {

            // Stop if array is full
            if (index == numbers.length) {
                break;
            }

            // Get user input
            double number = input.nextDouble();

            // Stop for zero or negative number
            if (number <= 0) {
                break;
            }

            // Store number in array
            numbers[index] = number;
            index++;
        }

        // Calculate total of stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display stored numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display total
        System.out.println("Total: " + total);

        // Close Scanner
        input.close();
    }
}