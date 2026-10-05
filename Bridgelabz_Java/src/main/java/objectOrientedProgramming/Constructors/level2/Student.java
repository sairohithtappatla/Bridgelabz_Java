package objectOrientedProgramming.Constructors.level2;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA);
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Rohith", 9.6);
        student.setCGPA(9.7);
        student.displayDetails();

        System.out.println("\nPostgraduate Student");
        PostgraduateStudent postgraduate = new PostgraduateStudent(
            201, "Sai", 9.2, "Cyber Security"
        );
        postgraduate.displayPostgraduateDetails();
    }
}