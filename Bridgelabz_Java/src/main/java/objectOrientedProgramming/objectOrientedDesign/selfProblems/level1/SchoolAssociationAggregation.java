package objectOrientedProgramming.objectOrientedDesign.selfProblems.level1.school;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enroll(Student student) {
        if (student != null && !enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("\nStudents in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

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
            course.enroll(this);
        }
    }

    public void displayCourses() {
        System.out.println("\nCourses for " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("\nStudents at " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class SchoolAssociationAggregation {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        // Students and courses are created independently of the school.
        Student student1 = new Student("Rohith");
        Student student2 = new Student("Sai");

        Course java = new Course("Java");
        Course mathematics = new Course("Mathematics");
        Course networks = new Course("Computer Networks");

        school.addStudent(student1);
        school.addStudent(student2);

        student1.enrollCourse(java);
        student1.enrollCourse(mathematics);
        student2.enrollCourse(java);
        student2.enrollCourse(networks);

        school.displayStudents();
        student1.displayCourses();
        student2.displayCourses();

        java.displayEnrolledStudents();
        mathematics.displayEnrolledStudents();
    }
}