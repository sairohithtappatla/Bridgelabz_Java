package objectOrientedProgramming.Constructors.level2;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary,
                   int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = Math.max(teamSize, 0);
    }

    public void displayManagerDetails() {
        // Public employeeID and protected department are accessible here.
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}