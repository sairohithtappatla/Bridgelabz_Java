package objectOrientedProgramming.Constructors.level1;

public class PersonCopy {
    private String name;
    private int age;

    public PersonCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public PersonCopy(PersonCopy other) {
        this(other.name, other.age);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonCopy original = new PersonCopy("Rohith", 21);
        PersonCopy copied = new PersonCopy(original);

        System.out.println("Original Person");
        original.displayDetails();

        System.out.println("\nCopied Person");
        copied.displayDetails();
    }
}