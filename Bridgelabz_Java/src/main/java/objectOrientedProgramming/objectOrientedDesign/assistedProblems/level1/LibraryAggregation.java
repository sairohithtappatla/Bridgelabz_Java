package objectOrientedProgramming.objectOrientedDesign.assistedProblems.level1;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
            System.out.println(book.getTitle() + " added to " + libraryName);
        }
    }

    public void displayBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        // Books are created independently of any library.
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt");

        Library centralLibrary = new Library("Central Library");
        Library collegeLibrary = new Library("College Library");

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        // The same book object can be associated with another library.
        collegeLibrary.addBook(book2);
        collegeLibrary.addBook(book3);

        centralLibrary.displayBooks();
        collegeLibrary.displayBooks();

        // book2 still exists independently of either library.
        System.out.println("\nIndependent Book:");
        book2.displayDetails();
    }
}