package objectOrientedProgramming.Constructors.level1;

public class BookConstructors {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookConstructors() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized constructor
    public BookConstructors(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        BookConstructors defaultBook = new BookConstructors();
        BookConstructors book = new BookConstructors("Clean Code", "Robert C. Martin", 650.0);

        System.out.println("Default Book");
        defaultBook.displayDetails();

        System.out.println("\nParameterized Book");
        book.displayDetails();
    }
}