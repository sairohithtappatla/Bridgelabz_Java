class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(
            String name,
            int id,
            double salary,
            String programmingLanguage) {

        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String college;

    public Intern(
            String name,
            int id,
            double salary,
            String college) {

        super(name, id, salary);
        this.college = college;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("College: " + college);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee[] employees = {
            new Manager("Rohith", 101, 90000, 8),
            new Developer("Arjun", 102, 75000, "Java"),
            new Intern("Rahul", 103, 20000, "SRM Institute")
        };

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("--------------------");
        }
    }
}