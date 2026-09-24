package coreProgramming.javaMethods.level3;

public class MatrixOperations {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int columns) {

        // Create matrix
        double[][] matrix = new double[rows][columns];

        // Generate random values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                // Generate value from 1 to 9
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        // Return matrix
        return matrix;
    }

    // Method to add two matrices
    public static double[][] add(
            double[][] first,
            double[][] second) {

        // Create result matrix
        double[][] result =
            new double[first.length][first[0].length];

        // Add corresponding elements
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        // Return result
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtract(
            double[][] first,
            double[][] second) {

        // Create result matrix
        double[][] result =
            new double[first.length][first[0].length];

        // Subtract corresponding elements
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }

        // Return result
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiply(
            double[][] first,
            double[][] second) {

        // Create result matrix
        double[][] result =
            new double[first.length][second[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {

                    // Add multiplication result
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Return result
        return result;
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {

        // Create transposed matrix
        double[][] result =
            new double[matrix[0].length][matrix.length];

        // Swap rows and columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        // Return transpose
        return result;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {

        // Apply determinant formula
        return matrix[0][0] * matrix[1][1]
             - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] matrix) {

        // Apply 3x3 determinant formula
        return matrix[0][0] *
                    (matrix[1][1] * matrix[2][2]
                   - matrix[1][2] * matrix[2][1])
             - matrix[0][1] *
                    (matrix[1][0] * matrix[2][2]
                   - matrix[1][2] * matrix[2][0])
             + matrix[0][2] *
                    (matrix[1][0] * matrix[2][1]
                   - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {

        // Calculate determinant
        double determinant = determinant2x2(matrix);

        // Return null for singular matrix
        if (determinant == 0) {
            return null;
        }

        // Create inverse matrix
        double[][] inverse = new double[2][2];

        // Apply inverse formula
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        // Return inverse
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {

        // Display every row
        for (int i = 0; i < matrix.length; i++) {

            // Display every element
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8.2f", matrix[i][j]);
            }

            // Move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create two random 2x2 matrices
        double[][] first = createRandomMatrix(2, 2);
        double[][] second = createRandomMatrix(2, 2);

        // Display first matrix
        System.out.println("First Matrix:");
        displayMatrix(first);

        // Display second matrix
        System.out.println("\nSecond Matrix:");
        displayMatrix(second);

        // Add matrices
        System.out.println("\nAddition:");
        displayMatrix(add(first, second));

        // Subtract matrices
        System.out.println("\nSubtraction:");
        displayMatrix(subtract(first, second));

        // Multiply matrices
        System.out.println("\nMultiplication:");
        displayMatrix(multiply(first, second));

        // Display transpose
        System.out.println("\nTranspose of First Matrix:");
        displayMatrix(transpose(first));

        // Find determinant
        double determinant = determinant2x2(first);

        // Display determinant
        System.out.println("\nDeterminant of First Matrix: " + determinant);

        // Find inverse
        double[][] inverse = inverse2x2(first);

        // Display inverse when available
        if (inverse != null) {
            System.out.println("\nInverse of First Matrix:");
            displayMatrix(inverse);
        } else {
            System.out.println("\nFirst Matrix has no inverse.");
        }
    }
}