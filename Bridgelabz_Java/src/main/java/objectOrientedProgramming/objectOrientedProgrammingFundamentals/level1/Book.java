package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level1;

import java.util.Scanner;

public class Book {

    // Instance variables store book details
    private String title;
    private String author;
    private double price;

    // Constructor to initialize book attributes
    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    // Getter method to return book title
    public String getTitle() {
        return title;
    }

    // Setter method to update book title
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title = title;
    }

    // Getter method to return author name
    public String getAuthor() {
        return author;
    }

    // Setter method to update author name
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        this.author = author;
    }

    // Getter method to return book price
    public double getPrice() {
        return price;
    }

    // Setter method to update book price
    public void setPrice(double price) {
        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Price must be a non-negative finite number.");
        }
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: %.2f%n", price);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get book details
            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter author name: ");
            String author = input.nextLine();

            System.out.print("Enter book price: ");
            double price = Double.parseDouble(input.nextLine());

            // Create Book object
            Book book = new Book(title, author, price);

            // Display book details
            System.out.println("\nBook Details");
            book.displayDetails();
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}