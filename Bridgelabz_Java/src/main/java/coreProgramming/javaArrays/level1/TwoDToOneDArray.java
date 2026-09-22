package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get rows and columns
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Validate dimensions
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid rows or columns.");
            input.close();
            return;
        }

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create 1D array with rows multiplied by columns
        int[] array = new int[rows * columns];

        // Initialize 1D array index
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("1D Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Close Scanner
        input.close();
    }
}