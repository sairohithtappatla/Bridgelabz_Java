package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        // Validate input
        if (principal < 0 || rate < 0 || time < 0) {
            System.err.println("Invalid input.");
            input.close();
            return;
        }

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println(
            "The Simple Interest is " + simpleInterest
            + " for Principal " + principal
            + ", Rate of Interest " + rate
            + " and Time " + time
        );

        // Close Scanner
        input.close();
    }
}