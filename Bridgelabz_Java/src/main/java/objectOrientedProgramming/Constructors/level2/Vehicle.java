package objectOrientedProgramming.Constructors.level2;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 2500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {
        Vehicle first = new Vehicle("Rohith", "Car");
        Vehicle second = new Vehicle("Sai", "Bike");

        first.displayVehicleDetails();

        Vehicle.updateRegistrationFee(3000.0);
        System.out.println("\nAfter Fee Update");
        second.displayVehicleDetails();
    }
}