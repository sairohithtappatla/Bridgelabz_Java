package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.err.println("Invalid number of students.");
            input.close();
            return;
        }

        // Calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("Maximum number of handshakes: " + handshakes);

        // Close Scanner
        input.close();
    }
}