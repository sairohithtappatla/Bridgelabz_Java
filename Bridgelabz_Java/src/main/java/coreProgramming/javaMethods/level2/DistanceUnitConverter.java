package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class DistanceUnitConverter {

    // Conversion constants
    static final double KM_TO_MILES = 0.621371;
    static final double MILES_TO_KM = 1.60934;

    // Method to convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {

        // Perform conversion
        return kilometers * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double milesToKilometers(double miles) {

        // Perform conversion
        return miles * MILES_TO_KM;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display conversion options
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");

        // Get conversion choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Get distance from the user
        System.out.print("Enter distance: ");
        double distance = input.nextDouble();

        // Validate the distance
        if (distance < 0) {
            System.out.println("Distance cannot be negative.");
            input.close();
            return;
        }

        // Perform selected conversion
        if (choice == 1) {

            // Convert kilometers to miles
            double result = kilometersToMiles(distance);

            // Display result
            System.out.println("Distance in miles: " + result);

        } else if (choice == 2) {

            // Convert miles to kilometers
            double result = milesToKilometers(distance);

            // Display result
            System.out.println("Distance in kilometers: " + result);

        } else {

            // Handle invalid choice
            System.out.println("Invalid choice.");
        }

        // Close Scanner
        input.close();
    }
}
