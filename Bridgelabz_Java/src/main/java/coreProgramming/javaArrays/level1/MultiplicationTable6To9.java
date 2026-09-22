package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        int number = input.nextInt();

        // Create array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display multiplication results
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        // Close Scanner
        input.close();
    }
}