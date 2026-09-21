package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class MultiplesBelow100 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Find multiples below 100
        for (int i = number; i < 100; i += number) {

            // Display multiple
            System.out.println(i);
        }

        // Close Scanner
        input.close();
    }
}