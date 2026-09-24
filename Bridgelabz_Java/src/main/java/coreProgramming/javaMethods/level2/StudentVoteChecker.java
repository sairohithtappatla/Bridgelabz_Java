package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public static boolean isEligibleToVote(int age) {

        // Return true when age is at least 18
        return age >= 18;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get student's age
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Validate the age
        if (age < 0) {
            System.out.println("Invalid age.");
            input.close();
            return;
        }

        // Check voting eligibility
        boolean eligible = isEligibleToVote(age);

        // Display the result
        if (eligible) {
            System.out.println("Student is eligible to vote.");
        } else {
            System.out.println("Student is not eligible to vote.");
        }

        // Close Scanner
        input.close();
    }
}
