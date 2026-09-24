package coreProgramming.javaMethods.level2;

import java.util.Scanner;
import java.util.Random;

public class RandomArrayStatistics {

    // Method to generate a random array
    public static int[] generateRandomArray(int size) {

        // Create array with the requested size
        int[] numbers = new int[size];

        // Create Random object
        Random random = new Random();

        // Generate random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Return generated array
        return numbers;
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] numbers) {

        // Initialize sum
        int sum = 0;

        // Add all array elements
        for (int number : numbers) {
            sum += number;
        }

        // Return sum
        return sum;
    }

    // Method to calculate the average
    public static double calculateAverage(int[] numbers) {

        // Calculate total sum
        int sum = calculateSum(numbers);

        // Calculate and return average
        return (double) sum / numbers.length;
    }

    // Method to find the minimum value
    public static int findMinimum(int[] numbers) {

        // Assume first element is minimum
        int minimum = numbers[0];

        // Compare all elements
        for (int number : numbers) {

            // Update minimum when smaller value is found
            if (number < minimum) {
                minimum = number;
            }
        }

        // Return minimum value
        return minimum;
    }

    // Method to find the maximum value
    public static int findMaximum(int[] numbers) {

        // Assume first element is maximum
        int maximum = numbers[0];

        // Compare all elements
        for (int number : numbers) {

            // Update maximum when greater value is found
            if (number > maximum) {
                maximum = number;
            }
        }

        // Return maximum value
        return maximum;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        // Validate array size
        if (size <= 0) {
            System.out.println("Array size must be positive.");
            input.close();
            return;
        }

        // Generate random array
        int[] numbers = generateRandomArray(size);

        // Display array elements
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Calculate statistics
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);

        // Display statistics
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        // Close Scanner
        input.close();
    }
}
