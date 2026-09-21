package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get age from user
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println(
                    "The person's age is " + age + " and can vote."
            );
        } else {
            System.out.println(
                    "The person's age is " + age + " and cannot vote."
            );
        }

        // Close Scanner
        input.close();
    }
}
