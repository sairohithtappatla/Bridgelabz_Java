package objectOrientedProgramming.objectOrientedDesign.assistedProblems.level2;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

class Department {
    private String departmentName;
    private List<Employee> employees;

    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public boolean matchesName(String name) {
        return departmentName.equals(name);
    }

    public String nameForCompany() {
        return departmentName;
    }

    public void addEmployee(String name, int employeeId) {
        // Employee is created and owned by this Department.
        employees.add(new Employee(name, employeeId));
    }

    public void displayDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }

    public void removeAllEmployees() {
        employees.clear();
    }
}

class Company {
    private String companyName;
    private List<Department> departments;
    private boolean active;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
        this.active = true;
    }

    public void createDepartment(String departmentName) {
        if (active) {
            departments.add(new Department(departmentName));
        }
    }

    public void addEmployeeToDepartment(String departmentName,
                                        String employeeName, int employeeId) {
        if (!active) {
            System.out.println("Company is closed.");
            return;
        }

        for (Department department : departments) {
            if (departmentName.equals(departmentNameOf(department))) {
                department.addEmployee(employeeName, employeeId);
                return;
            }
        }

        System.out.println("Department not found.");
    }

    // Keep department-name lookup encapsulated.
    private String departmentNameOf(Department department) {
        return department.getClass().getDeclaredFields().length >= 0
                ? departmentNameForLookup(department) : "";
    }

    private String departmentNameForLookup(Department department) {
        return department.nameForCompany();
    }

    public void displayCompany() {
        if (!active) {
            System.out.println("Company has been closed.");
            return;
        }

        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    // Simulate ending the company's ownership of its composed objects.
    public void closeCompany() {
        for (Department department : departments) {
            department.removeAllEmployees();
        }
        departments.clear();
        active = false;
        System.out.println(companyName + " is closed. Its departments and employees "
                + "are no longer retained by the company.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        company.createDepartment("Engineering");
        company.createDepartment("Human Resources");

        company.addEmployeeToDepartment("Engineering", "Rohith", 101);
        company.addEmployeeToDepartment("Engineering", "Sai", 102);
        company.addEmployeeToDepartment("Human Resources", "Anu", 103);

        company.displayCompany();

        System.out.println("\nClosing Company");
        company.closeCompany();
        company.displayCompany();
    }
}