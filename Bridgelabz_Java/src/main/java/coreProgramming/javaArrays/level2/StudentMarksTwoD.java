package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class StudentMarksTwoD {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // Validate number of students
        if (number <= 0) {
            System.err.println("Invalid number of students.");
            input.close();
            return;
        }

        // Create 2D array for Physics, Chemistry and Maths
        double[][] marks = new double[number][3];

        // Create arrays for percentage and grade
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Take marks input
        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = input.nextDouble();

            // Validate marks
            if (marks[i][0] < 0 || marks[i][0] > 100
                    || marks[i][1] < 0 || marks[i][1] > 100
                    || marks[i][2] < 0 || marks[i][2] > 100) {

                System.out.println("Invalid marks. Enter values from 0 to 100.");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < marks.length; i++) {

            double total = 0;

            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / marks[i].length;

            // Assign grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nStudent Results:");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                "Student " + (i + 1)
                + " | Physics: " + marks[i][0]
                + " | Chemistry: " + marks[i][1]
                + " | Maths: " + marks[i][2]
                + " | Percentage: " + percentage[i]
                + " | Grade: " + grade[i]
            );
        }

        // Close Scanner
        input.close();
    }
}