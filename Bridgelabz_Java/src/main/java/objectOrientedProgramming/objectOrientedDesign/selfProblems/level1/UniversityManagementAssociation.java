package objectOrientedProgramming.objectOrientedDesign.selfProblems.level1.universityManagement;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getCourseName());
        }
    }

    public void displayCourses() {
        System.out.println("\nCourses for " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }

    public void displayCourses() {
        System.out.println("\nCourses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private List<Student> students;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: "
                + (professor == null ? "Not assigned" : professor.getName()));

        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class UniversityManagementAssociation {
    public static void main(String[] args) {
        Student student1 = new Student("Rohith");
        Student student2 = new Student("Sai");

        Professor professor1 = new Professor("Dr. Kumar");
        Professor professor2 = new Professor("Dr. Priya");

        Course java = new Course("Java Programming");
        Course cyberSecurity = new Course("Cyber Security");

        student1.enrollCourse(java);
        student1.enrollCourse(cyberSecurity);
        student2.enrollCourse(java);

        professor1.assignCourse(java);
        professor2.assignCourse(cyberSecurity);

        student1.displayCourses();
        professor1.displayCourses();

        java.displayCourseDetails();
        cyberSecurity.displayCourseDetails();
    }
}