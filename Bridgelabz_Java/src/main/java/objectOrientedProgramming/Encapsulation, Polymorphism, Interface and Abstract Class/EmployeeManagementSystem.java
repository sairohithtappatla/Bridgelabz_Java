import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Calculated Salary: ₹" + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String department);

    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(
            int employeeId,
            String name,
            double baseSalary) {

        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(
            int employeeId,
            String name,
            double baseSalary,
            int hoursWorked,
            double hourlyRate) {

        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        FullTimeEmployee fullTime =
            new FullTimeEmployee(101, "Rohith", 60000);

        PartTimeEmployee partTime =
            new PartTimeEmployee(102, "Arjun", 0, 80, 500);

        fullTime.assignDepartment("Engineering");
        partTime.assignDepartment("Support");

        List<Employee> employees = new ArrayList<>();

        employees.add(fullTime);
        employees.add(partTime);

        for (Employee employee : employees) {
            employee.displayDetails();

            if (employee instanceof Department) {
                Department department = (Department) employee;
                System.out.println(
                    "Department: " +
                    department.getDepartmentDetails()
                );
            }

            System.out.println("--------------------");
        }
    }
}