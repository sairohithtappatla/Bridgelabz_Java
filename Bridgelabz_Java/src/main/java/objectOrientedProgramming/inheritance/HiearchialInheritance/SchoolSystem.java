class SchoolPerson {
    protected String name;
    protected int age;

    public SchoolPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends SchoolPerson {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        displayPerson();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends SchoolPerson {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayPerson();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends SchoolPerson {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        displayPerson();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {

    public static void main(String[] args) {

        Teacher teacher =
            new Teacher("Anita", 35, "Computer Science");

        Student student =
            new Student("Rohith", 21, "A");

        Staff staff =
            new Staff("Kumar", 40, "Administration");

        teacher.displayRole();

        System.out.println("--------------------");

        student.displayRole();

        System.out.println("--------------------");

        staff.displayRole();
    }
}