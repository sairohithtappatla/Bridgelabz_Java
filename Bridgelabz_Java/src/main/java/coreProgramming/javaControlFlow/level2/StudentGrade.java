package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get marks for three subjects
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        // Calculate total marks
        double totalMarks = physics + chemistry + maths;

        // Calculate average percentage
        double averageMark = totalMarks / 3;

        // Declare grade and remarks
        char grade;
        String remarks;

        // Determine grade and remarks
        if (averageMark >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";

        } else if (averageMark >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";

        } else if (averageMark >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";

        } else if (averageMark >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";

        } else if (averageMark >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";

        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display result
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close Scanner
        input.close();
    }
}