package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close Scanner
        input.close();
    }
}
