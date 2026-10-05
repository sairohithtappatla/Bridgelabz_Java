import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(
            int itemId,
            String title,
            String author) {

        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println(
            "Loan Duration: " +
            getLoanDuration() +
            " days"
        );
    }
}

interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

class LibraryBook extends LibraryItem implements Reservable {
    private boolean available = true;

    public LibraryBook(
            int itemId,
            String title,
            String author) {

        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem() {
        available = false;
        System.out.println("Book reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(
            int itemId,
            String title,
            String author) {

        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        available = false;
        System.out.println("Magazine reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(
            int itemId,
            String title,
            String author) {

        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem() {
        available = false;
        System.out.println("DVD reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(
            new LibraryBook(
                101,
                "Clean Code",
                "Robert C. Martin"
            )
        );

        items.add(
            new Magazine(
                102,
                "Tech Monthly",
                "Tech Publications"
            )
        );

        items.add(
            new DVD(
                103,
                "Java Programming",
                "Programming Academy"
            )
        );

        for (LibraryItem item : items) {

            item.getItemDetails();

            Reservable reservable =
                (Reservable) item;

            System.out.println(
                "Available: " +
                reservable.checkAvailability()
            );

            System.out.println("--------------------");
        }
    }
}