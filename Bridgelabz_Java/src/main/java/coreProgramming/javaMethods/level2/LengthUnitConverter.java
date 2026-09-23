package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class LengthUnitConverter {

    // Conversion constants
    static final double YARDS_TO_FEET = 3;
    static final double FEET_TO_YARDS = 0.333333;
    static final double METERS_TO_INCHES = 39.3701;
    static final double INCHES_TO_METERS = 0.0254;
    static final double INCHES_TO_CENTIMETERS = 2.54;

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CENTIMETERS;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        if (yards < 0 || feet < 0 || meters < 0 || inches < 0) {
            System.err.println("Values cannot be negative.");
            input.close();
            return;
        }

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");

        input.close();
    }
}