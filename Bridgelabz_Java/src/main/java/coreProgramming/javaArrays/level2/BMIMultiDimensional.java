package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Validate number of persons
        if (number <= 0) {
            System.err.println("Invalid number of persons.");
            input.close();
            return;
        }

        // Store weight, height and BMI
        double[][] personData = new double[number][3];

        // Store weight status
        String[] weightStatus = new String[number];

        // Take input and calculate BMI
        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = input.nextDouble();

            // Validate input
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate and store BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details
        System.out.println("\nBMI Details:");

        for (int i = 0; i < personData.length; i++) {
            System.out.println(
                "Person " + (i + 1)
                + " | Weight: " + personData[i][0] + " kg"
                + " | Height: " + personData[i][1] + " m"
                + " | BMI: " + personData[i][2]
                + " | Status: " + weightStatus[i]
            );
        }

        // Close Scanner
        input.close();
    }
}