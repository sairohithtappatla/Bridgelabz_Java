package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class LengthUnitConverter {

    // Conversion constants
    static final double METER_TO_FEET = 3.28084;
    static final double FEET_TO_METER = 0.3048;
    static final double INCH_TO_CM = 2.54;
    static final double CM_TO_INCH = 0.393701;

    // Method to convert meters to feet
    public static double meterToFeet(double meter) {

        // Perform conversion
        return meter * METER_TO_FEET;
    }

    // Method to convert feet to meters
    public static double feetToMeter(double feet) {

        // Perform conversion
        return feet * FEET_TO_METER;
    }

    // Method to convert inches to centimeters
    public static double inchToCentimeter(double inch) {

        // Perform conversion
        return inch * INCH_TO_CM;
    }

    // Method to convert centimeters to inches
    public static double centimeterToInch(double centimeter) {

        // Perform conversion
        return centimeter * CM_TO_INCH;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display conversion options
        System.out.println("1. Meter to Feet");
        System.out.println("2. Feet to Meter");
        System.out.println("3. Inch to Centimeter");
        System.out.println("4. Centimeter to Inch");

        // Get conversion choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Get value from the user
        System.out.print("Enter value: ");
        double value = input.nextDouble();

        // Validate the value
        if (value < 0) {
            System.out.println("Value cannot be negative.");
            input.close();
            return;
        }

        // Perform selected conversion
        switch (choice) {

            case 1:
                // Convert meter to feet
                System.out.println("Result: " + meterToFeet(value));
                break;

            case 2:
                // Convert feet to meter
                System.out.println("Result: " + feetToMeter(value));
                break;

            case 3:
                // Convert inch to centimeter
                System.out.println("Result: " + inchToCentimeter(value));
                break;

            case 4:
                // Convert centimeter to inch
                System.out.println("Result: " + centimeterToInch(value));
                break;

            default:
                // Handle invalid choice
                System.out.println("Invalid choice.");
        }

        // Close Scanner
        input.close();
    }
}
