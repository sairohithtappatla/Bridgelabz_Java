package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class TwoDArraySum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Validate rows and columns
        if (rows <= 0 || columns <= 0) {
            System.err.println("Invalid row or column size.");
            input.close();
            return;
        }

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for matrix elements
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Calculate sum and display matrix
        int sum = 0;

        System.out.println("The matrix is:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        // Display sum
        System.out.println("Sum of all elements: " + sum);

        // Close Scanner
        input.close();
    }
}