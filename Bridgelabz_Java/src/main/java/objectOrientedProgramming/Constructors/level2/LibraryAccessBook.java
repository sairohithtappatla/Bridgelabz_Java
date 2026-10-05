package objectOrientedProgramming.Constructors.level2;

public class LibraryAccessBook {
    public String ISBN;
    protected String title;
    private String author;

    public LibraryAccessBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        }
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        LibraryAccessBook book = new LibraryAccessBook(
            "978-0132350884", "Clean Code", "Robert C. Martin"
        );
        book.setAuthor("R. C. Martin");
        book.displayDetails();

        System.out.println("\nEBook Details");
        EBook ebook = new EBook("978-0201633610", "Design Patterns",
                                "Erich Gamma", "PDF");
        ebook.displayEBookDetails();
    }
}