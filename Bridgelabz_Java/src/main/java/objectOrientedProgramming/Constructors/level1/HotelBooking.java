package objectOrientedProgramming.Constructors.level1;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Not Assigned", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = Math.max(nights, 1);
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking booking = new HotelBooking("Rohith", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(booking);

        System.out.println("Default Booking");
        defaultBooking.displayBooking();

        System.out.println("\nParameterized Booking");
        booking.displayBooking();

        System.out.println("\nCopied Booking");
        copiedBooking.displayBooking();
    }
}