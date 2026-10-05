package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Book {
    private static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void displayIfBook(Object object) {
        if (object instanceof Book) {
            Book book = (Book) object;
            book.displayDetails();
        } else {
            System.out.println("The object is not a Book.");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        Book.displayLibraryName();
        displayIfBook(book);

        System.out.println("\nChecking a different object:");
        displayIfBook(100);
    }
}