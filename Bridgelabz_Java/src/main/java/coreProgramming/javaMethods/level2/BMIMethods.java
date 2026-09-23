package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class BMIMethods {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {

        double heightMeters = heightCm / 100;

        return weight / (heightMeters * heightMeters);
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int PERSON_COUNT = 10;

        // Column 0 = weight
        // Column 1 = height in cm
        // Column 2 = BMI
        double[][] personData = new double[PERSON_COUNT][3];

        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();

            System.out.print("Enter height in cm: ");
            double height = input.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.err.println("Invalid input.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = calculateBMI(weight, height);
        }

        System.out.println("\nBMI Details:");

        for (int i = 0; i < personData.length; i++) {

            String status = determineBMIStatus(personData[i][2]);

            System.out.println(
                "Person " + (i + 1)
                + " | Weight: " + personData[i][0] + " kg"
                + " | Height: " + personData[i][1] + " cm"
                + " | BMI: " + personData[i][2]
                + " | Status: " + status
            );
        }

        input.close();
    }
}