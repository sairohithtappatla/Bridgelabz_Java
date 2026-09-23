package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class MaximumHandshakesSimple {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.err.println("Invalid number of students.");
            input.close();
            return;
        }

        // Calculate and display handshakes
        System.out.println(
            "Number of possible handshakes: "
            + calculateHandshakes(numberOfStudents)
        );

        // Close Scanner
        input.close();
    }
}