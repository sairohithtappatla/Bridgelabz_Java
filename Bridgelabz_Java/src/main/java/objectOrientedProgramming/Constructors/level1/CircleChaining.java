package objectOrientedProgramming.Constructors.level1;

public class CircleChaining {
    private double radius;

    // Default constructor delegates to parameterized constructor
    public CircleChaining() {
        this(1.0);
    }

    public CircleChaining(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
    }

    public static void main(String[] args) {
        CircleChaining defaultCircle = new CircleChaining();
        CircleChaining customCircle = new CircleChaining(5.0);

        System.out.println("Default Circle");
        defaultCircle.displayDetails();

        System.out.println("\nCustom Circle");
        customCircle.displayDetails();
    }
}