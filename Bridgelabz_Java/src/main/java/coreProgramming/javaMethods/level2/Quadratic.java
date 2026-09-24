package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class Quadratic {

    // Method to calculate the discriminant
    public static double calculateDiscriminant(double a, double b, double c) {

        // Calculate b squared minus 4ac
        return (b * b) - (4 * a * c);
    }

    // Method to calculate the first root
    public static double calculateRoot1(double a, double b, double discriminant) {

        // Calculate the first root
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to calculate the second root
    public static double calculateRoot2(double a, double b, double discriminant) {

        // Calculate the second root
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get coefficient values
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Validate coefficient a
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero.");
            input.close();
            return;
        }

        // Calculate discriminant
        double discriminant = calculateDiscriminant(a, b, c);

        // Check the type of roots
        if (discriminant > 0) {

            // Calculate two real roots
            double root1 = calculateRoot1(a, b, discriminant);
            double root2 = calculateRoot2(a, b, discriminant);

            // Display both roots
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        } else if (discriminant == 0) {

            // Calculate repeated root
            double root = -b / (2 * a);

            // Display repeated root
            System.out.println("Repeated root: " + root);

        } else {

            // Display that roots are complex
            System.out.println("The equation has complex roots.");
        }

        // Close Scanner
        input.close();
    }
}
