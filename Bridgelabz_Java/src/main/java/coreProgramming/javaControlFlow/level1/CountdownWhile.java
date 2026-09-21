package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get countdown value
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        // Count down using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Close Scanner
        input.close();
    }
}
