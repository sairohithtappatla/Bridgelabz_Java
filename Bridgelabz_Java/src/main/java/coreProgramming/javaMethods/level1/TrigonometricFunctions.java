package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take angle
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        // Close Scanner
        input.close();
    }
}