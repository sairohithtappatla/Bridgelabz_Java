package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether number is divisible by 5
        boolean isDivisible = number % 5 == 0;

        // Display result
        System.out.print("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close Scanner
        input.close();
    }
}
