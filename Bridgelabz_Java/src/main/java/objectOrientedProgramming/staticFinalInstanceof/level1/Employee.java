package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void displayIfEmployee(Object object) {
        if (object instanceof Employee) {
            Employee employee = (Employee) object;
            employee.displayDetails();
        } else {
            System.out.println("The object is not an Employee.");
        }
    }

    public static void main(String[] args) {
        Employee first = new Employee("Rohith", 101, "Developer");
        Employee second = new Employee("Sai", 102, "Tester");

        displayIfEmployee(first);
        System.out.println();
        Employee.displayTotalEmployees();

        System.out.println("\nChecking a different object:");
        displayIfEmployee("Employee");
    }
}