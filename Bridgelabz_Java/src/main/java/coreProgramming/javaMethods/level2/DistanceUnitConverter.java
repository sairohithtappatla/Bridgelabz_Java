package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class DistanceUnitConverter {

    // Conversion constants
    static final double KM_TO_MILES = 0.621371;
    static final double MILES_TO_KM = 1.60934;
    static final double METERS_TO_FEET = 3.28084;
    static final double FEET_TO_METERS = 0.3048;

    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = input.nextDouble();

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        System.out.print("Enter meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        if (km < 0 || miles < 0 || meters < 0 || feet < 0) {
            System.err.println("Values cannot be negative.");
            input.close();
            return;
        }

        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

        input.close();
    }
}