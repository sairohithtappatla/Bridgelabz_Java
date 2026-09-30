package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level2;

import java.util.Scanner;

public class MovieTicket {

    // Instance variables store movie ticket details
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    // Constructor to initialize movie name and default booking state
    public MovieTicket(String movieName) {
        setMovieName(movieName);
        this.seatNumber = "Not assigned";
        this.price = 0;
        this.booked = false;
    }

    // Getter method to return movie name
    public String getMovieName() {
        return movieName;
    }

    // Setter method to update movie name
    public void setMovieName(String movieName) {
        if (movieName == null || movieName.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie name cannot be empty.");
        }
        this.movieName = movieName;
    }

    // Getter method to return seat number
    public String getSeatNumber() {
        return seatNumber;
    }

    // Getter method to return ticket price
    public double getPrice() {
        return price;
    }

    // Getter method to return booking status
    public boolean isBooked() {
        return booked;
    }

    // Method to book a ticket by assigning a seat and price
    public void bookTicket(String seatNumber, double price) {
        if (booked) {
            throw new IllegalStateException("This ticket has already been booked.");
        }

        // Validate seat number and ticket price
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Seat number cannot be empty.");
        }
        if (price <= 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Price must be a positive finite number.");
        }

        // Update ticket information
        this.seatNumber = seatNumber;
        this.price = price;
        this.booked = true;
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Ticket Price: %.2f%n", price);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Not Booked"));
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get movie name
            System.out.print("Enter movie name: ");
            String movieName = input.nextLine();

            // Create MovieTicket object
            MovieTicket ticket = new MovieTicket(movieName);

            // Get seat number
            System.out.print("Enter seat number: ");
            String seatNumber = input.nextLine();

            // Get ticket price
            System.out.print("Enter ticket price: ");
            double price = Double.parseDouble(input.nextLine());

            // Book the ticket
            ticket.bookTicket(seatNumber, price);

            // Display booked ticket details
            System.out.println("\nTicket Details");
            ticket.displayDetails();
        } catch (IllegalArgumentException | IllegalStateException exception) {
            // Display booking or input errors
            System.out.println("Unable to book ticket: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}