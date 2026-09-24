package coreProgramming.javaMethods.level3;

public class EmployeeBonus {

    public static double[][] generateEmployeeData() {

        final int EMPLOYEE_COUNT = 10;

        double[][] employees = new double[EMPLOYEE_COUNT][2];

        for (int i = 0; i < employees.length; i++) {

            // 5-digit salary
            employees[i][0] =
                10000 + (int) (Math.random() * 90000);

            // Years of service from 1 to 10
            employees[i][1] =
                1 + (int) (Math.random() * 10);
        }

        return employees;
    }

    public static double[][] calculateBonus(
            double[][] employees) {

        double[][] result = new double[employees.length][2];

        for (int i = 0; i < employees.length; i++) {

            double salary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }

        return result;
    }

    public static double[] calculateTotals(
            double[][] employees,
            double[][] bonusData) {

        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;

        for (int i = 0; i < employees.length; i++) {

            oldSalaryTotal += employees[i][0];
            newSalaryTotal += bonusData[i][0];
            bonusTotal += bonusData[i][1];
        }

        return new double[]{
            oldSalaryTotal,
            newSalaryTotal,
            bonusTotal
        };
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData();

        double[][] bonusData = calculateBonus(employees);

        double[] totals =
            calculateTotals(employees, bonusData);

        System.out.println(
            "Employee\tOld Salary\tYears\tBonus\tNew Salary"
        );

        for (int i = 0; i < employees.length; i++) {

            System.out.println(
                (i + 1) + "\t\t"
                + employees[i][0] + "\t"
                + employees[i][1] + "\t"
                + bonusData[i][1] + "\t"
                + bonusData[i][0]
            );
        }

        System.out.println("\nTotal Old Salary: " + totals[0]);
        System.out.println("Total New Salary: " + totals[1]);
        System.out.println("Total Bonus: " + totals[2]);
    }
}