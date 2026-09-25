package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int numberOfStudents) {

        // Create 2D array for Physics, Chemistry, and Maths
        int[][] scores =
                new int[numberOfStudents][3];

        // Generate scores for every student
        for (int i = 0; i < numberOfStudents; i++) {

            // Generate Physics score from 10 to 99
            scores[i][0] =
                    10 + (int) (Math.random() * 90);

            // Generate Chemistry score from 10 to 99
            scores[i][1] =
                    10 + (int) (Math.random() * 90);

            // Generate Maths score from 10 to 99
            scores[i][2] =
                    10 + (int) (Math.random() * 90);
        }

        // Return generated scores
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {

        // Create 2D result array
        double[][] results =
                new double[scores.length][3];

        // Process every student
        for (int i = 0; i < scores.length; i++) {

            // Calculate total marks
            int total =
                    scores[i][0]
                            + scores[i][1]
                            + scores[i][2];

            // Calculate average
            double average = total / 3.0;

            // Calculate percentage
            double percentage =
                    (total / 300.0) * 100;

            // Round average to two decimal places
            average =
                    Math.round(average * 100.0) / 100.0;

            // Round percentage to two decimal places
            percentage =
                    Math.round(percentage * 100.0) / 100.0;

            // Store total
            results[i][0] = total;

            // Store average
            results[i][1] = average;

            // Store percentage
            results[i][2] = percentage;
        }

        // Return calculated results
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(
            double[][] results) {

        // Create grade result array
        String[][] grades =
                new String[results.length][1];

        // Process every student
        for (int i = 0; i < results.length; i++) {

            // Get percentage
            double percentage = results[i][2];

            // Assign grade according to the reference table
            if (percentage >= 80) {
                grades[i][0] = "A";

            } else if (percentage >= 70) {
                grades[i][0] = "B";

            } else if (percentage >= 60) {
                grades[i][0] = "C";

            } else if (percentage >= 50) {
                grades[i][0] = "D";

            } else if (percentage >= 40) {
                grades[i][0] = "E";

            } else {
                grades[i][0] = "R";
            }
        }

        // Return grades
        return grades;
    }

    // Method to display complete student scorecard
    public static void displayScorecard(
            int[][] scores,
            double[][] results,
            String[][] grades) {

        // Display table header
        System.out.println(
                "\nStudent\tPhysics\tChemistry\tMaths"
                        + "\tTotal\tAverage\tPercentage\tGrade"
        );

        // Display separator
        System.out.println(
                "--------------------------------------------------------------------------"
        );

        // Display every student's scorecard
        for (int i = 0; i < scores.length; i++) {

            // Display student number
            System.out.print((i + 1) + "\t");

            // Display Physics score
            System.out.print(scores[i][0] + "\t");

            // Display Chemistry score
            System.out.print(scores[i][1] + "\t\t");

            // Display Maths score
            System.out.print(scores[i][2] + "\t");

            // Display total
            System.out.print((int) results[i][0] + "\t");

            // Display average
            System.out.print(results[i][1] + "\t");

            // Display percentage
            System.out.print(results[i][2] + "%\t\t");

            // Display grade
            System.out.println(grades[i][0]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate number of students
        if (numberOfStudents <= 0) {

            // Display validation message
            System.out.println(
                    "Number of students must be positive."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Generate random PCM scores
        int[][] scores =
                generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results =
                calculateResults(scores);

        // Calculate grades
        String[][] grades =
                calculateGrades(results);

        // Display complete scorecard
        displayScorecard(
                scores,
                results,
                grades
        );

        // Close Scanner
        input.close();
    }
}
