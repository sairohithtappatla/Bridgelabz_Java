package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Student {
    private static String universityName = "SRM Institute of Science and Technology";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        if (newGrade != null && !newGrade.isBlank()) {
            this.grade = newGrade;
        }
    }

    public static void displayIfStudent(Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;
            student.displayDetails();
        } else {
            System.out.println("The object is not a Student.");
        }
    }

    public static void updateGradeIfStudent(Object object, String newGrade) {
        if (object instanceof Student) {
            Student student = (Student) object;
            student.updateGrade(newGrade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Cannot update grade: object is not a Student.");
        }
    }

    public static void main(String[] args) {
        Student first = new Student("Rohith", 101, "A");
        Student second = new Student("Sai", 102, "A+");

        displayIfStudent(first);

        System.out.println("\nUpdating grade:");
        updateGradeIfStudent(first, "A+");
        displayIfStudent(first);

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\nChecking a different object:");
        displayIfStudent("Student");
    }
}