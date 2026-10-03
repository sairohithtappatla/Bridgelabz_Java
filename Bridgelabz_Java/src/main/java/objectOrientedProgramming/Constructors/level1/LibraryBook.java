package objectOrientedProgramming.Constructors.level1;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = Math.max(price, 0);
        this.availability = true;
    }

    public boolean borrowBook() {
        if (!availability) {
            System.out.println(title + " is currently unavailable.");
            return false;
        }

        availability = false;
        System.out.println(title + " has been borrowed successfully.");
        return true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Alchemist", "Paulo Coelho", 350.0);

        book.displayDetails();
        book.borrowBook();

        System.out.println("\nAfter Borrowing");
        book.displayDetails();
    }
}