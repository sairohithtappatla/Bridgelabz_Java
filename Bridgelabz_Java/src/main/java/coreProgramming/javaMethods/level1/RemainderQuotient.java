package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class RemainderQuotient {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Validate divisor
        if (divisor == 0) {
            System.err.println("Divisor cannot be zero.");
            input.close();
            return;
        }

        // Calculate quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);

        // Close Scanner
        input.close();
    }
}