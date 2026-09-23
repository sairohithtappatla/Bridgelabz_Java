package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public static boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int STUDENT_COUNT = 10;
        int[] ages = new int[STUDENT_COUNT];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}