class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(
            String courseName,
            int duration,
            String platform,
            boolean isRecorded) {

        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayOnlineCourse() {
        displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(
            String courseName,
            int duration,
            String platform,
            boolean isRecorded,
            double fee,
            double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseDetails() {
        displayOnlineCourse();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Fee: ₹" + (fee - discount));
    }
}

public class EducationalCourseHierarchy {

    public static void main(String[] args) {

        PaidOnlineCourse course =
            new PaidOnlineCourse(
                "Java Programming",
                12,
                "Online Academy",
                true,
                10000,
                1500
            );

        course.displayCourseDetails();
    }
}