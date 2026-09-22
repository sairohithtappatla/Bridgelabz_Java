package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class StudentVotingAge {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create an array to store ages of 10 students
        int[] ages = new int[10];

        // Take age input for each student
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {

            // Validate age
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close Scanner
        input.close();
    }
}