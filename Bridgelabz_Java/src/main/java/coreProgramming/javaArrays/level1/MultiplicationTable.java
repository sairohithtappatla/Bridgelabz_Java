package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        int number = input.nextInt();

        // Create array to store multiplication results
        int[] multiplicationTable = new int[10];

        // Calculate multiplication results from 1 to 10
        for (int i = 1; i <= multiplicationTable.length; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close Scanner
        input.close();
    }
}