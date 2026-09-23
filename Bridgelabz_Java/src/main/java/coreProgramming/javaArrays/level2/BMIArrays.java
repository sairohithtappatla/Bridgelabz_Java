package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class BMIArrays {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Validate number of persons
        if (number <= 0) {
            System.err.println("Invalid number of persons.");
            input.close();
            return;
        }

        // Create arrays
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Take input for each person
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kilograms: ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = input.nextDouble();

            // Validate input
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details
        System.out.println("\nBMI Details:");

        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1)
                + " | Height: " + height[i] + " m"
                + " | Weight: " + weight[i] + " kg"
                + " | BMI: " + bmi[i]
                + " | Status: " + weightStatus[i]
            );
        }

        // Close Scanner
        input.close();
    }
}