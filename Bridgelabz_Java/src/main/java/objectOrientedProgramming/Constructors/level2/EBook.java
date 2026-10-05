package objectOrientedProgramming.Constructors.level2;

public class EBook extends LibraryAccessBook {
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        // Public ISBN and protected title are accessible in this subclass.
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Format: " + fileFormat);
        System.out.println("Author: " + getAuthor());
    }
}