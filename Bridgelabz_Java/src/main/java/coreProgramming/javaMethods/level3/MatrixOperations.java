package coreProgramming.javaMethods.level3;

public class MatrixOperations {

    public static double[][] createRandomMatrix(
            int rows, int columns) {

        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] =
                    1 + (int) (Math.random() * 9);
            }
        }

        return matrix;
    }

    public static double[][] addMatrices(
            double[][] first, double[][] second) {

        double[][] result =
            new double[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] =
                    first[i][j] + second[i][j];
            }
        }

        return result;
    }

    public static double[][] subtractMatrices(
            double[][] first, double[][] second) {

        double[][] result =
            new double[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] =
                    first[i][j] - second[i][j];
            }
        }

        return result;
    }

    public static double[][] multiplyMatrices(
            double[][] first, double[][] second) {

        double[][] result =
            new double[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] +=
                        first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    public static double[][] transpose(double[][] matrix) {

        double[][] result =
            new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static double determinant2x2(double[][] matrix) {

        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {

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

    public static double[][] inverse2x2(double[][] matrix) {

        double determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {

        double determinant = determinant3x3(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] =
            (matrix[1][1] * matrix[2][2]
            - matrix[1][2] * matrix[2][1]) / determinant;

        inverse[0][1] =
            (matrix[0][2] * matrix[2][1]
            - matrix[0][1] * matrix[2][2]) / determinant;

        inverse[0][2] =
            (matrix[0][1] * matrix[1][2]
            - matrix[0][2] * matrix[1][1]) / determinant;

        inverse[1][0] =
            (matrix[1][2] * matrix[2][0]
            - matrix[1][0] * matrix[2][2]) / determinant;

        inverse[1][1] =
            (matrix[0][0] * matrix[2][2]
            - matrix[0][2] * matrix[2][0]) / determinant;

        inverse[1][2] =
            (matrix[0][2] * matrix[1][0]
            - matrix[0][0] * matrix[1][2]) / determinant;

        inverse[2][0] =
            (matrix[1][0] * matrix[2][1]
            - matrix[1][1] * matrix[2][0]) / determinant;

        inverse[2][1] =
            (matrix[0][1] * matrix[2][0]
            - matrix[0][0] * matrix[2][1]) / determinant;

        inverse[2][2] =
            (matrix[0][0] * matrix[1][1]
            - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {

        if (matrix == null) {
            System.out.println("Matrix is not invertible.");
            return;
        }

        for (double[] row : matrix) {

            for (double value : row) {
                System.out.printf("%8.2f", value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] first = createRandomMatrix(3, 3);
        double[][] second = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(first);

        System.out.println("\nMatrix B:");
        displayMatrix(second);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(first, second));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(first, second));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(first, second));

        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(first));

        System.out.println("\nDeterminant of A:");
        System.out.println(determinant3x3(first));

        System.out.println("\nInverse of A:");
        displayMatrix(inverse3x3(first));

        double[][] matrix2x2 = {
            {4, 7},
            {2, 6}
        };

        System.out.println("\n2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\n2x2 Determinant:");
        System.out.println(determinant2x2(matrix2x2));

        System.out.println("\n2x2 Inverse:");
        displayMatrix(inverse2x2(matrix2x2));
    }
}