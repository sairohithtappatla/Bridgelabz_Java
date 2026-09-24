package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slopes
    public static boolean areCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Calculate first slope
        double slopeAB = (y2 - y1) / (x2 - x1);

        // Calculate second slope
        double slopeBC = (y3 - y2) / (x3 - x2);

        // Calculate third slope
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Compare slopes
        return Double.compare(slopeAB, slopeBC) == 0 &&
               Double.compare(slopeBC, slopeAC) == 0;
    }

    // Method to check collinearity using triangle area
    public static boolean areCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Calculate area of triangle
        double area = 0.5 * (
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        );

        // Points are collinear when area is zero
        return Math.abs(area) < 0.000001;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get point A
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Get point B
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Get point C
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check using slope method
        boolean slopeResult = areCollinearBySlope(
            x1, y1, x2, y2, x3, y3
        );

        // Check using area method
        boolean areaResult = areCollinearByArea(
            x1, y1, x2, y2, x3, y3
        );

        // Display results
        System.out.println("Collinear using slope: " + slopeResult);
        System.out.println("Collinear using area: " + areaResult);

        // Close Scanner
        input.close();
    }
}