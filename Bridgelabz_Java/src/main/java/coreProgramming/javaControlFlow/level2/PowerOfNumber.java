package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number and power
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result
        int result = 1;

        // Calculate power using loop
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        // Display result
        System.out.println(number + " raised to the power " + power + " = " + result);

        // Close Scanner
        input.close();
    }
}