package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        // Check whether first number is the smallest
        boolean isSmallest = number1 <= number2 && number1 <= number3;

        // Display result
        System.out.println(
                "Is the first number the smallest? " + isSmallest
        );

        // Close Scanner
        input.close();
    }
}
