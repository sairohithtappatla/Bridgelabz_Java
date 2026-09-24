package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class TemperatureWeightUnitConverter {

    // Conversion constants
    static final double POUND_TO_KG = 0.453592;
    static final double KG_TO_POUND = 2.20462;

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {

        // Perform conversion
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {

        // Perform conversion
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert pounds to kilograms
    public static double poundsToKilograms(double pounds) {

        // Perform conversion
        return pounds * POUND_TO_KG;
    }

    // Method to convert kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {

        // Perform conversion
        return kilograms * KG_TO_POUND;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display conversion options
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");

        // Get conversion choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Get value from the user
        System.out.print("Enter value: ");
        double value = input.nextDouble();

        // Validate the weight value
        if ((choice == 3 || choice == 4) && value < 0) {
            System.out.println("Weight cannot be negative.");
            input.close();
            return;
        }

        // Perform selected conversion
        switch (choice) {

            case 1:
                // Convert Celsius to Fahrenheit
                System.out.println("Result: " + celsiusToFahrenheit(value));
                break;

            case 2:
                // Convert Fahrenheit to Celsius
                System.out.println("Result: " + fahrenheitToCelsius(value));
                break;

            case 3:
                // Convert pounds to kilograms
                System.out.println("Result: " + poundsToKilograms(value));
                break;

            case 4:
                // Convert kilograms to pounds
                System.out.println("Result: " + kilogramsToPounds(value));
                break;

            default:
                // Handle invalid choice
                System.out.println("Invalid choice.");
        }

        // Close Scanner
        input.close();
    }
}
