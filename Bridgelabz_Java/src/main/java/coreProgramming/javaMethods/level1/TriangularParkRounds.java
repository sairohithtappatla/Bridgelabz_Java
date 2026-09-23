package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class TriangularParkRounds {

    // Method to calculate number of rounds required
    public static double calculateRounds(double side1, double side2, double side3) {

        // Calculate perimeter in meters
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters and calculate rounds
        double distance = 5000;

        return distance / perimeter;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take triangle sides
        System.out.print("Enter side 1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = input.nextDouble();

        // Validate input
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println("Invalid side values.");
            input.close();
            return;
        }

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required: " + rounds);

        // Close Scanner
        input.close();
    }
}