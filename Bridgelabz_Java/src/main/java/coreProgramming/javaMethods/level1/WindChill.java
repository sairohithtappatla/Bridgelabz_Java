package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class WindChill {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(
            double temperature, double windSpeed) {

        return 35.74
                + (0.6215 * temperature)
                + ((0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take temperature and wind speed
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        // Validate input
        if (windSpeed < 0) {
            System.err.println("Wind speed cannot be negative.");
            input.close();
            return;
        }

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature: " + windChill);

        // Close Scanner
        input.close();
    }
}