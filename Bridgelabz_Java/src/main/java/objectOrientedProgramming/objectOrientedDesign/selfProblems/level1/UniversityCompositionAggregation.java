package objectOrientedProgramming.objectOrientedDesign.selfProblems.level1.universityStructure;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }


    public void displayDetails() {
        System.out.println("Faculty: " + name + ", Specialization: " + specialization);
    }
}

class Department {
    private String departmentName;
    private List<Faculty> facultyMembers;

    Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        if (faculty != null && !facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }


    public void displayDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Faculty faculty : facultyMembers) {
            faculty.displayDetails();
        }
    }

    public void clearFacultyReferences() {
        facultyMembers.clear();
    }
    public boolean matchesName(String name) {
        return departmentName.equals(name);
    }
}

class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> facultyMembers;
    private boolean active;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
        this.active = true;
    }

    public void createDepartment(String departmentName) {
        if (active) {
            departments.add(new Department(departmentName));
        }
    }

    public void associateFaculty(Faculty faculty) {
        if (active && faculty != null && !facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    public void assignFacultyToDepartment(String departmentName, Faculty faculty) {
        if (!active) {
            return;
        }

        for (Department department : departments) {
            if (department.matchesName(departmentName)) {
                department.addFaculty(faculty);
                return;
            }
        }

        System.out.println("Department not found.");
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayDetails();
        }

        System.out.println("\nUniversity Faculty List:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayDetails();
        }
    }

    // Departments are owned by the University. Faculty objects are not.
    public void closeUniversity() {
        for (Department department : departments) {
            department.clearFacultyReferences();
        }
        departments.clear();
        facultyMembers.clear();
        active = false;
        System.out.println(universityName + " closed and released its department references.");
    }
}

public class UniversityCompositionAggregation {
    public static void main(String[] args) {
        University university = new University("SRM University");

        university.createDepartment("Computer Science");
        university.createDepartment("Electronics");

        // Faculty can exist independently of the University.
        Faculty faculty1 = new Faculty("Dr. Kumar", "Cyber Security");
        Faculty faculty2 = new Faculty("Dr. Priya", "Electronics");

        university.associateFaculty(faculty1);
        university.associateFaculty(faculty2);

        university.assignFacultyToDepartment("Computer Science", faculty1);
        university.assignFacultyToDepartment("Electronics", faculty2);

        university.displayUniversity();

        System.out.println("\nClosing University");
        university.closeUniversity();

        // The Faculty objects still exist independently.
        System.out.println("\nIndependent Faculty after University closes:");
        faculty1.displayDetails();
    }
}