package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level2;

import java.util.Scanner;

public class Student {

    // Instance variables store individual student information
    private String name;
    private int rollNumber;
    private double marks;

    // Class variable shared by all Student objects
    private static int studentCount = 0;

    // Constructor to initialize student attributes
    public Student(String name, int rollNumber, double marks) {
        setName(name);
        setRollNumber(rollNumber);
        setMarks(marks);
        studentCount++;
    }

    // Getter method to return student name
    public String getName() {
        return name;
    }

    // Setter method to update student name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    // Getter method to return roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter method to update roll number
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("Roll number must be positive.");
        }
        this.rollNumber = rollNumber;
    }

    // Getter method to return marks
    public double getMarks() {
        return marks;
    }

    // Setter method to update marks
    public void setMarks(double marks) {
        if (marks < 0 || marks > 100 || Double.isNaN(marks)) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    // Method to calculate grade using defined score ranges
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Static method to return the number of Student objects created
    public static int getStudentCount() {
        return studentCount;
    }

    // Method to display student report
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.2f%n", marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get student details
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = Integer.parseInt(input.nextLine());

            System.out.print("Enter marks out of 100: ");
            double marks = Double.parseDouble(input.nextLine());

            // Create Student object
            Student student = new Student(name, rollNumber, marks);

            // Display student report
            System.out.println("\nStudent Report");
            student.displayDetails();

            // Display shared class variable
            System.out.println("Total Student Objects: " + getStudentCount());
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}