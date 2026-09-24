package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class BMIMethods {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {

        // Calculate BMI using weight in kilograms and height in meters
        return weight / (height * height);
    }

    // Method to classify BMI
    public static String classifyBMI(double bmi) {

        // Check underweight condition
        if (bmi < 18.5) {
            return "Underweight";
        }

        // Check normal weight condition
        if (bmi < 25) {
            return "Normal";
        }

        // Check overweight condition
        if (bmi < 30) {
            return "Overweight";
        }

        // Return obesity classification
        return "Obese";
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get weight from the user
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        // Get height from the user
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        // Validate weight and height
        if (weight <= 0 || height <= 0) {
            System.out.println("Weight and height must be positive.");
            input.close();
            return;
        }

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Classify BMI
        String category = classifyBMI(bmi);

        // Display results
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);

        // Close Scanner
        input.close();
    }
}
