package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random 2-digit ages for students
    public static int[] generateAges(int numberOfStudents) {

        // Create an array to store student ages
        int[] ages = new int[numberOfStudents];

        // Generate an age for every student
        for (int i = 0; i < numberOfStudents; i++) {

            // Generate a random 2-digit age from 10 to 99
            ages[i] = 10 + (int) (Math.random() * 90);
        }

        // Return generated ages
        return ages;
    }

    // Method to check voting eligibility for every student
    public static String[][] checkVotingEligibility(int[] ages) {

        // Create a 2D array for age and eligibility
        String[][] result = new String[ages.length][2];

        // Process every student's age
        for (int i = 0; i < ages.length; i++) {

            // Store age as String
            result[i][0] = String.valueOf(ages[i]);

            // Validate negative age
            if (ages[i] < 0) {

                // Negative age cannot vote
                result[i][1] = "false";

            // Check whether age is 18 or above
            } else if (ages[i] >= 18) {

                // Student can vote
                result[i][1] = "true";

            } else {

                // Student cannot vote
                result[i][1] = "false";
            }
        }

        // Return the eligibility table
        return result;
    }

    // Method to display voting eligibility table
    public static void displayTable(String[][] table) {

        // Display table header
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("------------------------");

        // Display each student's details
        for (int i = 0; i < table.length; i++) {

            // Display student number, age, and eligibility
            System.out.println(
                    (i + 1)
                            + "\t"
                            + table[i][0]
                            + "\t"
                            + table[i][1]
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students as input
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

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] result =
                checkVotingEligibility(ages);

        // Display the result
        displayTable(result);

        // Close Scanner
        input.close();
    }
}
