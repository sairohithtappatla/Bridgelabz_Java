package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Number of employees
        final int EMPLOYEE_COUNT = 10;

        // Create arrays for salary, years of service, bonus and new salary
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        // Take input for employees
        for (int i = 0; i < salary.length; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            double currentSalary = input.nextDouble();

            System.out.print("Enter years of service: ");
            double service = input.nextDouble();

            // Validate input
            if (currentSalary <= 0 || service < 0) {
                System.out.println("Invalid input. Please enter valid values.");
                i--;
                continue;
            }

            salary[i] = currentSalary;
            yearsOfService[i] = service;
        }

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Calculate bonus and new salary
        for (int i = 0; i < salary.length; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display employee details
        System.out.println("\nEmployee Details:");

        for (int i = 0; i < salary.length; i++) {
            System.out.println(
                "Employee " + (i + 1)
                + " | Old Salary: " + salary[i]
                + " | Bonus: " + bonus[i]
                + " | New Salary: " + newSalary[i]
            );
        }

        // Display totals
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close Scanner
        input.close();
    }
}