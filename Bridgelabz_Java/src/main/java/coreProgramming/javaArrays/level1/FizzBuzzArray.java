package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Validate positive integer
        if (number < 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create String array to store FizzBuzz results
        String[] results = new String[number + 1];

        // Generate FizzBuzz results
        for (int i = 0; i <= number; i++) {

            // Check multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results with position
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close Scanner
        input.close();
    }
}