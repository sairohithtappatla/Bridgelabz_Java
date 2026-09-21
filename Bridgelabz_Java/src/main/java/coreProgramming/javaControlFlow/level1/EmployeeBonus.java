package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get salary and years of service
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus
        double bonus = 0.0;

        // Calculate 5% bonus for more than 5 years of service
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100;
        }

        // Display bonus
        System.out.println("The bonus amount is " + bonus);

        // Close Scanner
        input.close();
    }
}
