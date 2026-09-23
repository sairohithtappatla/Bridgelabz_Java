package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class DivideChocolates {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(
            int numberOfChocolates, int numberOfChildren) {

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate input
        if (numberOfChocolates < 0 || numberOfChildren <= 0) {
            System.err.println("Invalid input.");
            input.close();
            return;
        }

        // Calculate distribution
        int[] result = findRemainderAndQuotient(
            numberOfChocolates,
            numberOfChildren
        );

        // Display result
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        // Close Scanner
        input.close();
    }
}