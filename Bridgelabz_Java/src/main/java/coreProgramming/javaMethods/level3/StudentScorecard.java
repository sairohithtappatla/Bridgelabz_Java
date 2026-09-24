package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random PCM scores
    public static double[][] generateScores(int numberOfStudents) {

        // Create 2D array for PCM marks
        double[][] scores = new double[numberOfStudents][3];

        // Generate scores for every student
        for (int i = 0; i < numberOfStudents; i++) {

            // Generate Physics score
            scores[i][0] = (int) (Math.random() * 90) + 10;

            // Generate Chemistry score
            scores[i][1] = (int) (Math.random() * 90) + 10;

            // Generate Maths score
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        // Return score array
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(double[][] scores) {

        // Create result array
        double[][] results = new double[scores.length][3];

        // Process every student
        for (int i = 0; i < scores.length; i++) {

            // Calculate total
            double total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculate average
            double average = total / 3;

            // Calculate percentage
            double percentage = total / 300 * 100;

            // Round average
            average = Math.round(average * 100.0) / 100.0;

            // Round percentage
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Store total
            results[i][0] = total;

            // Store average
            results[i][1] = average;

            // Store percentage
            results[i][2] = percentage;
        }

        // Return results
        return results;
    }

    // Method to display student scorecard
    public static void displayScorecard(
            double[][] scores,
            double[][] results) {

        // Display table heading
        System.out.println(
            "\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage"
        );

        // Display each student's details
        for (int i = 0; i < scores.length; i++) {

            // Display student row
            System.out.printf(
                "%d\t%.0f\t%.0f\t\t%.0f\t%.0f\t%.2f\t%.2f%%%n",
                i + 1,
                scores[i][0],
                scores[i][1],
                scores[i][2],
                results[i][0],
                results[i][1],
                results[i][2]
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate student count
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be positive.");
            input.close();
            return;
        }

        // Generate random scores
        double[][] scores = generateScores(numberOfStudents);

        // Calculate student results
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScorecard(scores, results);

        // Close Scanner
        input.close();
    }
}