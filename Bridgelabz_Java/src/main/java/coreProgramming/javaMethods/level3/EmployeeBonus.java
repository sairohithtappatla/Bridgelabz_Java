package coreProgramming.javaMethods.level3;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData() {

        // Create 2D array for salary and service years
        double[][] employees = new double[10][2];

        // Generate data for each employee
        for (int i = 0; i < employees.length; i++) {

            // Generate five-digit salary
            employees[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generate years of service from 1 to 10
            employees[i][1] = (int) (Math.random() * 10) + 1;
        }

        // Return employee data
        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employees) {

        // Create result array for new salary and bonus
        double[][] result = new double[employees.length][2];

        // Process every employee
        for (int i = 0; i < employees.length; i++) {

            // Get old salary
            double salary = employees[i][0];

            // Get years of service
            double years = employees[i][1];

            // Determine bonus percentage
            double bonusRate = years > 5 ? 0.05 : 0.02;

            // Calculate bonus
            double bonus = salary * bonusRate;

            // Calculate new salary
            double newSalary = salary + bonus;

            // Store new salary
            result[i][0] = newSalary;

            // Store bonus
            result[i][1] = bonus;
        }

        // Return calculated data
        return result;
    }

    // Method to display salary and bonus summary
    public static void displaySummary(
            double[][] employees,
            double[][] result) {

        // Initialize totals
        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;

        // Display table heading
        System.out.println(
            "\nEmployee\tOld Salary\tYears\tNew Salary\tBonus"
        );

        // Display employee details
        for (int i = 0; i < employees.length; i++) {

            // Add old salary
            oldSalaryTotal += employees[i][0];

            // Add new salary
            newSalaryTotal += result[i][0];

            // Add bonus
            bonusTotal += result[i][1];

            // Display employee row
            System.out.printf(
                "%d\t\t%.2f\t\t%.0f\t%.2f\t\t%.2f%n",
                i + 1,
                employees[i][0],
                employees[i][1],
                result[i][0],
                result[i][1]
            );
        }

        // Display totals
        System.out.println("\nTotal Old Salary: " + oldSalaryTotal);
        System.out.println("Total New Salary: " + newSalaryTotal);
        System.out.println("Total Bonus: " + bonusTotal);
    }

    public static void main(String[] args) {

        // Generate employee data
        double[][] employees = generateEmployeeData();

        // Calculate bonus and new salary
        double[][] result = calculateBonus(employees);

        // Display summary
        displaySummary(employees, result);
    }
}