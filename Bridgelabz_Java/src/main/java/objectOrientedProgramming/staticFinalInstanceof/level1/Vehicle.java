package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Vehicle {
    private static double registrationFee = 2500.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Registration fee cannot be negative.");
        }
    }

    public void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void displayIfVehicle(Object object) {
        if (object instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) object;
            vehicle.displayDetails();
        } else {
            System.out.println("The object is not a Vehicle.");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Rohith", "Car", "TN01AB1234");
        Vehicle bike = new Vehicle("Sai", "Bike", "TN02CD5678");

        displayIfVehicle(car);

        System.out.println("\nUpdating registration fee:");
        Vehicle.updateRegistrationFee(3000.0);
        displayIfVehicle(bike);

        System.out.println("\nChecking a different object:");
        displayIfVehicle(123);
    }
}