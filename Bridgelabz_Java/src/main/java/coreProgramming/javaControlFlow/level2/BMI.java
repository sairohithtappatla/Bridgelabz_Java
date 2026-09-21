package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get weight in kilograms
        double weight = input.nextDouble();

        // Get height in centimeters
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Declare BMI status
        String status;

        // Determine BMI status
        if (bmi <= 18.4) {
            status = "Underweight";

        } else if (bmi <= 24.9) {
            status = "Normal";

        } else if (bmi <= 39.9) {
            status = "Overweight";

        } else {
            status = "Obese";
        }

        // Display BMI and status
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);

        // Close Scanner
        input.close();
    }
}