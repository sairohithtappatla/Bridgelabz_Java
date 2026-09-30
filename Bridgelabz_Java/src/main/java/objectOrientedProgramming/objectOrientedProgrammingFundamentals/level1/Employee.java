package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level1;

import java.util.Scanner;

public class Employee {

    // Instance variables store individual employee details
    private String name;
    private int id;
    private double salary;

    // Class variable shared by all Employee objects
    private static int employeeCount = 0;

    // Constructor to initialize employee attributes
    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
        employeeCount++;
    }

    // Getter method to return employee name
    public String getName() {
        return name;
    }

    // Setter method to update employee name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    // Getter method to return employee ID
    public int getId() {
        return id;
    }

    // Setter method to update employee ID
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        this.id = id;
    }

    // Getter method to return employee salary
    public double getSalary() {
        return salary;
    }

    // Setter method to update employee salary
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    // Static method to return the number of Employee objects created
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.printf("Salary: %.2f%n", salary);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get employee details
            System.out.print("Enter employee name: ");
            String name = input.nextLine();

            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(input.nextLine());

            System.out.print("Enter employee salary: ");
            double salary = Double.parseDouble(input.nextLine());

            // Create an Employee object using the constructor
            Employee employee = new Employee(name, id, salary);

            // Display employee details
            System.out.println("\nEmployee Details");
            employee.displayDetails();

            // Display shared class variable
            System.out.println("Total Employee Objects: " + getEmployeeCount());
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}