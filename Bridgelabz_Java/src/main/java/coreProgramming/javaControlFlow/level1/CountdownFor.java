package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get countdown value
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        // Count down using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Close Scanner
        input.close();
    }
}
