package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class StudentMarks {
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

        // Create arrays for marks, percentage and grade
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Take marks for each student
        for (int i = 0; i < number; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physics[i] = input.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Enter Maths marks: ");
            maths[i] = input.nextDouble();

            // Validate marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0
                    || physics[i] > 100 || chemistry[i] > 100 || maths[i] > 100) {

                System.out.println("Invalid marks. Enter values from 0 to 100.");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3;

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

        // Display student details
        System.out.println("\nStudent Results:");

        for (int i = 0; i < number; i++) {
            System.out.println(
                "Student " + (i + 1)
                + " | Physics: " + physics[i]
                + " | Chemistry: " + chemistry[i]
                + " | Maths: " + maths[i]
                + " | Percentage: " + percentage[i]
                + " | Grade: " + grade[i]
            );
        }

        // Close Scanner
        input.close();
    }
}