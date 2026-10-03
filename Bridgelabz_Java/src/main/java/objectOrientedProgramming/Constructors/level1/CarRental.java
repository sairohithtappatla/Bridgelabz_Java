package objectOrientedProgramming.Constructors.level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    private static final double DAILY_RATE = 1500.0;

    public CarRental() {
        this("Not Assigned", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = Math.max(rentalDays, 1);
    }

    private double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Cost: Rs. %.2f%n", calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Rohith", "Honda City", 4);
        rental.displayRentalDetails();
    }
}