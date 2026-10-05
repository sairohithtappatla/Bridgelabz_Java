package objectOrientedProgramming.Constructors.level2;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(501, "Engineering", 50000.0);
        employee.setSalary(55000.0);
        employee.displayDetails();

        System.out.println("\nManager Details");
        Manager manager = new Manager(601, "Operations", 75000.0, 5);
        manager.displayManagerDetails();
    }
}