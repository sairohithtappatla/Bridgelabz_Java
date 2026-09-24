package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class EuclideanDistanceLine {

    // Method to calculate Euclidean distance
    public static double calculateDistance(
            double x1, double y1, double x2, double y2) {

        // Calculate difference in x coordinates
        double xDifference = x2 - x1;

        // Calculate difference in y coordinates
        double yDifference = y2 - y1;

        // Calculate distance using Pythagorean formula
        return Math.sqrt(
            Math.pow(xDifference, 2) +
            Math.pow(yDifference, 2)
        );
    }

    // Method to calculate line equation parameters
    public static double[] calculateLine(
            double x1, double y1, double x2, double y2) {

        // Validate vertical line
        if (x2 == x1) {
            return new double[] {Double.POSITIVE_INFINITY, x1};
        }

        // Calculate slope
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept
        double intercept = y1 - slope * x1;

        // Return slope and intercept
        return new double[] {slope, intercept};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Get second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Calculate line parameters
        double[] line = calculateLine(x1, y1, x2, y2);

        // Display distance
        System.out.println("Euclidean Distance: " + distance);

        // Display line equation
        if (Double.isInfinite(line[0])) {

            // Display vertical line
            System.out.println("Line Equation: x = " + line[1]);

        } else {

            // Display normal line
            System.out.println(
                "Line Equation: y = " + line[0] + "x + " + line[1]
            );
        }

        // Close Scanner
        input.close();
    }
}