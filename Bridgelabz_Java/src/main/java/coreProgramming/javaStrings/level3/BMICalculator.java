package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for every person
    public static String[][] calculateBMI(double[][] people) {

        // Create a 2D String array for height, weight, BMI and status
        String[][] result = new String[people.length][4];

        // Process every person
        for (int i = 0; i < people.length; i++) {

            // Get weight in kilograms
            double weight = people[i][0];

            // Get height in centimeters
            double heightInCentimeters = people[i][1];

            // Convert height from centimeters to meters
            double heightInMeters = heightInCentimeters / 100.0;

            // Calculate BMI
            double bmi =
                    weight / (heightInMeters * heightInMeters);

            // Determine BMI status
            String status;

            // Check underweight condition
            if (bmi < 18.5) {
                status = "Underweight";

            // Check normal weight condition
            } else if (bmi < 25) {
                status = "Normal";

            // Check overweight condition
            } else if (bmi < 30) {
                status = "Overweight";

            // Remaining values are obese
            } else {
                status = "Obese";
            }

            // Store height
            result[i][0] =
                    String.format("%.2f", heightInCentimeters);

            // Store weight
            result[i][1] =
                    String.format("%.2f", weight);

            // Store BMI
            result[i][2] =
                    String.format("%.2f", bmi);

            // Store status
            result[i][3] = status;
        }

        // Return the complete BMI result
        return result;
    }

    // Method to create the final BMI table
    public static String[][] createBMITable(double[][] people) {

        // Call the user-defined BMI method
        String[][] bmiResult = calculateBMI(people);

        // Create a result table
        String[][] table =
                new String[people.length][4];

        // Copy all BMI results into the table
        for (int i = 0; i < people.length; i++) {

            // Store height
            table[i][0] = bmiResult[i][0];

            // Store weight
            table[i][1] = bmiResult[i][1];

            // Store BMI
            table[i][2] = bmiResult[i][2];

            // Store status
            table[i][3] = bmiResult[i][3];
        }

        // Return the table
        return table;
    }

    // Method to display BMI results in tabular format
    public static void displayTable(String[][] table) {

        // Display table header
        System.out.println(
                "\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus"
        );

        // Display separator
        System.out.println(
                "--------------------------------------------------------"
        );

        // Display every person's BMI information
        for (int i = 0; i < table.length; i++) {

            // Display person number
            System.out.print((i + 1) + "\t");

            // Display height
            System.out.print(table[i][0] + "\t\t");

            // Display weight
            System.out.print(table[i][1] + "\t\t");

            // Display BMI
            System.out.print(table[i][2] + "\t");

            // Display status
            System.out.println(table[i][3]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create a 2D array for 10 people
        double[][] people = new double[10][2];

        // Take input for every person
        for (int i = 0; i < people.length; i++) {

            // Display person number
            System.out.println("\nPerson " + (i + 1));

            // Take weight input
            System.out.print("Enter weight in kg: ");
            people[i][0] = input.nextDouble();

            // Take height input
            System.out.print("Enter height in cm: ");
            people[i][1] = input.nextDouble();

            // Validate weight
            if (people[i][0] <= 0) {
                System.out.println(
                        "Weight must be positive."
                );
                i--;
                continue;
            }

            // Validate height
            if (people[i][1] <= 0) {
                System.out.println(
                        "Height must be positive."
                );
                i--;
            }
        }

        // Create BMI table
        String[][] table = createBMITable(people);

        // Display BMI table
        displayTable(table);

        // Close Scanner
        input.close();
    }
}
