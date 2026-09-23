package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class TemperatureWeightUnitConverter {

    // Conversion constants
    static final double POUNDS_TO_KILOGRAMS = 0.453592;
    static final double KILOGRAMS_TO_POUNDS = 2.20462;
    static final double GALLONS_TO_LITERS = 3.78541;
    static final double LITERS_TO_GALLONS = 0.264172;

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter liters: ");
        double liters = input.nextDouble();

        if (pounds < 0 || kilograms < 0 || gallons < 0 || liters < 0) {
            System.err.println("Weight and volume values cannot be negative.");
            input.close();
            return;
        }

        System.out.println(
            fahrenheit + " Fahrenheit = "
            + convertFahrenheitToCelsius(fahrenheit) + " Celsius"
        );

        System.out.println(
            celsius + " Celsius = "
            + convertCelsiusToFahrenheit(celsius) + " Fahrenheit"
        );

        System.out.println(
            pounds + " pounds = "
            + convertPoundsToKilograms(pounds) + " kilograms"
        );

        System.out.println(
            kilograms + " kilograms = "
            + convertKilogramsToPounds(kilograms) + " pounds"
        );

        System.out.println(
            gallons + " gallons = "
            + convertGallonsToLiters(gallons) + " liters"
        );

        System.out.println(
            liters + " liters = "
            + convertLitersToGallons(liters) + " gallons"
        );

        input.close();
    }
}