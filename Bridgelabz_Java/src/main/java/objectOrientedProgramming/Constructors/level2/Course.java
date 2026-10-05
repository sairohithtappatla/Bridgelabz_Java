package objectOrientedProgramming.Constructors.level2;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = Math.max(fee, 0);
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        if (newName != null && !newName.isBlank()) {
            instituteName = newName;
        }
    }

    public static void main(String[] args) {
        Course java = new Course("Java", 3, 5000.0);
        Course python = new Course("Python", 2, 4000.0);

        java.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz Learning");
        System.out.println("\nAfter Updating Institute Name");
        python.displayCourseDetails();
    }
}