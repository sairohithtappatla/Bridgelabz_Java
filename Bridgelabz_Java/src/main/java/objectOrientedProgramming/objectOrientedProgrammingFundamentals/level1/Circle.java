package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level1;

import java.util.Scanner;

public class Circle {

    // Constant for the value of pi
    private static final double PI = Math.PI;

    // Instance variable to store the circle radius
    private double radius;

    // Constructor to initialize circle radius
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter method to return radius
    public double getRadius() {
        return radius;
    }

    // Setter method to update radius
    public void setRadius(double radius) {
        if (radius <= 0 || Double.isNaN(radius) || Double.isInfinite(radius)) {
            throw new IllegalArgumentException("Radius must be a positive finite number.");
        }
        this.radius = radius;
    }

    // Method to calculate circle area
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Method to calculate circle circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Method to display circle calculations
    public void displayDetails() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get circle radius
            System.out.print("Enter circle radius: ");
            double radius = Double.parseDouble(input.nextLine());

            // Create Circle object
            Circle circle = new Circle(radius);

            // Display area and circumference
            System.out.println("\nCircle Details");
            circle.displayDetails();
        } catch (IllegalArgumentException exception) {
            // Display invalid input message
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}